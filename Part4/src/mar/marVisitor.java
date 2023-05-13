// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part4/src\mar.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by the {@code InstBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstBlock(marParser.InstBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(marParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(marParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(marParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(marParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclare}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclare(marParser.VarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclare}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclare(marParser.FuncDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(marParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Useless}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseless(marParser.UselessContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(marParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(marParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(marParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(marParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(marParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(marParser.FormalParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(marParser.CallContext ctx);
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
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(marParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(marParser.IdContext ctx);
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
	 * Visit a parse tree produced by {@link marParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(marParser.ExprListContext ctx);
}