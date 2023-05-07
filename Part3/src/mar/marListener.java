// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part3/src\mar.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterBlock(marParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitBlock(marParser.BlockContext ctx);
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
}