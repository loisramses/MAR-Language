import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class marVM {
    public static class VM {
        private enum opCode {
            DCONST(0),
            ADD(1),
            SUB(2),
            MULT(3),
            DIV(4),
            UMINUS(5),
            PRINT(6),
            HALT(7);

            private int value;
            private static Map<Integer, opCode> map = new HashMap<>();

            private opCode(int value) {
                this.value = value;
            }

            static {
                for (marVM.VM.opCode op : opCode.values()) {
                    map.put(op.value, op);
                }
            }

            public static opCode valueOf(int value) {
                return (opCode) map.get(value);
            }

            public int getValue() {
                return this.value;
            }
        }

        private DataInputStream dataInputStream;
        private Stack<Double> stack;
        private File inputFile;
        private boolean debug;

        public VM(File file, boolean debug) throws IOException {
            this.inputFile = file;
            this.dataInputStream = new DataInputStream(new FileInputStream(this.inputFile));
            this.stack = new Stack<Double>();
            this.debug = debug;
        }

        public void resetInputStream() throws FileNotFoundException {
            this.dataInputStream = new DataInputStream(new FileInputStream(this.inputFile));
        }

        public void closeInputStream() throws IOException {
            this.dataInputStream.close();
        }

        private void exec_dconst(double x) {
            stack.add(x);
        }

        private void exec_add() {
            double right = stack.pop();
            double left = stack.pop();
            stack.add(Double.sum(left, right));
        }

        private void exec_sub() {
            double right = stack.pop();
            double left = stack.pop();
            stack.add(left - right);
        }

        private void exec_mult() {
            double right = stack.pop();
            double left = stack.pop();
            stack.add(left * right);
        }

        private void exec_div() {
            double right = stack.pop();
            double left = stack.pop();
            stack.add(left / right);
        }

        private void exec_uminus() {
            stack.add(-stack.pop());
        }

        private void exec_print() {
            System.out.println(stack.pop());
        }

        private void exec_halt() {
            System.exit(0);
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
        marVM.VM.opCode op;
        double value;
        if (debug) {
            byte[] byteCodes = new byte[(int) input.length()];
            vm.dataInputStream.readFully(byteCodes);
            System.out.println("Reading bytecodes from " + input);
            for (byte b : byteCodes)
                System.out.print(b + " ");
            System.out.println();
            vm.resetInputStream();
        }

        while (vm.dataInputStream.available() > 0) {
            op = marVM.VM.opCode.valueOf(vm.dataInputStream.read());
            switch (op) {
                case DCONST:
                    value = vm.dataInputStream.read();
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op + " " + value);
                    }
                    vm.exec_dconst(value);
                    break;
                case ADD:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.exec_add();
                    break;
                case SUB:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.exec_sub();
                    break;
                case MULT:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.exec_mult();
                    break;
                case DIV:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.exec_div();
                    break;
                case UMINUS:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.exec_uminus();
                    break;
                case PRINT:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.exec_print();
                    break;
                case HALT:
                    if (vm.debug) {
                        System.out.println("\t\tStack: " + vm.stack);
                        System.out.println(" " + op);
                    }
                    vm.closeInputStream();
                    vm.exec_halt();
                    break;
            }
        }
        vm.closeInputStream();
    }
}