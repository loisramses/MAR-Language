import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import SymbolTable.*;
import java.io.*;
import java.util.*;
import mar.*;
import util.*;

public class marCompiler {
    public static class Evaluator extends marBaseListener {
        private int typeErrors;
        private final ByteArrayOutputStream byteArray;
        private final DataOutputStream byteArrayOutputStream;
        private final ArrayList<Const> constPool;
        private final ArrayList<String> opCodes;
        private final Stack<Const> vars;
        private final Stack<Integer> ifElsePos;
        private final Stack<Integer> whilePos;
        private final Map<String, Symbol> globalSymbols;
        boolean changedValue;
        private boolean inElse;

        public Evaluator(Scope global) {
            this.typeErrors = 0;
            this.byteArray = new ByteArrayOutputStream();
            this.byteArrayOutputStream = new DataOutputStream(byteArray);
            this.vars = new Stack<>();
            this.opCodes = new ArrayList<>();
            this.constPool = new ArrayList<>(50);
            this.globalSymbols = global.getSymbols();
            this.ifElsePos = new Stack<>();
            this.whilePos = new Stack<>();
            this.inElse = false;
            this.changedValue = false;
            if (this.globalSymbols.size() > 0)
                this.opCodes.add("GLOBAL " + this.globalSymbols.size());
        }

