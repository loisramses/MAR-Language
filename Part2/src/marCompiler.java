import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;
import mar.*;
import util.*;

public class marCompiler {
    public static class Evaluator extends marBaseListener {
        private final boolean debug;
        private int opCount, rejected, typeErrors;
        ByteArrayOutputStream byteArray;
        DataOutputStream byteArrayOutputStream;
        Stack<Const> constPool;
        Stack<String> opCodes;

        public Evaluator(boolean debug) {
            this.debug = debug;
            this.opCount = 0;
            this.rejected = 0;
            this.typeErrors = 0;
            this.byteArray = new ByteArrayOutputStream();
            this.byteArrayOutputStream = new DataOutputStream(byteArray);
            this.constPool = new Stack<>();
            this.opCodes = new Stack<>();
        }

        private void printError(Object ctx, Const left, Const right) {
            String line = ((ParserRuleContext) ctx).getStart().getLine() + ":"
                    + ((ParserRuleContext) ctx).getStop().getCharPositionInLine();
            String operator = ((ParserRuleContext) ctx).getChild(1).getText();
            System.out.println("line: " + line + " error: operator " + operator + " is invalid between "
                    + left.getType() + " and " + right.getType());
        }

        public void exitProg(marParser.ProgContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(OpCode.HALT.getValue());
                opCodes.push(opCount++ + ": HALT");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitInst(marParser.InstContext ctx) {
            String OP = null;
            try {
                if (this.constPool.peek().isNumber()) {
                    OP = "PRINT_N";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_N.getValue());
                } else if (this.constPool.peek().isString()) {
                    OP = "PRINT_S";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_S.getValue());
                } else if (this.constPool.peek().isBool()) {
                    OP = "PRINT_B";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_B.getValue());
                } else if (this.constPool.peek().isNil()) {
                    OP = "PRINT_NIL";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_NIL.getValue());
                }
                if (OP != null)
                    opCodes.push(opCount++ + ": " + OP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitNil(marParser.NilContext ctx) {
            try {
                this.rejected++;
                this.constPool.push(new Const("nil", null));
                this.opCodes.push(opCount++ + ": NIL");
                this.byteArrayOutputStream.writeInt(OpCode.NIL.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitBinMulDiv(marParser.BinMulDivContext ctx) {
            String OP = "MULT";
            Const temp;
            try {
                temp = this.constPool.pop();
                if (temp.isNumber() && this.constPool.peek().isNumber()) {
                    if (ctx.op.getText().equals("*")) {
                        this.byteArrayOutputStream.writeInt(OpCode.MULT.getValue());
                    } else {
                        OP = "DIV";
                        this.byteArrayOutputStream.writeInt(OpCode.DIV.getValue());
                    }
                    opCodes.push(opCount++ + ": " + OP);
                } else {
                    this.typeErrors++;
                    printError(ctx, this.constPool.peek(), temp);
                }
                this.constPool.push(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitLogicOr(marParser.LogicOrContext ctx) {
            Const temp;
            try {
                temp = this.constPool.pop();
                if (temp.isBool() && this.constPool.peek().isBool()) {
                    this.byteArrayOutputStream.writeInt(OpCode.OR.getValue());
                    this.opCodes.push(opCount++ + ": OR");
                } else {
                    this.typeErrors++;
                    printError(ctx, this.constPool.peek(), temp);
                }
                this.constPool.push(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitNumber(marParser.NumberContext ctx) {
            double result = Double.parseDouble(ctx.NUMBER().getText());
            try {
                this.constPool.push(new Const("number", result));
                this.opCodes.push(opCount++ + ": CONST " + (this.constPool.size() - this.rejected));
                this.byteArrayOutputStream.writeInt(OpCode.NUMBER.getValue());
                this.byteArrayOutputStream.writeDouble(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitInEquality(marParser.InEqualityContext ctx) {
            String OP = null;
            Boolean result = null, NEQ = false;
            Const temp;
            Object left, right;
            try {
                if (ctx.op.getText().equals("!="))
                    NEQ = true;
                temp = this.constPool.pop();
                left = this.constPool.peek().getValue();
                right = temp.getValue();
                if (temp.isNumber() && this.constPool.peek().isNumber()) {
                    OP = "EQ_N";
                    result = ((Double) left).equals((Double) right);
                    if (NEQ) this.byteArrayOutputStream.writeInt(OpCode.NEQ_N.getValue());
                    else this.byteArrayOutputStream.writeInt(OpCode.EQ_N.getValue());
                } else if (temp.isString() && this.constPool.peek().isString()) {
                    OP = "EQ_S";
                    result = ((String) left).equals((String) right);
                    if (NEQ) this.byteArrayOutputStream.writeInt(OpCode.NEQ_S.getValue());
                    else this.byteArrayOutputStream.writeInt(OpCode.EQ_S.getValue());
                } else if (temp.isBool() && this.constPool.peek().isBool()) {
                    OP = "EQ_B";
                    result = ((Boolean) left).equals((Boolean) right);
                    if (NEQ) this.byteArrayOutputStream.writeInt(OpCode.NEQ_B.getValue());
                    else this.byteArrayOutputStream.writeInt(OpCode.EQ_B.getValue());
                } else if (temp.isNil() && this.constPool.peek().isNil()) {
                    OP = "EQ_NIL";
                    result = left == null && right == null;
                    if (NEQ) this.byteArrayOutputStream.writeInt(OpCode.NEQ_NIL.getValue());
                    else this.byteArrayOutputStream.writeInt(OpCode.EQ_NIL.getValue());
                } else {
                    this.typeErrors++;
                    printError(ctx, this.constPool.peek(), temp);
                    return;
                }
                if (NEQ) {
                    OP = "N" + OP;
                    result = !result;
                }
                this.constPool.push(temp);
                this.rejected++;
                this.constPool.push(new Const("bool", result));
                if (OP != null)
                    this.opCodes.push(opCount++ + ": " + OP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitRelational(marParser.RelationalContext ctx) {
            String OP = null;
            Boolean result = null;
            Const temp;
            Object left, right;
            try {
                temp = this.constPool.pop();
                left = this.constPool.peek().getValue();
                right = temp.getValue();
                if (temp.isNumber() && this.constPool.peek().isNumber()) {
                    if (ctx.op.getText().equals("<")) {
                        OP = "LT";
                        this.byteArrayOutputStream.writeInt(OpCode.LT.getValue());
                        result = ((Double) left) < ((Double) right);
                    }
                    if (ctx.op.getText().equals(">")) {
                        OP = "GT";
                        this.byteArrayOutputStream.writeInt(OpCode.GT.getValue());
                        result = ((Double) left) > ((Double) right);
                    }
                    if (ctx.op.getText().equals("<=")) {
                        OP = "LEQ";
                        this.byteArrayOutputStream.writeInt(OpCode.LEQ.getValue());
                        result = ((Double) left) <= ((Double) right);
                    }
                    if (ctx.op.getText().equals(">=")) {
                        OP = "GEQ";
                        this.byteArrayOutputStream.writeInt(OpCode.GEQ.getValue());
                        result = ((Double) left) >= ((Double) right);
                    }
                } else {
                    this.typeErrors++;
                    printError(ctx, this.constPool.peek(), temp);
                    return;
                }
                this.constPool.push(temp);
                this.rejected++;
                this.constPool.push(new Const("bool", result));
                if (OP != null)
                    this.opCodes.push(opCount++ + ": " + OP);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitString(marParser.StringContext ctx) {
            String result = ctx.STRING().getText();
            try {
                this.constPool.push(new Const("string", result));
                this.opCodes.push(opCount++ + ": CONST " + (this.constPool.size() - this.rejected));
                this.byteArrayOutputStream.writeInt(OpCode.STRING.getValue());
                this.byteArrayOutputStream.writeInt(result.length());
                this.byteArrayOutputStream.write(result.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitBoolean(marParser.BooleanContext ctx) {
            Boolean result = Boolean.parseBoolean(ctx.op.getText());
            try {
                this.rejected++;
                this.constPool.push(new Const("bool", result));
                this.opCodes.push(opCount++ + ": " + result.toString().toUpperCase());
                if (result)
                    this.byteArrayOutputStream.writeInt(OpCode.TRUE.getValue());
                else
                    this.byteArrayOutputStream.writeInt(OpCode.FALSE.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitLogicAnd(marParser.LogicAndContext ctx) {
            Const temp;
            try {
                temp = this.constPool.pop();
                if (temp.isBool() && this.constPool.peek().isBool()) {
                    this.byteArrayOutputStream.writeInt(OpCode.AND.getValue());
                    opCodes.push(opCount++ + ": AND");
                } else {
                    this.typeErrors++;
                    printError(ctx, this.constPool.peek(), temp);
                }
                this.constPool.push(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitUnary(marParser.UnaryContext ctx) {
            boolean error = false;
            try {
                if (ctx.op.getText().equals("-")) {
                    if (this.constPool.peek().isNumber()) {
                        this.byteArrayOutputStream.writeInt(OpCode.UMINUS.getValue());
                        this.opCodes.push(opCount++ + ": UMINUS");
                    } else {
                        error = true;
                    }
                } else { // must be "not" operator
                    if (this.constPool.peek().isBool()) {
                        this.byteArrayOutputStream.writeInt(OpCode.NOT.getValue());
                        this.opCodes.push(opCount++ + ": NOT");
                    } else {
                        error = true;
                    }
                }
                if (error)
                    System.out.println("line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() + " error: unary operator " + ctx.op.getText()
                            + " is invalid for " + this.constPool.peek().getType());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitBinAddSub(marParser.BinAddSubContext ctx) {
            String OP = "ADD";
            Const temp;
            try {
                temp = this.constPool.pop();
                if (ctx.op.getText().equals("+")) {
                    if (temp.isNumber() && this.constPool.peek().isNumber()) {
                        this.byteArrayOutputStream.writeInt(OpCode.ADD.getValue());
                        opCodes.push(opCount++ + ": " + OP);
                    } else if (temp.isString() && this.constPool.peek().isString()) {
                        OP = "CONCAT";
                        this.byteArrayOutputStream.writeInt(OpCode.CONCAT.getValue());
                        opCodes.push(opCount++ + ": " + OP);
                    } else {
                        this.typeErrors++;    
                        printError(ctx, this.constPool.peek(), temp);
                    }
                } else { // must be subtraction
                    OP = "SUB";
                    if (temp.isNumber() && this.constPool.peek().isNumber()) {
                        this.byteArrayOutputStream.writeInt(OpCode.SUB.getValue());
                        opCodes.push(opCount++ + ": " + OP);
                    } else {
                        this.typeErrors++;
                        printError(ctx, this.constPool.peek(), temp);
                    }
                }
                this.constPool.push(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String inputFileName = null, outputFileName = "outputs/out.marbc";
        File outputFile = new File(outputFileName), temp;
        boolean debug = false;
        if (args.length > 0)
            inputFileName = args[0];
        if (args.length > 1 && args[1].compareTo("-debug") == 0)
            debug = true;
        InputStream is = System.in;
        try {
            if (inputFileName != null) {
                is = new FileInputStream(inputFileName);
                temp = new File(inputFileName);
                outputFile = new File("outputs/" + temp.getName() + "bc");
                assert (temp.delete());
            }
            CharStream input = CharStreams.fromStream(is);
            marLexer lexer = new marLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            marParser parser = new marParser(tokens);
            ParseTree tree = parser.prog();
            if (parser.getNumberOfSyntaxErrors() > 0) System.exit(1);
            System.out.println("... no parsing errors");
            ParseTreeWalker walker = new ParseTreeWalker();
            Evaluator eval = new Evaluator(debug);
            walker.walk(eval, tree);
            if (eval.typeErrors <= 0) System.out.println("... no type errors");
            else return;
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile));
            System.out.println("... code generation");
            dataOutputStream.write(eval.byteArray.toByteArray());
            dataOutputStream.close();
            if (eval.debug) {
                System.out.println("Constant pool:");
                int i = 1;
                for (Const var : eval.constPool) {
                    if (var.isBool() || var.isNil()) continue;
                    System.out.println(i++ + ": " + var.toString());
                }
                System.out.println("Generated assembly code:");
                for (String string : eval.opCodes)
                    System.out.println(string);
                System.out.println("Corrresponding bytecodes:");
                byte[] byteCodes = eval.byteArray.toByteArray();
                for (byte b : byteCodes)
                    System.out.print(b + " ");
                System.out.println("\n");
                System.out.println("Saving bytecodes to " + outputFile);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}