// Generated from Gramatica.g4 by ANTLR 4.9.1
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
		IDENTIFICADOR=1, CONSTENTERO=2, CONSTREAL=3, CONSTLIT=4, WS=5, ERRORCOMENT=6, 
		ERRORLIT=7, ERRORNUM=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", "CONSTLIT", "WS", "ERRORCOMENT", 
			"ERRORLIT", "ERRORNUM"
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
			null, "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", "CONSTLIT", "WS", 
			"ERRORCOMENT", "ERRORLIT", "ERRORNUM"
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
		case 5:
			ERRORCOMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			ERRORLIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			ERRORNUM_action((RuleContext)_localctx, actionIndex);
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
	private void ERRORCOMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    System.err.println("Comentario multilinea sin cierre");

			break;
		}
	}
	private void ERRORLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    System.err.println("Cadena sin cerrar");

			break;
		}
	}
	private void ERRORNUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    System.err.println("No es un número");

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\25"+
		"\n\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\5\3 \n\3\3\3\6\3#\n\3"+
		"\r\3\16\3$\3\3\3\3\5\3)\n\3\3\3\6\3,\n\3\r\3\16\3-\5\3\60\n\3\3\3\3\3"+
		"\3\4\5\4\65\n\4\3\4\6\48\n\4\r\4\16\49\3\4\3\4\6\4>\n\4\r\4\16\4?\3\4"+
		"\3\4\5\4D\n\4\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\6\4M\n\4\r\4\16\4N\3\4\5"+
		"\4R\n\4\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5b\n\5\f\5\16\5e\13\5\3\5\5\5h\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6q\n"+
		"\6\f\6\16\6t\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080"+
		"\13\6\3\6\3\6\5\6\u0084\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008e"+
		"\n\7\f\7\16\7\u0091\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b"+
		"\16\b\u009d\13\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b"+
		"\5\b\u00a9\n\b\3\b\3\b\3\t\5\t\u00ae\n\t\3\t\6\t\u00b1\n\t\r\t\16\t\u00b2"+
		"\3\t\3\t\5\t\u00b7\n\t\3\t\6\t\u00ba\n\t\r\t\16\t\u00bb\3\t\3\t\3\t\5"+
		"\t\u00c1\n\t\3\t\6\t\u00c4\n\t\r\t\16\t\u00c5\3\t\3\t\5\t\u00ca\n\t\3"+
		"\t\6\t\u00cd\n\t\r\t\16\t\u00ce\5\t\u00d1\n\t\3\t\3\t\2\2\n\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\3\2\r\5\2C\\aac|\6\2\62;C\\aac|\4\2--//\3\2"+
		"\62;\4\2\62;CH\3\2$$\3\2))\5\2\13\f\17\17\"\"\3\2\f\f\3\2//\3\2\'\'\2"+
		"\u00fc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5/\3\2\2\2\7Q\3\2\2"+
		"\2\tg\3\2\2\2\13\u0083\3\2\2\2\r\u0087\3\2\2\2\17\u00a8\3\2\2\2\21\u00d0"+
		"\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\31\3\2\2\2\26\30\t\3\2\2\27\26"+
		"\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31"+
		"\3\2\2\2\34\35\b\2\2\2\35\4\3\2\2\2\36 \t\4\2\2\37\36\3\2\2\2\37 \3\2"+
		"\2\2 \"\3\2\2\2!#\t\5\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\60"+
		"\3\2\2\2&(\7&\2\2\')\t\4\2\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\t\6\2\2"+
		"+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\37\3\2\2\2/&\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\b\3\3\2\62\6\3\2\2\2\63\65\t\4\2\2\64\63\3\2"+
		"\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\t\5\2\2\67\66\3\2\2\289\3\2\2\29"+
		"\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\60\2\2<>\t\5\2\2=<\3\2\2\2>?\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@R\3\2\2\2AC\7&\2\2BD\t\4\2\2CB\3\2\2\2CD\3\2\2"+
		"\2DF\3\2\2\2EG\t\6\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2"+
		"\2JL\7\60\2\2KM\t\6\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2"+
		"\2\2PR\b\4\4\2Q\64\3\2\2\2QA\3\2\2\2R\b\3\2\2\2SY\7$\2\2TU\7$\2\2UX\7"+
		"$\2\2VX\n\7\2\2WT\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3"+
		"\2\2\2[Y\3\2\2\2\\h\7$\2\2]c\t\b\2\2^b\n\b\2\2_`\t\b\2\2`b\t\b\2\2a^\3"+
		"\2\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fh\t"+
		"\b\2\2gS\3\2\2\2g]\3\2\2\2hi\3\2\2\2ij\b\5\5\2j\n\3\2\2\2k\u0084\t\t\2"+
		"\2lm\7\'\2\2mn\7\'\2\2nr\3\2\2\2oq\n\n\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2u\u0084\7\f\2\2vw\7\'\2\2wx\7/\2\2x~\3"+
		"\2\2\2y}\n\13\2\2z{\7/\2\2{}\n\f\2\2|y\3\2\2\2|z\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\7/\2\2\u0082\u0084\7\'\2\2\u0083k\3\2\2\2\u0083l\3\2\2\2\u0083v\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0086\b\6\6\2\u0086\f\3\2\2\2\u0087\u0088"+
		"\7\'\2\2\u0088\u0089\7/\2\2\u0089\u008f\3\2\2\2\u008a\u008e\n\13\2\2\u008b"+
		"\u008c\7/\2\2\u008c\u008e\n\f\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\2\2\3\u0093\u0094\b\7"+
		"\7\2\u0094\16\3\2\2\2\u0095\u009b\7$\2\2\u0096\u0097\7$\2\2\u0097\u009a"+
		"\7$\2\2\u0098\u009a\n\7\2\2\u0099\u0096\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a9\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u00a4\t\b\2\2\u009f\u00a3\n\b\2\2\u00a0"+
		"\u00a1\t\b\2\2\u00a1\u00a3\t\b\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\2\2\3\u00a8\u0095\3\2"+
		"\2\2\u00a8\u009e\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\b\b\2\u00ab"+
		"\20\3\2\2\2\u00ac\u00ae\t\4\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\t\5\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00d1\3\2\2\2\u00b4"+
		"\u00b6\7&\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00d1\7\60\2\2\u00be\u00c0\7\60\2\2\u00bf\u00c1\t\4\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\t\5"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00d1\3\2\2\2\u00c7\u00c9\7&\2\2\u00c8\u00ca\t\4"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\t\6\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ad\3\2\2\2\u00d0"+
		"\u00b4\3\2\2\2\u00d0\u00be\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\b\t\t\2\u00d3\22\3\2\2\2+\2\24\27\31\37$(-/\649?CHNQ"+
		"WYacgr|~\u0083\u008d\u008f\u0099\u009b\u00a2\u00a4\u00a8\u00ad\u00b2\u00b6"+
		"\u00bb\u00c0\u00c5\u00c9\u00ce\u00d0\n\3\2\2\3\3\3\3\4\4\3\5\5\b\2\2\3"+
		"\7\6\3\b\7\3\t\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}