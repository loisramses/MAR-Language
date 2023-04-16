// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part2/src\mar.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(marParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinMulDiv}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinMulDiv(marParser.BinMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr(marParser.LogicOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(marParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InEquality}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEquality(marParser.InEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(marParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(marParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(marParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd(marParser.LogicAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(marParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinAddSub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinAddSub(marParser.BinAddSubContext ctx);
}