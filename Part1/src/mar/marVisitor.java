// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part1/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link marParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface marVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(marParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(marParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HandleParen}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandleParen(marParser.HandleParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(marParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(marParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(marParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(marParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(marParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(marParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Test}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(marParser.TestContext ctx);
}