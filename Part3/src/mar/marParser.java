// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part3/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class marParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ENDLINE=6, ADD=7, MULT=8, DIV=9, 
		SUB=10, NOT=11, PRINT=12, PARENTL=13, PARENTR=14, CPARENTL=15, CPARENTR=16, 
		NUMBER=17, DIGIT=18, DQ=19, STRING=20, TRUE=21, FALSE=22, OR=23, AND=24, 
		EQ=25, NEQ=26, GT=27, LT=28, GEQ=29, LEQ=30, AFFECT=31, T_NUMBER=32, T_STRING=33, 
		T_BOOL=34, T_NIL=35, ID=36, LETTER=37, SL_COMMENT=38, ML_COMMENT=39, WS=40;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_type = 2, RULE_varDecl = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "type", "varDecl", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "';'", "'+'", "'*'", 
			"'/'", "'-'", "'not'", "'print'", "'('", "')'", "'{'", "'}'", null, null, 
			"'\"'", null, "'true'", "'false'", "'or'", "'and'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'='", "'number'", "'string'", "'bool'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ENDLINE", "ADD", "MULT", "DIV", 
			"SUB", "NOT", "PRINT", "PARENTL", "PARENTR", "CPARENTL", "CPARENTR", 
			"NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", "OR", "AND", "EQ", 
			"NEQ", "GT", "LT", "GEQ", "LEQ", "AFFECT", "T_NUMBER", "T_STRING", "T_BOOL", 
			"T_NIL", "ID", "LETTER", "SL_COMMENT", "ML_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public marParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(marParser.EOF, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) {
				{
				{
				setState(10);
				varDecl();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				inst();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719513618L) != 0) );
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstContext extends ParserRuleContext {
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
	 
		public InstContext() { }
		public void copyFrom(InstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends InstContext {
		public TerminalNode PRINT() { return getToken(marParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public PrintContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends InstContext {
		public TerminalNode CPARENTL() { return getToken(marParser.CPARENTL, 0); }
		public TerminalNode CPARENTR() { return getToken(marParser.CPARENTR, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public BlockContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBlock(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends InstContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode AFFECT() { return getToken(marParser.AFFECT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public AssignContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends InstContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public WhileContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends InstContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public IfContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitIf(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inst);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CPARENTL:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(CPARENTL);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719513618L) != 0)) {
					{
					{
					setState(24);
					inst();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30);
				match(CPARENTR);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(ID);
				setState(32);
				match(AFFECT);
				setState(33);
				expr(0);
				setState(34);
				match(ENDLINE);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(PRINT);
				setState(37);
				expr(0);
				setState(38);
				match(ENDLINE);
				}
				break;
			case T__0:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(T__0);
				setState(41);
				expr(0);
				setState(42);
				match(T__1);
				setState(43);
				inst();
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44);
					match(T__2);
					setState(45);
					inst();
					}
					break;
				}
				}
				break;
			case T__3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__3);
				setState(49);
				expr(0);
				setState(50);
				match(T__4);
				setState(51);
				inst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_NUMBER() { return getToken(marParser.T_NUMBER, 0); }
		public TerminalNode T_STRING() { return getToken(marParser.T_STRING, 0); }
		public TerminalNode T_BOOL() { return getToken(marParser.T_BOOL, 0); }
		public TerminalNode T_NIL() { return getToken(marParser.T_NIL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public TerminalNode AFFECT() { return getToken(marParser.AFFECT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(59);
				match(AFFECT);
				setState(60);
				expr(0);
				}
			}

			setState(63);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(marParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(marParser.DIV, 0); }
		public BinMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBinMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBinMulDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(marParser.OR, 0); }
		public LogicOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitLogicOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InEqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(marParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(marParser.NEQ, 0); }
		public InEqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterInEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitInEquality(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(marParser.LT, 0); }
		public TerminalNode GT() { return getToken(marParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(marParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(marParser.GEQ, 0); }
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitRelational(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(marParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(marParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(marParser.NOT, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitUnary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(marParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(marParser.SUB, 0); }
		public BinAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBinAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBinAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HandleParenContext extends ExprContext {
		public TerminalNode PARENTL() { return getToken(marParser.PARENTL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(marParser.PARENTR, 0); }
		public HandleParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterHandleParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitHandleParen(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilContext extends ExprContext {
		public TerminalNode T_NIL() { return getToken(marParser.T_NIL, 0); }
		public NilContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNil(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(marParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExprContext {
		public Token op;
		public TerminalNode TRUE() { return getToken(marParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(marParser.FALSE, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBoolean(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(marParser.AND, 0); }
		public LogicAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitLogicAnd(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTL:
				{
				_localctx = new HandleParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(PARENTL);
				setState(67);
				expr(0);
				setState(68);
				match(PARENTR);
				}
				break;
			case SUB:
			case NOT:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==NOT) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				expr(12);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((BooleanContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(NUMBER);
				}
				break;
			case T_NIL:
				{
				_localctx = new NilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(T_NIL);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(80);
						((BinMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((BinMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new BinAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(83);
						((BinAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((BinAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(86);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new InEqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(89);
						((InEqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((InEqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						match(AND);
						setState(93);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
						match(OR);
						setState(96);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000\u0004"+
		"\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t\u0004\u0001"+
		"\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0007\u0001"+
		"\u0000 #\u0001\u0000\n\u000b\u0001\u0000\u0015\u0016\u0001\u0000\b\t\u0002"+
		"\u0000\u0007\u0007\n\n\u0001\u0000\u001b\u001e\u0001\u0000\u0019\u001a"+
		"v\u0000\r\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004"+
		"7\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\bM\u0001\u0000"+
		"\u0000\u0000\n\f\u0003\u0006\u0003\u0000\u000b\n\u0001\u0000\u0000\u0000"+
		"\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u001b\u0005\u000f\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e6\u0005\u0010\u0000\u0000\u001f \u0005$\u0000"+
		"\u0000 !\u0005\u001f\u0000\u0000!\"\u0003\b\u0004\u0000\"#\u0005\u0006"+
		"\u0000\u0000#6\u0001\u0000\u0000\u0000$%\u0005\f\u0000\u0000%&\u0003\b"+
		"\u0004\u0000&\'\u0005\u0006\u0000\u0000\'6\u0001\u0000\u0000\u0000()\u0005"+
		"\u0001\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005\u0002\u0000\u0000+.\u0003"+
		"\u0002\u0001\u0000,-\u0005\u0003\u0000\u0000-/\u0003\u0002\u0001\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/6\u0001\u0000\u0000"+
		"\u000001\u0005\u0004\u0000\u000012\u0003\b\u0004\u000023\u0005\u0005\u0000"+
		"\u000034\u0003\u0002\u0001\u000046\u0001\u0000\u0000\u00005\u0017\u0001"+
		"\u0000\u0000\u00005\u001f\u0001\u0000\u0000\u00005$\u0001\u0000\u0000"+
		"\u00005(\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u00006\u0003\u0001"+
		"\u0000\u0000\u000078\u0007\u0000\u0000\u00008\u0005\u0001\u0000\u0000"+
		"\u00009:\u0003\u0004\u0002\u0000:=\u0005$\u0000\u0000;<\u0005\u001f\u0000"+
		"\u0000<>\u0003\b\u0004\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0006\u0000\u0000@\u0007\u0001"+
		"\u0000\u0000\u0000AB\u0006\u0004\uffff\uffff\u0000BC\u0005\r\u0000\u0000"+
		"CD\u0003\b\u0004\u0000DE\u0005\u000e\u0000\u0000EN\u0001\u0000\u0000\u0000"+
		"FG\u0007\u0001\u0000\u0000GN\u0003\b\u0004\fHN\u0007\u0002\u0000\u0000"+
		"IN\u0005\u0014\u0000\u0000JN\u0005\u0011\u0000\u0000KN\u0005#\u0000\u0000"+
		"LN\u0005$\u0000\u0000MA\u0001\u0000\u0000\u0000MF\u0001\u0000\u0000\u0000"+
		"MH\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000Nc\u0001\u0000"+
		"\u0000\u0000OP\n\u000b\u0000\u0000PQ\u0007\u0003\u0000\u0000Qb\u0003\b"+
		"\u0004\fRS\n\n\u0000\u0000ST\u0007\u0004\u0000\u0000Tb\u0003\b\u0004\u000b"+
		"UV\n\t\u0000\u0000VW\u0007\u0005\u0000\u0000Wb\u0003\b\u0004\nXY\n\b\u0000"+
		"\u0000YZ\u0007\u0006\u0000\u0000Zb\u0003\b\u0004\t[\\\n\u0007\u0000\u0000"+
		"\\]\u0005\u0018\u0000\u0000]b\u0003\b\u0004\b^_\n\u0006\u0000\u0000_`"+
		"\u0005\u0017\u0000\u0000`b\u0003\b\u0004\u0007aO\u0001\u0000\u0000\u0000"+
		"aR\u0001\u0000\u0000\u0000aU\u0001\u0000\u0000\u0000aX\u0001\u0000\u0000"+
		"\u0000a[\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\t\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000\t\r\u0013\u001b.5=Mac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}