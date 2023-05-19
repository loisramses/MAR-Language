import java.io.*;
import java.util.*;
import SymbolTable.Type;
import util.*;

public class marVM {
    public static class VM {
        private final DataInputStream dataInputStream;
        private ArrayList<Const> constPool;
        private ArrayList<Const> globals;
        private ArrayList<String> instructions;
        private final ArrayList<String> trace;
        private final ArrayList<String> results;
        private final ArrayList<Const> vars;
        private final boolean debug;
        private int LB;

        public VM(File file, boolean debug) throws IOException {
            this.dataInputStream = new DataInputStream(new FileInputStream(file));
            this.constPool = new ArrayList<>();
            this.instructions = new ArrayList<>();
            this.trace = new ArrayList<>();
            this.results = new ArrayList<>();
            this.vars = new ArrayList<>();
            this.debug = debug;
            this.LB = 0;
        }

        private void pushVar(Const var) {
            this.vars.add(var);
        }

        private Const popVar() {
            return this.vars.remove(this.vars.size() - 1);
        }

        private void setVariables() {
            OpCode op;
            double valueDouble;
            int size;
            this.instructions = new ArrayList<>(50);
            try {
                size = this.dataInputStream.readInt();
                this.constPool = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    op = OpCode.valueOf(this.dataInputStream.readInt());
                    switch (op) {
                        case NUMBER -> {
                            valueDouble = this.dataInputStream.readDouble();
                            this.constPool.add(new Const(Type.tNUMBER, valueDouble));
                        }
                        case STRING -> this.constPool.add(new Const(Type.tSTRING, this.dataInputStream.readUTF()));
                        default -> {}
                    }
                }
                while (this.dataInputStream.available() > 0) {
                    op = OpCode.valueOf(this.dataInputStream.readInt());
                    switch (op) {
                        case ADD -> this.instructions.add(OpCode.ADD.getText().toUpperCase());
                        case SUB -> this.instructions.add(OpCode.SUB.getText().toUpperCase());
                        case MULT -> this.instructions.add(OpCode.MULT.getText().toUpperCase());
                        case DIV -> this.instructions.add(OpCode.DIV.getText().toUpperCase());
                        case UMINUS -> this.instructions.add(OpCode.UMINUS.getText().toUpperCase());
                        case HALT -> this.instructions.add(OpCode.HALT.getText().toUpperCase());
                        case AND -> this.instructions.add(OpCode.AND.getText().toUpperCase());
                        case CONCAT -> this.instructions.add(OpCode.CONCAT.getText().toUpperCase());
                        case EQ_B -> this.instructions.add(OpCode.EQ_B.getText().toUpperCase());
                        case EQ_N -> this.instructions.add(OpCode.EQ_N.getText().toUpperCase());
                        case EQ_NIL -> this.instructions.add(OpCode.EQ_NIL.getText().toUpperCase());
                        case EQ_S -> this.instructions.add(OpCode.EQ_S.getText().toUpperCase());
                        case FALSE -> this.instructions.add(OpCode.FALSE.getText().toUpperCase());
                        case GEQ -> this.instructions.add(OpCode.GEQ.getText().toUpperCase());
                        case GT -> this.instructions.add(OpCode.GT.getText().toUpperCase());
                        case LEQ -> this.instructions.add(OpCode.LEQ.getText().toUpperCase());
                        case LT -> this.instructions.add(OpCode.LT.getText().toUpperCase());
                        case NEQ_B -> this.instructions.add(OpCode.NEQ_B.getText().toUpperCase());
                        case NEQ_N -> this.instructions.add(OpCode.NEQ_N.getText().toUpperCase());
                        case NEQ_NIL -> this.instructions.add(OpCode.NEQ_NIL.getText().toUpperCase());
                        case NEQ_S -> this.instructions.add(OpCode.NEQ_S.getText().toUpperCase());
                        case NIL -> this.instructions.add(OpCode.NIL.getText().toUpperCase());
                        case NOT -> this.instructions.add(OpCode.NOT.getText().toUpperCase());
                        case OR -> this.instructions.add(OpCode.OR.getText().toUpperCase());
                        case PRINT_B -> this.instructions.add(OpCode.PRINT_B.getText().toUpperCase());
                        case PRINT_N -> this.instructions.add(OpCode.PRINT_N.getText().toUpperCase());
                        case PRINT_NIL -> this.instructions.add(OpCode.PRINT_NIL.getText().toUpperCase());
                        case PRINT_S -> this.instructions.add(OpCode.PRINT_S.getText().toUpperCase());
                        case TRUE -> this.instructions.add(OpCode.TRUE.getText().toUpperCase());
                        case JUMP -> this.instructions.add(OpCode.JUMP.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case JUMPF -> this.instructions.add(OpCode.JUMPF.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case CONST -> this.instructions.add(OpCode.CONST.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case GLOBAL -> {
                            this.globals = new ArrayList<>(size);
                            this.instructions.add(OpCode.GLOBAL.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        }
                        case STOREG -> this.instructions.add(OpCode.STOREG.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case LOADG -> this.instructions.add(OpCode.LOADG.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case STOREL -> this.instructions.add(OpCode.STOREL.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case LOADL -> this.instructions.add(OpCode.LOADL.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case CALL -> this.instructions.add(OpCode.CALL.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case RETURN -> this.instructions.add(OpCode.RETURN.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case LOCAL -> this.instructions.add(OpCode.LOCAL.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        case POP -> this.instructions.add(OpCode.POP.getText().toUpperCase() + " " + this.dataInputStream.readInt());
                        default -> {}
                    }
                }
                this.closeInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        private void closeInputStream() throws IOException {
            this.dataInputStream.close();
        }

        private void exec_const(int index) {
            Const x = this.constPool.get(index);
            this.pushVar(x);
        }

        private void exec_add() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tNUMBER, Double.sum(left, right)));
        }

        private void exec_sub() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tNUMBER, left - right));
        }

        private void exec_mult() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tNUMBER, left * right));
        }

        private void exec_div() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tNUMBER, left / right));
        }

