// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part1/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link marParser}.
 */
public interface marListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(marParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(marParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(marParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(marParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HandleParen}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterHandleParen(marParser.HandleParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HandleParen}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitHandleParen(marParser.HandleParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(marParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(marParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(marParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(marParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(marParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(marParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(marParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(marParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(marParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(marParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(marParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(marParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Test}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTest(marParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Test}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTest(marParser.TestContext ctx);
}