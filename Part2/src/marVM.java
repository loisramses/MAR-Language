import java.io.*;
import java.util.*;
import util.*;

public class marVM {
    public static class VM {
        private final DataInputStream dataInputStream;
        private ArrayList<Const> constPool;
        private ArrayList<String> instructions;
        private ArrayList<String> trace;
        private ArrayList<String> results;
        private final Stack<Const> vars;
        private final boolean debug;

        public VM(File file, boolean debug) throws IOException {
            this.dataInputStream = new DataInputStream(new FileInputStream(file));
            this.constPool = new ArrayList<>();
            this.instructions = new ArrayList<>();
            this.trace = new ArrayList<>();
            this.results = new ArrayList<>();
            this.vars = new Stack<>();
            this.debug = debug;
        }

        private void setVariables() {
            OpCode op;
            Double valueDouble;
            String valueString;
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
                            this.constPool.add(new Const("number", valueDouble));
                        }
                        case STRING -> {
                            int nBytes = this.dataInputStream.readInt();
                            byte[] bytes = this.dataInputStream.readNBytes(nBytes);
                            valueString = new String(bytes);
                            this.constPool.add(new Const("string", valueString));
                        }
                        default -> {}
                    }
                }
                while (this.dataInputStream.available() > 0) {
                    op = OpCode.valueOf(this.dataInputStream.readInt());
                    switch (op) {
                        case ADD -> {
                            instructions.add(OpCode.ADD.getText().toUpperCase());
                        }
                        case SUB -> {
                            instructions.add(OpCode.SUB.getText().toUpperCase());
                        }
                        case MULT -> {
                            instructions.add(OpCode.MULT.getText().toUpperCase());
                        }
                        case DIV -> {
                            instructions.add(OpCode.DIV.getText().toUpperCase());
                        }
                        case UMINUS -> {
                            instructions.add(OpCode.UMINUS.getText().toUpperCase());
                        }
                        case HALT -> {
                            instructions.add(OpCode.HALT.getText().toUpperCase());
                        }
                        case AND -> {
                            instructions.add(OpCode.AND.getText().toUpperCase());
                        }
                        case CONCAT -> {
                            instructions.add(OpCode.CONCAT.getText().toUpperCase());
                        }
                        case EQ_B -> {
                            instructions.add(OpCode.EQ_B.getText().toUpperCase());
                        }
                        case EQ_N -> {
                            instructions.add(OpCode.EQ_N.getText().toUpperCase());
                        }
                        case EQ_NIL -> {
                            instructions.add(OpCode.EQ_NIL.getText().toUpperCase());
                        }
                        case EQ_S -> {
                            instructions.add(OpCode.EQ_S.getText().toUpperCase());
                        }
                        case FALSE -> {
                            instructions.add(OpCode.FALSE.getText().toUpperCase());
                        }
                        case GEQ -> {
                            instructions.add(OpCode.GEQ.getText().toUpperCase());
                        }
                        case GT -> {
                            instructions.add(OpCode.GT.getText().toUpperCase());
                        }
                        case LEQ -> {
                            instructions.add(OpCode.LEQ.getText().toUpperCase());
                        }
                        case LT -> {
                            instructions.add(OpCode.LT.getText().toUpperCase());
                        }
                        case NEQ_B -> {
                            instructions.add(OpCode.NEQ_B.getText().toUpperCase());
                        }
                        case NEQ_N -> {
                            instructions.add(OpCode.NEQ_N.getText().toUpperCase());
                        }
                        case NEQ_NIL -> {
                            instructions.add(OpCode.NEQ_NIL.getText().toUpperCase());
                        }
                        case NEQ_S -> {
                            instructions.add(OpCode.NEQ_S.getText().toUpperCase());
                        }
                        case NIL -> {
                            instructions.add(OpCode.NIL.getText().toUpperCase());
                        }
                        case NOT -> {
                            instructions.add(OpCode.NOT.getText().toUpperCase());
                        }
                        case OR -> {
                            instructions.add(OpCode.OR.getText().toUpperCase());
                        }
                        case PRINT_B -> {
                            instructions.add(OpCode.PRINT_B.getText().toUpperCase());
                        }
                        case PRINT_N -> {
                            instructions.add(OpCode.PRINT_N.getText().toUpperCase());
                        }
                        case PRINT_NIL -> {
                            instructions.add(OpCode.PRINT_NIL.getText().toUpperCase());
                        }
                        case PRINT_S -> {
                            instructions.add(OpCode.PRINT_S.getText().toUpperCase());
                        }
                        case TRUE -> {
                            instructions.add(OpCode.TRUE.getText().toUpperCase());
                        }
                        default -> {
                            instructions.add("CONST " + this.dataInputStream.readInt());
                        }
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

        private void exec_dconst(Const x) {
            this.vars.push(x);
        }

        public void exec_sconst(Const x) {
            this.vars.push(x);
        }

        private void exec_add() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("number", Double.sum(left, right)));
        }

        private void exec_sub() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("number", left - right));
        }

        private void exec_mult() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("number", left * right));
        }

        private void exec_div() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("number", left / right));
        }

        private void exec_uminus() {
            Double temp = (Double) this.vars.pop().getValue();
            this.vars.add(new Const("number", -temp));
        }

        private void exec_and() {
            Boolean right = (Boolean) this.vars.pop().getValue();
            Boolean left = (Boolean) this.vars.pop().getValue();
            this.vars.push(new Const("bool", Boolean.logicalAnd(left, right)));
        }

        private void exec_concat() {
            String right = (String) this.vars.pop().getValue();
            String left = (String) this.vars.pop().getValue();
            this.vars.push(new Const("string", "\"" + left.replaceAll("\"", "") + right.replaceAll("\"", "") + "\""));
        }

        private void exec_eqb() {
            Boolean right = (Boolean) this.vars.pop().getValue();
            Boolean left = (Boolean) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left.equals(right)));
        }

        private void exec_eqn() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left.equals(right)));
        }

        private void exec_eqnil() {
            Object right = this.vars.pop().getValue();
            Object left = this.vars.pop().getValue();
            this.vars.push(new Const("bool", left == right));
        }

        private void exec_eqs() {
            String right = (String) this.vars.pop().getValue();
            String left = (String) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left.equals(right)));
        }

        private void exec_false() {
            this.vars.push(new Const("bool", false));
        }

        private void exec_geq() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left >= right));
        }

        private void exec_gt() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left > right));
        }

        private void exec_leq() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left <= right));
        }

        private void exec_lt() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("bool", left < right));
        }

        private void exec_neqb() {
            Boolean right = (Boolean) this.vars.pop().getValue();
            Boolean left = (Boolean) this.vars.pop().getValue();
            this.vars.push(new Const("bool", !left.equals(right)));
        }

        private void exec_neqn() {
            Double right = (Double) this.vars.pop().getValue();
            Double left = (Double) this.vars.pop().getValue();
            this.vars.push(new Const("bool", !left.equals(right)));
        }

        private void exec_neqnil() {
            Object right = this.vars.pop().getValue();
            Object left = this.vars.pop().getValue();
            this.vars.push(new Const("bool", left != right));
        }

        private void exec_neqs() {
            String right = (String) this.vars.pop().getValue();
            String left = (String) this.vars.pop().getValue();
            this.vars.push(new Const("bool", !left.equals(right)));
        }

        private void exec_nill() {
            this.vars.push(new Const("nil", null));
        }

        private void exec_not() {
            Boolean temp = (Boolean) this.vars.pop().getValue();
            this.vars.push(new Const("bool", !temp));
        }

        private void exec_or() {
            Boolean right = (Boolean) this.vars.pop().getValue();
            Boolean left = (Boolean) this.vars.pop().getValue();
            this.vars.push(new Const("bool", Boolean.logicalOr(left, right)));
        }

        private void exec_printb() {
            Boolean temp = (Boolean) this.vars.pop().getValue();
            this.results.add(temp.toString());
            this.trace.add(temp.toString());
        }

        private void exec_printn() {
            Double temp = (Double) this.vars.pop().getValue();
            this.results.add(temp.toString());
            this.trace.add(temp.toString());
        }

        private void exec_printnil() {
            this.vars.pop();
            this.results.add("nil");
            this.trace.add("nil");
        }

        private void exec_prints() {
            String temp = ((String) this.vars.pop().getValue()).replaceAll("\"", "");
            this.results.add(temp);
            this.trace.add(temp);
        }

        private void exec_true() {
            this.vars.push(new Const("bool", true));
        }
    }

    public static void main(String[] args) throws IOException {
        String inputFile = null;
        boolean debug = false;
        if (args.length > 0)
            inputFile = args[0];
        if (args.length > 1 && args[1].compareTo("-debug") == 0)
            debug = true;
        File input = new File(inputFile);
        VM vm = new VM(input, debug);
        vm.setVariables();
        OpCode op;
        String toPrint;
        for (String string : vm.instructions) {
            toPrint = "\t\t\t\t\t\tStack: " + vm.vars + "\n ";
            try {
                op = OpCode.valueOf(string);
            } catch (IllegalArgumentException e) {
                String[] res = string.split(" ");
                Const temp = vm.constPool.get(Integer.parseInt(res[res.length - 1]));
                if (temp.isNumber()) vm.exec_dconst(temp);
                else vm.exec_sconst(temp);
                string += " '" + temp.toString();
                vm.trace.add(toPrint + string);
                continue;
            }
            vm.trace.add(toPrint + string);
            switch (op) {
                case ADD -> {
                    vm.exec_add();
                }
                case SUB -> {
                    vm.exec_sub();
                }
                case MULT -> {
                    vm.exec_mult();
                }
                case DIV -> {
                    vm.exec_div();
                }
                case UMINUS -> {
                    vm.exec_uminus();
                }
                case AND -> {
                    vm.exec_and();
                }
                case CONCAT -> {
                    vm.exec_concat();
                }
                case EQ_B -> {
                    vm.exec_eqb();
                }
                case EQ_N -> {
                    vm.exec_eqn();
                }
                case EQ_NIL -> {
                    vm.exec_eqnil();
                }
                case EQ_S -> {
                    vm.exec_eqs();
                }
                case FALSE -> {
                    vm.exec_false();
                }
                case GEQ -> {
                    vm.exec_geq();
                }
                case GT -> {
                    vm.exec_gt();
                }
                case LEQ -> {
                    vm.exec_leq();
                }
                case LT -> {
                    vm.exec_lt();
                }
                case NEQ_B -> {
                    vm.exec_neqb();
                }
                case NEQ_N -> {
                    vm.exec_neqn();
                }
                case NEQ_NIL -> {
                    vm.exec_neqnil();
                }
                case NEQ_S -> {
                    vm.exec_neqs();
                }
                case NIL -> {
                    vm.exec_nill();
                }
                case NOT -> {
                    vm.exec_not();
                }
                case OR -> {
                    vm.exec_or();
                }
                case PRINT_B -> {
                    vm.exec_printb();
                }
                case PRINT_N -> {
                    vm.exec_printn();
                }
                case PRINT_NIL -> {
                    vm.exec_printnil();
                }
                case PRINT_S -> {
                    vm.exec_prints();
                }
                case TRUE -> {
                    vm.exec_true();
                }
                default -> {}
            }
        }
        if (vm.debug) {
            System.out.println("Constant pool:");
            for (int i = 0; i < vm.constPool.size(); i++) {
                System.out.println(i + ": " + vm.constPool.get(i));
            }
            System.out.println("Instructions:");
            for (int i = 0; i < vm.instructions.size(); i++) {
                System.out.println(i + ": " + vm.instructions.get(i));
            }
            System.out.println("Trace while running the code:");
            for (String string : vm.trace) {
                System.out.println(string);
            }
        } else for (String string : vm.results) System.out.println(string);
    }
}