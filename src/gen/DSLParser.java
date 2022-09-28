// Generated from C:/Users/hamza/OneDrive/Desktop/finalcomp2/compiler/src\DSLParser.g4 by ANTLR 4.10.1
package gen;
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
		OPEN_BR=18, ATTRIBUTE=19, GET=20, COMA=21, CLOSE_BR=22, SIMICOLON=23, 
		STRING=24, TYPE_SEA=25, TYPE_DIGIT=26, CONTROL=27, CONTROLLER_OPEN=28, 
		CONTROLLER_NAME=29, CONTROLLER_WHITESPACE=30, POST=31, SINGLE=32, LIST=33, 
		IF=34, FOR=35, VAR=36, LIST_ADD=37, LIST_DELETE=38, LIST_SIZE=39, LIST_GET=40, 
		SESSION=41, DOT=42, FUNCTION=43, PRINT=44, RETURN=45, DART=46, LOGIC_COMMENT=47, 
		LOGIC_NAME=48, CONTROLLER_CLOSE=49, ASSIGNMENT=50, OPERAND=51, LOGICAL=52, 
		BOOLEN=53, LOGIC_SIMICOLON=54, LOGIC_COMMA=55, LOGIC_OPEN=56, LOGIC_CLOSE=57, 
		LOGIC_BR_OPEN=58, LOGIC_BR_COLSE=59, LOGIC_STRING=60, LOGIC_DIGIT=61, 
		LOGIC_WHITESPACE=62;
	public static final int
		RULE_program = 0, RULE_program_design = 1, RULE_page = 2, RULE_header = 3, 
		RULE_attribute_header = 4, RULE_body = 5, RULE_in_out = 6, RULE_attribute = 7, 
		RULE_get_data = 8, RULE_controller = 9, RULE_logic = 10, RULE_session = 11, 
		RULE_if = 12, RULE_compare = 13, RULE_post = 14, RULE_var = 15, RULE_variables = 16, 
		RULE_list = 17, RULE_assignment = 18, RULE_for = 19, RULE_call_function = 20, 
		RULE_function = 21, RULE_parameter = 22, RULE_print = 23, RULE_logic_body = 24, 
		RULE_type = 25, RULE_list_use = 26, RULE_list_add = 27, RULE_list_delete = 28, 
		RULE_list_size = 29, RULE_list_get = 30, RULE_lang_Misc = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_design", "page", "header", "attribute_header", "body", 
			"in_out", "attribute", "get_data", "controller", "logic", "session", 
			"if", "compare", "post", "var", "variables", "list", "assignment", "for", 
			"call_function", "function", "parameter", "print", "logic_body", "type", 
			"list_use", "list_add", "list_delete", "list_size", "list_get", "lang_Misc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'page'", "'controller'", null, null, null, "'header'", "'body'", 
			null, null, null, null, null, null, "':'", null, null, null, null, null, 
			null, null, null, null, null, null, null, "'control'", null, null, null, 
			"'post'", "'''", "'list'", "'if'", "'for'", "'var'", "'add'", "'delete'", 
			"'size'", "'get'", "'session'", "'.'", "'function'", "'print'", "'return'", 
			"'->'", null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAGE_WORD", "CONTROLLER_WORD", "COMMENT", "SEA_WS", "PAGE_OPEN", 
			"HEADER", "BODY", "OPEN_BREAKET", "PAGE_CLOSE", "PAGE_COMMENT", "NAME", 
			"PAGE_WHITESPACE", "INPUT", "TWO_POINT", "CLOSED_BREAKET", "CONTENT_WHITESPACE", 
			"TYPE_NAME", "OPEN_BR", "ATTRIBUTE", "GET", "COMA", "CLOSE_BR", "SIMICOLON", 
			"STRING", "TYPE_SEA", "TYPE_DIGIT", "CONTROL", "CONTROLLER_OPEN", "CONTROLLER_NAME", 
			"CONTROLLER_WHITESPACE", "POST", "SINGLE", "LIST", "IF", "FOR", "VAR", 
			"LIST_ADD", "LIST_DELETE", "LIST_SIZE", "LIST_GET", "SESSION", "DOT", 
			"FUNCTION", "PRINT", "RETURN", "DART", "LOGIC_COMMENT", "LOGIC_NAME", 
			"CONTROLLER_CLOSE", "ASSIGNMENT", "OPERAND", "LOGICAL", "BOOLEN", "LOGIC_SIMICOLON", 
			"LOGIC_COMMA", "LOGIC_OPEN", "LOGIC_CLOSE", "LOGIC_BR_OPEN", "LOGIC_BR_COLSE", 
			"LOGIC_STRING", "LOGIC_DIGIT", "LOGIC_WHITESPACE"
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(64);
				lang_Misc();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE_WORD) {
				{
				{
				setState(70);
				program_design();
				}
				}
				setState(75);
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
			setState(76);
			page();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(77);
				lang_Misc();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			controller();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==SEA_WS) {
				{
				{
				setState(84);
				lang_Misc();
				}
				}
				setState(89);
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
			setState(90);
			match(PAGE_WORD);
			setState(91);
			match(NAME);
			setState(92);
			match(PAGE_OPEN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(93);
				header();
				setState(94);
				body();
				}
			}

			setState(98);
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
		public List<Attribute_headerContext> attribute_header() {
			return getRuleContexts(Attribute_headerContext.class);
		}
		public Attribute_headerContext attribute_header(int i) {
			return getRuleContext(Attribute_headerContext.class,i);
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
			setState(100);
			match(HEADER);
			setState(101);
			match(OPEN_BREAKET);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT) {
				{
				{
				setState(102);
				attribute_header();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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

	public static class Attribute_headerContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(DSLParser.INPUT, 0); }
		public TerminalNode TWO_POINT() { return getToken(DSLParser.TWO_POINT, 0); }
		public TerminalNode STRING() { return getToken(DSLParser.STRING, 0); }
		public TerminalNode SIMICOLON() { return getToken(DSLParser.SIMICOLON, 0); }
		public Attribute_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterAttribute_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitAttribute_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitAttribute_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_headerContext attribute_header() throws RecognitionException {
		Attribute_headerContext _localctx = new Attribute_headerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(INPUT);
			setState(111);
			match(TWO_POINT);
			setState(112);
			match(STRING);
			setState(113);
			match(SIMICOLON);
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
		public List<In_outContext> in_out() {
			return getRuleContexts(In_outContext.class);
		}
		public In_outContext in_out(int i) {
			return getRuleContext(In_outContext.class,i);
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
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(BODY);
			setState(116);
			match(OPEN_BREAKET);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT) {
				{
				{
				setState(117);
				in_out();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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

	public static class In_outContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(DSLParser.INPUT, 0); }
		public TerminalNode TWO_POINT() { return getToken(DSLParser.TWO_POINT, 0); }
		public TerminalNode TYPE_NAME() { return getToken(DSLParser.TYPE_NAME, 0); }
		public TerminalNode OPEN_BR() { return getToken(DSLParser.OPEN_BR, 0); }
		public TerminalNode CLOSE_BR() { return getToken(DSLParser.CLOSE_BR, 0); }
		public TerminalNode SIMICOLON() { return getToken(DSLParser.SIMICOLON, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<Get_dataContext> get_data() {
			return getRuleContexts(Get_dataContext.class);
		}
		public Get_dataContext get_data(int i) {
			return getRuleContext(Get_dataContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DSLParser.COMA, i);
		}
		public In_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterIn_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitIn_out(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitIn_out(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_outContext in_out() throws RecognitionException {
		In_outContext _localctx = new In_outContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_in_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(INPUT);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TWO_POINT) {
				{
				setState(126);
				match(TWO_POINT);
				setState(127);
				match(TYPE_NAME);
				setState(128);
				match(OPEN_BR);
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(129);
					attribute();
					}
					break;
				case 2:
					{
					setState(130);
					get_data();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(133);
					match(COMA);
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(134);
						attribute();
						}
						break;
					case 2:
						{
						setState(135);
						get_data();
						}
						break;
					}
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(143);
				match(CLOSE_BR);
				setState(144);
				match(SIMICOLON);
				}
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(DSLParser.ATTRIBUTE, 0); }
		public TerminalNode OPEN_BR() { return getToken(DSLParser.OPEN_BR, 0); }
		public TerminalNode CLOSE_BR() { return getToken(DSLParser.CLOSE_BR, 0); }
		public List<TerminalNode> STRING() { return getTokens(DSLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DSLParser.STRING, i);
		}
		public TerminalNode TYPE_DIGIT() { return getToken(DSLParser.TYPE_DIGIT, 0); }
		public List<TerminalNode> COMA() { return getTokens(DSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DSLParser.COMA, i);
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
		enterRule(_localctx, 14, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ATTRIBUTE);
			setState(149);
			match(OPEN_BR);
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(150);
				match(STRING);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(151);
					match(COMA);
					setState(152);
					match(STRING);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TYPE_DIGIT:
				{
				setState(158);
				match(TYPE_DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
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

	public static class Get_dataContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(DSLParser.ATTRIBUTE, 0); }
		public List<TerminalNode> OPEN_BR() { return getTokens(DSLParser.OPEN_BR); }
		public TerminalNode OPEN_BR(int i) {
			return getToken(DSLParser.OPEN_BR, i);
		}
		public TerminalNode GET() { return getToken(DSLParser.GET, 0); }
		public TerminalNode STRING() { return getToken(DSLParser.STRING, 0); }
		public List<TerminalNode> CLOSE_BR() { return getTokens(DSLParser.CLOSE_BR); }
		public TerminalNode CLOSE_BR(int i) {
			return getToken(DSLParser.CLOSE_BR, i);
		}
		public Get_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterGet_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitGet_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitGet_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_dataContext get_data() throws RecognitionException {
		Get_dataContext _localctx = new Get_dataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_get_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ATTRIBUTE);
			setState(164);
			match(OPEN_BR);
			setState(165);
			match(GET);
			setState(166);
			match(OPEN_BR);
			setState(167);
			match(STRING);
			setState(168);
			match(CLOSE_BR);
			setState(169);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
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
		public List<SessionContext> session() {
			return getRuleContexts(SessionContext.class);
		}
		public SessionContext session(int i) {
			return getRuleContext(SessionContext.class,i);
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
		enterRule(_localctx, 18, RULE_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(CONTROLLER_WORD);
			setState(172);
			match(CONTROLLER_NAME);
			setState(173);
			match(CONTROL);
			setState(174);
			match(CONTROLLER_NAME);
			setState(175);
			match(CONTROLLER_OPEN);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << IF) | (1L << FOR) | (1L << VAR) | (1L << SESSION) | (1L << FUNCTION) | (1L << PRINT) | (1L << LOGIC_COMMENT) | (1L << LOGIC_NAME))) != 0)) {
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(176);
					function();
					}
					break;
				case LIST:
				case IF:
				case FOR:
				case VAR:
				case PRINT:
				case LOGIC_NAME:
					{
					setState(177);
					logic();
					}
					break;
				case LOGIC_COMMENT:
					{
					setState(178);
					match(LOGIC_COMMENT);
					}
					break;
				case SESSION:
					{
					setState(179);
					session();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public TerminalNode LOGIC_SIMICOLON() { return getToken(DSLParser.LOGIC_SIMICOLON, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
		enterRule(_localctx, 20, RULE_logic);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(187);
					if_();
					}
					break;
				case FOR:
					{
					setState(188);
					for_();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(191);
					variables();
					}
					break;
				case 2:
					{
					setState(192);
					assignment();
					}
					break;
				case 3:
					{
					setState(193);
					print();
					}
					break;
				case 4:
					{
					setState(194);
					list();
					}
					break;
				case 5:
					{
					setState(195);
					call_function();
					}
					break;
				case 6:
					{
					setState(196);
					list_use();
					}
					break;
				}
				setState(199);
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

	public static class SessionContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(DSLParser.SESSION, 0); }
		public TerminalNode VAR() { return getToken(DSLParser.VAR, 0); }
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DSLParser.ASSIGNMENT, 0); }
		public TerminalNode LOGIC_SIMICOLON() { return getToken(DSLParser.LOGIC_SIMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DSLParser.DOT, 0); }
		public List_sizeContext list_size() {
			return getRuleContext(List_sizeContext.class,0);
		}
		public List_getContext list_get() {
			return getRuleContext(List_getContext.class,0);
		}
		public SessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_session; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitSession(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SessionContext session() throws RecognitionException {
		SessionContext _localctx = new SessionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_session);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SESSION);
			setState(204);
			match(VAR);
			setState(205);
			match(LOGIC_NAME);
			setState(206);
			match(ASSIGNMENT);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(207);
				type();
				}
				break;
			case 2:
				{
				{
				setState(208);
				match(LOGIC_NAME);
				setState(209);
				match(DOT);
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST_SIZE:
					{
					setState(210);
					list_size();
					}
					break;
				case LIST_GET:
					{
					setState(211);
					list_get();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(214);
				call_function();
				}
				break;
			}
			setState(217);
			match(LOGIC_SIMICOLON);
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
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public TerminalNode LOGIC_BR_OPEN() { return getToken(DSLParser.LOGIC_BR_OPEN, 0); }
		public Logic_bodyContext logic_body() {
			return getRuleContext(Logic_bodyContext.class,0);
		}
		public TerminalNode LOGIC_BR_COLSE() { return getToken(DSLParser.LOGIC_BR_COLSE, 0); }
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
		enterRule(_localctx, 24, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IF);
			setState(220);
			match(LOGIC_OPEN);
			setState(221);
			compare();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL) {
				{
				{
				setState(222);
				match(LOGICAL);
				setState(223);
				compare();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(LOGIC_CLOSE);
			setState(230);
			match(LOGIC_BR_OPEN);
			setState(231);
			logic_body();
			setState(232);
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode BOOLEN() { return getToken(DSLParser.BOOLEN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DSLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DSLParser.DOT, i);
		}
		public List<List_sizeContext> list_size() {
			return getRuleContexts(List_sizeContext.class);
		}
		public List_sizeContext list_size(int i) {
			return getRuleContext(List_sizeContext.class,i);
		}
		public List<List_getContext> list_get() {
			return getRuleContexts(List_getContext.class);
		}
		public List_getContext list_get(int i) {
			return getRuleContext(List_getContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				{
				setState(234);
				match(LOGIC_NAME);
				setState(235);
				match(DOT);
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST_SIZE:
					{
					setState(236);
					list_size();
					}
					break;
				case LIST_GET:
					{
					setState(237);
					list_get();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				{
				setState(240);
				type();
				}
				break;
			}
			setState(243);
			match(BOOLEN);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(244);
				match(LOGIC_NAME);
				setState(245);
				match(DOT);
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST_SIZE:
					{
					setState(246);
					list_size();
					}
					break;
				case LIST_GET:
					{
					setState(247);
					list_get();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(250);
				type();
				}
				break;
			}
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

	public static class PostContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DSLParser.ASSIGNMENT, 0); }
		public TerminalNode POST() { return getToken(DSLParser.POST, 0); }
		public TerminalNode LOGIC_BR_OPEN() { return getToken(DSLParser.LOGIC_BR_OPEN, 0); }
		public List<TerminalNode> SINGLE() { return getTokens(DSLParser.SINGLE); }
		public TerminalNode SINGLE(int i) {
			return getToken(DSLParser.SINGLE, i);
		}
		public TerminalNode LOGIC_BR_COLSE() { return getToken(DSLParser.LOGIC_BR_COLSE, 0); }
		public PostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterPost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitPost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitPost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostContext post() throws RecognitionException {
		PostContext _localctx = new PostContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_post);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LOGIC_NAME);
			setState(254);
			match(ASSIGNMENT);
			setState(255);
			match(POST);
			setState(256);
			match(LOGIC_BR_OPEN);
			setState(257);
			match(SINGLE);
			setState(258);
			match(LOGIC_NAME);
			setState(259);
			match(SINGLE);
			setState(260);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PostContext post() {
			return getRuleContext(PostContext.class,0);
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
		enterRule(_localctx, 30, RULE_var);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(LOGIC_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				post();
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DSLParser.VAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(VAR);
			setState(268);
			var();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_COMMA) {
				{
				{
				setState(269);
				match(LOGIC_COMMA);
				{
				setState(270);
				var();
				}
				}
				}
				setState(275);
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
		public PostContext post() {
			return getRuleContext(PostContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LIST);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(277);
				post();
				}
				break;
			case 2:
				{
				{
				setState(278);
				match(LOGIC_NAME);
				setState(279);
				match(ASSIGNMENT);
				setState(280);
				match(LOGIC_OPEN);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(281);
					type();
					}
					break;
				case 2:
					{
					{
					setState(282);
					type();
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(283);
						match(LOGIC_COMMA);
						setState(284);
						type();
						}
						}
						setState(287); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LOGIC_COMMA );
					}
					}
					break;
				}
				setState(291);
				match(LOGIC_CLOSE);
				}
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DSLParser.ASSIGNMENT, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DSLParser.DOT, 0); }
		public List_sizeContext list_size() {
			return getRuleContext(List_sizeContext.class,0);
		}
		public List_getContext list_get() {
			return getRuleContext(List_getContext.class,0);
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
		enterRule(_localctx, 36, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LOGIC_NAME);
			setState(295);
			match(ASSIGNMENT);
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				{
				setState(296);
				type();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERAND) {
					{
					{
					setState(297);
					match(OPERAND);
					setState(298);
					type();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(304);
				match(LOGIC_NAME);
				setState(305);
				match(DOT);
				setState(308);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST_SIZE:
					{
					setState(306);
					list_size();
					}
					break;
				case LIST_GET:
					{
					setState(307);
					list_get();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(310);
				call_function();
				}
				break;
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
		public TerminalNode DART() { return getToken(DSLParser.DART, 0); }
		public TerminalNode LOGIC_COMMA() { return getToken(DSLParser.LOGIC_COMMA, 0); }
		public TerminalNode OPERAND() { return getToken(DSLParser.OPERAND, 0); }
		public TerminalNode LOGIC_DIGIT() { return getToken(DSLParser.LOGIC_DIGIT, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public TerminalNode LOGIC_BR_OPEN() { return getToken(DSLParser.LOGIC_BR_OPEN, 0); }
		public Logic_bodyContext logic_body() {
			return getRuleContext(Logic_bodyContext.class,0);
		}
		public TerminalNode LOGIC_BR_COLSE() { return getToken(DSLParser.LOGIC_BR_COLSE, 0); }
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DSLParser.DOT, 0); }
		public List_sizeContext list_size() {
			return getRuleContext(List_sizeContext.class,0);
		}
		public List_getContext list_get() {
			return getRuleContext(List_getContext.class,0);
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
		enterRule(_localctx, 38, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(FOR);
			setState(314);
			match(LOGIC_OPEN);
			{
			setState(315);
			match(LOGIC_NAME);
			}
			setState(316);
			match(DART);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(317);
				type();
				}
				break;
			case 2:
				{
				{
				setState(318);
				match(LOGIC_NAME);
				setState(319);
				match(DOT);
				setState(322);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST_SIZE:
					{
					setState(320);
					list_size();
					}
					break;
				case LIST_GET:
					{
					setState(321);
					list_get();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
			setState(326);
			match(LOGIC_COMMA);
			setState(327);
			match(OPERAND);
			setState(328);
			match(LOGIC_DIGIT);
			setState(329);
			match(LOGIC_CLOSE);
			setState(330);
			match(LOGIC_BR_OPEN);
			setState(331);
			logic_body();
			setState(332);
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
		enterRule(_localctx, 40, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(LOGIC_NAME);
			setState(335);
			match(LOGIC_OPEN);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(336);
				type();
				}
				break;
			case 2:
				{
				{
				setState(337);
				type();
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(338);
					match(LOGIC_COMMA);
					setState(339);
					type();
					}
					}
					setState(342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOGIC_COMMA );
				}
				}
				break;
			}
			setState(346);
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
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public TerminalNode LOGIC_BR_OPEN() { return getToken(DSLParser.LOGIC_BR_OPEN, 0); }
		public Logic_bodyContext logic_body() {
			return getRuleContext(Logic_bodyContext.class,0);
		}
		public TerminalNode LOGIC_BR_COLSE() { return getToken(DSLParser.LOGIC_BR_COLSE, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(DSLParser.RETURN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LOGIC_SIMICOLON() { return getToken(DSLParser.LOGIC_SIMICOLON, 0); }
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
		enterRule(_localctx, 42, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(FUNCTION);
			setState(349);
			match(LOGIC_NAME);
			setState(350);
			match(LOGIC_OPEN);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGIC_NAME) {
				{
				setState(351);
				parameter();
				}
			}

			setState(354);
			match(LOGIC_CLOSE);
			setState(355);
			match(LOGIC_BR_OPEN);
			setState(356);
			logic_body();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(357);
				match(RETURN);
				setState(358);
				type();
				setState(359);
				match(LOGIC_SIMICOLON);
				}
			}

			setState(363);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> LOGIC_NAME() { return getTokens(DSLParser.LOGIC_NAME); }
		public TerminalNode LOGIC_NAME(int i) {
			return getToken(DSLParser.LOGIC_NAME, i);
		}
		public List<TerminalNode> LOGIC_COMMA() { return getTokens(DSLParser.LOGIC_COMMA); }
		public TerminalNode LOGIC_COMMA(int i) {
			return getToken(DSLParser.LOGIC_COMMA, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(LOGIC_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(366);
				match(LOGIC_NAME);
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(367);
					match(LOGIC_COMMA);
					setState(368);
					match(LOGIC_NAME);
					}
					}
					setState(371); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LOGIC_COMMA );
				}
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
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(PRINT);
			setState(376);
			match(LOGIC_OPEN);
			setState(377);
			type();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_COMMA) {
				{
				{
				setState(378);
				match(LOGIC_COMMA);
				setState(379);
				type();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
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
		enterRule(_localctx, 48, RULE_logic_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << IF) | (1L << FOR) | (1L << VAR) | (1L << PRINT) | (1L << LOGIC_NAME))) != 0)) {
				{
				{
				setState(387);
				logic();
				}
				}
				setState(392);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public TerminalNode LOGIC_DIGIT() { return getToken(DSLParser.LOGIC_DIGIT, 0); }
		public TerminalNode LOGIC_STRING() { return getToken(DSLParser.LOGIC_STRING, 0); }
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
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGIC_NAME) | (1L << LOGIC_STRING) | (1L << LOGIC_DIGIT))) != 0)) ) {
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
		public List_getContext list_get() {
			return getRuleContext(List_getContext.class,0);
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
		enterRule(_localctx, 52, RULE_list_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(LOGIC_NAME);
			setState(396);
			match(DOT);
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_ADD:
				{
				setState(397);
				list_add();
				}
				break;
			case LIST_DELETE:
				{
				setState(398);
				list_delete();
				}
				break;
			case LIST_SIZE:
				{
				setState(399);
				list_size();
				}
				break;
			case LIST_GET:
				{
				setState(400);
				list_get();
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
		enterRule(_localctx, 54, RULE_list_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LIST_ADD);
			setState(404);
			match(LOGIC_OPEN);
			setState(405);
			type();
			setState(406);
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
		public TerminalNode LOGIC_DIGIT() { return getToken(DSLParser.LOGIC_DIGIT, 0); }
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
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
		enterRule(_localctx, 56, RULE_list_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LIST_DELETE);
			setState(409);
			match(LOGIC_OPEN);
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==LOGIC_NAME || _la==LOGIC_DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(411);
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
		enterRule(_localctx, 58, RULE_list_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LIST_SIZE);
			setState(414);
			match(LOGIC_OPEN);
			setState(415);
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

	public static class List_getContext extends ParserRuleContext {
		public TerminalNode LIST_GET() { return getToken(DSLParser.LIST_GET, 0); }
		public TerminalNode LOGIC_OPEN() { return getToken(DSLParser.LOGIC_OPEN, 0); }
		public TerminalNode LOGIC_CLOSE() { return getToken(DSLParser.LOGIC_CLOSE, 0); }
		public TerminalNode LOGIC_DIGIT() { return getToken(DSLParser.LOGIC_DIGIT, 0); }
		public TerminalNode LOGIC_NAME() { return getToken(DSLParser.LOGIC_NAME, 0); }
		public List_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterList_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitList_get(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitList_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_getContext list_get() throws RecognitionException {
		List_getContext _localctx = new List_getContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_list_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LIST_GET);
			setState(418);
			match(LOGIC_OPEN);
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==LOGIC_NAME || _la==LOGIC_DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(420);
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
		enterRule(_localctx, 62, RULE_lang_Misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		"\u0004\u0001>\u01a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001V\b\u0001\n\u0001\f\u0001Y\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002a\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003h\b\u0003\n\u0003\f\u0003k\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005z\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0084\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0005\u0006\u008b\b\u0006"+
		"\n\u0006\f\u0006\u008e\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0093\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007\u009d\t\u0007\u0001\u0007"+
		"\u0003\u0007\u00a0\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b5\b\t\n\t\f\t\u00b8"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u00be\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c6\b\n\u0001\n\u0001\n\u0003"+
		"\n\u00ca\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d5\b\u000b"+
		"\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e1\b\f\n\f\f\f\u00e4\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00ef\b\r\u0001\r\u0003\r\u00f2\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00f9\b\r\u0001\r\u0003\r\u00fc\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010a"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0110"+
		"\b\u0010\n\u0010\f\u0010\u0113\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u011e\b\u0011\u000b\u0011\f\u0011\u011f\u0003\u0011\u0122"+
		"\b\u0011\u0001\u0011\u0003\u0011\u0125\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u012c\b\u0012\n\u0012"+
		"\f\u0012\u012f\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0135\b\u0012\u0001\u0012\u0003\u0012\u0138\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0143\b\u0013\u0003\u0013\u0145"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0155\b\u0014\u000b\u0014\f"+
		"\u0014\u0156\u0003\u0014\u0159\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0161\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u016a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0004\u0016\u0172\b\u0016\u000b\u0016\f\u0016"+
		"\u0173\u0003\u0016\u0176\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u017d\b\u0017\n\u0017\f\u0017\u0180\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0005\u0018\u0185\b\u0018\n\u0018"+
		"\f\u0018\u0188\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0192\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>\u0000\u0003\u0002\u000000<=\u0002\u000000==\u0001\u0000"+
		"\u0003\u0004\u01c1\u0000C\u0001\u0000\u0000\u0000\u0002L\u0001\u0000\u0000"+
		"\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\b"+
		"n\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000"+
		"\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014\u00c9\u0001\u0000\u0000"+
		"\u0000\u0016\u00cb\u0001\u0000\u0000\u0000\u0018\u00db\u0001\u0000\u0000"+
		"\u0000\u001a\u00f1\u0001\u0000\u0000\u0000\u001c\u00fd\u0001\u0000\u0000"+
		"\u0000\u001e\u0109\u0001\u0000\u0000\u0000 \u010b\u0001\u0000\u0000\u0000"+
		"\"\u0114\u0001\u0000\u0000\u0000$\u0126\u0001\u0000\u0000\u0000&\u0139"+
		"\u0001\u0000\u0000\u0000(\u014e\u0001\u0000\u0000\u0000*\u015c\u0001\u0000"+
		"\u0000\u0000,\u0175\u0001\u0000\u0000\u0000.\u0177\u0001\u0000\u0000\u0000"+
		"0\u0186\u0001\u0000\u0000\u00002\u0189\u0001\u0000\u0000\u00004\u018b"+
		"\u0001\u0000\u0000\u00006\u0193\u0001\u0000\u0000\u00008\u0198\u0001\u0000"+
		"\u0000\u0000:\u019d\u0001\u0000\u0000\u0000<\u01a1\u0001\u0000\u0000\u0000"+
		">\u01a6\u0001\u0000\u0000\u0000@B\u0003>\u001f\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DI\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0003"+
		"\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0001\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LP\u0003\u0004\u0002\u0000MO\u0003"+
		">\u001f\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000SW\u0003\u0012\t\u0000TV\u0003>\u001f\u0000"+
		"UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X\u0003\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0001\u0000\u0000[\\\u0005\u000b\u0000\u0000"+
		"\\`\u0005\u0005\u0000\u0000]^\u0003\u0006\u0003\u0000^_\u0003\n\u0005"+
		"\u0000_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\t\u0000\u0000c\u0005\u0001"+
		"\u0000\u0000\u0000de\u0005\u0006\u0000\u0000ei\u0005\b\u0000\u0000fh\u0003"+
		"\b\u0004\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005\u000f\u0000\u0000m\u0007\u0001\u0000"+
		"\u0000\u0000no\u0005\r\u0000\u0000op\u0005\u000e\u0000\u0000pq\u0005\u0018"+
		"\u0000\u0000qr\u0005\u0017\u0000\u0000r\t\u0001\u0000\u0000\u0000st\u0005"+
		"\u0007\u0000\u0000tx\u0005\b\u0000\u0000uw\u0003\f\u0006\u0000vu\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{|\u0005\u000f\u0000\u0000|\u000b\u0001\u0000\u0000\u0000}\u0092"+
		"\u0005\r\u0000\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0080\u0005"+
		"\u0011\u0000\u0000\u0080\u0083\u0005\u0012\u0000\u0000\u0081\u0084\u0003"+
		"\u000e\u0007\u0000\u0082\u0084\u0003\u0010\b\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u008c\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0005\u0015\u0000\u0000\u0086\u0089\u0003\u000e"+
		"\u0007\u0000\u0087\u0089\u0003\u0010\b\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0016\u0000\u0000\u0090\u0091\u0005\u0017\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092~\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u0013\u0000\u0000\u0095\u009f\u0005\u0012\u0000\u0000\u0096"+
		"\u009b\u0005\u0018\u0000\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098"+
		"\u009a\u0005\u0018\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u00a0\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u001a\u0000\u0000\u009f"+
		"\u0096\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0016\u0000\u0000\u00a2"+
		"\u000f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0012\u0000\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a8\u0005\u0018\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0016\u0000\u0000\u00a9\u00aa\u0005\u0016\u0000\u0000\u00aa"+
		"\u0011\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0002\u0000\u0000\u00ac"+
		"\u00ad\u0005\u001d\u0000\u0000\u00ad\u00ae\u0005\u001b\u0000\u0000\u00ae"+
		"\u00af\u0005\u001d\u0000\u0000\u00af\u00b6\u0005\u001c\u0000\u0000\u00b0"+
		"\u00b5\u0003*\u0015\u0000\u00b1\u00b5\u0003\u0014\n\u0000\u00b2\u00b5"+
		"\u0005/\u0000\u0000\u00b3\u00b5\u0003\u0016\u000b\u0000\u00b4\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u00051\u0000\u0000\u00ba\u0013\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0003\u0018\f\u0000\u00bc\u00be\u0003&\u0013"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00ca\u0001\u0000\u0000\u0000\u00bf\u00c6\u0003 \u0010\u0000"+
		"\u00c0\u00c6\u0003$\u0012\u0000\u00c1\u00c6\u0003.\u0017\u0000\u00c2\u00c6"+
		"\u0003\"\u0011\u0000\u00c3\u00c6\u0003(\u0014\u0000\u00c4\u00c6\u0003"+
		"4\u001a\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u00056\u0000"+
		"\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00ca\u0015\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005)\u0000\u0000\u00cc\u00cd\u0005$\u0000\u0000\u00cd"+
		"\u00ce\u00050\u0000\u0000\u00ce\u00d7\u00052\u0000\u0000\u00cf\u00d8\u0003"+
		"2\u0019\u0000\u00d0\u00d1\u00050\u0000\u0000\u00d1\u00d4\u0005*\u0000"+
		"\u0000\u00d2\u00d5\u0003:\u001d\u0000\u00d3\u00d5\u0003<\u001e\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003(\u0014\u0000\u00d7\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d0\u0001\u0000\u0000\u0000\u00d7\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u00056\u0000\u0000\u00da\u0017\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\"\u0000\u0000\u00dc\u00dd\u00058\u0000\u0000\u00dd\u00e2\u0003\u001a"+
		"\r\u0000\u00de\u00df\u00054\u0000\u0000\u00df\u00e1\u0003\u001a\r\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u00059\u0000\u0000\u00e6\u00e7\u0005:\u0000\u0000\u00e7\u00e8"+
		"\u00030\u0018\u0000\u00e8\u00e9\u0005;\u0000\u0000\u00e9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u00050\u0000\u0000\u00eb\u00ee\u0005*\u0000\u0000"+
		"\u00ec\u00ef\u0003:\u001d\u0000\u00ed\u00ef\u0003<\u001e\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u00032\u0019\u0000\u00f1\u00ea\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00fb\u00055\u0000\u0000\u00f4\u00f5\u00050\u0000"+
		"\u0000\u00f5\u00f8\u0005*\u0000\u0000\u00f6\u00f9\u0003:\u001d\u0000\u00f7"+
		"\u00f9\u0003<\u001e\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u00032\u0019\u0000\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u001b\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"0\u0000\u0000\u00fe\u00ff\u00052\u0000\u0000\u00ff\u0100\u0005\u001f\u0000"+
		"\u0000\u0100\u0101\u0005:\u0000\u0000\u0101\u0102\u0005 \u0000\u0000\u0102"+
		"\u0103\u00050\u0000\u0000\u0103\u0104\u0005 \u0000\u0000\u0104\u0105\u0005"+
		";\u0000\u0000\u0105\u001d\u0001\u0000\u0000\u0000\u0106\u010a\u00050\u0000"+
		"\u0000\u0107\u010a\u0003$\u0012\u0000\u0108\u010a\u0003\u001c\u000e\u0000"+
		"\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u001f\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005$\u0000\u0000\u010c\u0111\u0003\u001e\u000f\u0000\u010d"+
		"\u010e\u00057\u0000\u0000\u010e\u0110\u0003\u001e\u000f\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112!\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0124\u0005"+
		"!\u0000\u0000\u0115\u0125\u0003\u001c\u000e\u0000\u0116\u0117\u00050\u0000"+
		"\u0000\u0117\u0118\u00052\u0000\u0000\u0118\u0121\u00058\u0000\u0000\u0119"+
		"\u0122\u00032\u0019\u0000\u011a\u011d\u00032\u0019\u0000\u011b\u011c\u0005"+
		"7\u0000\u0000\u011c\u011e\u00032\u0019\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000"+
		"\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u00059\u0000\u0000\u0124\u0115\u0001\u0000\u0000\u0000"+
		"\u0124\u0116\u0001\u0000\u0000\u0000\u0125#\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u00050\u0000\u0000\u0127\u0137\u00052\u0000\u0000\u0128\u012d\u0003"+
		"2\u0019\u0000\u0129\u012a\u00053\u0000\u0000\u012a\u012c\u00032\u0019"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0138\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u00050\u0000\u0000\u0131\u0134\u0005*\u0000\u0000\u0132"+
		"\u0135\u0003:\u001d\u0000\u0133\u0135\u0003<\u001e\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0138\u0003(\u0014\u0000\u0137\u0128\u0001\u0000"+
		"\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000"+
		"\u0000\u0000\u0138%\u0001\u0000\u0000\u0000\u0139\u013a\u0005#\u0000\u0000"+
		"\u013a\u013b\u00058\u0000\u0000\u013b\u013c\u00050\u0000\u0000\u013c\u0144"+
		"\u0005.\u0000\u0000\u013d\u0145\u00032\u0019\u0000\u013e\u013f\u00050"+
		"\u0000\u0000\u013f\u0142\u0005*\u0000\u0000\u0140\u0143\u0003:\u001d\u0000"+
		"\u0141\u0143\u0003<\u001e\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0141\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144"+
		"\u013d\u0001\u0000\u0000\u0000\u0144\u013e\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u00057\u0000\u0000\u0147\u0148"+
		"\u00053\u0000\u0000\u0148\u0149\u0005=\u0000\u0000\u0149\u014a\u00059"+
		"\u0000\u0000\u014a\u014b\u0005:\u0000\u0000\u014b\u014c\u00030\u0018\u0000"+
		"\u014c\u014d\u0005;\u0000\u0000\u014d\'\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u00050\u0000\u0000\u014f\u0158\u00058\u0000\u0000\u0150\u0159\u0003"+
		"2\u0019\u0000\u0151\u0154\u00032\u0019\u0000\u0152\u0153\u00057\u0000"+
		"\u0000\u0153\u0155\u00032\u0019\u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000"+
		"\u0158\u0150\u0001\u0000\u0000\u0000\u0158\u0151\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u00059\u0000\u0000\u015b)\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0005+\u0000\u0000\u015d\u015e\u00050\u0000\u0000\u015e\u0160\u00058"+
		"\u0000\u0000\u015f\u0161\u0003,\u0016\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u00059\u0000\u0000\u0163\u0164\u0005:\u0000\u0000\u0164"+
		"\u0169\u00030\u0018\u0000\u0165\u0166\u0005-\u0000\u0000\u0166\u0167\u0003"+
		"2\u0019\u0000\u0167\u0168\u00056\u0000\u0000\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005;\u0000\u0000"+
		"\u016c+\u0001\u0000\u0000\u0000\u016d\u0176\u00050\u0000\u0000\u016e\u0171"+
		"\u00050\u0000\u0000\u016f\u0170\u00057\u0000\u0000\u0170\u0172\u00050"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u016d\u0001\u0000"+
		"\u0000\u0000\u0175\u016e\u0001\u0000\u0000\u0000\u0176-\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0005,\u0000\u0000\u0178\u0179\u00058\u0000\u0000\u0179"+
		"\u017e\u00032\u0019\u0000\u017a\u017b\u00057\u0000\u0000\u017b\u017d\u0003"+
		"2\u0019\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u00059\u0000\u0000\u0182/\u0001\u0000\u0000\u0000"+
		"\u0183\u0185\u0003\u0014\n\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u01871\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0007\u0000\u0000\u0000\u018a3\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u00050\u0000\u0000\u018c\u0191\u0005*\u0000"+
		"\u0000\u018d\u0192\u00036\u001b\u0000\u018e\u0192\u00038\u001c\u0000\u018f"+
		"\u0192\u0003:\u001d\u0000\u0190\u0192\u0003<\u001e\u0000\u0191\u018d\u0001"+
		"\u0000\u0000\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u01925\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005%\u0000\u0000\u0194\u0195\u00058\u0000\u0000"+
		"\u0195\u0196\u00032\u0019\u0000\u0196\u0197\u00059\u0000\u0000\u01977"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0005&\u0000\u0000\u0199\u019a\u0005"+
		"8\u0000\u0000\u019a\u019b\u0007\u0001\u0000\u0000\u019b\u019c\u00059\u0000"+
		"\u0000\u019c9\u0001\u0000\u0000\u0000\u019d\u019e\u0005\'\u0000\u0000"+
		"\u019e\u019f\u00058\u0000\u0000\u019f\u01a0\u00059\u0000\u0000\u01a0;"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005(\u0000\u0000\u01a2\u01a3\u0005"+
		"8\u0000\u0000\u01a3\u01a4\u0007\u0001\u0000\u0000\u01a4\u01a5\u00059\u0000"+
		"\u0000\u01a5=\u0001\u0000\u0000\u0000\u01a6\u01a7\u0007\u0002\u0000\u0000"+
		"\u01a7?\u0001\u0000\u0000\u0000,CIPW`ix\u0083\u0088\u008c\u0092\u009b"+
		"\u009f\u00b4\u00b6\u00bd\u00c5\u00c9\u00d4\u00d7\u00e2\u00ee\u00f1\u00f8"+
		"\u00fb\u0109\u0111\u011f\u0121\u0124\u012d\u0134\u0137\u0142\u0144\u0156"+
		"\u0158\u0160\u0169\u0173\u0175\u017e\u0186\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}