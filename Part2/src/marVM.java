import java.io.*;
import java.util.*;
import util.*;

public class marVM {
    public static class VM {
        private final DataInputStream dataInputStream;
        private final Stack<Const> constPool;
        private final boolean debug;

        public VM(File file, boolean debug) throws IOException {
            this.dataInputStream = new DataInputStream(new FileInputStream(file));
            this.constPool = new Stack<>();
            this.debug = debug;
        }

        public void closeInputStream() throws IOException {
            this.dataInputStream.close();
        }

        private void exec_dconst(Double x) {
            constPool.push(new Const("number", x));
        }

        public void exec_sconst(String valueString) {
            constPool.push(new Const("string", valueString));
        }

        private void exec_add() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("number", Double.sum(left, right)));
        }

        private void exec_sub() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("number", left - right));
        }

        private void exec_mult() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("number", left * right));
        }

        private void exec_div() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("number", left / right));
        }

        private void exec_uminus() {
            Double temp = (Double) constPool.pop().getValue();
            constPool.add(new Const("number", -temp));
        }

        private void exec_halt() {
            System.exit(0);
        }

        public void exec_and() {
            Boolean right = (Boolean) constPool.pop().getValue();
            Boolean left = (Boolean) constPool.pop().getValue();
            constPool.push(new Const("bool", Boolean.logicalAnd(left, right)));
        }

        public void exec_concat() {
            String right = (String) constPool.pop().getValue();
            String left = (String) constPool.pop().getValue();
            constPool.push(new Const("string", "\"" + left.replaceAll("\"", "") + right.replaceAll("\"", "") + "\""));
        }

        public void exec_eqb() {
            Boolean right = (Boolean) constPool.pop().getValue();
            Boolean left = (Boolean) constPool.pop().getValue();
            constPool.push(new Const("bool", left.equals(right)));
        }

        public void exec_eqn() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("bool", left.equals(right)));
        }

        public void exec_eqnil() {
            Object right = constPool.pop().getValue();
            Object left = constPool.pop().getValue();
            constPool.push(new Const("bool", left == right));
        }

        public void exec_eqs() {
            String right = (String) constPool.pop().getValue();
            String left = (String) constPool.pop().getValue();
            constPool.push(new Const("bool", left.equals(right)));
        }

        public void exec_false() {
            constPool.push(new Const("bool", false));
        }

        public void exec_geq() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("bool", left >= right));
        }

        public void exec_gt() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("bool", left > right));
        }

        public void exec_leq() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("bool", left <= right));
        }

        public void exec_lt() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("bool", left < right));
        }

        public void exec_neqb() {
            Boolean right = (Boolean) constPool.pop().getValue();
            Boolean left = (Boolean) constPool.pop().getValue();
            constPool.push(new Const("bool", !left.equals(right)));
        }

        public void exec_neqn() {
            Double right = (Double) constPool.pop().getValue();
            Double left = (Double) constPool.pop().getValue();
            constPool.push(new Const("bool", !left.equals(right)));
        }

        public void exec_neqnil() {
            Object right = constPool.pop().getValue();
            Object left = constPool.pop().getValue();
            constPool.push(new Const("bool", left != right));
        }

        public void exec_neqs() {
            String right = (String) constPool.pop().getValue();
            String left = (String) constPool.pop().getValue();
            constPool.push(new Const("bool", !left.equals(right)));
        }

        public void exec_nill() {
            constPool.push(new Const("nil", null));
        }

        public void exec_not() {
            Boolean temp = (Boolean) constPool.pop().getValue();
            constPool.push(new Const("bool", !temp));
        }

        public void exec_or() {
            Boolean right = (Boolean) constPool.pop().getValue();
            Boolean left = (Boolean) constPool.pop().getValue();
            constPool.push(new Const("bool", Boolean.logicalOr(left, right)));
        }

        public void exec_printb() {
            Boolean temp = (Boolean) constPool.pop().getValue();
            System.out.println(temp);
        }

        public void exec_printn() {
            Double temp = (Double) constPool.pop().getValue();
            System.out.println(temp);
        }

        public void exec_printnil() {
            constPool.pop();
            System.out.println("nil");
        }

        public void exec_prints() {
            String temp = (String) constPool.pop().getValue();
            System.out.println(temp.replaceAll("\"", ""));
        }

        public void exec_true() {
            this.constPool.push(new Const("bool", true));
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
        OpCode op;
        double valueDouble;
        String valueString;
        while (vm.dataInputStream.available() > 0) {
            op = OpCode.valueOf(vm.dataInputStream.readInt());
            switch (op) {
                case NUMBER -> {
                    valueDouble = vm.dataInputStream.readDouble();
                    vm.exec_dconst(valueDouble);
                    if (vm.debug)
                        System.out
                                .println("\t\tStack: " + vm.constPool + "\n CONST '" + vm.constPool.peek().toString());
                }
                case STRING -> {
                    int nBytes = vm.dataInputStream.readInt();
                    byte[] bytes = vm.dataInputStream.readNBytes(nBytes);
                    valueString = new String(bytes);
                    vm.exec_sconst(valueString);
                    if (vm.debug)
                        System.out
                                .println("\t\tStack: " + vm.constPool + "\n CONST '" + vm.constPool.peek().toString());
                }
                case ADD -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_add();
                }
                case SUB -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_sub();
                }
                case MULT -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_mult();
                }
                case DIV -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_div();
                }
                case UMINUS -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_uminus();
                }
                case HALT -> {
                    vm.closeInputStream();
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_halt();
                }
                case AND -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_and();
                }
                case CONCAT -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_concat();
                }
                case EQ_B -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_eqb();
                }
                case EQ_N -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_eqn();
                }
                case EQ_NIL -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_eqnil();
                }
                case EQ_S -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_eqs();
                }
                case FALSE -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_false();
                }
                case GEQ -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_geq();
                }
                case GT -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_gt();
                }
                case LEQ -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_leq();
                }
                case LT -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_lt();
                }
                case NEQ_B -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_neqb();
                }
                case NEQ_N -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_neqn();
                }
                case NEQ_NIL -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_neqnil();
                }
                case NEQ_S -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_neqs();
                }
                case NIL -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_nill();
                }
                case NOT -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_not();
                }
                case OR -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_or();
                }
                case PRINT_B -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_printb();
                }
                case PRINT_N -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_printn();
                }
                case PRINT_NIL -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_printnil();
                }
                case PRINT_S -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_prints();
                }
                case TRUE -> {
                    if (vm.debug)
                        System.out.println("\t\tStack: " + vm.constPool + "\n " + op);
                    vm.exec_true();
                }
                default -> {
                }
            }
        }

        vm.closeInputStream();
    }
}