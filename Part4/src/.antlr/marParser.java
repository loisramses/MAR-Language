// Generated from c:\Users\luisr\OneDrive - Universidade do Algarve\u005Cuni\3º Ano\2º SEMESTRE\Compiladores\Trabalho\Part4\src\mar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class marParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ENDLINE=10, ADD=11, MULT=12, DIV=13, SUB=14, NOT=15, PRINT=16, PARENTL=17, 
		PARENTR=18, CPARENTL=19, CPARENTR=20, NUMBER=21, DIGIT=22, DQ=23, STRING=24, 
		TRUE=25, FALSE=26, OR=27, AND=28, EQ=29, NEQ=30, GT=31, LT=32, GEQ=33, 
		LEQ=34, AFFECT=35, T_NUMBER=36, T_STRING=37, T_BOOL=38, T_NIL=39, ID=40, 
		LETTER=41, SL_COMMENT=42, ML_COMMENT=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ifCond = 2, RULE_whileCond = 3, RULE_test = 4, 
		RULE_functions = 5, RULE_elseInst = 6, RULE_type = 7, RULE_block = 8, 
		RULE_varDecl = 9, RULE_functionDecl = 10, RULE_formalParams = 11, RULE_formalParam = 12, 
		RULE_expr = 13, RULE_exprList = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ifCond", "whileCond", "test", "functions", "elseInst", 
			"type", "block", "varDecl", "functionDecl", "formalParams", "formalParam", 
			"expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'while'", "'do'", "'return'", "'b'", "'aa'", 
			"'else'", "','", "';'", "'+'", "'*'", "'/'", "'-'", "'not'", "'print'", 
			"'('", "')'", "'{'", "'}'", null, null, "'\"'", null, "'true'", "'false'", 
			"'or'", "'and'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", 
			"'number'", "'string'", "'bool'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ENDLINE", 
			"ADD", "MULT", "DIV", "SUB", "NOT", "PRINT", "PARENTL", "PARENTR", "CPARENTL", 
			"CPARENTR", "NUMBER", "DIGIT", "DQ", "STRING", "TRUE", "FALSE", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GEQ", "LEQ", "AFFECT", "T_NUMBER", "T_STRING", 
			"T_BOOL", "T_NIL", "ID", "LETTER", "SL_COMMENT", "ML_COMMENT", "WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					varDecl();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			functions();
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				inst();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << SUB) | (1L << NOT) | (1L << PRINT) | (1L << PARENTL) | (1L << CPARENTL) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << T_NIL) | (1L << ID))) != 0) );
			setState(42);
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
	public static class UselessContext extends InstContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public UselessContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class PrintContext extends InstContext {
		public TerminalNode PRINT() { return getToken(marParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public PrintContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnContext extends InstContext {
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends InstContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode AFFECT() { return getToken(marParser.AFFECT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(marParser.ENDLINE, 0); }
		public AssignContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class WhileContext extends InstContext {
		public WhileCondContext whileCond() {
			return getRuleContext(WhileCondContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public WhileContext(InstContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class InstBlockContext extends InstContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstBlockContext(InstContext ctx) { copyFrom(ctx); }
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inst);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new InstBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				block();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(ID);
				setState(46);
				match(AFFECT);
				setState(47);
				expr(0);
				setState(48);
				match(ENDLINE);
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(PRINT);
				setState(51);
				expr(0);
				setState(52);
				match(ENDLINE);
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(T__0);
				setState(55);
				ifCond();
				setState(56);
				match(T__1);
				setState(57);
				inst();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(58);
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
				setState(61);
				match(T__2);
				setState(62);
				whileCond();
				setState(63);
				match(T__3);
				setState(64);
				inst();
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(T__4);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << PARENTL) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << T_NIL) | (1L << ID))) != 0)) {
					{
					setState(67);
					expr(0);
					}
				}

				setState(70);
				match(ENDLINE);
				}
				break;
			case 7:
				_localctx = new UselessContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				expr(0);
				setState(72);
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

	public static class IfCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifCond);
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

	public static class WhileCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCond; }
	}

	public final WhileCondContext whileCond() throws RecognitionException {
		WhileCondContext _localctx = new WhileCondContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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

	public static class TestContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			test();
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
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					functionDecl();
					}
					} 
				}
				setState(88);
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

	public static class ElseInstContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public ElseInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseInst; }
	}

	public final ElseInstContext elseInst() throws RecognitionException {
		ElseInstContext _localctx = new ElseInstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);
			setState(90);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_NUMBER() { return getToken(marParser.T_NUMBER, 0); }
		public TerminalNode T_STRING() { return getToken(marParser.T_STRING, 0); }
		public TerminalNode T_BOOL() { return getToken(marParser.T_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NUMBER) | (1L << T_STRING) | (1L << T_BOOL))) != 0)) ) {
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CPARENTL);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NUMBER) | (1L << T_STRING) | (1L << T_BOOL))) != 0)) {
				{
				{
				setState(95);
				varDecl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << SUB) | (1L << NOT) | (1L << PRINT) | (1L << PARENTL) | (1L << CPARENTL) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << T_NIL) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				inst();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type();
			setState(110);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFFECT) {
				{
				setState(111);
				match(AFFECT);
				setState(112);
				expr(0);
				}
			}

			setState(115);
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
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NUMBER) | (1L << T_STRING) | (1L << T_BOOL))) != 0)) {
				{
				setState(117);
				type();
				}
			}

			setState(120);
			match(ID);
			setState(121);
			match(PARENTL);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NUMBER) | (1L << T_STRING) | (1L << T_BOOL))) != 0)) {
				{
				setState(122);
				formalParams();
				}
			}

			setState(125);
			match(PARENTR);
			setState(126);
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
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			formalParam();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(129);
				match(T__8);
				setState(130);
				formalParam();
				}
				}
				setState(135);
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

	public static class FormalParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			type();
			setState(137);
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
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode PARENTL() { return getToken(marParser.PARENTL, 0); }
		public TerminalNode PARENTR() { return getToken(marParser.PARENTR, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class LogicOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(marParser.OR, 0); }
		public LogicOrContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
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
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(marParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(marParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(marParser.NOT, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class HandleParenContext extends ExprContext {
		public TerminalNode PARENTL() { return getToken(marParser.PARENTL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(marParser.PARENTR, 0); }
		public HandleParenContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NilContext extends ExprContext {
		public TerminalNode T_NIL() { return getToken(marParser.T_NIL, 0); }
		public NilContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(marParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanContext extends ExprContext {
		public Token op;
		public TerminalNode TRUE() { return getToken(marParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(marParser.FALSE, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LogicAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(marParser.AND, 0); }
		public LogicAndContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(140);
				match(ID);
				setState(141);
				match(PARENTL);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << PARENTL) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << T_NIL) | (1L << ID))) != 0)) {
					{
					setState(142);
					exprList();
					}
				}

				setState(145);
				match(PARENTR);
				}
				break;
			case 2:
				{
				_localctx = new HandleParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(PARENTL);
				setState(147);
				expr(0);
				setState(148);
				match(PARENTR);
				}
				break;
			case 3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
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
				setState(151);
				expr(12);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
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
				setState(153);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new NilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T_NIL);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new BinMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(160);
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
						setState(161);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new BinAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(163);
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
						setState(164);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(166);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ))) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new InEqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(169);
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
						setState(170);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						match(AND);
						setState(173);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						match(OR);
						setState(176);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(181);
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
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(183);
				match(T__8);
				setState(184);
				expr(0);
				}
				}
				setState(189);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3G\n\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\7"+
		"\7W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\nc\n\n\f\n\16\nf"+
		"\13\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13t\n"+
		"\13\3\13\3\13\3\f\5\fy\n\f\3\f\3\f\3\f\5\f~\n\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u0092\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00a0\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7"+
		"\13\17\3\20\3\20\3\20\7\20\u00bc\n\20\f\20\16\20\u00bf\13\20\3\20\2\3"+
		"\34\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\n\3\2\b\t\3\2&(\3\2\20"+
		"\21\3\2\33\34\3\2\16\17\4\2\r\r\20\20\3\2!$\3\2\37 \2\u00d1\2#\3\2\2\2"+
		"\4L\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fX\3\2\2\2\16[\3\2\2\2\20"+
		"^\3\2\2\2\22`\3\2\2\2\24o\3\2\2\2\26x\3\2\2\2\30\u0082\3\2\2\2\32\u008a"+
		"\3\2\2\2\34\u009f\3\2\2\2\36\u00b8\3\2\2\2 \"\5\24\13\2! \3\2\2\2\"%\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&(\5\f\7\2\')\5\4\3\2(\'"+
		"\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\2\2\3-\3\3\2\2\2"+
		".M\5\22\n\2/\60\7*\2\2\60\61\7%\2\2\61\62\5\34\17\2\62\63\7\f\2\2\63M"+
		"\3\2\2\2\64\65\7\22\2\2\65\66\5\34\17\2\66\67\7\f\2\2\67M\3\2\2\289\7"+
		"\3\2\29:\5\6\4\2:;\7\4\2\2;=\5\4\3\2<>\5\16\b\2=<\3\2\2\2=>\3\2\2\2>M"+
		"\3\2\2\2?@\7\5\2\2@A\5\b\5\2AB\7\6\2\2BC\5\4\3\2CM\3\2\2\2DF\7\7\2\2E"+
		"G\5\34\17\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HM\7\f\2\2IJ\5\34\17\2JK\7\f"+
		"\2\2KM\3\2\2\2L.\3\2\2\2L/\3\2\2\2L\64\3\2\2\2L8\3\2\2\2L?\3\2\2\2LD\3"+
		"\2\2\2LI\3\2\2\2M\5\3\2\2\2NO\5\34\17\2O\7\3\2\2\2PQ\5\34\17\2Q\t\3\2"+
		"\2\2RS\t\2\2\2ST\5\n\6\2T\13\3\2\2\2UW\5\26\f\2VU\3\2\2\2WZ\3\2\2\2XV"+
		"\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3\2\2\2[\\\7\n\2\2\\]\5\4\3\2]\17\3\2"+
		"\2\2^_\t\3\2\2_\21\3\2\2\2`d\7\25\2\2ac\5\24\13\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2ej\3\2\2\2fd\3\2\2\2gi\5\4\3\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\26\2\2n\23\3\2\2\2op\5\20"+
		"\t\2ps\7*\2\2qr\7%\2\2rt\5\34\17\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\f"+
		"\2\2v\25\3\2\2\2wy\5\20\t\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7*\2\2{}\7"+
		"\23\2\2|~\5\30\r\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\24\2\2"+
		"\u0080\u0081\5\22\n\2\u0081\27\3\2\2\2\u0082\u0087\5\32\16\2\u0083\u0084"+
		"\7\13\2\2\u0084\u0086\5\32\16\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\31\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7*\2\2\u008c\33\3\2\2\2\u008d"+
		"\u008e\b\17\1\2\u008e\u008f\7*\2\2\u008f\u0091\7\23\2\2\u0090\u0092\5"+
		"\36\20\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u00a0\7\24\2\2\u0094\u0095\7\23\2\2\u0095\u0096\5\34\17\2\u0096\u0097"+
		"\7\24\2\2\u0097\u00a0\3\2\2\2\u0098\u0099\t\4\2\2\u0099\u00a0\5\34\17"+
		"\16\u009a\u00a0\t\5\2\2\u009b\u00a0\7\32\2\2\u009c\u00a0\7\27\2\2\u009d"+
		"\u00a0\7)\2\2\u009e\u00a0\7*\2\2\u009f\u008d\3\2\2\2\u009f\u0094\3\2\2"+
		"\2\u009f\u0098\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00b5\3\2\2\2\u00a1"+
		"\u00a2\f\r\2\2\u00a2\u00a3\t\6\2\2\u00a3\u00b4\5\34\17\16\u00a4\u00a5"+
		"\f\f\2\2\u00a5\u00a6\t\7\2\2\u00a6\u00b4\5\34\17\r\u00a7\u00a8\f\13\2"+
		"\2\u00a8\u00a9\t\b\2\2\u00a9\u00b4\5\34\17\f\u00aa\u00ab\f\n\2\2\u00ab"+
		"\u00ac\t\t\2\2\u00ac\u00b4\5\34\17\13\u00ad\u00ae\f\t\2\2\u00ae\u00af"+
		"\7\36\2\2\u00af\u00b4\5\34\17\n\u00b0\u00b1\f\b\2\2\u00b1\u00b2\7\35\2"+
		"\2\u00b2\u00b4\5\34\17\t\u00b3\u00a1\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3"+
		"\u00a7\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\35\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bd\5\34\17\2\u00b9\u00ba\7\13"+
		"\2\2\u00ba\u00bc\5\34\17\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00bd\3\2\2"+
		"\2\23#*=FLXdjsx}\u0087\u0091\u009f\u00b3\u00b5\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}