// Generated from latte/latteLexer.g4 by ANTLR 4.9
package latte;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class latteLexer extends Lexer {
    public static final int
        Surrogate_id_SYMB_0 = 1, Surrogate_id_SYMB_1 = 2, Surrogate_id_SYMB_2 = 3, Surrogate_id_SYMB_3 = 4,
        Surrogate_id_SYMB_4 = 5, Surrogate_id_SYMB_5 = 6, Surrogate_id_SYMB_6 = 7, Surrogate_id_SYMB_7 = 8,
        Surrogate_id_SYMB_8 = 9, Surrogate_id_SYMB_9 = 10, Surrogate_id_SYMB_10 = 11,
        Surrogate_id_SYMB_11 = 12, Surrogate_id_SYMB_12 = 13, Surrogate_id_SYMB_13 = 14,
        Surrogate_id_SYMB_14 = 15, Surrogate_id_SYMB_15 = 16, Surrogate_id_SYMB_16 = 17,
        Surrogate_id_SYMB_17 = 18, Surrogate_id_SYMB_18 = 19, Surrogate_id_SYMB_19 = 20,
        Surrogate_id_SYMB_20 = 21, Surrogate_id_SYMB_21 = 22, Surrogate_id_SYMB_22 = 23,
        Surrogate_id_SYMB_23 = 24, Surrogate_id_SYMB_24 = 25, Surrogate_id_SYMB_25 = 26,
        Surrogate_id_SYMB_26 = 27, Surrogate_id_SYMB_27 = 28, Surrogate_id_SYMB_28 = 29,
        Surrogate_id_SYMB_29 = 30, Surrogate_id_SYMB_30 = 31, Surrogate_id_SYMB_31 = 32,
        Surrogate_id_SYMB_32 = 33, Surrogate_id_SYMB_33 = 34, Surrogate_id_SYMB_34 = 35,
        Surrogate_id_SYMB_35 = 36, Surrogate_id_SYMB_36 = 37, Surrogate_id_SYMB_37 = 38,
        Surrogate_id_SYMB_38 = 39, Surrogate_id_SYMB_39 = 40, Surrogate_id_SYMB_40 = 41,
        Surrogate_id_SYMB_41 = 42, COMMENT_antlr_builtin = 43, MULTICOMMENT_antlr_builtin = 44,
        INTEGER = 45, IDENT = 46, WS = 47, ErrorToken = 48, STRING = 49, STRINGESC = 50;
    public static final int
        STRESCAPE = 1, STRINGMODE = 2;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0178\b\1\b\1" +
            "\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4" +
            "\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t" +
            "\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t" +
            "\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t" +
            "\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4" +
            "*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63" +
            "\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;" +
            "\4<\t<\3\2\3\2\5\2~\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3" +
            "\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20" +
            "\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25" +
            "\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33" +
            "\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3" +
            "\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%" +
            "\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3" +
            ")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3" +
            "-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\7\60\u0117\n\60\f\60\16" +
            "\60\u011a\13\60\3\60\5\60\u011d\n\60\3\60\3\60\5\60\u0121\n\60\3\60\3" +
            "\60\3\60\3\60\7\60\u0127\n\60\f\60\16\60\u012a\13\60\3\60\5\60\u012d\n" +
            "\60\3\60\3\60\5\60\u0131\n\60\5\60\u0133\n\60\3\60\3\60\3\61\3\61\3\61" +
            "\3\61\7\61\u013b\n\61\f\61\16\61\u013e\13\61\3\61\3\61\3\61\3\61\3\61" +
            "\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u014b\n\63\r\63\16\63\u014c\3\64\3" +
            "\64\5\64\u0151\n\64\3\65\3\65\3\65\7\65\u0156\n\65\f\65\16\65\u0159\13" +
            "\65\3\66\6\66\u015c\n\66\r\66\16\66\u015d\3\66\3\66\3\67\3\67\38\38\3" +
            "9\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3\u013c\2=\5\2" +
            "\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16" +
            "%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35" +
            "C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e\63g/i\2k\60m\61o\2q\62s\2u\64" +
            "w\2y\2\5\2\3\4\t\5\2C\\\u00c2\u00d8\u00da\u00e0\5\2c|\u00e1\u00f8\u00fa" +
            "\u0101\3\2\62;\4\2\f\f\17\17\5\2\13\f\16\17\"\"\b\2$$^^hhppttvv\4\2$$" +
            "^^\2\u017d\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2" +
            "\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2" +
            "\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2" +
            "-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2" +
            "\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2" +
            "E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3" +
            "\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2" +
            "\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2" +
            "m\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\4u\3\2\2\2\4w\3\2\2\2\4y\3\2\2\2\5}\3" +
            "\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2" +
            "\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27" +
            "\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u0097" +
            "\3\2\2\2!\u0099\3\2\2\2#\u009c\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2" +
            ")\u00a4\3\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00ab\3\2\2\2\61\u00ae" +
            "\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6\3\2" +
            "\2\2;\u00b8\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2\2\2A\u00c0\3\2\2\2C\u00c3" +
            "\3\2\2\2E\u00c6\3\2\2\2G\u00ce\3\2\2\2I\u00d4\3\2\2\2K\u00d9\3\2\2\2M" +
            "\u00e1\3\2\2\2O\u00e7\3\2\2\2Q\u00eb\3\2\2\2S\u00ee\3\2\2\2U\u00f2\3\2" +
            "\2\2W\u00f6\3\2\2\2Y\u00fd\3\2\2\2[\u0104\3\2\2\2]\u0109\3\2\2\2_\u010e" +
            "\3\2\2\2a\u0132\3\2\2\2c\u0136\3\2\2\2e\u0144\3\2\2\2g\u014a\3\2\2\2i" +
            "\u0150\3\2\2\2k\u0152\3\2\2\2m\u015b\3\2\2\2o\u0161\3\2\2\2q\u0163\3\2" +
            "\2\2s\u0165\3\2\2\2u\u016a\3\2\2\2w\u016f\3\2\2\2y\u0174\3\2\2\2{~\5\7" +
            "\3\2|~\5\t\4\2}{\3\2\2\2}|\3\2\2\2~\6\3\2\2\2\177\u0080\t\2\2\2\u0080" +
            "\b\3\2\2\2\u0081\u0082\t\3\2\2\u0082\n\3\2\2\2\u0083\u0084\t\4\2\2\u0084" +
            "\f\3\2\2\2\u0085\u0086\7*\2\2\u0086\16\3\2\2\2\u0087\u0088\7+\2\2\u0088" +
            "\20\3\2\2\2\u0089\u008a\7.\2\2\u008a\22\3\2\2\2\u008b\u008c\7}\2\2\u008c" +
            "\24\3\2\2\2\u008d\u008e\7\177\2\2\u008e\26\3\2\2\2\u008f\u0090\7=\2\2" +
            "\u0090\30\3\2\2\2\u0091\u0092\7?\2\2\u0092\32\3\2\2\2\u0093\u0094\7]\2" +
            "\2\u0094\34\3\2\2\2\u0095\u0096\7_\2\2\u0096\36\3\2\2\2\u0097\u0098\7" +
            "\60\2\2\u0098 \3\2\2\2\u0099\u009a\7-\2\2\u009a\u009b\7-\2\2\u009b\"\3" +
            "\2\2\2\u009c\u009d\7/\2\2\u009d\u009e\7/\2\2\u009e$\3\2\2\2\u009f\u00a0" +
            "\7<\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2\u00a3\7_\2\2\u00a3(\3" +
            "\2\2\2\u00a4\u00a5\7/\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7,\3\2" +
            "\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa\7(\2\2\u00aa.\3\2\2\2\u00ab\u00ac" +
            "\7~\2\2\u00ac\u00ad\7~\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7-\2\2\u00af\62" +
            "\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3" +
            "\66\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b58\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7" +
            ":\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7?\2\2\u00ba<\3\2\2\2\u00bb\u00bc" +
            "\7@\2\2\u00bc>\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf@\3" +
            "\2\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2\7?\2\2\u00c2B\3\2\2\2\u00c3\u00c4" +
            "\7#\2\2\u00c4\u00c5\7?\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8" +
            "\7q\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb" +
            "\u00cc\7c\2\2\u00cc\u00cd\7p\2\2\u00cdF\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf" +
            "\u00d0\7n\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7u\2\2" +
            "\u00d3H\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2" +
            "\2\u00d7\u00d8\7g\2\2\u00d8J\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7" +
            "z\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df" +
            "\7f\2\2\u00df\u00e0\7u\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3" +
            "\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6" +
            "N\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00ea" +
            "P\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7h\2\2\u00edR\3\2\2\2\u00ee\u00ef" +
            "\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1T\3\2\2\2\u00f2\u00f3" +
            "\7p\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7y\2\2\u00f5V\3\2\2\2\u00f6\u00f7" +
            "\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7w\2\2\u00fa" +
            "\u00fb\7t\2\2\u00fb\u00fc\7p\2\2\u00fcX\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe" +
            "\u00ff\7v\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2" +
            "\u0102\u0103\7i\2\2\u0103Z\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7t\2" +
            "\2\u0106\u0107\7w\2\2\u0107\u0108\7g\2\2\u0108\\\3\2\2\2\u0109\u010a\7" +
            "x\2\2\u010a\u010b\7q\2\2\u010b\u010c\7k\2\2\u010c\u010d\7f\2\2\u010d^" +
            "\3\2\2\2\u010e\u010f\7y\2\2\u010f\u0110\7j\2\2\u0110\u0111\7k\2\2\u0111" +
            "\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113`\3\2\2\2\u0114\u0118\7%\2\2\u0115" +
            "\u0117\n\5\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2" +
            "\2\2\u0118\u0119\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u0118\3\2\2\2\u011b" +
            "\u011d\7\17\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3" +
            "\2\2\2\u011e\u0121\7\f\2\2\u011f\u0121\7\2\2\3\u0120\u011c\3\2\2\2\u0120" +
            "\u011f\3\2\2\2\u0121\u0133\3\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7" +
            "\61\2\2\u0124\u0128\3\2\2\2\u0125\u0127\n\5\2\2\u0126\u0125\3\2\2\2\u0127" +
            "\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0130\3\2" +
            "\2\2\u012a\u0128\3\2\2\2\u012b\u012d\7\17\2\2\u012c\u012b\3\2\2\2\u012c" +
            "\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\7\f\2\2\u012f\u0131\7\2" +
            "\2\3\u0130\u012c\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0133\3\2\2\2\u0132" +
            "\u0114\3\2\2\2\u0132\u0122\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\60" +
            "\2\2\u0135b\3\2\2\2\u0136\u0137\7\61\2\2\u0137\u0138\7,\2\2\u0138\u013c" +
            "\3\2\2\2\u0139\u013b\13\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2" +
            "\u013c\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c" +
            "\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141\7\61\2\2\u0141\u0142\3\2\2\2\u0142" +
            "\u0143\b\61\2\2\u0143d\3\2\2\2\u0144\u0145\7$\2\2\u0145\u0146\3\2\2\2" +
            "\u0146\u0147\b\62\3\2\u0147\u0148\b\62\4\2\u0148f\3\2\2\2\u0149\u014b" +
            "\5\13\5\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2" +
            "\u014c\u014d\3\2\2\2\u014dh\3\2\2\2\u014e\u0151\5\5\2\2\u014f\u0151\7" +
            "a\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151j\3\2\2\2\u0152\u0157" +
            "\5i\64\2\u0153\u0156\5i\64\2\u0154\u0156\5\13\5\2\u0155\u0153\3\2\2\2" +
            "\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158" +
            "\3\2\2\2\u0158l\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\t\6\2\2\u015b" +
            "\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2" +
            "\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\66\2\2\u0160n\3\2\2\2\u0161\u0162" +
            "\t\7\2\2\u0162p\3\2\2\2\u0163\u0164\13\2\2\2\u0164r\3\2\2\2\u0165\u0166" +
            "\5o\67\2\u0166\u0167\3\2\2\2\u0167\u0168\b9\3\2\u0168\u0169\b9\5\2\u0169" +
            "t\3\2\2\2\u016a\u016b\7^\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b:\3\2\u016d" +
            "\u016e\b:\6\2\u016ev\3\2\2\2\u016f\u0170\7$\2\2\u0170\u0171\3\2\2\2\u0171" +
            "\u0172\b;\7\2\u0172\u0173\b;\b\2\u0173x\3\2\2\2\u0174\u0175\n\b\2\2\u0175" +
            "\u0176\3\2\2\2\u0176\u0177\b<\3\2\u0177z\3\2\2\2\23\2\3\4}\u0118\u011c" +
            "\u0120\u0128\u012c\u0130\u0132\u013c\u014c\u0150\u0155\u0157\u015d\t\b" +
            "\2\2\5\2\2\4\4\2\6\2\2\7\3\2\t\63\2\4\2\2";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
        "DEFAULT_MODE", "STRESCAPE", "STRINGMODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public latteLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
            "LETTER", "CAPITAL", "SMALL", "DIGIT", "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1",
            "Surrogate_id_SYMB_2", "Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4",
            "Surrogate_id_SYMB_5", "Surrogate_id_SYMB_6", "Surrogate_id_SYMB_7",
            "Surrogate_id_SYMB_8", "Surrogate_id_SYMB_9", "Surrogate_id_SYMB_10",
            "Surrogate_id_SYMB_11", "Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13",
            "Surrogate_id_SYMB_14", "Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16",
            "Surrogate_id_SYMB_17", "Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19",
            "Surrogate_id_SYMB_20", "Surrogate_id_SYMB_21", "Surrogate_id_SYMB_22",
            "Surrogate_id_SYMB_23", "Surrogate_id_SYMB_24", "Surrogate_id_SYMB_25",
            "Surrogate_id_SYMB_26", "Surrogate_id_SYMB_27", "Surrogate_id_SYMB_28",
            "Surrogate_id_SYMB_29", "Surrogate_id_SYMB_30", "Surrogate_id_SYMB_31",
            "Surrogate_id_SYMB_32", "Surrogate_id_SYMB_33", "Surrogate_id_SYMB_34",
            "Surrogate_id_SYMB_35", "Surrogate_id_SYMB_36", "Surrogate_id_SYMB_37",
            "Surrogate_id_SYMB_38", "Surrogate_id_SYMB_39", "Surrogate_id_SYMB_40",
            "Surrogate_id_SYMB_41", "COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin",
            "STRING", "INTEGER", "IDENTIFIER_FIRST", "IDENT", "WS", "Escapable",
            "ErrorToken", "STRESCAPED", "STRINGESC", "STRINGEND", "STRINGTEXT"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
            null, "'('", "')'", "','", "'{'", "'}'", "';'", "'='", "'['", "']'",
            "'.'", "'++'", "'--'", "':'", "'[]'", "'-'", "'!'", "'&&'", "'||'", "'+'",
            "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'boolean'",
            "'class'", "'else'", "'extends'", "'false'", "'for'", "'if'", "'int'",
            "'new'", "'return'", "'string'", "'true'", "'void'", "'while'", null,
            null, null, null, null, null, "'\"'", "'\\'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
            null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2",
            "Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5",
            "Surrogate_id_SYMB_6", "Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8",
            "Surrogate_id_SYMB_9", "Surrogate_id_SYMB_10", "Surrogate_id_SYMB_11",
            "Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13", "Surrogate_id_SYMB_14",
            "Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16", "Surrogate_id_SYMB_17",
            "Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19", "Surrogate_id_SYMB_20",
            "Surrogate_id_SYMB_21", "Surrogate_id_SYMB_22", "Surrogate_id_SYMB_23",
            "Surrogate_id_SYMB_24", "Surrogate_id_SYMB_25", "Surrogate_id_SYMB_26",
            "Surrogate_id_SYMB_27", "Surrogate_id_SYMB_28", "Surrogate_id_SYMB_29",
            "Surrogate_id_SYMB_30", "Surrogate_id_SYMB_31", "Surrogate_id_SYMB_32",
            "Surrogate_id_SYMB_33", "Surrogate_id_SYMB_34", "Surrogate_id_SYMB_35",
            "Surrogate_id_SYMB_36", "Surrogate_id_SYMB_37", "Surrogate_id_SYMB_38",
            "Surrogate_id_SYMB_39", "Surrogate_id_SYMB_40", "Surrogate_id_SYMB_41",
            "COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin", "INTEGER", "IDENT",
            "WS", "ErrorToken", "STRING", "STRINGESC"
        };
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
    public String getGrammarFileName() {
        return "latteLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}