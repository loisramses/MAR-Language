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

        public Evaluator(/* String fileName, */boolean debug) {
            this.debug = debug;
            this.count = 0;
            byteArray = new ByteArrayOutputStream();
        }

        public void exitMult(marParser.MultContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.MULT.getValue()).byteValue());
            if (this.debug)
                System.out.println(count++ + ": MULT");
        }

        public void exitDiv(marParser.DivContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.DIV.getValue()).byteValue());
            if (this.debug)
                System.out.println(count++ + ": DIV");
        }

        public void exitAdd(marParser.AddContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.ADD.getValue()).byteValue());
            if (this.debug)
                System.out.println(count++ + ": ADD");
        }

        public void exitSub(marParser.SubContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.SUB.getValue()).byteValue());
            if (this.debug)
                System.out.println(count++ + ": SUB");
        }

        public void exitNumber(marParser.NumberContext ctx) {
            double result = Double.valueOf(ctx.NUMBER().getText());
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.DCONST.getValue()).byteValue());
            this.byteArray.write(Double.valueOf(result).byteValue());
            if (this.debug)
                System.out.println(count++ + ": DCONST " + result);
        }

        public void exitNegative(marParser.NegativeContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.UMINUS.getValue()).byteValue());
            if (this.debug)
                System.out.println(count++ + ": UMINUS");
        }

        public void exitInst(marParser.InstContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.PRINT.getValue()).byteValue());
            if (this.debug)
                System.out.println(count++ + ": PRINT");
        }

        public void exitProg(marParser.ProgContext ctx) {
            this.byteArray.write(Integer.valueOf(marCompiler.Evaluator.opCode.HALT.getValue()).byteValue());
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
                outputFile = new File("../outputs/" + temp.getName() + "bc");
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
            Evaluator eval = new Evaluator(/* inputFile, */debug);
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
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}