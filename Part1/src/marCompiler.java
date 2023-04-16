import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
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

        private boolean debug;
        private int count;
        ByteArrayOutputStream byteArray;
        DataOutputStream byteArrayOutputStream;

        public Evaluator(/* String fileName, */boolean debug) {
            this.debug = debug;
            this.count = 0;
            byteArray = new ByteArrayOutputStream();
            byteArrayOutputStream = new DataOutputStream(byteArray);
        }

        public void exitMult(marParser.MultContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.MULT.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": MULT");
        }

        public void exitDiv(marParser.DivContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.DIV.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": DIV");
        }

        public void exitAdd(marParser.AddContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.ADD.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": ADD");
        }

        public void exitSub(marParser.SubContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.SUB.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": SUB");
        }

        public void exitTest(marParser.TestContext ctx) {
            System.out.println(ctx.op.getText());
        }
        public void exitNumber(marParser.NumberContext ctx) {
            double result = Double.valueOf(ctx.NUMBER().getText());
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.DCONST.getValue()));
                this.byteArrayOutputStream.writeDouble(Double.valueOf(result));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": DCONST " + result);
        }

        public void exitNegative(marParser.NegativeContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.UMINUS.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": UMINUS");
        }

        public void exitInst(marParser.InstContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.PRINT.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": PRINT");
        }

        public void exitProg(marParser.ProgContext ctx) {
            try {
                this.byteArrayOutputStream.writeInt(Integer.valueOf(opCode.HALT.getValue()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.debug)
                System.out.println(count++ + ": HALT");
        }
    }

    public static void main(String[] args) throws IOException {
        String inputFileName = null, outputFileName = "../outputs/out.marbc";
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
                temp.delete();
            }
            CharStream input = CharStreams.fromStream(is);
            marLexer lexer = new marLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            marParser parser = new marParser(tokens);
            ParseTree tree = parser.prog();
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.exit(1);
            }
            ParseTreeWalker walker = new ParseTreeWalker();
            Evaluator eval = new Evaluator(debug);
            if (debug)
                System.out.println("Generated assembly code:");
            walker.walk(eval, tree);
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile));
            dataOutputStream.write(eval.byteArray.toByteArray());
            dataOutputStream.close();
            if (eval.debug) {
                System.out.println("Corrresponding bytecodes:");
                byte[] byteCodes = eval.byteArray.toByteArray();
                for (byte b : byteCodes)
                    System.out.print(b + " ");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}