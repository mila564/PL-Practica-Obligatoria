// Generated from D:/ESCRITORIO/PL/practica_obligatoria/src\Gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFICADOR=1, CONSTENTERO=2, CONSTREAL=3, CONSTLIT=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", "CONSTLIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", "CONSTLIT", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			IDENTIFICADOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			CONSTENTERO_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			CONSTREAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			CONSTLIT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFICADOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    System.out.println(getText());

			break;
		}
	}
	private void CONSTENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    System.out.println(getText());

			break;
		}
	}
	private void CONSTREAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    System.out.println(getText());

			break;
		}
	}
	private void CONSTLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    System.out.println(getText());

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7\u0081\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\5\2\17\n\2\3\2\7\2\22\n\2\f\2\16"+
		"\2\25\13\2\3\2\3\2\3\3\5\3\32\n\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\5"+
		"\3#\n\3\3\3\6\3&\n\3\r\3\16\3\'\5\3*\n\3\3\3\3\3\3\4\5\4/\n\4\3\4\6\4"+
		"\62\n\4\r\4\16\4\63\3\4\3\4\6\48\n\4\r\4\16\49\3\4\3\4\5\4>\n\4\3\4\6"+
		"\4A\n\4\r\4\16\4B\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\5\4L\n\4\3\5\3\5\3\5"+
		"\3\5\7\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13"+
		"\5\3\5\5\5b\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\5\6~\n\6\3"+
		"\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\r\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"--//\3\2\62;\4\2\62;CH\3\2$$\3\2))\5\2\13\f\17\17\"\"\3\2\f\f\3\2//\3"+
		"\2\'\'\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\3\16\3\2\2\2\5)\3\2\2\2\7K\3\2\2\2\ta\3\2\2\2\13}\3\2\2\2\r\17"+
		"\t\2\2\2\16\r\3\2\2\2\17\23\3\2\2\2\20\22\t\3\2\2\21\20\3\2\2\2\22\25"+
		"\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27"+
		"\b\2\2\2\27\4\3\2\2\2\30\32\t\4\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\3\2\2\2\33\35\t\5\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37*\3\2\2\2 \"\7&\2\2!#\t\4\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2"+
		"\2$&\t\6\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\31"+
		"\3\2\2\2) \3\2\2\2*+\3\2\2\2+,\b\3\3\2,\6\3\2\2\2-/\t\4\2\2.-\3\2\2\2"+
		"./\3\2\2\2/\61\3\2\2\2\60\62\t\5\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\60\2\2\668\t\5\2\2\67\66"+
		"\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:L\3\2\2\2;=\7&\2\2<>\t\4\2\2"+
		"=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\t\6\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2"+
		"BC\3\2\2\2CD\3\2\2\2DF\7\60\2\2EG\t\6\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IJ\3\2\2\2JL\b\4\4\2K.\3\2\2\2K;\3\2\2\2L\b\3\2\2\2MS\7$\2"+
		"\2NO\7$\2\2OR\7$\2\2PR\n\7\2\2QN\3\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TV\3\2\2\2US\3\2\2\2Vb\7$\2\2W]\t\b\2\2X\\\n\b\2\2YZ\t\b\2\2"+
		"Z\\\t\b\2\2[X\3\2\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_]\3\2\2\2`b\t\b\2\2aM\3\2\2\2aW\3\2\2\2bc\3\2\2\2cd\b\5\5\2d\n\3\2"+
		"\2\2e~\t\t\2\2fg\7\'\2\2gh\7\'\2\2hl\3\2\2\2ik\n\n\2\2ji\3\2\2\2kn\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2o~\7\f\2\2pq\7\'\2\2qr\7/"+
		"\2\2rx\3\2\2\2sw\n\13\2\2tu\7/\2\2uw\n\f\2\2vs\3\2\2\2vt\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7/\2\2|~\7\'\2\2}e\3\2"+
		"\2\2}f\3\2\2\2}p\3\2\2\2~\177\3\2\2\2\177\u0080\b\6\6\2\u0080\f\3\2\2"+
		"\2\33\2\16\21\23\31\36\"\').\639=BHKQS[]alvx}\7\3\2\2\3\3\3\3\4\4\3\5"+
		"\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}