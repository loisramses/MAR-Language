import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
// import java.util.*;
import mar.*;

public class marCompiler {
    public static class Evaluator extends marBaseListener {
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

            private opCode(int value) {
                this.value = value;
            }

            public int getValue() {
                return this.value;
            }
        }

        boolean debug;
        int count;
        // Stack<Double> stack = new Stack<Double>();
        DataOutputStream dataOutputStream;
        String outputFile;

        public Evaluator(String fileName, boolean debug) {
            this.debug = debug;
            this.count = 0;
            this.outputFile = "../outputs/out.marbc";
            if (fileName != null) {
                File file = new File(fileName);
                outputFile = "../outputs/" + file.getName() + "bc";
            }
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public void exitMult(marParser.MultContext ctx) {
            // double right = stack.pop();
            // double left = stack.pop();
            // double result = left * right;
            // stack.push(result);
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.MULT.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": MULT");
        }

        public void exitDiv(marParser.DivContext ctx) {
            // double right = stack.pop();
            // double left = stack.pop();
            // double result = left / right;
            // stack.push(result);
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.DIV.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": DIV");
        }

        public void exitAdd(marParser.AddContext ctx) {
            // double right = stack.pop();
            // double left = stack.pop();
            // double result = Double.sum(left, right);
            // stack.push(result);
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.ADD.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": ADD");
        }

        public void exitSub(marParser.SubContext ctx) {
            // double right = stack.pop();
            // double left = stack.pop();
            // double result = left - right;
            // stack.push(result);
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.SUB.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": SUB");
        }

        public void exitNumber(marParser.NumberContext ctx) {
            double result = Double.valueOf(ctx.NUMBER().getText());
            // stack.push(result);
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.DCONST.getValue());
                dataOutputStream.writeDouble(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": DCONST " + result);
        }

        public void exitNegative(marParser.NegativeContext ctx) {
            // double result = -stack.pop();
            // stack.push(result);
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.UMINUS.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": UMINUS");
        }

        public void exitInst(marParser.InstContext ctx) {
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.PRINT.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": PRINT");
        }

        public void exitProg(marParser.ProgContext ctx) {
            try {
                dataOutputStream.writeInt(marCompiler.Evaluator.opCode.HALT.getValue());
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": HALT");
        }
    }

    public static void main(String[] args) throws IOException {
        String inputFile = null;
        boolean debug = false;
        if (args.length > 0)
            inputFile = args[0];
        if (args.length > 1 && args[1].compareTo("-debug") == 0)
            debug = true;
        InputStream is = System.in;
        try {
            if (inputFile != null)
                is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            marLexer lexer = new marLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            marParser parser = new marParser(tokens);
            ParseTree tree = parser.prog();
            ParseTreeWalker walker = new ParseTreeWalker();
            Evaluator eval = new Evaluator(inputFile, debug);
            if (eval.debug)
                System.out.println("Generated assembly code:");
            walker.walk(eval, tree);
            if (eval.debug) {
                File out = new File(eval.outputFile);
                byte[] byteCodes = new byte[(int) out.length()];
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(eval.outputFile));
                System.out.println("Corrresponding bytecodes:");
                dataInputStream.readFully(byteCodes);
                dataInputStream.close();
                for (byte b : byteCodes)
                    System.out.print(b + " ");
                System.out.println();
            }

        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}