        public void writeData() {
            String[] inst;
            OpCode op;
            try {
                for (String string : this.opCodes) {
                    inst = string.split(" ");
                    op = OpCode.valueOf(inst[0]);
                    switch (op) {
                        case ADD -> this.byteArrayOutputStream.writeInt(OpCode.ADD.getValue());
                        case SUB -> this.byteArrayOutputStream.writeInt(OpCode.SUB.getValue());
                        case MULT -> this.byteArrayOutputStream.writeInt(OpCode.MULT.getValue());
                        case DIV -> this.byteArrayOutputStream.writeInt(OpCode.DIV.getValue());
                        case UMINUS -> this.byteArrayOutputStream.writeInt(OpCode.UMINUS.getValue());
                        case HALT -> this.byteArrayOutputStream.writeInt(OpCode.HALT.getValue());
                        case AND -> this.byteArrayOutputStream.writeInt(OpCode.AND.getValue());
                        case CONCAT -> this.byteArrayOutputStream.writeInt(OpCode.CONCAT.getValue());
                        case EQ_B -> this.byteArrayOutputStream.writeInt(OpCode.EQ_B.getValue());
                        case EQ_N -> this.byteArrayOutputStream.writeInt(OpCode.EQ_N.getValue());
                        case EQ_NIL -> this.byteArrayOutputStream.writeInt(OpCode.EQ_NIL.getValue());
                        case EQ_S -> this.byteArrayOutputStream.writeInt(OpCode.EQ_S.getValue());
                        case FALSE -> this.byteArrayOutputStream.writeInt(OpCode.FALSE.getValue());
                        case GEQ -> this.byteArrayOutputStream.writeInt(OpCode.GEQ.getValue());
                        case GT -> this.byteArrayOutputStream.writeInt(OpCode.GT.getValue());
                        case LEQ -> this.byteArrayOutputStream.writeInt(OpCode.LEQ.getValue());
                        case LT -> this.byteArrayOutputStream.writeInt(OpCode.LT.getValue());
                        case NEQ_B -> this.byteArrayOutputStream.writeInt(OpCode.NEQ_B.getValue());
                        case NEQ_N -> this.byteArrayOutputStream.writeInt(OpCode.NEQ_N.getValue());
                        case NEQ_NIL -> this.byteArrayOutputStream.writeInt(OpCode.NEQ_NIL.getValue());
                        case NEQ_S -> this.byteArrayOutputStream.writeInt(OpCode.NEQ_S.getValue());
                        case NIL -> this.byteArrayOutputStream.writeInt(OpCode.NIL.getValue());
                        case NOT -> this.byteArrayOutputStream.writeInt(OpCode.NOT.getValue());
                        case OR -> this.byteArrayOutputStream.writeInt(OpCode.OR.getValue());
                        case PRINT_B -> this.byteArrayOutputStream.writeInt(OpCode.PRINT_B.getValue());
                        case PRINT_N -> this.byteArrayOutputStream.writeInt(OpCode.PRINT_N.getValue());
                        case PRINT_NIL -> this.byteArrayOutputStream.writeInt(OpCode.PRINT_NIL.getValue());
                        case PRINT_S -> this.byteArrayOutputStream.writeInt(OpCode.PRINT_S.getValue());
                        case TRUE -> this.byteArrayOutputStream.writeInt(OpCode.TRUE.getValue());
                        case JUMP -> {
                            this.byteArrayOutputStream.writeInt(OpCode.JUMP.getValue());
                            this.byteArrayOutputStream.writeInt(Integer.parseInt(inst[1]));
                        }
                        case JUMPF -> {
                            this.byteArrayOutputStream.writeInt(OpCode.JUMPF.getValue());
                            this.byteArrayOutputStream.writeInt(Integer.parseInt(inst[1]));
                        }
                        case CONST -> {
                            this.byteArrayOutputStream.writeInt(OpCode.CONST.getValue());
                            this.byteArrayOutputStream.writeInt(Integer.parseInt(inst[1]));
                        }
                        case GLOBAL -> {
                            this.byteArrayOutputStream.writeInt(OpCode.GLOBAL.getValue());
                            this.byteArrayOutputStream.writeInt(Integer.parseInt(inst[1]));
                        }
                        case STORE -> {
                            this.byteArrayOutputStream.writeInt(OpCode.STORE.getValue());
                            this.byteArrayOutputStream.writeInt(Integer.parseInt(inst[1]));
                        }
                        case LOAD -> {
                            this.byteArrayOutputStream.writeInt(OpCode.LOAD.getValue());
                            this.byteArrayOutputStream.writeInt(Integer.parseInt(inst[1]));
                        }
                        default -> throw new IllegalArgumentException("Unexpected value: " + op);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
                        arrayOutputStream.writeUTF((String) const1.getValue());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return array.toByteArray();
        }

        private void printError(ParserRuleContext ctx, String message) {
            String line = ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine();
            System.out.println("line: " + line + " error: " + message);
        }

        public void exitProg(marParser.ProgContext ctx) {
            this.opCodes.add("HALT");
        }

        public void exitPrint(marParser.PrintContext ctx) {
            String OP = "";
            Const temp = this.vars.pop();
            if (temp.isNumber()) {
                OP = "PRINT_N";
            } else if (temp.isString()) {
                OP = "PRINT_S";
            } else if (temp.isBool()) {
                OP = "PRINT_B";
            } else if (temp.isNil()) {
                OP = "PRINT_NIL";
            }
            this.opCodes.add(OP);
        }

        public void exitNil(marParser.NilContext ctx) {
            this.vars.push(new Const(Type.tNIL, null));
            this.opCodes.add("NIL");
        }

        public void exitBinMulDiv(marParser.BinMulDivContext ctx) {
            String OP;
            Const right = this.vars.pop(), left = this.vars.pop();
            if (right.isNumber() && left.isNumber()) {
                if (ctx.op.getType() == marParser.MULT) {
                    OP = "MULT";
                } else {
                    OP = "DIV";
                }
                opCodes.add(OP);
            } else {
                this.typeErrors++;
                this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                        + left.getType() + " and " + right.getType());
            }
            this.vars.push(right);
        }

        public void exitLogicOr(marParser.LogicOrContext ctx) {
            Const right = this.vars.pop(), left = this.vars.pop();
            if (right.isBool() && left.isBool()) {
                this.vars.push(new Const(Type.tBOOL, false));
                this.opCodes.add("OR");
            } else {
                this.typeErrors++;
                this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                        + left.getType() + " and " + right.getType());
            }
            this.vars.push(new Const(Type.tBOOL, false));
        }

        public void exitNumber(marParser.NumberContext ctx) {
            double result = Double.parseDouble(ctx.NUMBER().getText());
            Const temp = new Const(Type.tNUMBER, result);
            this.vars.push(temp);
            this.constPool.add(temp);
            this.opCodes.add("CONST " + (this.constPool.size() - 1));
        }

        public void exitInEquality(marParser.InEqualityContext ctx) {
            String OP;
            boolean NEQ = false;
            Const right = this.vars.pop(), left = this.vars.pop();
            if (ctx.op.getType() == marParser.NEQ)
                NEQ = true;
            if (right.isNumber() && left.isNumber()) {
                OP = "EQ_N";
            } else if (right.isString() && left.isString()) {
                OP = "EQ_S";
            } else if (right.isBool() && left.isBool()) {
                OP = "EQ_B";
            } else if (right.isNil() && left.isNil()) {
                OP = "EQ_NIL";
            } else {
                this.typeErrors++;
                this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                        + left.getType() + " and " + right.getType());
                return;
            }
            if (NEQ)
                OP = "N" + OP;
            this.vars.push(new Const(Type.tBOOL, false));
            this.opCodes.add(OP);
        }

