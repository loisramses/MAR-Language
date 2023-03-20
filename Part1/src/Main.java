/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import mar.*;

public class Main {
    /** Sample "calculator" */
    public static class Evaluator extends marBaseListener {
        Stack<Integer> stack = new Stack<Integer>();

        public void exitMult(marParser.MultOrDivContext ctx) {
            int right = stack.pop();
            int left = stack.pop();
            stack.push( left * right );
        }

        public void exitAdd(marParser.AddOrSubContext ctx) {
            int right = stack.pop();
            int left = stack.pop();
            stack.push(left + right);
        }

        public void exitInt(marParser.NumberContext ctx) {
            stack.push( Integer.valueOf(ctx.NUMBER().getText()) );
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        try {
            if (inputFile != null) is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            marLexer lexer = new marLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            marParser parser = new marParser(tokens);
            ParseTree tree = parser.prog();
            ParseTreeWalker walker = new ParseTreeWalker();
            Evaluator eval = new Evaluator();
            walker.walk(eval, tree);
            System.out.println("stack result = " + eval.stack.pop());
        }
        catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
