// Generated from C:/Users/luisr/OneDrive - Universidade do Algarve/uni/3º Ano/2º SEMESTRE/Compiladores/Trabalho/Part4/src\mar.g4 by ANTLR 4.12.0
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ENDLINE=8, ADD=9, 
		MULT=10, DIV=11, SUB=12, NOT=13, PRINT=14, PARENTL=15, PARENTR=16, CPARENTL=17, 
		CPARENTR=18, NUMBER=19, DIGIT=20, DQ=21, STRING=22, TRUE=23, FALSE=24, 
		OR=25, AND=26, EQ=27, NEQ=28, GT=29, LT=30, GEQ=31, LEQ=32, AFFECT=33, 
		T_NUMBER=34, T_STRING=35, T_BOOL=36, T_NIL=37, ID=38, LETTER=39, SL_COMMENT=40, 
		ML_COMMENT=41, WS=42;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ifCond = 2, RULE_whileCond = 3, RULE_functions = 4, 
		RULE_elseInst = 5, RULE_type = 6, RULE_block = 7, RULE_varDecl = 8, RULE_functionDecl = 9, 
		RULE_formalParams = 10, RULE_formalParam = 11, RULE_expr = 12, RULE_exprList = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ifCond", "whileCond", "functions", "elseInst", "type", 
			"block", "varDecl", "functionDecl", "formalParams", "formalParam", "expr", 
			"exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'while'", "'do'", "'return'", "'else'", "','", 
			"';'", "'+'", "'*'", "'/'", "'-'", "'not'", "'print'", "'('", "')'", 
			"'{'", "'}'", null, null, "'\"'", null, "'true'", "'false'", "'or'", 
			"'and'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", "'number'", 
			"'string'", "'bool'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ENDLINE", "ADD", "MULT", 
			"DIV", "SUB", "NOT", "PRINT", "PARENTL", "PARENTR", "CPARENTL", "CPARENTR", 
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
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					varDecl();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			functions();
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				inst();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 412346937386L) != 0) );
			setState(40);
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
	public static class UselessContext extends InstContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public UselessContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterUseless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitUseless(this);
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
	public static class ReturnContext extends InstContext {
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitReturn(this);
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
		public WhileCondContext whileCond() {
			return getRuleContext(WhileCondContext.class,0);
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
		public IfCondContext ifCond() {
			return getRuleContext(IfCondContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public ElseInstContext elseInst() {
			return getRuleContext(ElseInstContext.class,0);
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
	@SuppressWarnings("CheckReturnValue")
	public static class InstBlockContext extends InstContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstBlockContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterInstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitInstBlock(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inst);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new InstBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				block();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ID);
				setState(44);
				match(AFFECT);
				setState(45);
				expr(0);
				setState(46);
				match(ENDLINE);
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(PRINT);
				setState(49);
				expr(0);
				setState(50);
				match(ENDLINE);
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(T__0);
				setState(53);
				ifCond();
				setState(54);
				match(T__1);
				setState(55);
				inst();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					elseInst();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(T__2);
				setState(60);
				whileCond();
				setState(61);
				match(T__3);
				setState(62);
				inst();
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(T__4);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412346789888L) != 0)) {
					{
					setState(65);
					expr(0);
					}
				}

				setState(68);
				match(ENDLINE);
				}
				break;
			case 7:
				_localctx = new UselessContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				expr(0);
				setState(70);
				match(ENDLINE);
				}
				break;
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
	public static class IfCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterIfCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitIfCond(this);
		}
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			expr(0);
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
	public static class WhileCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterWhileCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitWhileCond(this);
		}
	}

	public final WhileCondContext whileCond() throws RecognitionException {
		WhileCondContext _localctx = new WhileCondContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			expr(0);
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
	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					functionDecl();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class ElseInstContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public ElseInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterElseInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitElseInst(this);
		}
	}

	public final ElseInstContext elseInst() throws RecognitionException {
		ElseInstContext _localctx = new ElseInstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			inst();
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
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CPARENTL() { return getToken(marParser.CPARENTL, 0); }
		public TerminalNode CPARENTR() { return getToken(marParser.CPARENTR, 0); }
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CPARENTL);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				{
				setState(90);
				varDecl();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412346937386L) != 0)) {
				{
				{
				setState(96);
				inst();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(CPARENTR);
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
		enterRule(_localctx, 16, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type();
			setState(105);
			match(ID);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(106);
				match(AFFECT);
				setState(107);
				expr(0);
				}
			}

			setState(110);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode PARENTL() { return getToken(marParser.PARENTL, 0); }
		public TerminalNode PARENTR() { return getToken(marParser.PARENTR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				setState(112);
				type();
				}
			}

			setState(115);
			match(ID);
			setState(116);
			match(PARENTL);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				setState(117);
				formalParams();
				}
			}

			setState(120);
			match(PARENTR);
			setState(121);
			block();
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
	public static class FormalParamsContext extends ParserRuleContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFormalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFormalParams(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			formalParam();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(124);
				match(T__6);
				setState(125);
				formalParam();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FormalParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFormalParam(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			type();
			setState(132);
			match(ID);
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
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode PARENTL() { return getToken(marParser.PARENTL, 0); }
		public TerminalNode PARENTR() { return getToken(marParser.PARENTR, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitCall(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135);
				match(ID);
				setState(136);
				match(PARENTL);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412346789888L) != 0)) {
					{
					setState(137);
					exprList();
					}
				}

				setState(140);
				match(PARENTR);
				}
				break;
			case 2:
				{
				_localctx = new HandleParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(PARENTL);
				setState(142);
				expr(0);
				setState(143);
				match(PARENTR);
				}
				break;
			case 3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
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
				setState(146);
				expr(12);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
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
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new NilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(T_NIL);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new BinMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(155);
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
						setState(156);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new BinAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(158);
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
						setState(159);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new InEqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
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
						setState(165);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(167);
						match(AND);
						setState(168);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(170);
						match(OR);
						setState(171);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expr(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(178);
				match(T__6);
				setState(179);
				expr(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
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
		"\u0004\u0001*\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000%\b\u0000\u000b\u0000"+
		"\f\u0000&\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004P\b\u0004"+
		"\n\u0004\f\u0004S\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007\\\b\u0007\n\u0007\f\u0007"+
		"_\t\u0007\u0001\u0007\u0005\u0007b\b\u0007\n\u0007\f\u0007e\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bm\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0003\tr\b\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u007f\b\n\n\n\f\n\u0082"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u008b\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ad"+
		"\b\f\n\f\f\f\u00b0\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b5\b\r\n\r\f"+
		"\r\u00b8\t\r\u0001\r\u0000\u0001\u0018\u000e\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0007\u0001\u0000"+
		"\"$\u0001\u0000\f\r\u0001\u0000\u0017\u0018\u0001\u0000\n\u000b\u0002"+
		"\u0000\t\t\f\f\u0001\u0000\u001d \u0001\u0000\u001b\u001c\u00cb\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004J\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000"+
		"\u0000\nT\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000eY\u0001"+
		"\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000"+
		"\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000"+
		"\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0010\b\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000\"$\u0003\b\u0004\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0000\u0000\u0001"+
		")\u0001\u0001\u0000\u0000\u0000*I\u0003\u000e\u0007\u0000+,\u0005&\u0000"+
		"\u0000,-\u0005!\u0000\u0000-.\u0003\u0018\f\u0000./\u0005\b\u0000\u0000"+
		"/I\u0001\u0000\u0000\u000001\u0005\u000e\u0000\u000012\u0003\u0018\f\u0000"+
		"23\u0005\b\u0000\u00003I\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u0000"+
		"56\u0003\u0004\u0002\u000067\u0005\u0002\u0000\u000079\u0003\u0002\u0001"+
		"\u00008:\u0003\n\u0005\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:I\u0001\u0000\u0000\u0000;<\u0005\u0003\u0000\u0000<=\u0003\u0006"+
		"\u0003\u0000=>\u0005\u0004\u0000\u0000>?\u0003\u0002\u0001\u0000?I\u0001"+
		"\u0000\u0000\u0000@B\u0005\u0005\u0000\u0000AC\u0003\u0018\f\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DI\u0005\b\u0000\u0000EF\u0003\u0018\f\u0000FG\u0005\b\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000H*\u0001\u0000\u0000\u0000H+\u0001\u0000\u0000\u0000"+
		"H0\u0001\u0000\u0000\u0000H4\u0001\u0000\u0000\u0000H;\u0001\u0000\u0000"+
		"\u0000H@\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000I\u0003\u0001"+
		"\u0000\u0000\u0000JK\u0003\u0018\f\u0000K\u0005\u0001\u0000\u0000\u0000"+
		"LM\u0003\u0018\f\u0000M\u0007\u0001\u0000\u0000\u0000NP\u0003\u0012\t"+
		"\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000R\t\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0003\u0002\u0001\u0000"+
		"V\u000b\u0001\u0000\u0000\u0000WX\u0007\u0000\u0000\u0000X\r\u0001\u0000"+
		"\u0000\u0000Y]\u0005\u0011\u0000\u0000Z\\\u0003\u0010\b\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^c\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`b\u0003\u0002\u0001\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0012\u0000\u0000"+
		"g\u000f\u0001\u0000\u0000\u0000hi\u0003\f\u0006\u0000il\u0005&\u0000\u0000"+
		"jk\u0005!\u0000\u0000km\u0003\u0018\f\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\b\u0000\u0000"+
		"o\u0011\u0001\u0000\u0000\u0000pr\u0003\f\u0006\u0000qp\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005&\u0000"+
		"\u0000tv\u0005\u000f\u0000\u0000uw\u0003\u0014\n\u0000vu\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0010"+
		"\u0000\u0000yz\u0003\u000e\u0007\u0000z\u0013\u0001\u0000\u0000\u0000"+
		"{\u0080\u0003\u0016\u000b\u0000|}\u0005\u0007\u0000\u0000}\u007f\u0003"+
		"\u0016\u000b\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0003\f\u0006\u0000\u0084\u0085\u0005&\u0000\u0000\u0085"+
		"\u0017\u0001\u0000\u0000\u0000\u0086\u0087\u0006\f\uffff\uffff\u0000\u0087"+
		"\u0088\u0005&\u0000\u0000\u0088\u008a\u0005\u000f\u0000\u0000\u0089\u008b"+
		"\u0003\u001a\r\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0099\u0005"+
		"\u0010\u0000\u0000\u008d\u008e\u0005\u000f\u0000\u0000\u008e\u008f\u0003"+
		"\u0018\f\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u0099\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092\u0099\u0003\u0018"+
		"\f\f\u0093\u0099\u0007\u0002\u0000\u0000\u0094\u0099\u0005\u0016\u0000"+
		"\u0000\u0095\u0099\u0005\u0013\u0000\u0000\u0096\u0099\u0005%\u0000\u0000"+
		"\u0097\u0099\u0005&\u0000\u0000\u0098\u0086\u0001\u0000\u0000\u0000\u0098"+
		"\u008d\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098"+
		"\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u00ae\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\n\u000b\u0000\u0000\u009b\u009c\u0007\u0003\u0000\u0000\u009c\u00ad"+
		"\u0003\u0018\f\f\u009d\u009e\n\n\u0000\u0000\u009e\u009f\u0007\u0004\u0000"+
		"\u0000\u009f\u00ad\u0003\u0018\f\u000b\u00a0\u00a1\n\t\u0000\u0000\u00a1"+
		"\u00a2\u0007\u0005\u0000\u0000\u00a2\u00ad\u0003\u0018\f\n\u00a3\u00a4"+
		"\n\b\u0000\u0000\u00a4\u00a5\u0007\u0006\u0000\u0000\u00a5\u00ad\u0003"+
		"\u0018\f\t\u00a6\u00a7\n\u0007\u0000\u0000\u00a7\u00a8\u0005\u001a\u0000"+
		"\u0000\u00a8\u00ad\u0003\u0018\f\b\u00a9\u00aa\n\u0006\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0019\u0000\u0000\u00ab\u00ad\u0003\u0018\f\u0007\u00ac\u009a"+
		"\u0001\u0000\u0000\u0000\u00ac\u009d\u0001\u0000\u0000\u0000\u00ac\u00a0"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003\u0018\f\u0000\u00b2\u00b3\u0005"+
		"\u0007\u0000\u0000\u00b3\u00b5\u0003\u0018\f\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u001b\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u0011\u001f&9BHQ]clq"+
		"v\u0080\u008a\u0098\u00ac\u00ae\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}