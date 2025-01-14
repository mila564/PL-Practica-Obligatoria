// Generated from Gramatica.g4 by ANTLR 4.9.1

    import especificacion.*;
    import java.util.*;
    import java.io.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, IDENTIFICADOR=40, CONSTENTERO=41, CONSTREAL=42, CONSTLIT=43, 
		WS=44, ERRORCOMENT=45, ERRORLIT=46, ERRORNUM=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "IDENTIFICADOR", 
			"CONSTENTERO", "CONSTREAL", "CONSTLIT", "WS", "ERRORCOMENT", "ERRORLIT", 
			"ERRORNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "';'", "'return'", "'bifurcacion'", 
			"'sino'", "'bifurcacio'", "'buclepara'", "'buclemientras'", "'bucle'", 
			"'hasta'", "'entonces'", "'='", "'+='", "'-='", "'*='", "'/='", "'+'", 
			"'-'", "'*'", "'/'", "'no'", "'cierto'", "'falso'", "'y'", "'o'", "'<>'", 
			"'<'", "'>'", "'>='", "'<='"
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
		case 44:
			ERRORCOMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			ERRORLIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			ERRORNUM_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERRORCOMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    System.err.println("Error l"+ "\u00e9" + "xico: Comentario multil" + "\u00ed" + "nea sin cierre");

			break;
		}
	}
	private void ERRORLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    System.err.println("Error l"+ "\u00e9" + "xico: Cadena sin cerrar");

			break;
		}
	}
	private void ERRORNUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    System.err.println("Error l"+ "\u00e9" + "xico: " + getText() + " no es un n" + "\u00fa" + "mero");

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\5)\u0128"+
		"\n)\3)\7)\u012b\n)\f)\16)\u012e\13)\3*\5*\u0131\n*\3*\6*\u0134\n*\r*\16"+
		"*\u0135\3*\3*\5*\u013a\n*\3*\6*\u013d\n*\r*\16*\u013e\5*\u0141\n*\3+\5"+
		"+\u0144\n+\3+\6+\u0147\n+\r+\16+\u0148\3+\3+\6+\u014d\n+\r+\16+\u014e"+
		"\3+\3+\5+\u0153\n+\3+\6+\u0156\n+\r+\16+\u0157\3+\3+\6+\u015c\n+\r+\16"+
		"+\u015d\5+\u0160\n+\3,\3,\3,\3,\7,\u0166\n,\f,\16,\u0169\13,\3,\3,\3,"+
		"\3,\3,\7,\u0170\n,\f,\16,\u0173\13,\3,\5,\u0176\n,\3-\3-\3-\3-\3-\7-\u017d"+
		"\n-\f-\16-\u0180\13-\3-\3-\3-\3-\3-\3-\3-\7-\u0189\n-\f-\16-\u018c\13"+
		"-\3-\3-\5-\u0190\n-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u019a\n.\f.\16.\u019d\13"+
		".\3.\3.\3.\3/\3/\3/\3/\7/\u01a6\n/\f/\16/\u01a9\13/\3/\3/\3/\3/\7/\u01af"+
		"\n/\f/\16/\u01b2\13/\3/\5/\u01b5\n/\3/\3/\3\60\3\60\5\60\u01bb\n\60\3"+
		"\60\6\60\u01be\n\60\r\60\16\60\u01bf\3\60\3\60\5\60\u01c4\n\60\3\60\6"+
		"\60\u01c7\n\60\r\60\16\60\u01c8\5\60\u01cb\n\60\3\60\3\60\2\2\61\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\r\5\2C\\aac|\6\2\62;C\\aac"+
		"|\4\2--//\3\2\62;\4\2\62;CH\3\2$$\3\2))\5\2\13\f\17\17\"\"\3\2\f\f\3\2"+
		"//\3\2\'\'\2\u01f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\3a\3\2\2\2\5i\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r"+
		"}\3\2\2\2\17\u0084\3\2\2\2\21\u0089\3\2\2\2\23\u0092\3\2\2\2\25\u0099"+
		"\3\2\2\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a6\3\2\2\2\35\u00b2\3"+
		"\2\2\2\37\u00b7\3\2\2\2!\u00c2\3\2\2\2#\u00cc\3\2\2\2%\u00da\3\2\2\2\'"+
		"\u00e0\3\2\2\2)\u00e6\3\2\2\2+\u00ef\3\2\2\2-\u00f1\3\2\2\2/\u00f4\3\2"+
		"\2\2\61\u00f7\3\2\2\2\63\u00fa\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2"+
		"\29\u0101\3\2\2\2;\u0103\3\2\2\2=\u0105\3\2\2\2?\u0108\3\2\2\2A\u010f"+
		"\3\2\2\2C\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011c\3\2\2\2K"+
		"\u011e\3\2\2\2M\u0120\3\2\2\2O\u0123\3\2\2\2Q\u0127\3\2\2\2S\u0140\3\2"+
		"\2\2U\u015f\3\2\2\2W\u0175\3\2\2\2Y\u018f\3\2\2\2[\u0193\3\2\2\2]\u01b4"+
		"\3\2\2\2_\u01ca\3\2\2\2ab\7h\2\2bc\7w\2\2cd\7p\2\2de\7e\2\2ef\7k\2\2f"+
		"g\7q\2\2gh\7p\2\2h\4\3\2\2\2ij\7r\2\2jk\7t\2\2kl\7q\2\2lm\7e\2\2mn\7g"+
		"\2\2no\7f\2\2op\7k\2\2pq\7o\2\2qr\7k\2\2rs\7g\2\2st\7p\2\2tu\7v\2\2uv"+
		"\7q\2\2v\6\3\2\2\2wx\7*\2\2x\b\3\2\2\2yz\7+\2\2z\n\3\2\2\2{|\7.\2\2|\f"+
		"\3\2\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7q\2\2\u0083\16\3\2\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088\20\3\2\2\2\u0089"+
		"\u008a\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2"+
		"\u008d\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7t\2\2\u0091\22\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095"+
		"\7k\2\2\u0095\u0096\7e\2\2\u0096\u0097\7k\2\2\u0097\u0098\7q\2\2\u0098"+
		"\24\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\26\3\2\2\2\u009d\u009e\7=\2\2\u009e\30\3\2\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7t\2\2"+
		"\u00a4\u00a5\7p\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\7"+
		"k\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7q\2\2\u00b6\36\3\2\2\2\u00b7"+
		"\u00b8\7d\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7w\2\2"+
		"\u00bb\u00bc\7t\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7c\2\2\u00be\u00bf"+
		"\7e\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1 \3\2\2\2\u00c2\u00c3"+
		"\7d\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca\u00cb\7c\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7w"+
		"\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7o\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7u\2\2"+
		"\u00d9$\3\2\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7e\2"+
		"\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df&\3\2\2\2\u00e0\u00e1\7"+
		"j\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5(\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7e\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7u\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0"+
		",\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7?\2\2\u00f3.\3\2\2\2\u00f4\u00f5"+
		"\7/\2\2\u00f5\u00f6\7?\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9\62\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"\64\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7/\2\2\u0100"+
		"8\3\2\2\2\u0101\u0102\7,\2\2\u0102:\3\2\2\2\u0103\u0104\7\61\2\2\u0104"+
		"<\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7q\2\2\u0107>\3\2\2\2\u0108\u0109"+
		"\7e\2\2\u0109\u010a\7k\2\2\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e@\3\2\2\2\u010f\u0110\7h\2\2\u0110"+
		"\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0114\7q\2\2"+
		"\u0114B\3\2\2\2\u0115\u0116\7{\2\2\u0116D\3\2\2\2\u0117\u0118\7q\2\2\u0118"+
		"F\3\2\2\2\u0119\u011a\7>\2\2\u011a\u011b\7@\2\2\u011bH\3\2\2\2\u011c\u011d"+
		"\7>\2\2\u011dJ\3\2\2\2\u011e\u011f\7@\2\2\u011fL\3\2\2\2\u0120\u0121\7"+
		"@\2\2\u0121\u0122\7?\2\2\u0122N\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0125"+
		"\7?\2\2\u0125P\3\2\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u012c"+
		"\3\2\2\2\u0129\u012b\t\3\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dR\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133"+
		"\3\2\2\2\u0132\u0134\t\5\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0141\3\2\2\2\u0137\u0139\7&"+
		"\2\2\u0138\u013a\t\4\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u013d\t\6\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u0130\3\2\2\2\u0140\u0137\3\2\2\2\u0141T\3\2\2\2\u0142\u0144\t\4\2\2"+
		"\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0147"+
		"\t\5\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\60\2\2\u014b\u014d\t"+
		"\5\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0160\3\2\2\2\u0150\u0152\7&\2\2\u0151\u0153\t\4"+
		"\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0156\t\6\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\7\60\2\2\u015a"+
		"\u015c\t\6\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0143\3\2\2\2\u015f"+
		"\u0150\3\2\2\2\u0160V\3\2\2\2\u0161\u0167\7$\2\2\u0162\u0163\7$\2\2\u0163"+
		"\u0166\7$\2\2\u0164\u0166\n\7\2\2\u0165\u0162\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0176\7$\2\2\u016b\u0171\t\b"+
		"\2\2\u016c\u0170\n\b\2\2\u016d\u016e\t\b\2\2\u016e\u0170\t\b\2\2\u016f"+
		"\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0176\t\b\2\2\u0175\u0161\3\2\2\2\u0175\u016b\3\2\2\2\u0176X\3\2\2\2"+
		"\u0177\u0190\t\t\2\2\u0178\u0179\7\'\2\2\u0179\u017a\7\'\2\2\u017a\u017e"+
		"\3\2\2\2\u017b\u017d\n\n\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0190\7\f\2\2\u0182\u0183\7\'\2\2\u0183\u0184\7/\2\2\u0184"+
		"\u018a\3\2\2\2\u0185\u0189\n\13\2\2\u0186\u0187\7/\2\2\u0187\u0189\n\f"+
		"\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\u018e\7/\2\2\u018e\u0190\7\'\2\2\u018f\u0177\3\2\2\2\u018f"+
		"\u0178\3\2\2\2\u018f\u0182\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b-"+
		"\2\2\u0192Z\3\2\2\2\u0193\u0194\7\'\2\2\u0194\u0195\7/\2\2\u0195\u019b"+
		"\3\2\2\2\u0196\u019a\n\13\2\2\u0197\u0198\7/\2\2\u0198\u019a\n\f\2\2\u0199"+
		"\u0196\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u019f\7\2\2\3\u019f\u01a0\b.\3\2\u01a0\\\3\2\2\2\u01a1\u01a7\7$\2\2\u01a2"+
		"\u01a3\7$\2\2\u01a3\u01a6\7$\2\2\u01a4\u01a6\n\7\2\2\u01a5\u01a2\3\2\2"+
		"\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01b5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01b0\t\b\2\2\u01ab"+
		"\u01af\n\b\2\2\u01ac\u01ad\t\b\2\2\u01ad\u01af\t\b\2\2\u01ae\u01ab\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7\2"+
		"\2\3\u01b4\u01a1\3\2\2\2\u01b4\u01aa\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\b/\4\2\u01b7^\3\2\2\2\u01b8\u01ba\7\60\2\2\u01b9\u01bb\t\4\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be"+
		"\t\5\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01cb\3\2\2\2\u01c1\u01c3\7&\2\2\u01c2\u01c4\t\4"+
		"\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01c7\t\6\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01b8\3\2\2\2\u01ca"+
		"\u01c1\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\b\60\5\2\u01cd`\3\2\2\2"+
		"\'\2\u0127\u012a\u012c\u0130\u0135\u0139\u013e\u0140\u0143\u0148\u014e"+
		"\u0152\u0157\u015d\u015f\u0165\u0167\u016f\u0171\u0175\u017e\u0188\u018a"+
		"\u018f\u0199\u019b\u01a5\u01a7\u01ae\u01b0\u01b4\u01ba\u01bf\u01c3\u01c8"+
		"\u01ca\6\b\2\2\3.\2\3/\3\3\60\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}