        public void exitRelational(marParser.RelationalContext ctx) {
            String OP = null;
            Const right = this.vars.pop(), left = this.vars.pop();
            if (right.isNumber() && left.isNumber()) {
                if (ctx.op.getType() == marParser.LT) {
                    OP = "LT";
                } else if (ctx.op.getType() == marParser.GT) {
                    OP = "GT";
                } else if (ctx.op.getType() == marParser.LEQ) {
                    OP = "LEQ";
                } else if (ctx.op.getType() == marParser.GEQ) {
                    OP = "GEQ";
                }
            } else {
                this.typeErrors++;
                this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                        + left.getType() + " and " + right.getType());
                return;
            }
            this.vars.push(new Const(Type.tBOOL, false));
            this.opCodes.add(OP);
        }

        public void exitString(marParser.StringContext ctx) {
            String result = ctx.STRING().getText();
            Const temp = new Const(Type.tSTRING, result);
            this.vars.push(temp);
            this.constPool.add(temp);
            this.opCodes.add("CONST " + (this.constPool.size() - 1));
        }

        public void exitBoolean(marParser.BooleanContext ctx) {
            Boolean result = Boolean.parseBoolean(ctx.op.getText());
            this.vars.push(new Const(Type.tBOOL, result));
            this.opCodes.add(result.toString().toUpperCase());
        }

