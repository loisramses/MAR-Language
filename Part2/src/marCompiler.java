import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;
import mar.*;
import util.*;

public class marCompiler {
    public static class Evaluator extends marBaseListener {
        private final boolean debug;
        private int opCount, typeErrors;
        ByteArrayOutputStream byteArray;
        DataOutputStream byteArrayOutputStream;
        ArrayList<Const> constPool;
        ArrayList<String> opCodes;
        Stack<Const> vars;

        public Evaluator(boolean debug) {
            this.debug = debug;
            this.opCount = 0;
            this.typeErrors = 0;
            this.byteArray = new ByteArrayOutputStream();
            this.byteArrayOutputStream = new DataOutputStream(byteArray);
            this.vars = new Stack<>();
            this.opCodes = new ArrayList<>();
            this.constPool = new ArrayList<>(50);
        }

        public byte[] constToByteArray() {
            ByteArrayOutputStream array = new ByteArrayOutputStream();
            DataOutputStream arrayOutputStream = new DataOutputStream(array);
            try {
                arrayOutputStream.writeInt(this.constPool.size());
                for (Const const1 : constPool) {
                    if (const1.isNumber()) {
                        arrayOutputStream.writeInt(OpCode.NUMBER.getValue());
                        arrayOutputStream.writeDouble((Double) const1.getValue());
                    } else { // must be string
                        arrayOutputStream.writeInt(OpCode.STRING.getValue());
                        arrayOutputStream.writeInt(((String) const1.getValue()).length());
                        arrayOutputStream.write(((String) const1.getValue()).getBytes());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return array.toByteArray();
        }

        private void printError(ParserRuleContext ctx, Const left, Const right) {
            String line = ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine();
            String operator = ctx.getChild(1).getText();
            System.out.println("line: " + line + " error: operator " + operator + " is invalid between "
                    + left.getType() + " and " + right.getType());
        }

        public void exitProg(marParser.ProgContext ctx) {
            opCodes.add(opCount++ + ": HALT");
            try {
                this.byteArrayOutputStream.writeInt(OpCode.HALT.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitInst(marParser.InstContext ctx) {
            String OP = null;
            Const temp = this.vars.pop();
            try {
                if (temp.isNumber()) {
                    OP = "PRINT_N";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_N.getValue());
                } else if (temp.isString()) {
                    OP = "PRINT_S";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_S.getValue());
                } else if (temp.isBool()) {
                    OP = "PRINT_B";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_B.getValue());
                } else if (temp.isNil()) {
                    OP = "PRINT_NIL";
                    this.byteArrayOutputStream.writeInt(OpCode.PRINT_NIL.getValue());
                }
                this.opCodes.add(opCount++ + ": " + OP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitNil(marParser.NilContext ctx) {
            this.vars.push(new Const("nil", null));
            this.opCodes.add(opCount++ + ": NIL");
            try {
                this.byteArrayOutputStream.writeInt(OpCode.NIL.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitBinMulDiv(marParser.BinMulDivContext ctx) {
            String OP;
            Const right = this.vars.pop(), left = this.vars.pop();
            try {
                if (right.isNumber() && left.isNumber()) {
                    if (ctx.op.getType() == marParser.MULT) {
                        OP = "MULT";
                        this.byteArrayOutputStream.writeInt(OpCode.MULT.getValue());
                    } else {
                        OP = "DIV";
                        this.byteArrayOutputStream.writeInt(OpCode.DIV.getValue());
                    }
                    opCodes.add(opCount++ + ": " + OP);
                } else {
                    this.typeErrors++;
                    printError(ctx, left, right);
                }
                this.vars.push(right);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitLogicOr(marParser.LogicOrContext ctx) {
            Const right = this.vars.pop(), left = this.vars.pop();
            try {
                if (right.isBool() && left.isBool()) {
                    this.vars.push(new Const("bool", false));
                    this.byteArrayOutputStream.writeInt(OpCode.OR.getValue());
                    this.opCodes.add(opCount++ + ": OR");
                } else {
                    this.typeErrors++;
                    printError(ctx, left, right);
                }
                this.vars.push(new Const("bool", false));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitNumber(marParser.NumberContext ctx) {
            double result = Double.parseDouble(ctx.NUMBER().getText());
            Const temp = new Const("number", result);
            this.vars.push(temp);
            this.constPool.add(temp);
            this.opCodes.add(opCount++ + ": CONST " + (this.constPool.size() - 1));
            try {
                this.byteArrayOutputStream.writeInt(OpCode.NUMBER.getValue());
                this.byteArrayOutputStream.writeInt(this.constPool.size() - 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitInEquality(marParser.InEqualityContext ctx) {
            String OP;
            boolean NEQ = false;
            Const right = this.vars.pop(), left = this.vars.pop();
            try {
                if (ctx.op.getType() == marParser.NEQ)
                    NEQ = true;
                if (right.isNumber() && left.isNumber()) {
                    OP = "EQ_N";
                    if (NEQ)
                        this.byteArrayOutputStream.writeInt(OpCode.NEQ_N.getValue());
                    else
                        this.byteArrayOutputStream.writeInt(OpCode.EQ_N.getValue());
                } else if (right.isString() && left.isString()) {
                    OP = "EQ_S";
                    if (NEQ)
                        this.byteArrayOutputStream.writeInt(OpCode.NEQ_S.getValue());
                    else
                        this.byteArrayOutputStream.writeInt(OpCode.EQ_S.getValue());
                } else if (right.isBool() && left.isBool()) {
                    OP = "EQ_B";
                    if (NEQ)
                        this.byteArrayOutputStream.writeInt(OpCode.NEQ_B.getValue());
                    else
                        this.byteArrayOutputStream.writeInt(OpCode.EQ_B.getValue());
                } else if (right.isNil() && left.isNil()) {
                    OP = "EQ_NIL";
                    if (NEQ)
                        this.byteArrayOutputStream.writeInt(OpCode.NEQ_NIL.getValue());
                    else
                        this.byteArrayOutputStream.writeInt(OpCode.EQ_NIL.getValue());
                } else {
                    this.typeErrors++;
                    printError(ctx, left, right);
                    return;
                }
                if (NEQ)
                    OP = "N" + OP;
                this.vars.push(new Const("bool", false));
                this.opCodes.add(opCount++ + ": " + OP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitRelational(marParser.RelationalContext ctx) {
            String OP = null;
            Const right = this.vars.pop(), left = this.vars.pop();
            try {
                if (right.isNumber() && left.isNumber()) {
                    if (ctx.op.getType() == marParser.LT) {
                        OP = "LT";
                        this.byteArrayOutputStream.writeInt(OpCode.LT.getValue());
                    } else if (ctx.op.getType() == marParser.GT) {
                        OP = "GT";
                        this.byteArrayOutputStream.writeInt(OpCode.GT.getValue());
                    } else if (ctx.op.getType() == marParser.LEQ) {
                        OP = "LEQ";
                        this.byteArrayOutputStream.writeInt(OpCode.LEQ.getValue());
                    } else if (ctx.op.getType() == marParser.GEQ) {
                        OP = "GEQ";
                        this.byteArrayOutputStream.writeInt(OpCode.GEQ.getValue());
                    }
                } else {
                    this.typeErrors++;
                    printError(ctx, left, right);
                    return;
                }
                this.vars.push(new Const("bool", false));
                this.opCodes.add(opCount++ + ": " + OP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitString(marParser.StringContext ctx) {
            String result = ctx.STRING().getText();
            Const temp = new Const("string", result);
            this.vars.push(temp);
            this.constPool.add(temp);
            this.opCodes.add(opCount++ + ": CONST " + (this.constPool.size() - 1));
            try {
                this.byteArrayOutputStream.writeInt(OpCode.STRING.getValue());
                this.byteArrayOutputStream.writeInt(this.constPool.size() - 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitBoolean(marParser.BooleanContext ctx) {
            Boolean result = Boolean.parseBoolean(ctx.op.getText());
            try {
                this.vars.push(new Const("bool", result));
                this.opCodes.add(opCount++ + ": " + result.toString().toUpperCase());
                if (result)
                    this.byteArrayOutputStream.writeInt(OpCode.TRUE.getValue());
                else
                    this.byteArrayOutputStream.writeInt(OpCode.FALSE.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitLogicAnd(marParser.LogicAndContext ctx) {
            Const right = this.vars.pop(), left = this.vars.pop();
            try {
                if (right.isBool() && left.isBool()) {
                    this.byteArrayOutputStream.writeInt(OpCode.AND.getValue());
                    opCodes.add(opCount++ + ": AND");
                } else {
                    this.typeErrors++;
                    printError(ctx, left, right);
                }
                this.vars.push(new Const("bool", false));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitUnary(marParser.UnaryContext ctx) {
            boolean error = false;
            Const temp = this.vars.pop();
            try {
                if (ctx.op.getType() == marParser.SUB) {
                    if (temp.isNumber()) {
                        this.byteArrayOutputStream.writeInt(OpCode.UMINUS.getValue());
                        this.opCodes.add(opCount++ + ": UMINUS");
                    } else {
                        error = true;
                    }
                } else { // must be "not" operator
                    if (temp.isBool()) {
                        this.byteArrayOutputStream.writeInt(OpCode.NOT.getValue());
                        this.opCodes.add(opCount++ + ": NOT");
                    } else {
                        error = true;
                    }
                }
                this.vars.push(temp);
                if (error) {
                    this.typeErrors++;
                    System.out.println("line " + ctx.getStart().getLine() + ":"
                            + ctx.getStop().getCharPositionInLine() + " error: unary operator " + ctx.op.getText()
                            + " is invalid for " + temp.getType());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void exitBinAddSub(marParser.BinAddSubContext ctx) {
            String OP;
            Const right = this.vars.pop(), left = this.vars.pop();
            try {
                if (ctx.op.getType() == marParser.ADD) {
                    OP = "ADD";
                    if (right.isNumber() && left.isNumber()) {
                        this.byteArrayOutputStream.writeInt(OpCode.ADD.getValue());
                    } else if (right.isString() && left.isString()) {
                        OP = "CONCAT";
                        this.byteArrayOutputStream.writeInt(OpCode.CONCAT.getValue());
                    } else {
                        this.typeErrors++;
                        printError(ctx, left, right);
                    }
                } else { // must be subtraction
                    OP = "SUB";
                    if (right.isNumber() && left.isNumber()) {
                        this.byteArrayOutputStream.writeInt(OpCode.SUB.getValue());
                    } else {
                        this.typeErrors++;
                        printError(ctx, left, right);
                    }
                }
                this.vars.push(right);
                opCodes.add(opCount++ + ": " + OP);
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
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.exit(1);
            }
            System.out.println("... no parsing errors");
            ParseTreeWalker walker = new ParseTreeWalker();
            Evaluator eval = new Evaluator(debug);
            walker.walk(eval, tree);
            if (eval.typeErrors <= 0)
                System.out.println("... no type errors");
            else
                return;
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile));
            System.out.println("... code generation");
            dataOutputStream.write(eval.constToByteArray());
            dataOutputStream.write(eval.byteArray.toByteArray());
            dataOutputStream.close();
            if (eval.debug) {
                System.out.println("Constant pool:");
                for (int i = 0; i < eval.constPool.size(); i++)
                    System.out.println(i + ": " + eval.constPool.get(i));
                System.out.println("Generated assembly code:");
                for (String string : eval.opCodes)
                    System.out.println(string);
                System.out.println("Saving the constant pool and the bytecodes to " + outputFile);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}