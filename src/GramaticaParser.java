// Generated from src/Gramatica.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, IDENTIFICADOR=40, CONSTENTERO=41, CONSTREAL=42, CONSTLIT=43, 
		WS=44, ERRORCOMENT=45, ERRORLIT=46, ERRORNUM=47;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_programPrima = 2, RULE_part = 3, RULE_restpart = 4, 
		RULE_restpartPrimaIntermedia = 5, RULE_restpartPrimaIntermediaListparam = 6, 
		RULE_restpartPrimaIntermediaParentesis = 7, RULE_restPartPrimaIntermedia2 = 8, 
		RULE_restpartPrima = 9, RULE_frestpartPrima = 10, RULE_unCierreParentOVarios = 11, 
		RULE_listparam = 12, RULE_listparamPrima = 13, RULE_type = 14, RULE_blq = 15, 
		RULE_fblqFaltaInicio = 16, RULE_sentlist = 17, RULE_sentlistPrima = 18, 
		RULE_sent = 19, RULE_restBifurcacion = 20, RULE_fbifurcacion = 21, RULE_fsent = 22, 
		RULE_sentPrima = 23, RULE_sentPrimaPrima = 24, RULE_lid = 25, RULE_lidPrima = 26, 
		RULE_asig = 27, RULE_exp = 28, RULE_expPrima = 29, RULE_expPrimaPrima = 30, 
		RULE_op = 31, RULE_lcond = 32, RULE_lcondPrima = 33, RULE_lcondPrimaPrima = 34, 
		RULE_cond = 35, RULE_oprIntermedia = 36, RULE_oprIntermedia2 = 37, RULE_asignacion = 38, 
		RULE_opr = 39, RULE_fopr = 40, RULE_opl = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "programPrima", "part", "restpart", "restpartPrimaIntermedia", 
			"restpartPrimaIntermediaListparam", "restpartPrimaIntermediaParentesis", 
			"restPartPrimaIntermedia2", "restpartPrima", "frestpartPrima", "unCierreParentOVarios", 
			"listparam", "listparamPrima", "type", "blq", "fblqFaltaInicio", "sentlist", 
			"sentlistPrima", "sent", "restBifurcacion", "fbifurcacion", "fsent", 
			"sentPrima", "sentPrimaPrima", "lid", "lidPrima", "asig", "exp", "expPrima", 
			"expPrimaPrima", "op", "lcond", "lcondPrima", "lcondPrimaPrima", "cond", 
			"oprIntermedia", "oprIntermedia2", "asignacion", "opr", "fopr", "opl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "'return'", "'bifurcacion'", 
			"'buclepara'", "'buclemientras'", "'bucle'", "'hasta'", "'entonces'", 
			"'sino'", "'bifurcacio'", "';'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'+'", "'-'", "'*'", "'/'", "'no'", "'cierto'", "'falso'", "'<>'", "'<'", 
			"'>'", "'>='", "'<='", "'y'", "'o'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", 
			"CONSTLIT", "WS", "ERRORCOMENT", "ERRORLIT", "ERRORNUM"
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				program();
				}
				}
				setState(87); 
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
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public ProgramPrimaContext programPrima() {
			return getRuleContext(ProgramPrimaContext.class,0);
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
			setState(89);
			part();
			setState(90);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__0);
				setState(97);
				type();
				setState(98);
				restpart();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__1);
				setState(101);
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

	public static class RestpartContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public RestpartPrimaIntermediaContext restpartPrimaIntermedia() {
			return getRuleContext(RestpartPrimaIntermediaContext.class,0);
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
		enterRule(_localctx, 8, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFICADOR);
			setState(105);
			match(T__2);
			setState(106);
			restpartPrimaIntermedia();
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

	public static class RestpartPrimaIntermediaContext extends ParserRuleContext {
		public RestpartPrimaIntermediaListparamContext restpartPrimaIntermediaListparam() {
			return getRuleContext(RestpartPrimaIntermediaListparamContext.class,0);
		}
		public RestpartPrimaIntermediaParentesisContext restpartPrimaIntermediaParentesis() {
			return getRuleContext(RestpartPrimaIntermediaParentesisContext.class,0);
		}
		public RestpartPrimaIntermediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpartPrimaIntermedia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestpartPrimaIntermedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestpartPrimaIntermedia(this);
		}
	}

	public final RestpartPrimaIntermediaContext restpartPrimaIntermedia() throws RecognitionException {
		RestpartPrimaIntermediaContext _localctx = new RestpartPrimaIntermediaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_restpartPrimaIntermedia);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				restpartPrimaIntermediaListparam();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				restpartPrimaIntermediaParentesis();
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

	public static class RestpartPrimaIntermediaListparamContext extends ParserRuleContext {
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public RestpartPrimaIntermediaParentesisContext restpartPrimaIntermediaParentesis() {
			return getRuleContext(RestpartPrimaIntermediaParentesisContext.class,0);
		}
		public RestpartPrimaIntermediaListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpartPrimaIntermediaListparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestpartPrimaIntermediaListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestpartPrimaIntermediaListparam(this);
		}
	}

	public final RestpartPrimaIntermediaListparamContext restpartPrimaIntermediaListparam() throws RecognitionException {
		RestpartPrimaIntermediaListparamContext _localctx = new RestpartPrimaIntermediaListparamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_restpartPrimaIntermediaListparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			listparam();
			setState(113);
			restpartPrimaIntermediaParentesis();
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

	public static class RestpartPrimaIntermediaParentesisContext extends ParserRuleContext {
		public RestPartPrimaIntermedia2Context restPartPrimaIntermedia2() {
			return getRuleContext(RestPartPrimaIntermedia2Context.class,0);
		}
		public RestpartPrimaIntermediaParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpartPrimaIntermediaParentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestpartPrimaIntermediaParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestpartPrimaIntermediaParentesis(this);
		}
	}

	public final RestpartPrimaIntermediaParentesisContext restpartPrimaIntermediaParentesis() throws RecognitionException {
		RestpartPrimaIntermediaParentesisContext _localctx = new RestpartPrimaIntermediaParentesisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_restpartPrimaIntermediaParentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__3);
			setState(116);
			restPartPrimaIntermedia2();
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

	public static class RestPartPrimaIntermedia2Context extends ParserRuleContext {
		public RestpartPrimaContext restpartPrima() {
			return getRuleContext(RestpartPrimaContext.class,0);
		}
		public FrestpartPrimaContext frestpartPrima() {
			return getRuleContext(FrestpartPrimaContext.class,0);
		}
		public RestPartPrimaIntermedia2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restPartPrimaIntermedia2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestPartPrimaIntermedia2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestPartPrimaIntermedia2(this);
		}
	}

	public final RestPartPrimaIntermedia2Context restPartPrimaIntermedia2() throws RecognitionException {
		RestPartPrimaIntermedia2Context _localctx = new RestPartPrimaIntermedia2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_restPartPrimaIntermedia2);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__18:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				restpartPrima();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				frestpartPrima();
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

	public static class RestpartPrimaContext extends ParserRuleContext {
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public FblqFaltaInicioContext fblqFaltaInicio() {
			return getRuleContext(FblqFaltaInicioContext.class,0);
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
		enterRule(_localctx, 18, RULE_restpartPrima);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				blq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				fblqFaltaInicio();
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

	public static class FrestpartPrimaContext extends ParserRuleContext {
		public UnCierreParentOVariosContext unCierreParentOVarios() {
			return getRuleContext(UnCierreParentOVariosContext.class,0);
		}
		public RestpartPrimaContext restpartPrima() {
			return getRuleContext(RestpartPrimaContext.class,0);
		}
		public FrestpartPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frestpartPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFrestpartPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFrestpartPrima(this);
		}
	}

	public final FrestpartPrimaContext frestpartPrima() throws RecognitionException {
		FrestpartPrimaContext _localctx = new FrestpartPrimaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_frestpartPrima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			unCierreParentOVarios();
			setState(127);
			restpartPrima();

			    notifyErrorListeners("Demasiados paréntesis");

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

	public static class UnCierreParentOVariosContext extends ParserRuleContext {
		public UnCierreParentOVariosContext unCierreParentOVarios() {
			return getRuleContext(UnCierreParentOVariosContext.class,0);
		}
		public UnCierreParentOVariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unCierreParentOVarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterUnCierreParentOVarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitUnCierreParentOVarios(this);
		}
	}

	public final UnCierreParentOVariosContext unCierreParentOVarios() throws RecognitionException {
		UnCierreParentOVariosContext _localctx = new UnCierreParentOVariosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unCierreParentOVarios);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__3);
				setState(132);
				unCierreParentOVarios();
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
		enterRule(_localctx, 24, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			type();
			setState(136);
			match(IDENTIFICADOR);
			setState(137);
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
		enterRule(_localctx, 26, RULE_listparamPrima);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__4);
				setState(140);
				type();
				setState(141);
				match(IDENTIFICADOR);
				setState(142);
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 30, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__8);
			setState(150);
			sentlist();
			setState(151);
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

	public static class FblqFaltaInicioContext extends ParserRuleContext {
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public FblqFaltaInicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblqFaltaInicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFblqFaltaInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFblqFaltaInicio(this);
		}
	}

	public final FblqFaltaInicioContext fblqFaltaInicio() throws RecognitionException {
		FblqFaltaInicioContext _localctx = new FblqFaltaInicioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fblqFaltaInicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			sentlist();
			setState(154);
			match(T__9);

			    notifyErrorListeners("Falta palabra reservada inicio");

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
		enterRule(_localctx, 34, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			sent();
			setState(158);
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
		enterRule(_localctx, 36, RULE_sentlistPrima);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__18:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				sent();
				setState(161);
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
		public List<FsentContext> fsent() {
			return getRuleContexts(FsentContext.class);
		}
		public FsentContext fsent(int i) {
			return getRuleContext(FsentContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(GramaticaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GramaticaParser.IDENTIFICADOR, i);
		}
		public SentPrimaContext sentPrima() {
			return getRuleContext(SentPrimaContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public RestBifurcacionContext restBifurcacion() {
			return getRuleContext(RestBifurcacionContext.class,0);
		}
		public FbifurcacionContext fbifurcacion() {
			return getRuleContext(FbifurcacionContext.class,0);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
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
		enterRule(_localctx, 38, RULE_sent);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				type();
				setState(167);
				lid();
				setState(168);
				fsent();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IDENTIFICADOR);
				setState(171);
				sentPrima();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__10);
				setState(173);
				exp();
				setState(174);
				fsent();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(T__11);
				setState(177);
				match(T__2);
				setState(178);
				lcond();
				setState(179);
				match(T__3);
				setState(180);
				restBifurcacion();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				fbifurcacion();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(T__12);
				setState(184);
				match(T__2);
				setState(185);
				match(IDENTIFICADOR);
				setState(186);
				asig();
				setState(187);
				exp();
				setState(188);
				fsent();
				setState(189);
				lcond();
				setState(190);
				fsent();
				setState(191);
				match(IDENTIFICADOR);
				setState(192);
				asig();
				setState(193);
				exp();
				setState(194);
				match(T__3);
				setState(195);
				blq();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(T__13);
				setState(198);
				match(T__2);
				setState(199);
				lcond();
				setState(200);
				match(T__3);
				setState(201);
				blq();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				match(T__14);
				setState(204);
				blq();
				setState(205);
				match(T__15);
				setState(206);
				match(T__2);
				setState(207);
				lcond();
				setState(208);
				match(T__3);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
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

	public static class RestBifurcacionContext extends ParserRuleContext {
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public RestBifurcacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restBifurcacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestBifurcacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestBifurcacion(this);
		}
	}

	public final RestBifurcacionContext restBifurcacion() throws RecognitionException {
		RestBifurcacionContext _localctx = new RestBifurcacionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_restBifurcacion);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__16);
				setState(214);
				blq();
				setState(215);
				match(T__17);
				setState(216);
				blq();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				blq();
				setState(219);
				match(T__17);
				setState(220);
				blq();
				notifyErrorListeners("Falta la palabra reservada 'entonces'");
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

	public static class FbifurcacionContext extends ParserRuleContext {
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public FbifurcacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fbifurcacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFbifurcacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFbifurcacion(this);
		}
	}

	public final FbifurcacionContext fbifurcacion() throws RecognitionException {
		FbifurcacionContext _localctx = new FbifurcacionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fbifurcacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__18);
			setState(226);
			match(T__2);
			setState(227);
			lcond();
			setState(228);
			match(T__3);
			setState(229);
			match(T__16);
			setState(230);
			blq();
			setState(231);
			match(T__17);
			setState(232);
			blq();
			notifyErrorListeners("Palabra reservada 'bifurcacion' mal escrita");
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

	public static class FsentContext extends ParserRuleContext {
		public FsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFsent(this);
		}
	}

	public final FsentContext fsent() throws RecognitionException {
		FsentContext _localctx = new FsentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fsent);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__19);
				}
				break;
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__18:
			case T__29:
			case T__30:
			case T__31:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Falta punto y coma");
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
		public FsentContext fsent() {
			return getRuleContext(FsentContext.class,0);
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
		enterRule(_localctx, 46, RULE_sentPrima);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				asig();
				setState(240);
				exp();
				setState(241);
				fsent();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__2);
				setState(244);
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
		public FsentContext fsent() {
			return getRuleContext(FsentContext.class,0);
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
		enterRule(_localctx, 48, RULE_sentPrimaPrima);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				lid();
				setState(248);
				match(T__3);
				setState(249);
				fsent();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__3);
				setState(252);
				fsent();
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
		enterRule(_localctx, 50, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFICADOR);
			setState(256);
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
		enterRule(_localctx, 52, RULE_lidPrima);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__18:
			case T__19:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__4);
				setState(260);
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
		enterRule(_localctx, 54, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		public ExpPrimaPrimaContext expPrimaPrima() {
			return getRuleContext(ExpPrimaPrimaContext.class,0);
		}
		public TerminalNode CONSTREAL() { return getToken(GramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(GramaticaParser.CONSTLIT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ExpPrimaContext expPrima() {
			return getRuleContext(ExpPrimaContext.class,0);
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
		enterRule(_localctx, 56, RULE_exp);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(CONSTENTERO);
				setState(266);
				expPrimaPrima();
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(CONSTREAL);
				setState(268);
				expPrimaPrima();
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(CONSTLIT);
				setState(270);
				expPrimaPrima();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(T__2);
				setState(272);
				exp();
				setState(273);
				match(T__3);
				setState(274);
				expPrimaPrima();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(IDENTIFICADOR);
				setState(277);
				expPrima();
				setState(278);
				expPrimaPrima();
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
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
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
		enterRule(_localctx, 58, RULE_expPrima);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__2);
				setState(284);
				lid();
				setState(285);
				match(T__3);
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

	public static class ExpPrimaPrimaContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpPrimaContext expPrima() {
			return getRuleContext(ExpPrimaContext.class,0);
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
		enterRule(_localctx, 60, RULE_expPrimaPrima);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				op();
				setState(290);
				exp();
				setState(291);
				expPrima();
				}
				break;
			case T__2:
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
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
		enterRule(_localctx, 62, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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

	public static class LcondContext extends ParserRuleContext {
		public LcondPrimaContext lcondPrima() {
			return getRuleContext(LcondPrimaContext.class,0);
		}
		public LcondPrimaPrimaContext lcondPrimaPrima() {
			return getRuleContext(LcondPrimaPrimaContext.class,0);
		}
		public LcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLcond(this);
		}
	}

	public final LcondContext lcond() throws RecognitionException {
		LcondContext _localctx = new LcondContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			lcondPrima();
			setState(299);
			lcondPrimaPrima();
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

	public static class LcondPrimaContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LcondPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcondPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLcondPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLcondPrima(this);
		}
	}

	public final LcondPrimaContext lcondPrima() throws RecognitionException {
		LcondPrimaContext _localctx = new LcondPrimaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lcondPrima);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__30:
			case T__31:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				cond();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__29);
				setState(303);
				cond();
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

	public static class LcondPrimaPrimaContext extends ParserRuleContext {
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public LcondPrimaContext lcondPrima() {
			return getRuleContext(LcondPrimaContext.class,0);
		}
		public LcondPrimaPrimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcondPrimaPrima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLcondPrimaPrima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLcondPrimaPrima(this);
		}
	}

	public final LcondPrimaPrimaContext lcondPrimaPrima() throws RecognitionException {
		LcondPrimaPrimaContext _localctx = new LcondPrimaPrimaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lcondPrimaPrima);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				opl();
				setState(307);
				lcond();
				setState(308);
				lcondPrima();
				}
				break;
			case T__2:
			case T__3:
			case T__19:
			case T__29:
			case T__30:
			case T__31:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
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

	public static class CondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OprIntermediaContext oprIntermedia() {
			return getRuleContext(OprIntermediaContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cond);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				exp();
				setState(314);
				oprIntermedia();
				setState(315);
				exp();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(T__31);
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

	public static class OprIntermediaContext extends ParserRuleContext {
		public OprIntermedia2Context oprIntermedia2() {
			return getRuleContext(OprIntermedia2Context.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public OprIntermediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprIntermedia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOprIntermedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOprIntermedia(this);
		}
	}

	public final OprIntermediaContext oprIntermedia() throws RecognitionException {
		OprIntermediaContext _localctx = new OprIntermediaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oprIntermedia);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(T__20);
				setState(322);
				oprIntermedia2();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				opr();
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

	public static class OprIntermedia2Context extends ParserRuleContext {
		public FoprContext fopr() {
			return getRuleContext(FoprContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OprIntermedia2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprIntermedia2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOprIntermedia2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOprIntermedia2(this);
		}
	}

	public final OprIntermedia2Context oprIntermedia2() throws RecognitionException {
		OprIntermedia2Context _localctx = new OprIntermedia2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_oprIntermedia2);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__33:
			case T__34:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				fopr();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				asignacion();
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__20);
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

	public static class OprContext extends ParserRuleContext {
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpr(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class FoprContext extends ParserRuleContext {
		public FoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFopr(this);
		}
	}

	public final FoprContext fopr() throws RecognitionException {
		FoprContext _localctx = new FoprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fopr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(334);
				match(T__33);
				}
				break;
			case T__34:
				{
				setState(335);
				match(T__34);
				}
				break;
			case T__2:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			notifyErrorListeners("La expresión introducida dentro del bucle no es una condición");
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

	public static class OplContext extends ParserRuleContext {
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpl(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u015a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\3\3\3\3\3\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\5\n{\n\n\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0094\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\5\24\u00a7\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d6\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e2\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00f0\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f8\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0100\n\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0108\n\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u011b\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0122\n\37"+
		"\3 \3 \3 \3 \3 \5 \u0129\n \3!\3!\3\"\3\"\3\"\3#\3#\3#\5#\u0133\n#\3$"+
		"\3$\3$\3$\3$\5$\u013a\n$\3%\3%\3%\3%\3%\3%\5%\u0142\n%\3&\3&\3&\5&\u0147"+
		"\n&\3\'\3\'\5\'\u014b\n\'\3(\3(\3)\3)\3*\3*\3*\5*\u0154\n*\3*\3*\3+\3"+
		"+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRT\2\7\3\2\b\n\3\2\27\33\3\2\34\37\3\2#\'\3\2()\2\u0153\2"+
		"W\3\2\2\2\4[\3\2\2\2\6`\3\2\2\2\bh\3\2\2\2\nj\3\2\2\2\fp\3\2\2\2\16r\3"+
		"\2\2\2\20u\3\2\2\2\22z\3\2\2\2\24~\3\2\2\2\26\u0080\3\2\2\2\30\u0087\3"+
		"\2\2\2\32\u0089\3\2\2\2\34\u0093\3\2\2\2\36\u0095\3\2\2\2 \u0097\3\2\2"+
		"\2\"\u009b\3\2\2\2$\u009f\3\2\2\2&\u00a6\3\2\2\2(\u00d5\3\2\2\2*\u00e1"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00ef\3\2\2\2\60\u00f7\3\2\2\2\62\u00ff\3\2\2"+
		"\2\64\u0101\3\2\2\2\66\u0107\3\2\2\28\u0109\3\2\2\2:\u011a\3\2\2\2<\u0121"+
		"\3\2\2\2>\u0128\3\2\2\2@\u012a\3\2\2\2B\u012c\3\2\2\2D\u0132\3\2\2\2F"+
		"\u0139\3\2\2\2H\u0141\3\2\2\2J\u0146\3\2\2\2L\u014a\3\2\2\2N\u014c\3\2"+
		"\2\2P\u014e\3\2\2\2R\u0153\3\2\2\2T\u0157\3\2\2\2VX\5\4\3\2WV\3\2\2\2"+
		"XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[\\\5\b\5\2\\]\5\6\4\2]\5\3\2"+
		"\2\2^a\5\4\3\2_a\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\7\3\2\2\2bc\7\3\2\2cd\5"+
		"\36\20\2de\5\n\6\2ei\3\2\2\2fg\7\4\2\2gi\5\n\6\2hb\3\2\2\2hf\3\2\2\2i"+
		"\t\3\2\2\2jk\7*\2\2kl\7\5\2\2lm\5\f\7\2m\13\3\2\2\2nq\5\16\b\2oq\5\20"+
		"\t\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rs\5\32\16\2st\5\20\t\2t\17\3\2\2\2"+
		"uv\7\6\2\2vw\5\22\n\2w\21\3\2\2\2x{\5\24\13\2y{\5\26\f\2zx\3\2\2\2zy\3"+
		"\2\2\2{\23\3\2\2\2|\177\5 \21\2}\177\5\"\22\2~|\3\2\2\2~}\3\2\2\2\177"+
		"\25\3\2\2\2\u0080\u0081\5\30\r\2\u0081\u0082\5\24\13\2\u0082\u0083\b\f"+
		"\1\2\u0083\27\3\2\2\2\u0084\u0088\7\6\2\2\u0085\u0086\7\6\2\2\u0086\u0088"+
		"\5\30\r\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0088\31\3\2\2\2\u0089"+
		"\u008a\5\36\20\2\u008a\u008b\7*\2\2\u008b\u008c\5\34\17\2\u008c\33\3\2"+
		"\2\2\u008d\u008e\7\7\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7*\2\2\u0090"+
		"\u0091\5\34\17\2\u0091\u0094\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008d\3"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094\35\3\2\2\2\u0095\u0096\t\2\2\2\u0096"+
		"\37\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\f\2"+
		"\2\u009a!\3\2\2\2\u009b\u009c\5$\23\2\u009c\u009d\7\f\2\2\u009d\u009e"+
		"\b\22\1\2\u009e#\3\2\2\2\u009f\u00a0\5(\25\2\u00a0\u00a1\5&\24\2\u00a1"+
		"%\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\5&\24\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\'\3"+
		"\2\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\5\64\33\2\u00aa\u00ab\5.\30\2"+
		"\u00ab\u00d6\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad\u00d6\5\60\31\2\u00ae\u00af"+
		"\7\r\2\2\u00af\u00b0\5:\36\2\u00b0\u00b1\5.\30\2\u00b1\u00d6\3\2\2\2\u00b2"+
		"\u00b3\7\16\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5B\"\2\u00b5\u00b6\7\6"+
		"\2\2\u00b6\u00b7\5*\26\2\u00b7\u00d6\3\2\2\2\u00b8\u00d6\5,\27\2\u00b9"+
		"\u00ba\7\17\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\7*\2\2\u00bc\u00bd\58"+
		"\35\2\u00bd\u00be\5:\36\2\u00be\u00bf\5.\30\2\u00bf\u00c0\5B\"\2\u00c0"+
		"\u00c1\5.\30\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\58\35\2\u00c3\u00c4\5:\36"+
		"\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\5 \21\2\u00c6\u00d6\3\2\2\2\u00c7\u00c8"+
		"\7\20\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\5B\"\2\u00ca\u00cb\7\6\2\2\u00cb"+
		"\u00cc\5 \21\2\u00cc\u00d6\3\2\2\2\u00cd\u00ce\7\21\2\2\u00ce\u00cf\5"+
		" \21\2\u00cf\u00d0\7\22\2\2\u00d0\u00d1\7\5\2\2\u00d1\u00d2\5B\"\2\u00d2"+
		"\u00d3\7\6\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\5 \21\2\u00d5\u00a8\3\2"+
		"\2\2\u00d5\u00ac\3\2\2\2\u00d5\u00ae\3\2\2\2\u00d5\u00b2\3\2\2\2\u00d5"+
		"\u00b8\3\2\2\2\u00d5\u00b9\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d5\u00cd\3\2"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9"+
		"\5 \21\2\u00d9\u00da\7\24\2\2\u00da\u00db\5 \21\2\u00db\u00e2\3\2\2\2"+
		"\u00dc\u00dd\5 \21\2\u00dd\u00de\7\24\2\2\u00de\u00df\5 \21\2\u00df\u00e0"+
		"\b\26\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00dc\3\2\2\2"+
		"\u00e2+\3\2\2\2\u00e3\u00e4\7\25\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5"+
		"B\"\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8\7\23\2\2\u00e8\u00e9\5 \21\2\u00e9"+
		"\u00ea\7\24\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\b\27\1\2\u00ec-\3\2\2"+
		"\2\u00ed\u00f0\7\26\2\2\u00ee\u00f0\b\30\1\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0/\3\2\2\2\u00f1\u00f2\58\35\2\u00f2\u00f3\5:\36\2"+
		"\u00f3\u00f4\5.\30\2\u00f4\u00f8\3\2\2\2\u00f5\u00f6\7\5\2\2\u00f6\u00f8"+
		"\5\62\32\2\u00f7\u00f1\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\61\3\2\2\2\u00f9"+
		"\u00fa\5\64\33\2\u00fa\u00fb\7\6\2\2\u00fb\u00fc\5.\30\2\u00fc\u0100\3"+
		"\2\2\2\u00fd\u00fe\7\6\2\2\u00fe\u0100\5.\30\2\u00ff\u00f9\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\63\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103\5\66\34"+
		"\2\u0103\65\3\2\2\2\u0104\u0108\3\2\2\2\u0105\u0106\7\7\2\2\u0106\u0108"+
		"\5\64\33\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0108\67\3\2\2\2\u0109"+
		"\u010a\t\3\2\2\u010a9\3\2\2\2\u010b\u010c\7+\2\2\u010c\u011b\5> \2\u010d"+
		"\u010e\7,\2\2\u010e\u011b\5> \2\u010f\u0110\7-\2\2\u0110\u011b\5> \2\u0111"+
		"\u0112\7\5\2\2\u0112\u0113\5:\36\2\u0113\u0114\7\6\2\2\u0114\u0115\5>"+
		" \2\u0115\u011b\3\2\2\2\u0116\u0117\7*\2\2\u0117\u0118\5<\37\2\u0118\u0119"+
		"\5> \2\u0119\u011b\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u010d\3\2\2\2\u011a"+
		"\u010f\3\2\2\2\u011a\u0111\3\2\2\2\u011a\u0116\3\2\2\2\u011b;\3\2\2\2"+
		"\u011c\u0122\3\2\2\2\u011d\u011e\7\5\2\2\u011e\u011f\5\64\33\2\u011f\u0120"+
		"\7\6\2\2\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0122"+
		"=\3\2\2\2\u0123\u0124\5@!\2\u0124\u0125\5:\36\2\u0125\u0126\5<\37\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129?\3\2\2\2\u012a\u012b\t\4\2\2\u012bA\3\2\2\2\u012c\u012d\5D"+
		"#\2\u012d\u012e\5F$\2\u012eC\3\2\2\2\u012f\u0133\5H%\2\u0130\u0131\7 "+
		"\2\2\u0131\u0133\5H%\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0133E"+
		"\3\2\2\2\u0134\u0135\5T+\2\u0135\u0136\5B\"\2\u0136\u0137\5D#\2\u0137"+
		"\u013a\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0138\3\2"+
		"\2\2\u013aG\3\2\2\2\u013b\u013c\5:\36\2\u013c\u013d\5J&\2\u013d\u013e"+
		"\5:\36\2\u013e\u0142\3\2\2\2\u013f\u0142\7!\2\2\u0140\u0142\7\"\2\2\u0141"+
		"\u013b\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142I\3\2\2\2"+
		"\u0143\u0144\7\27\2\2\u0144\u0147\5L\'\2\u0145\u0147\5P)\2\u0146\u0143"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147K\3\2\2\2\u0148\u014b\5R*\2\u0149\u014b"+
		"\5N(\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014bM\3\2\2\2\u014c\u014d"+
		"\7\27\2\2\u014dO\3\2\2\2\u014e\u014f\t\5\2\2\u014fQ\3\2\2\2\u0150\u0154"+
		"\7$\2\2\u0151\u0154\7%\2\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b*"+
		"\1\2\u0156S\3\2\2\2\u0157\u0158\t\6\2\2\u0158U\3\2\2\2\32Y`hpz~\u0087"+
		"\u0093\u00a6\u00d5\u00e1\u00ef\u00f7\u00ff\u0107\u011a\u0121\u0128\u0132"+
		"\u0139\u0141\u0146\u014a\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}