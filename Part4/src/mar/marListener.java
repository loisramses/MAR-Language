// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part4/src\mar.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by the {@code InstBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstBlock(marParser.InstBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstBlock(marParser.InstBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterAssign(marParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitAssign(marParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterPrint(marParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitPrint(marParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterIf(marParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitIf(marParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterWhile(marParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitWhile(marParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterReturn(marParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitReturn(marParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Useless}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterUseless(marParser.UselessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Useless}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitUseless(marParser.UselessContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfCond(marParser.IfCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfCond(marParser.IfCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#whileCond}.
	 * @param ctx the parse tree
	 */
	void enterWhileCond(marParser.WhileCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#whileCond}.
	 * @param ctx the parse tree
	 */
	void exitWhileCond(marParser.WhileCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(marParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(marParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#elseInst}.
	 * @param ctx the parse tree
	 */
	void enterElseInst(marParser.ElseInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#elseInst}.
	 * @param ctx the parse tree
	 */
	void exitElseInst(marParser.ElseInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(marParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(marParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(marParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(marParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(marParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(marParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(marParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(marParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(marParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(marParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(marParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(marParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(marParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(marParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinMulDiv}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinMulDiv(marParser.BinMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinMulDiv}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinMulDiv(marParser.BinMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr(marParser.LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicOr}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr(marParser.LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InEquality}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInEquality(marParser.InEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InEquality}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInEquality(marParser.InEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelational(marParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelational(marParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(marParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(marParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(marParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(marParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinAddSub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinAddSub(marParser.BinAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinAddSub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinAddSub(marParser.BinAddSubContext ctx);
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
	 * Enter a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNil(marParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNil(marParser.NilContext ctx);
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
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(marParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(marParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(marParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(marParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd(marParser.LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicAnd}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd(marParser.LogicAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(marParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(marParser.ExprListContext ctx);
}