        private void exec_uminus() {
            Double temp = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tNUMBER, -temp));
        }

        private void exec_and() {
            Boolean right = (Boolean) this.popVar().getValue();
            Boolean left = (Boolean) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, Boolean.logicalAnd(left, right)));
        }

        private void exec_concat() {
            String right = (String) this.popVar().getValue();
            String left = (String) this.popVar().getValue();
            this.pushVar(new Const(Type.tSTRING, "\"" + left.replaceAll("\"", "") + right.replaceAll("\"", "") + "\""));
        }

        private void exec_eqb() {
            Boolean right = (Boolean) this.popVar().getValue();
            Boolean left = (Boolean) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left.equals(right)));
        }

        private void exec_eqn() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left.equals(right)));
        }

        private void exec_eqnil() {
            Object right = this.popVar().getValue();
            Object left = this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left == right));
        }

        private void exec_eqs() {
            String right = (String) this.popVar().getValue();
            String left = (String) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left.equals(right)));
        }

        private void exec_false() {
            this.pushVar(new Const(Type.tBOOL, false));
        }

        private void exec_geq() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left >= right));
        }

        private void exec_gt() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left > right));
        }

        private void exec_leq() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left <= right));
        }

        private void exec_lt() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left < right));
        }

        private void exec_neqb() {
            Boolean right = (Boolean) this.popVar().getValue();
            Boolean left = (Boolean) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, !left.equals(right)));
        }

        private void exec_neqn() {
            Double right = (Double) this.popVar().getValue();
            Double left = (Double) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, !left.equals(right)));
        }

        private void exec_neqnil() {
            Object right = this.popVar().getValue();
            Object left = this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, left != right));
        }

        private void exec_neqs() {
            String right = (String) this.popVar().getValue();
            String left = (String) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, !left.equals(right)));
        }

        private void exec_nill() {
            this.pushVar(new Const(Type.tNIL, null));
        }

        private void exec_not() {
            Boolean temp = (Boolean) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, !temp));
        }

        private void exec_or() {
            Boolean right = (Boolean) this.popVar().getValue();
            Boolean left = (Boolean) this.popVar().getValue();
            this.pushVar(new Const(Type.tBOOL, Boolean.logicalOr(left, right)));
        }

        private void exec_printb() {
            Boolean temp = (Boolean) this.popVar().getValue();
            this.results.add(temp.toString());
            this.trace.add(temp.toString());
        }

        private void exec_printn() {
            Double temp = (Double) this.popVar().getValue();
            this.results.add(temp.toString());
            this.trace.add(temp.toString());
        }

        private void exec_printnil() {
            this.popVar();
            this.results.add("nil");
            this.trace.add("nil");
        }

        private void exec_prints() {
            String temp = ((String) this.popVar().getValue()).replaceAll("\"", "");
            this.results.add(temp);
            this.trace.add(temp);
        }

        private void exec_true() {
            this.pushVar(new Const(Type.tBOOL, true));
        }

        public int exec_jump(int pointer) {
            return pointer - 1; // menos um pq o i ainda tem que incrementar no for
        }

        public int exec_jumpf(int i, int pointer) {
            Boolean res = (Boolean) this.popVar().getValue();
            if (!res) 
                return pointer - 1; // menos um pq o i ainda tem que incrementar no for
            return i;
        }

        public void exec_global(int size) {
            for (int i = 0; i < size; i++)
                this.globals.add(new Const(Type.tNIL, null));
        }

        public void exec_storeg(int index) {
            this.globals.set(index, this.popVar());
        }
        
        public void exec_loadg(int index) {
            this.pushVar(this.globals.get(index));
        }
        
        public void exec_storel(int index) {
            this.vars.set(this.LB + index, this.popVar());
        }

        public void exec_loadl(int index) {
            this.pushVar(this.vars.get(this.LB + index));
        }

        public int exec_call(int pointer, int currentInst) {
            this.pushVar(new Const(Type.tINT, this.LB));
            this.LB = this.vars.size() - 1;
            this.pushVar(new Const(Type.tINT, currentInst + 1));
            return pointer - 1;
        }

        public int exec_return(int size) {
            Const funcResult = this.popVar();
            int nextInst = (int) this.popVar().getValue();
            this.LB = (int) this.popVar().getValue();
            for (int i = 0; i < size; i++)
                this.popVar();
            this.pushVar(funcResult);
            return nextInst - 1;
        }

        public void exec_local(int size) {
            for (int i = 0; i < size; i++)
                this.pushVar(new Const(Type.tNIL, null));
        }

        public void exec_pop(int size) {
            for (int i = 0; i < size; i++)
                this.popVar();
        }
    }

    public static void main(String[] args) throws IOException {
        String inputFile = null;
        boolean debug = false;
        if (args.length > 0)
            inputFile = args[0];
        if (args.length > 1 && args[1].compareTo("-debug") == 0)
            debug = true;
        assert inputFile != null;
        File input = new File(inputFile);
        VM vm = new VM(input, debug);
        vm.setVariables();
        OpCode op;
        String toPrintStack, toPrintGlobals, string, lbValue;
        String[] instruction;
        for (int i = 0; i < vm.instructions.size(); i++) {
            string = vm.instructions.get(i);
            if (vm.globals != null) toPrintGlobals = "\t\t\t\t\t\tGLOBALS: " + vm.globals + "\n ";
            else toPrintGlobals = "";
            toPrintStack = "\t\t\t\t\t\tStack: " + vm.vars + "\n ";
            lbValue = "\t\t\t\t\t\tLB: " + vm.LB;
            instruction = string.split(" ");
            op = OpCode.valueOf(instruction[0]);
            vm.trace.add(toPrintGlobals + toPrintStack + lbValue + "\n" + i + ": " + string);
            switch (op) {
                case ADD -> vm.exec_add();
                case SUB -> vm.exec_sub();
                case MULT -> vm.exec_mult();
                case DIV -> vm.exec_div();
                case UMINUS -> vm.exec_uminus();
                case AND -> vm.exec_and();
                case CONCAT -> vm.exec_concat();
                case EQ_B -> vm.exec_eqb();
                case EQ_N -> vm.exec_eqn();
                case EQ_NIL -> vm.exec_eqnil();
                case EQ_S -> vm.exec_eqs();
                case FALSE -> vm.exec_false();
                case GEQ -> vm.exec_geq();
                case GT -> vm.exec_gt();
                case LEQ -> vm.exec_leq();
                case LT -> vm.exec_lt();
                case NEQ_B -> vm.exec_neqb();
                case NEQ_N -> vm.exec_neqn();
                case NEQ_NIL -> vm.exec_neqnil();
                case NEQ_S -> vm.exec_neqs();
                case NIL -> vm.exec_nill();
                case NOT -> vm.exec_not();
                case OR -> vm.exec_or();
                case PRINT_B -> vm.exec_printb();
                case PRINT_N -> vm.exec_printn();
                case PRINT_NIL -> vm.exec_printnil();
                case PRINT_S -> vm.exec_prints();
                case TRUE -> vm.exec_true();
                case JUMP -> i = vm.exec_jump(Integer.parseInt(instruction[1]));
                case JUMPF -> i = vm.exec_jumpf(i, Integer.parseInt(instruction[1]));
                case CONST -> vm.exec_const(Integer.parseInt(instruction[1]));
                case GLOBAL -> vm.exec_global(Integer.parseInt(instruction[1]));
                case STOREG -> vm.exec_storeg(Integer.parseInt(instruction[1]));
                case LOADG -> vm.exec_loadg(Integer.parseInt(instruction[1]));
                case STOREL -> vm.exec_storel(Integer.parseInt(instruction[1]));
                case LOADL -> vm.exec_loadl(Integer.parseInt(instruction[1]));
                case CALL -> i = vm.exec_call(Integer.parseInt(instruction[1]), i);
                case RETURN -> i = vm.exec_return(Integer.parseInt(instruction[1]));
                case LOCAL -> vm.exec_local(Integer.parseInt(instruction[1]));
                case POP -> vm.exec_pop(Integer.parseInt(instruction[1]));
                default -> {}
            }
        }
        if (vm.debug) {
            System.out.println("Constant pool:");
            for (int i = 0; i < vm.constPool.size(); i++)
                System.out.println(i + ": " + vm.constPool.get(i));
            System.out.println("Instructions:");
            for (int i = 0; i < vm.instructions.size(); i++)
                System.out.println(i + ": " + vm.instructions.get(i));
            System.out.println("Trace while running the code:");
            for (String inst : vm.trace)
                System.out.println(inst);
        } else for (String res : vm.results) System.out.println(res);
    }
}