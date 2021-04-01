// Generated from Gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, IDENTIFICADOR=22, CONSTENTERO=23, 
		CONSTREAL=24, CONSTLIT=25, WS=26, ERRORCOMENT=27, ERRORLIT=28, ERRORNUM=29;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_programPrima = 2, RULE_part = 3, RULE_fpart = 4, 
		RULE_restpart = 5, RULE_restpartPrima = 6, RULE_listparam = 7, RULE_listparamPrima = 8, 
		RULE_type = 9, RULE_blq = 10, RULE_sentlist = 11, RULE_sentlistPrima = 12, 
		RULE_sent = 13, RULE_sentPrima = 14, RULE_sentPrimaPrima = 15, RULE_lid = 16, 
		RULE_lidPrima = 17, RULE_asig = 18, RULE_exp = 19, RULE_expPrima = 20, 
		RULE_expPrimaPrima = 21, RULE_op = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "programPrima", "part", "fpart", "restpart", "restpartPrima", 
			"listparam", "listparamPrima", "type", "blq", "sentlist", "sentlistPrima", 
			"sent", "sentPrima", "sentPrimaPrima", "lid", "lidPrima", "asig", "exp", 
			"expPrima", "expPrimaPrima", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "';'", "'return'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "IDENTIFICADOR", 
			"CONSTENTERO", "CONSTREAL", "CONSTLIT", "WS", "ERRORCOMENT", "ERRORLIT", 
			"ERRORNUM"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				program();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramPrimaContext programPrima() {
			return getRuleContext(ProgramPrimaContext.class,0);
		}
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public FpartContext fpart() {
			return getRuleContext(FpartContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(51);
				part();
				}
				break;
			case 2:
				{
				setState(52);
				fpart();
				}
				break;
			}
			setState(55);
			programPrima();
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

	public static class ProgramPrimaContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProgramPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProgramPrima(this);
		}
	}

	public final ProgramPrimaContext programPrima() throws RecognitionException {
		ProgramPrimaContext _localctx = new ProgramPrimaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programPrima);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				program();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PartContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPart(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_part);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__0);
				setState(62);
				type();
				setState(63);
				restpart();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__1);
				setState(66);
				restpart();
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

	public static class FpartContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public FpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFpart(this);
		}
	}

	public final FpartContext fpart() throws RecognitionException {
		FpartContext _localctx = new FpartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fpart);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(T__0);
				setState(71);
				type();
				setState(72);
				restpart();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__1);
				setState(75);
				match(T__1);
				setState(76);
				restpart();

				    notifyErrorListeners("You repeated funcion keyword.");

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

	public static class RestpartContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public RestpartPrimaContext restpartPrima() {
			return getRuleContext(RestpartPrimaContext.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestpart(this);
		}
	}

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IDENTIFICADOR);
			setState(82);
			match(T__2);
			setState(83);
			restpartPrima();
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

	public static class RestpartPrimaContext extends ParserRuleContext {
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public RestpartPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpartPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestpartPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestpartPrima(this);
		}
	}

	public final RestpartPrimaContext restpartPrima() throws RecognitionException {
		RestpartPrimaContext _localctx = new RestpartPrimaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_restpartPrima);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				listparam();
				setState(86);
				match(T__3);
				setState(87);
				blq();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__3);
				setState(90);
				blq();
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

	public static class ListparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ListparamPrimaContext listparamPrima() {
			return getRuleContext(ListparamPrimaContext.class,0);
		}
		public ListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListparam(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		ListparamContext _localctx = new ListparamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			type();
			setState(94);
			match(IDENTIFICADOR);
			setState(95);
			listparamPrima();
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

	public static class ListparamPrimaContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ListparamPrimaContext listparamPrima() {
			return getRuleContext(ListparamPrimaContext.class,0);
		}
		public ListparamPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparamPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListparamPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListparamPrima(this);
		}
	}

	public final ListparamPrimaContext listparamPrima() throws RecognitionException {
		ListparamPrimaContext _localctx = new ListparamPrimaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listparamPrima);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__4);
				setState(98);
				type();
				setState(99);
				match(IDENTIFICADOR);
				setState(100);
				listparamPrima();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

	public static class BlqContext extends ParserRuleContext {
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlq(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__8);
			setState(108);
			sentlist();
			setState(109);
			match(T__9);
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

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistPrimaContext sentlistPrima() {
			return getRuleContext(SentlistPrimaContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			sent();
			setState(112);
			sentlistPrima();
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

	public static class SentlistPrimaContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistPrimaContext sentlistPrima() {
			return getRuleContext(SentlistPrimaContext.class,0);
		}
		public SentlistPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlistPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentlistPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentlistPrima(this);
		}
	}

	public final SentlistPrimaContext sentlistPrima() throws RecognitionException {
		SentlistPrimaContext _localctx = new SentlistPrimaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentlistPrima);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__11:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				sent();
				setState(115);
				sentlistPrima();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public SentPrimaContext sentPrima() {
			return getRuleContext(SentPrimaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sent);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				type();
				setState(121);
				lid();
				setState(122);
				match(T__10);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(IDENTIFICADOR);
				setState(125);
				sentPrima();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(T__11);
				setState(127);
				exp();
				setState(128);
				match(T__10);
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

	public static class SentPrimaContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SentPrimaPrimaContext sentPrimaPrima() {
			return getRuleContext(SentPrimaPrimaContext.class,0);
		}
		public SentPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentPrima(this);
		}
	}

	public final SentPrimaContext sentPrima() throws RecognitionException {
		SentPrimaContext _localctx = new SentPrimaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentPrima);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				asig();
				setState(133);
				exp();
				setState(134);
				match(T__10);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__2);
				setState(137);
				sentPrimaPrima();
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

	public static class SentPrimaPrimaContext extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public SentPrimaPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentPrimaPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentPrimaPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentPrimaPrima(this);
		}
	}

	public final SentPrimaPrimaContext sentPrimaPrima() throws RecognitionException {
		SentPrimaPrimaContext _localctx = new SentPrimaPrimaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentPrimaPrima);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				lid();
				setState(141);
				match(T__3);
				setState(142);
				match(T__10);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__3);
				setState(145);
				match(T__10);
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

	public static class LidContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public LidPrimaContext lidPrima() {
			return getRuleContext(LidPrimaContext.class,0);
		}
		public LidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLid(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IDENTIFICADOR);
			setState(149);
			lidPrima();
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

	public static class LidPrimaContext extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public LidPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lidPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLidPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLidPrima(this);
		}
	}

	public final LidPrimaContext lidPrima() throws RecognitionException {
		LidPrimaContext _localctx = new LidPrimaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lidPrima);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__4);
				setState(153);
				lid();
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

	public static class AsigContext extends ParserRuleContext {
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode CONSTENTERO() { return getToken(GramaticaParser.CONSTENTERO, 0); }
		public ExpPrimaContext expPrima() {
			return getRuleContext(ExpPrimaContext.class,0);
		}
		public TerminalNode CONSTREAL() { return getToken(GramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(GramaticaParser.CONSTLIT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ExpPrimaPrimaContext expPrimaPrima() {
			return getRuleContext(ExpPrimaPrimaContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(CONSTENTERO);
				setState(159);
				expPrima();
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(CONSTREAL);
				setState(161);
				expPrima();
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(CONSTLIT);
				setState(163);
				expPrima();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(T__2);
				setState(165);
				exp();
				setState(166);
				match(T__3);
				setState(167);
				expPrima();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(IDENTIFICADOR);
				setState(170);
				expPrimaPrima();
				setState(171);
				expPrima();
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

	public static class ExpPrimaContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpPrima(this);
		}
	}

	public final ExpPrimaContext expPrima() throws RecognitionException {
		ExpPrimaContext _localctx = new ExpPrimaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expPrima);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				op();
				setState(176);
				exp();
				}
				break;
			case T__3:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpPrimaPrimaContext extends ParserRuleContext {
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public ExpPrimaPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPrimaPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpPrimaPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpPrimaPrima(this);
		}
	}

	public final ExpPrimaPrimaContext expPrimaPrima() throws RecognitionException {
		ExpPrimaPrimaContext _localctx = new ExpPrimaPrimaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expPrimaPrima);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__2);
				setState(182);
				lid();
				setState(183);
				match(T__3);
				}
				break;
			case T__3:
			case T__10:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\5\38\n\3\3\3\3\3\3\4\3\4\5\4>\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\5\16y\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0085\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008d\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u009d\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b0\n\25\3\26\3\26\3\26"+
		"\3\26\5\26\u00b6\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00bd\n\27\3\30\3"+
		"\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3"+
		"\2\b\n\3\2\17\23\3\2\24\27\2\u00bc\2\61\3\2\2\2\4\67\3\2\2\2\6=\3\2\2"+
		"\2\bE\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22i\3\2\2"+
		"\2\24k\3\2\2\2\26m\3\2\2\2\30q\3\2\2\2\32x\3\2\2\2\34\u0084\3\2\2\2\36"+
		"\u008c\3\2\2\2 \u0094\3\2\2\2\"\u0096\3\2\2\2$\u009c\3\2\2\2&\u009e\3"+
		"\2\2\2(\u00af\3\2\2\2*\u00b5\3\2\2\2,\u00bc\3\2\2\2.\u00be\3\2\2\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\3\3\2\2\2\658\5\b\5\2\668\5\n\6\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2"+
		"\29:\5\6\4\2:\5\3\2\2\2;>\5\4\3\2<>\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\7\3\2"+
		"\2\2?@\7\3\2\2@A\5\24\13\2AB\5\f\7\2BF\3\2\2\2CD\7\4\2\2DF\5\f\7\2E?\3"+
		"\2\2\2EC\3\2\2\2F\t\3\2\2\2GH\7\3\2\2HI\7\3\2\2IJ\5\24\13\2JK\5\f\7\2"+
		"KR\3\2\2\2LM\7\4\2\2MN\7\4\2\2NO\5\f\7\2OP\b\6\1\2PR\3\2\2\2QG\3\2\2\2"+
		"QL\3\2\2\2R\13\3\2\2\2ST\7\30\2\2TU\7\5\2\2UV\5\16\b\2V\r\3\2\2\2WX\5"+
		"\20\t\2XY\7\6\2\2YZ\5\26\f\2Z^\3\2\2\2[\\\7\6\2\2\\^\5\26\f\2]W\3\2\2"+
		"\2][\3\2\2\2^\17\3\2\2\2_`\5\24\13\2`a\7\30\2\2ab\5\22\n\2b\21\3\2\2\2"+
		"cd\7\7\2\2de\5\24\13\2ef\7\30\2\2fg\5\22\n\2gj\3\2\2\2hj\3\2\2\2ic\3\2"+
		"\2\2ih\3\2\2\2j\23\3\2\2\2kl\t\2\2\2l\25\3\2\2\2mn\7\13\2\2no\5\30\r\2"+
		"op\7\f\2\2p\27\3\2\2\2qr\5\34\17\2rs\5\32\16\2s\31\3\2\2\2tu\5\34\17\2"+
		"uv\5\32\16\2vy\3\2\2\2wy\3\2\2\2xt\3\2\2\2xw\3\2\2\2y\33\3\2\2\2z{\5\24"+
		"\13\2{|\5\"\22\2|}\7\r\2\2}\u0085\3\2\2\2~\177\7\30\2\2\177\u0085\5\36"+
		"\20\2\u0080\u0081\7\16\2\2\u0081\u0082\5(\25\2\u0082\u0083\7\r\2\2\u0083"+
		"\u0085\3\2\2\2\u0084z\3\2\2\2\u0084~\3\2\2\2\u0084\u0080\3\2\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\5&\24\2\u0087\u0088\5(\25\2\u0088\u0089\7\r\2"+
		"\2\u0089\u008d\3\2\2\2\u008a\u008b\7\5\2\2\u008b\u008d\5 \21\2\u008c\u0086"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\37\3\2\2\2\u008e\u008f\5\"\22\2\u008f"+
		"\u0090\7\6\2\2\u0090\u0091\7\r\2\2\u0091\u0095\3\2\2\2\u0092\u0093\7\6"+
		"\2\2\u0093\u0095\7\r\2\2\u0094\u008e\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"!\3\2\2\2\u0096\u0097\7\30\2\2\u0097\u0098\5$\23\2\u0098#\3\2\2\2\u0099"+
		"\u009d\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009d\5\"\22\2\u009c\u0099\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009d%\3\2\2\2\u009e\u009f\t\3\2\2\u009f\'"+
		"\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00b0\5*\26\2\u00a2\u00a3\7\32\2\2"+
		"\u00a3\u00b0\5*\26\2\u00a4\u00a5\7\33\2\2\u00a5\u00b0\5*\26\2\u00a6\u00a7"+
		"\7\5\2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\5*\26\2\u00aa"+
		"\u00b0\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\5"+
		"*\26\2\u00ae\u00b0\3\2\2\2\u00af\u00a0\3\2\2\2\u00af\u00a2\3\2\2\2\u00af"+
		"\u00a4\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0)\3\2\2\2"+
		"\u00b1\u00b2\5.\30\2\u00b2\u00b3\5(\25\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6+\3\2\2\2\u00b7"+
		"\u00b8\7\5\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7\6\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"-\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf/\3\2\2\2\21\63\67=EQ]ix\u0084\u008c"+
		"\u0094\u009c\u00af\u00b5\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}