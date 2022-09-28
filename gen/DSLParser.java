// Generated from E:/compiler/src\DSLParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAGE_WORD=1, CONTROLLER_WORD=2, COMMENT=3, SEA_WS=4, PAGE_OPEN=5, HEADER=6, 
		BODY=7, OPEN_BREAKET=8, PAGE_CLOSE=9, PAGE_COMMENT=10, NAME=11, PAGE_WHITESPACE=12, 
		INPUT=13, TWO_POINT=14, CLOSED_BREAKET=15, CONTENT_WHITESPACE=16, TYPE_NAME=17, 
		OPEN_BR=18, ATTRIBUTE=19, COMA=20, CLOSE_BR=21, SIMICOLON=22, STRING=23, 
		TYPE_SEA=24, DIGIT=25, CONTROL=26, CONTROLLER_OPEN=27, CONTROLLER_NAME=28, 
		CONTROLLER_WHITESPACE=29, LIST=30, IF=31, FOR=32, VAR=33, FUNCTION=34, 
		PRINT=35, DART=36, LOGIC_COMMENT=37, LOGIC_NAME=38, CONTROLLER_CLOSE=39, 
		ASSIGNMENT=40, OPERAND=41, LOGICAL=42, BOOLEN=43, LIST_ADD=44, LIST_DELETE=45, 
		LIST_SIZE=46, DOT=47, LOGIC_SIMICOLON=48, LOGIC_COMMA=49, LOGIC_OPEN=50, 
		LOGIC_CLOSE=51, LOGIC_BR_OPEN=52, LOGIC_BR_COLSE=53, LOGIC_STRING=54, 
		LOGIC_DIGIT=55, LOGIC_WHITESPACE=56;
	public static final int
		RULE_program = 0, RULE_program_design = 1, RULE_page = 2, RULE_header = 3, 
		RULE_body = 4, RULE_attribute = 5, RULE_controller = 6, RULE_logic = 7, 
		RULE_if = 8, RULE_var = 9, RULE_list = 10, RULE_assignment = 11, RULE_for = 12, 
		RULE_call_function = 13, RULE_function = 14, RULE_print = 15, RULE_logic_body = 16, 
		RULE_type = 17, RULE_list_use = 18, RULE_list_add = 19, RULE_list_delete = 20, 
		RULE_list_size = 21, RULE_lang_Misc = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_design", "page", "header", "body", "attribute", "controller", 
			"logic", "if", "var", "list", "assignment", "for", "call_function", "function", 
			"print", "logic_body", "type", "list_use", "list_add", "list_delete", 
			"list_size", "lang_Misc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'page'", "'controller'", null, null, null, "'header'", "'body'", 
			null, null, null, null, null, null, "':'", null, null, null, null, null, 
			null, null, null, null, null, null, "'control'", null, null, null, "'list'", 
			"'if'", "'for'", "'var'", "'function'", "'print'", "'->'", null, null, 
			null, "'='", null, null, null, "'add'", "'delete'", "'size'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAGE_WORD", "CONTROLLER_WORD", "COMMENT", "SEA_WS", "PAGE_OPEN", 
			"HEADER", "BODY", "OPEN_BREAKET", "PAGE_CLOSE", "PAGE_COMMENT", "NAME", 
			"PAGE_WHITESPACE", "INPUT", "TWO_POINT", "CLOSED_BREAKET", "CONTENT_WHITESPACE", 
			"TYPE_NAME", "OPEN_BR", "ATTRIBUTE", "COMA", "CLOSE_BR", "SIMICOLON", 
			"STRING", "TYPE_SEA", "DIGIT", "CONTROL", "CONTROLLER_OPEN", "CONTROLLER_NAME", 
			"CONTROLLER_WHITESPACE", "LIST", "IF", "FOR", "VAR", "FUNCTION", "PRINT", 
			"DART", "LOGIC_COMMENT", "LOGIC_NAME", "CONTROLLER_CLOSE", "ASSIGNMENT", 
			"OPERAND", "LOGICAL", "BOOLEN", "LIST_ADD", "LIST_DELETE", "LIST_SIZE", 
			"DOT", "LOGIC_SIMICOLON", "LOGIC_COMMA", "LOGIC_OPEN", "LOGIC_CLOSE", 
			"LOGIC_BR_OPEN", "LOGIC_BR_COLSE", "LOGIC_STRING", "LOGIC_DIGIT", "LOGIC_WHITESPACE"
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
	public String getGrammarFileName() { return "DSLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Lang_MiscContext> lang_Misc() {
			return getRuleContexts(Lang_MiscContext.class);
		}
		public Lang_MiscContext lang_Misc(int i) {
			return getRuleContext(Lang_MiscContext.class,i);
		}
		public List<Program_designContext> program_design() {
			return getRuleContexts(Program_designContext.class);
		}
		public Program_designContext program_design(int i) {
			return getRuleContext(Program_designContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(46);
				lang_Misc();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE_WORD) {
				{
				{
				setState(52);
				program_design();
				}
				}
				setState(57);
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

	public static class Program_designContext extends ParserRuleContext {
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public ControllerContext controller() {
			return getRuleContext(ControllerContext.class,0);
		}
		public List<Lang_MiscContext> lang_Misc() {
			return getRuleContexts(Lang_MiscContext.class);
		}
		public Lang_MiscContext lang_Misc(int i) {
			return getRuleContext(Lang_MiscContext.class,i);
		}
		public Program_designContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_design; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterProgram_design(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitProgram_design(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitProgram_design(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_designContext program_design() throws RecognitionException {
		Program_designContext _localctx = new Program_designContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_design);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			page();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(59);
				lang_Misc();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			controller();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(66);
				lang_Misc();
				}
				}
				setState(71);
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE_WORD() { return getToken(DSLParser.PAGE_WORD, 0); }
		public TerminalNode NAME() { return getToken(DSLParser.NAME, 0); }
		public TerminalNode PAGE_OPEN() { return getToken(DSLParser.PAGE_OPEN, 0); }
		public TerminalNode PAGE_CLOSE() { return getToken(DSLParser.PAGE_CLOSE, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PAGE_WORD);
			setState(73);
			match(NAME);
			setState(74);
			match(PAGE_OPEN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(75);
				header();
				setState(76);
				body();
				}
			}

			setState(80);
			match(PAGE_CLOSE);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(DSLParser.HEADER, 0); }
		public TerminalNode OPEN_BREAKET() { return getToken(DSLParser.OPEN_BREAKET, 0); }
		public TerminalNode CLOSED_BREAKET() { return getToken(DSLParser.CLOSED_BREAKET, 0); }
		public List<TerminalNode> INPUT() { return getTokens(DSLParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(DSLParser.INPUT, i);
		}
		public List<TerminalNode> TWO_POINT() { return getTokens(DSLParser.TWO_POINT); }
		public TerminalNode TWO_POINT(int i) {
			return getToken(DSLParser.TWO_POINT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(DSLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DSLParser.STRING, i);
		}
		public List<TerminalNode> SIMICOLON() { return getTokens(DSLParser.SIMICOLON); }
		public TerminalNode SIMICOLON(int i) {
			return getToken(DSLParser.SIMICOLON, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(HEADER);
			setState(83);
			match(OPEN_BREAKET);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT) {
				{
				{
				setState(84);
				match(INPUT);
				setState(85);
				match(TWO_POINT);
				setState(86);
				match(STRING);
				setState(87);
				match(SIMICOLON);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CLOSED_BREAKET);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(DSLParser.BODY, 0); }
		public TerminalNode OPEN_BREAKET() { return getToken(DSLParser.OPEN_BREAKET, 0); }
		public TerminalNode CLOSED_BREAKET() { return getToken(DSLParser.CLOSED_BREAKET, 0); }
		public List<TerminalNode> INPUT() { return getTokens(DSLParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(DSLParser.INPUT, i);
		}
		public List<TerminalNode> TWO_POINT() { return getTokens(DSLParser.TWO_POINT); }
		public TerminalNode TWO_POINT(int i) {
			return getToken(DSLParser.TWO_POINT, i);
		}
		public List<TerminalNode> TYPE_NAME() { return getTokens(DSLParser.TYPE_NAME); }
		public TerminalNode TYPE_NAME(int i) {
			return getToken(DSLParser.TYPE_NAME, i);
		}
		public List<TerminalNode> OPEN_BR() { return getTokens(DSLParser.OPEN_BR); }
		public TerminalNode OPEN_BR(int i) {
			return getToken(DSLParser.OPEN_BR, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> CLOSE_BR() { return getTokens(DSLParser.CLOSE_BR); }
		public TerminalNode CLOSE_BR(int i) {
			return getToken(DSLParser.CLOSE_BR, i);
		}
		public List<TerminalNode> SIMICOLON() { return getTokens(DSLParser.SIMICOLON); }
		public TerminalNode SIMICOLON(int i) {
			return getToken(DSLParser.SIMICOLON, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DSLParser.COMA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(BODY);
			setState(96);
			match(OPEN_BREAKET);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT) {
				{
				{
				setState(97);
				match(INPUT);
				setState(98);
				match(TWO_POINT);
				setState(99);
				match(TYPE_NAME);
				setState(100);
				match(OPEN_BR);
				setState(101);
				attribute();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(102);
					match(COMA);
					setState(103);
					attribute();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(CLOSE_BR);
				setState(110);
				match(SIMICOLON);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(CLOSED_BREAKET);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(DSLParser.ATTRIBUTE, 0); }
		public TerminalNode OPEN_BR() { return getToken(DSLParser.OPEN_BR, 0); }
		public TerminalNode CLOSE_BR() { return getToken(DSLParser.CLOSE_BR, 0); }
		public List<TerminalNode> STRING() { return getTokens(DSLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DSLParser.STRING, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DSLParser.COMA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(DSLParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DSLParser.DIGIT, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ATTRIBUTE);
			setState(120);
			match(OPEN_BR);
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(121);
				match(STRING);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(122);
					match(COMA);
					setState(123);
					match(STRING);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLOSE_BR:
			case DIGIT:
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIGIT) {
					{
					{
					setState(129);
					match(DIGIT);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			match(CLOSE_BR);
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

	public static class ControllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER_WORD() { return getToken(DSLParser.CONTROLLER_WORD, 0); }
		public List<TerminalNode> CONTROLLER_NAME() { return getTokens(DSLParser.CONTROLLER_NAME); }
		public TerminalNode CONTROLLER_NAME(int i) {
			return getToken(DSLParser.CONTROLLER_NAME, i);
		}
		public TerminalNode CONTROL() { return getToken(DSLParser.CONTROL, 0); }
		public TerminalNode CONTROLLER_OPEN() { return getToken(DSLParser.CONTROLLER_OPEN, 0); }
		public TerminalNode CONTROLLER_CLOSE() { return getToken(DSLParser.CONTROLLER_CLOSE, 0); }
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public List<TerminalNode> LOGIC_COMMENT() { return getTokens(DSLParser.LOGIC_COMMENT); }
		public TerminalNode LOGIC_COMMENT(int i) {
			return getToken(DSLParser.LOGIC_COMMENT, i);
		}
		public ControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerContext controller() throws RecognitionException {
		ControllerContext _localctx = new ControllerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CONTROLLER_WORD);
			setState(140);
			match(CONTROLLER_NAME);
			setState(141);
			match(CONTROL);
			setState(142);
			match(CONTROLLER_NAME);
			setState(143);
			match(CONTROLLER_OPEN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << IF) | (1L << FOR) | (1L << VAR) | (1L << FUNCTION) | (1L << PRINT) | (1L << LOGIC_COMMENT) | (1L << LOGIC_NAME))) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST:
				case IF:
				case FOR:
				case VAR:
				case FUNCTION:
				case PRINT:
				case LOGIC_NAME:
					{
					setState(144);
					logic();
					}
					break;
				case LOGIC_COMMENT:
					{
					setState(145);
					match(LOGIC_COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(CONTROLLER_CLOSE);
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

	public static class LogicContext extends ParserRuleContext {
		public Logic_bodyContext logic_body() {
			return getRuleContext(Logic_bodyContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LOGIC_SIMICOLON() { return getToken(DSLParser.LOGIC_SIMICOLON, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public List_useContext list_use() {
			return getRuleContext(List_useContext.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logic);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(153);
					if_();
					}
					break;
				case FOR:
					{
					setState(154);
					for_();
					}
					break;
				case FUNCTION:
					{
					setState(155);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158);
				logic_body();
				}
				}
				break;
			case LIST:
			case VAR:
			case PRINT:
			case LOGIC_NAME:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(160);
					var();
					}
					break;
				case 2:
					{
					setState(161);
					assignment();
					}
					break;
				case 3:
					{
					setState(162);
					print();
					}
					break;
				case 4:
					{
					setState(163);
					list();
					}
					break;
				case 5:
					{
					setState(164);
					call_function();
					}
					break;
				case 6:
					{
					setState(165);
					list_use();
					}
					break;
				}
				setState(168);
				match(LOGIC_SIMICOLON);
				}
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DSLParser.IF, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> BOOLEN() { return getTokens(DSLParser.BOOLEN); }
		public TerminalNode BOOLEN(int i) {
			return getToken(DSLParser.BOOLEN, i);
		}
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TerminalNode> LOGICAL() { return getTokens(DSLParser.LOGICAL); }
		public TerminalNode LOGICAL(int i) {
			return getToken(DSLParser.LOGICAL, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IF);
			setState(173);
			match(LOGIC_OPEN);
			setState(174);
			type();
			setState(175);
			match(BOOLEN);
			setState(176);
			type();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(177);
				match(LOGICAL);
				setState(178);
				type();
				setState(179);
				match(BOOLEN);
				setState(180);
				type();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(LOGIC_CLOSE);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DSLParser.VAR, 0); }
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(VAR);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(190);
				match(LOGIC_NAME);
				}
				break;
			case 2:
				{
				setState(191);
				assignment();
				}
				break;
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_COMMA) {
				{
				{
				setState(194);
				match(LOGIC_COMMA);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(195);
					match(LOGIC_NAME);
					}
					break;
				case 2:
					{
					setState(196);
					assignment();
					}
					break;
				}
				}
				}
				setState(203);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(DSLParser.LIST, 0); }
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DSLParser.ASSIGNMENT, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LIST);
			setState(205);
			match(LOGIC_NAME);
			setState(206);
			match(ASSIGNMENT);
			setState(207);
			match(LOGIC_OPEN);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(208);
				type();
				}
				break;
			case 2:
				{
				{
				setState(209);
				type();
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(210);
					match(LOGIC_COMMA);
					setState(211);
					type();
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOGIC_COMMA );
				}
				}
				break;
			}
			setState(218);
			match(LOGIC_CLOSE);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DSLParser.ASSIGNMENT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> OPERAND() { return getTokens(DSLParser.OPERAND); }
		public TerminalNode OPERAND(int i) {
			return getToken(DSLParser.OPERAND, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(LOGIC_NAME);
			setState(221);
			match(ASSIGNMENT);
			setState(222);
			type();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERAND) {
				{
				{
				setState(223);
				match(OPERAND);
				setState(224);
				type();
				}
				}
				setState(229);
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DSLParser.FOR, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode DART() { return getToken(DSLParser.DART, 0); }
		public TerminalNode LOGIC_COMMA() { return getToken(DSLParser.LOGIC_COMMA, 0); }
		public TerminalNode OPERAND() { return getToken(DSLParser.OPERAND, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TerminalNode> LOGIC_DIGIT() { return getTokens(DSLParser.LOGIC_DIGIT); }
		public TerminalNode LOGIC_DIGIT(int i) {
			return getToken(DSLParser.LOGIC_DIGIT, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FOR);
			setState(231);
			match(LOGIC_OPEN);
			setState(232);
			match(LOGIC_NAME);
			setState(233);
			match(DART);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_DIGIT) {
				{
				{
				setState(234);
				match(LOGIC_DIGIT);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(LOGIC_COMMA);
			setState(241);
			match(OPERAND);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_DIGIT) {
				{
				{
				setState(242);
				match(LOGIC_DIGIT);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(LOGIC_CLOSE);
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

	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LOGIC_NAME);
			setState(251);
			match(LOGIC_OPEN);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(252);
				type();
				}
				break;
			case 2:
				{
				{
				setState(253);
				type();
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					match(LOGIC_COMMA);
					setState(255);
					type();
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOGIC_COMMA );
				}
				}
				break;
			}
			setState(262);
			match(LOGIC_CLOSE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DSLParser.FUNCTION, 0); }
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(FUNCTION);
			setState(265);
			match(LOGIC_NAME);
			setState(266);
			match(LOGIC_OPEN);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(267);
				match(LOGIC_NAME);
				}
				break;
			case 2:
				{
				{
				setState(268);
				match(LOGIC_NAME);
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					match(LOGIC_COMMA);
					setState(270);
					match(LOGIC_NAME);
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOGIC_COMMA );
				}
				}
				break;
			}
			setState(277);
			match(LOGIC_CLOSE);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DSLParser.PRINT, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PRINT);
			setState(280);
			match(LOGIC_OPEN);
			setState(281);
			type();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_COMMA) {
				{
				{
				setState(282);
				match(LOGIC_COMMA);
				setState(283);
				type();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(LOGIC_CLOSE);
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

	public static class Logic_bodyContext extends ParserRuleContext {
		public TerminalNode LOGIC_BR_OPEN() { return getToken(DSLParser.LOGIC_BR_OPEN, 0); }
		public TerminalNode LOGIC_BR_COLSE() { return getToken(DSLParser.LOGIC_BR_COLSE, 0); }
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public Logic_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterLogic_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitLogic_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitLogic_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_bodyContext logic_body() throws RecognitionException {
		Logic_bodyContext _localctx = new Logic_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LOGIC_BR_OPEN);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << IF) | (1L << FOR) | (1L << VAR) | (1L << FUNCTION) | (1L << PRINT) | (1L << LOGIC_NAME))) != 0)) {
				{
				{
				setState(292);
				logic();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(LOGIC_BR_COLSE);
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
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode LOGIC_STRING() { return getToken(DSLParser.LOGIC_STRING, 0); }
		public List<TerminalNode> LOGIC_DIGIT() { return getTokens(DSLParser.LOGIC_DIGIT); }
		public TerminalNode LOGIC_DIGIT(int i) {
			return getToken(DSLParser.LOGIC_DIGIT, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGIC_NAME:
				{
				setState(300);
				match(LOGIC_NAME);
				}
				break;
			case OPERAND:
			case LOGICAL:
			case BOOLEN:
			case LOGIC_SIMICOLON:
			case LOGIC_COMMA:
			case LOGIC_CLOSE:
			case LOGIC_DIGIT:
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_DIGIT) {
					{
					{
					setState(301);
					match(LOGIC_DIGIT);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LOGIC_STRING:
				{
				setState(307);
				match(LOGIC_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class List_useContext extends ParserRuleContext {
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode DOT() { return getToken(DSLParser.DOT, 0); }
		public List_addContext list_add() {
			return getRuleContext(List_addContext.class,0);
		}
		public List_deleteContext list_delete() {
			return getRuleContext(List_deleteContext.class,0);
		}
		public List_sizeContext list_size() {
			return getRuleContext(List_sizeContext.class,0);
		}
		public List_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterList_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitList_use(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitList_use(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_useContext list_use() throws RecognitionException {
		List_useContext _localctx = new List_useContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(LOGIC_NAME);
			setState(311);
			match(DOT);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_ADD:
				{
				setState(312);
				list_add();
				}
				break;
			case LIST_DELETE:
				{
				setState(313);
				list_delete();
				}
				break;
			case LIST_SIZE:
				{
				setState(314);
				list_size();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class List_addContext extends ParserRuleContext {
		public TerminalNode LIST_ADD() { return getToken(DSLParser.LIST_ADD, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterList_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitList_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitList_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_addContext list_add() throws RecognitionException {
		List_addContext _localctx = new List_addContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LIST_ADD);
			setState(318);
			match(LOGIC_OPEN);
			setState(319);
			type();
			setState(320);
			match(LOGIC_CLOSE);
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

	public static class List_deleteContext extends ParserRuleContext {
		public TerminalNode LIST_DELETE() { return getToken(DSLParser.LIST_DELETE, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List<TerminalNode> LOGIC_DIGIT() { return getTokens(DSLParser.LOGIC_DIGIT); }
		public TerminalNode LOGIC_DIGIT(int i) {
			return getToken(DSLParser.LOGIC_DIGIT, i);
		}
		public List_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterList_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitList_delete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitList_delete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_deleteContext list_delete() throws RecognitionException {
		List_deleteContext _localctx = new List_deleteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(LIST_DELETE);
			setState(323);
			match(LOGIC_OPEN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_DIGIT) {
				{
				{
				setState(324);
				match(LOGIC_DIGIT);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(LOGIC_CLOSE);
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

	public static class List_sizeContext extends ParserRuleContext {
		public TerminalNode LIST_SIZE() { return getToken(DSLParser.LIST_SIZE, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public List_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterList_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitList_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitList_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_sizeContext list_size() throws RecognitionException {
		List_sizeContext _localctx = new List_sizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LIST_SIZE);
			setState(333);
			match(LOGIC_OPEN);
			setState(334);
			match(LOGIC_CLOSE);
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

	public static class Lang_MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DSLParser.COMMENT, 0); }
		public TerminalNode SEA_WS() { return getToken(DSLParser.SEA_WS, 0); }
		public Lang_MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang_Misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterLang_Misc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitLang_Misc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitLang_Misc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lang_MiscContext lang_Misc() throws RecognitionException {
		Lang_MiscContext _localctx = new Lang_MiscContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lang_Misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==SEA_WS) ) {
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

	public static final String _serializedATN =
		"\u0004\u00018\u0153\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u00009\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002O\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Y\b\u0003\n\u0003"+
		"\f\u0003\\\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004i\b\u0004\n\u0004\f\u0004l\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004q\b\u0004\n\u0004\f\u0004t\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080\t\u0005\u0001\u0005"+
		"\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0003\u0005\u0088"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0093\b\u0006\n"+
		"\u0006\f\u0006\u0096\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a7\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ab\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00b7\b\b\n\b\f\b\u00ba\t\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00c1\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c6"+
		"\b\t\u0005\t\u00c8\b\t\n\t\f\t\u00cb\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00d5\b\n\u000b\n\f\n\u00d6"+
		"\u0003\n\u00d9\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00e2\b\u000b\n\u000b\f\u000b\u00e5"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ec\b\f\n\f"+
		"\f\f\u00ef\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f4\b\f\n\f\f\f\u00f7"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u0101\b\r\u000b\r\f\r\u0102\u0003\r\u0105\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u0110\b\u000e\u000b\u000e\f\u000e\u0111\u0003\u000e"+
		"\u0114\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u011d\b\u000f\n\u000f\f\u000f\u0120"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0126"+
		"\b\u0010\n\u0010\f\u0010\u0129\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u012f\b\u0011\n\u0011\f\u0011\u0132\t\u0011\u0001"+
		"\u0011\u0003\u0011\u0135\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u013c\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0146\b\u0014\n\u0014\f\u0014\u0149\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0001\u0001\u0000"+
		"\u0003\u0004\u0168\u00001\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000"+
		"\u0000\u0004H\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\b"+
		"_\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010\u00ac\u0001\u0000"+
		"\u0000\u0000\u0012\u00bd\u0001\u0000\u0000\u0000\u0014\u00cc\u0001\u0000"+
		"\u0000\u0000\u0016\u00dc\u0001\u0000\u0000\u0000\u0018\u00e6\u0001\u0000"+
		"\u0000\u0000\u001a\u00fa\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000"+
		"\u0000\u0000\u001e\u0117\u0001\u0000\u0000\u0000 \u0123\u0001\u0000\u0000"+
		"\u0000\"\u0134\u0001\u0000\u0000\u0000$\u0136\u0001\u0000\u0000\u0000"+
		"&\u013d\u0001\u0000\u0000\u0000(\u0142\u0001\u0000\u0000\u0000*\u014c"+
		"\u0001\u0000\u0000\u0000,\u0150\u0001\u0000\u0000\u0000.0\u0003,\u0016"+
		"\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000027\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u0000"+
		"69\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u0001\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:>\u0003"+
		"\u0004\u0002\u0000;=\u0003,\u0016\u0000<;\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AE\u0003\f\u0006\u0000"+
		"BD\u0003,\u0016\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0005"+
		"\u000b\u0000\u0000JN\u0005\u0005\u0000\u0000KL\u0003\u0006\u0003\u0000"+
		"LM\u0003\b\u0004\u0000MO\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\t\u0000\u0000"+
		"Q\u0005\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000SZ\u0005\b\u0000"+
		"\u0000TU\u0005\r\u0000\u0000UV\u0005\u000e\u0000\u0000VW\u0005\u0017\u0000"+
		"\u0000WY\u0005\u0016\u0000\u0000XT\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u000f\u0000\u0000"+
		"^\u0007\u0001\u0000\u0000\u0000_`\u0005\u0007\u0000\u0000`r\u0005\b\u0000"+
		"\u0000ab\u0005\r\u0000\u0000bc\u0005\u000e\u0000\u0000cd\u0005\u0011\u0000"+
		"\u0000de\u0005\u0012\u0000\u0000ej\u0003\n\u0005\u0000fg\u0005\u0014\u0000"+
		"\u0000gi\u0003\n\u0005\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0015\u0000\u0000no\u0005"+
		"\u0016\u0000\u0000oq\u0001\u0000\u0000\u0000pa\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u000f"+
		"\u0000\u0000v\t\u0001\u0000\u0000\u0000wx\u0005\u0013\u0000\u0000x\u0087"+
		"\u0005\u0012\u0000\u0000y~\u0005\u0017\u0000\u0000z{\u0005\u0014\u0000"+
		"\u0000{}\u0005\u0017\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0088\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0005\u0019\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087y\u0001\u0000\u0000\u0000\u0087"+
		"\u0084\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0015\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0002\u0000\u0000\u008c\u008d\u0005\u001c\u0000\u0000\u008d"+
		"\u008e\u0005\u001a\u0000\u0000\u008e\u008f\u0005\u001c\u0000\u0000\u008f"+
		"\u0094\u0005\u001b\u0000\u0000\u0090\u0093\u0003\u000e\u0007\u0000\u0091"+
		"\u0093\u0005%\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\'\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u009d\u0003"+
		"\u0010\b\u0000\u009a\u009d\u0003\u0018\f\u0000\u009b\u009d\u0003\u001c"+
		"\u000e\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0003 \u0010\u0000\u009f\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a7\u0003\u0012\t\u0000\u00a1\u00a7\u0003\u0016\u000b\u0000"+
		"\u00a2\u00a7\u0003\u001e\u000f\u0000\u00a3\u00a7\u0003\u0014\n\u0000\u00a4"+
		"\u00a7\u0003\u001a\r\u0000\u00a5\u00a7\u0003$\u0012\u0000\u00a6\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u009c\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ab\u000f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u001f\u0000\u0000\u00ad\u00ae\u00052\u0000\u0000\u00ae\u00af\u0003\""+
		"\u0011\u0000\u00af\u00b0\u0005+\u0000\u0000\u00b0\u00b8\u0003\"\u0011"+
		"\u0000\u00b1\u00b2\u0005*\u0000\u0000\u00b2\u00b3\u0003\"\u0011\u0000"+
		"\u00b3\u00b4\u0005+\u0000\u0000\u00b4\u00b5\u0003\"\u0011\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u00053\u0000\u0000\u00bc\u0011"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0005!\u0000\u0000\u00be\u00c1\u0005"+
		"&\u0000\u0000\u00bf\u00c1\u0003\u0016\u000b\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u00051\u0000\u0000\u00c3\u00c6\u0005&\u0000\u0000"+
		"\u00c4\u00c6\u0003\u0016\u000b\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd\u00ce\u0005&\u0000\u0000\u00ce"+
		"\u00cf\u0005(\u0000\u0000\u00cf\u00d8\u00052\u0000\u0000\u00d0\u00d9\u0003"+
		"\"\u0011\u0000\u00d1\u00d4\u0003\"\u0011\u0000\u00d2\u00d3\u00051\u0000"+
		"\u0000\u00d3\u00d5\u0003\"\u0011\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u00053\u0000\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005&\u0000\u0000\u00dd\u00de\u0005(\u0000\u0000\u00de\u00e3\u0003"+
		"\"\u0011\u0000\u00df\u00e0\u0005)\u0000\u0000\u00e0\u00e2\u0003\"\u0011"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u0017\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005 \u0000\u0000\u00e7\u00e8\u00052\u0000\u0000\u00e8"+
		"\u00e9\u0005&\u0000\u0000\u00e9\u00ed\u0005$\u0000\u0000\u00ea\u00ec\u0005"+
		"7\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u00051\u0000\u0000\u00f1\u00f5\u0005)\u0000\u0000"+
		"\u00f2\u00f4\u00057\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u00053\u0000\u0000\u00f9\u0019"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005&\u0000\u0000\u00fb\u0104\u0005"+
		"2\u0000\u0000\u00fc\u0105\u0003\"\u0011\u0000\u00fd\u0100\u0003\"\u0011"+
		"\u0000\u00fe\u00ff\u00051\u0000\u0000\u00ff\u0101\u0003\"\u0011\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00fc\u0001\u0000\u0000\u0000"+
		"\u0104\u00fd\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u00053\u0000\u0000\u0107"+
		"\u001b\u0001\u0000\u0000\u0000\u0108\u0109\u0005\"\u0000\u0000\u0109\u010a"+
		"\u0005&\u0000\u0000\u010a\u0113\u00052\u0000\u0000\u010b\u0114\u0005&"+
		"\u0000\u0000\u010c\u010f\u0005&\u0000\u0000\u010d\u010e\u00051\u0000\u0000"+
		"\u010e\u0110\u0005&\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u010b\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u00053\u0000\u0000\u0116\u001d\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0005#\u0000\u0000\u0118\u0119\u00052\u0000\u0000\u0119\u011e\u0003\""+
		"\u0011\u0000\u011a\u011b\u00051\u0000\u0000\u011b\u011d\u0003\"\u0011"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u00053\u0000\u0000\u0122\u001f\u0001\u0000\u0000\u0000"+
		"\u0123\u0127\u00054\u0000\u0000\u0124\u0126\u0003\u000e\u0007\u0000\u0125"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u00055\u0000\u0000\u012b!\u0001\u0000\u0000\u0000\u012c\u0135\u0005"+
		"&\u0000\u0000\u012d\u012f\u00057\u0000\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0135\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u00056\u0000\u0000"+
		"\u0134\u012c\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135#\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005&\u0000\u0000\u0137\u013b\u0005/\u0000\u0000\u0138\u013c\u0003"+
		"&\u0013\u0000\u0139\u013c\u0003(\u0014\u0000\u013a\u013c\u0003*\u0015"+
		"\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c%\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0005,\u0000\u0000\u013e\u013f\u00052\u0000\u0000\u013f\u0140"+
		"\u0003\"\u0011\u0000\u0140\u0141\u00053\u0000\u0000\u0141\'\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005-\u0000\u0000\u0143\u0147\u00052\u0000\u0000"+
		"\u0144\u0146\u00057\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146"+
		"\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u00053\u0000\u0000\u014b)\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005.\u0000\u0000\u014d\u014e\u00052\u0000"+
		"\u0000\u014e\u014f\u00053\u0000\u0000\u014f+\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0007\u0000\u0000\u0000\u0151-\u0001\u0000\u0000\u0000#17>ENZj"+
		"r~\u0084\u0087\u0092\u0094\u009c\u00a6\u00aa\u00b8\u00c0\u00c5\u00c9\u00d6"+
		"\u00d8\u00e3\u00ed\u00f5\u0102\u0104\u0111\u0113\u011e\u0127\u0130\u0134"+
		"\u013b\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}