        public void exitLogicAnd(marParser.LogicAndContext ctx) {
            Const right = this.vars.pop(), left = this.vars.pop();
            if (right.isBool() && left.isBool()) {
                opCodes.add("AND");
            } else {
                this.typeErrors++;
                this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                        + left.getType() + " and " + right.getType());
            }
            this.vars.push(new Const(Type.tBOOL, false));
        }

        public void exitUnary(marParser.UnaryContext ctx) {
            boolean error = false;
            Const temp = this.vars.pop();
            if (ctx.op.getType() == marParser.SUB) {
                if (temp.isNumber()) {
                    this.opCodes.add("UMINUS");
                } else {
                    error = true;
                }
            } else { // must be "not" operator
                if (temp.isBool()) {
                    this.opCodes.add("NOT");
                } else {
                    error = true;
                }
            }
            this.vars.push(temp);
            if (error) {
                this.typeErrors++;
                this.printError(ctx,
                        "unary operator " + ctx.op.getText() + " is invalid for " + temp.getType());
            }
        }

        public void exitBinAddSub(marParser.BinAddSubContext ctx) {
            String OP = "";
            Const right = this.vars.pop(), left = this.vars.pop();
            if (ctx.op.getType() == marParser.ADD) {
                if (right.isNumber() && left.isNumber()) {
                    OP = "ADD";
                } else if (right.isString() && left.isString()) {
                    OP = "CONCAT";
                } else {
                    this.typeErrors++;
                    this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                            + left.getType() + " and " + right.getType());
                }
            } else { // must be subtraction
                if (right.isNumber() && left.isNumber()) {
                    OP = "SUB";
                } else {
                    this.typeErrors++;
                    this.printError(ctx, "operator " + ctx.getChild(1).getText() + " is invalid between "
                            + left.getType() + " and " + right.getType());
                }
            }
            this.vars.push(right);
            opCodes.add(OP);
        }

        public void exitAssign(marParser.AssignContext ctx) {
            VariableSymbol temp = (VariableSymbol) this.globalSymbols.get(ctx.ID().getText());
            Const tempConst = this.vars.pop();
            if (temp.getType() != tempConst.getType()) {
                printError(ctx,
                        "cannot assign " + tempConst.getType().getText() + " to type " + temp.getType().getText());
                this.typeErrors++;
            }
            temp.assign();
            this.opCodes.add("STORE " + temp.getIndex());
        }

        public void exitVarDecl(marParser.VarDeclContext ctx) {
            if (ctx.AFFECT() != null) {
                VariableSymbol temp = (VariableSymbol) this.globalSymbols.get(ctx.ID().getText());
                temp.assign();
                Const tempConst = this.vars.pop();
                if (temp.getType() != tempConst.getType()) {
                    printError(ctx,
                            "cannot assign " + tempConst.getType().getText() + " to type " + temp.getType().getText());
                    this.typeErrors++;
                }
                this.opCodes.add("STORE " + temp.getIndex());
            }
        }

        public void exitId(marParser.IdContext ctx) {
            VariableSymbol temp = (VariableSymbol)  this.globalSymbols.get(ctx.ID().getText());
            Type tempType = temp.getType();
            int symbIndex = temp.getIndex();
            switch (tempType) {
                case tNUMBER -> this.vars.add(new Const(Type.tNUMBER, 1.0));
                case tBOOL -> this.vars.add(new Const(Type.tBOOL, false));
                case tNIL -> this.vars.add(new Const(Type.tNIL, null));
                case tSTRING -> this.vars.add(new Const(Type.tSTRING, ""));
            }
            this.opCodes.add("LOAD " + symbIndex);
        }

        public void exitEveryRule(ParserRuleContext ctx) {
            if (ctx.getParent() instanceof marParser.IfContext) {
                if (ctx instanceof marParser.ExprContext) {
                    Const temp = this.vars.pop();
                    if (!temp.isBool()) {
                        this.printError(ctx, "if expression must be of type bool");
                        this.typeErrors++;
                    }
                    this.opCodes.add("JUMPF ");
                    this.ifElsePos.push(this.opCodes.size() - 1);
                } else if ((ctx instanceof marParser.InstContext)
                        && ctx.getParent().getChildCount() > 4) { // else
                    if (!this.inElse) {
                        this.opCodes.add("JUMP ");
                        int index = this.ifElsePos.pop();
                        this.opCodes.set(index, this.opCodes.get(index) + this.opCodes.size());
                        this.ifElsePos.push(this.opCodes.size() - 1);
                        this.inElse = true;
                    } else {
                        this.inElse = false;
                    }
                }
            }
            if (ctx.getParent() instanceof marParser.WhileContext) {
                if (ctx instanceof marParser.ExprContext) {
                    ArrayList<Integer> loadIndexes = this.conditionChecker(this.whilePos.peek(),
                            this.opCodes.size() - 1, "LOAD");
                    if (loadIndexes.size() == 0) {
                        this.printError(ctx.getParent(), "loop is likely to be endless");
                        this.typeErrors++;
                    } else {
                        String[] res;
                        ArrayList<Integer> storeIndexes = this.conditionChecker(this.whilePos.peek(),
                                this.opCodes.size() - 1, "STORE");
                        for (int integer : loadIndexes) {
                            res = this.opCodes.get(integer).split(" ");
                            for (int integer2 : storeIndexes) {
                                if (this.opCodes.get(integer2).split(" ")[1].equals(res[1])) {
                                    changedValue = true;
                                    break;
                                }
                            }
                            if (changedValue) break; // get out earlier
                        }
                        if (!changedValue) {
                            this.printError(ctx.getParent(), "loop is likely to be endless");
                            this.typeErrors++;
                        }
                    }
                    Const temp = this.vars.pop();
                    if (!temp.isBool()) {
                        this.printError(ctx, "while condition must be of type bool");
                        this.typeErrors++;
                    }
                    this.opCodes.add("JUMPF ");
                    this.whilePos.push(this.opCodes.size() - 1);
                } else if (ctx instanceof marParser.InstContext) { // else
                    int index = this.whilePos.pop();
                    this.opCodes.set(index, this.opCodes.get(index) + (this.opCodes.size() + 1));
                    index = this.whilePos.pop();
                    this.opCodes.add("JUMP " + (index + 1));
                }
            }
        }

        public void enterWhile(marParser.WhileContext ctx) {
            this.whilePos.push(this.opCodes.size() - 1);
        }

        public void exitIf(marParser.IfContext ctx) {
            int index = this.ifElsePos.pop();
            this.opCodes.set(index, this.opCodes.get(index) + this.opCodes.size());
        }

        private ArrayList<Integer> conditionChecker(int start, int end, String keyword) {
            ArrayList<Integer> indexes = new ArrayList<>();
            String str;
            int index;
            for (int i = start; i < end; i++) {
                str = this.opCodes.get(i);
                index = str.indexOf(keyword);
                if (index != -1)
                    indexes.add(index);
            }
            return indexes;
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
            if (debug)
                System.out.println("... no parsing errors");

            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase();
            walker.walk(def, tree);

            def.mapGlobals(); // define the indexes of the global variables

            RefPhase ref = new RefPhase(def.scopes, def.global);
            walker.walk(ref, tree);

            if (def.getNumErrors() > 0 || ref.getNumErrors() > 0)
                return;
            Evaluator eval = new Evaluator(def.global);
            // walker.walk(eval, tree);

            if (eval.typeErrors <= 0) {
                if (debug) System.out.println("... no type errors");
            } else
                return;
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile));
            if (debug) System.out.println("... code generation");
            dataOutputStream.write(eval.constToByteArray());
            eval.writeData();
            dataOutputStream.write(eval.byteArray.toByteArray());
            dataOutputStream.close();
            if (debug) {
                System.out.println("Constant pool:");
                for (int i = 0; i < eval.constPool.size(); i++)
                    System.out.println(i + ": " + eval.constPool.get(i));
                System.out.println("Generated assembly code:");
                int i = 0;
                for (String string : eval.opCodes)
                    System.out.println(i++ + ": " + string);
                System.out.println("Saving the constant pool and the bytecodes to " + outputFile);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}