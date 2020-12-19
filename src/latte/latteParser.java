// Generated from latte/latteParser.g4 by ANTLR 4.9
package latte;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class latteParser extends Parser {
    public static final int
        RULE_start_Prog = 0, RULE_prog = 1, RULE_identP = 2, RULE_funct = 3, RULE_topDef = 4,
        RULE_listTopDef = 5, RULE_arg = 6, RULE_listArg = 7, RULE_clsBlock = 8,
        RULE_listClsDef = 9, RULE_clsDef = 10, RULE_clsMethod = 11, RULE_clsAttr = 12,
        RULE_block = 13, RULE_listStmt = 14, RULE_stmt = 15, RULE_item = 16, RULE_listItem = 17,
        RULE_primitiveType = 18, RULE_classType = 19, RULE_type = 20, RULE_listType = 21,
        RULE_expr6 = 22, RULE_expr5 = 23, RULE_expr4 = 24, RULE_expr3 = 25, RULE_expr2 = 26,
        RULE_expr1 = 27, RULE_expr = 28, RULE_listExpr = 29, RULE_addOp = 30,
        RULE_mulOp = 31, RULE_relOp = 32;
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
    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01fc\4\2\t\2" +
            "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
            "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
            "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
            "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
            "\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3" +
            "\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
            "\3\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\t" +
            "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13" +
            "\3\13\3\13\3\13\3\13\3\13\7\13\u008c\n\13\f\13\16\13\u008f\13\13\3\f\3" +
            "\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16" +
            "\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ad" +
            "\n\20\f\20\16\20\u00b0\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
            "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
            "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
            "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
            "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
            "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3" +
            "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0109\n\21\3\22\3\22" +
            "\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0113\n\22\3\23\3\23\3\23\3\23\3\23" +
            "\3\23\3\23\3\23\5\23\u011d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24" +
            "\5\24\u0127\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26" +
            "\u0133\n\26\3\26\3\26\3\26\7\26\u0138\n\26\f\26\16\26\u013b\13\26\3\27" +
            "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0146\n\27\3\30\3\30\3\30" +
            "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
            "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
            "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
            "\3\30\5\30\u0176\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
            "\3\30\3\30\3\30\7\30\u0185\n\30\f\30\16\30\u0188\13\30\3\31\3\31\3\31" +
            "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0195\n\31\3\32\3\32\3\32" +
            "\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01a0\n\32\f\32\16\32\u01a3\13\32" +
            "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01ae\n\33\f\33\16" +
            "\33\u01b1\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01bc" +
            "\n\34\f\34\16\34\u01bf\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5" +
            "\35\u01c9\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d3\n\36" +
            "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01de\n\37\3 \3 \3" +
            " \3 \5 \u01e4\n \3!\3!\3!\3!\3!\3!\5!\u01ec\n!\3\"\3\"\3\"\3\"\3\"\3\"" +
            "\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01fa\n\"\3\"\2\t\24\36*.\62\64\66#\2\4\6" +
            "\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\2\2\u0216" +
            "\2D\3\2\2\2\4H\3\2\2\2\6K\3\2\2\2\bN\3\2\2\2\ne\3\2\2\2\fn\3\2\2\2\16" +
            "p\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u0084\3\2\2\2\26\u0096\3\2\2\2" +
            "\30\u0098\3\2\2\2\32\u009b\3\2\2\2\34\u00a0\3\2\2\2\36\u00a5\3\2\2\2 " +
            "\u0108\3\2\2\2\"\u0112\3\2\2\2$\u011c\3\2\2\2&\u0126\3\2\2\2(\u0128\3" +
            "\2\2\2*\u0132\3\2\2\2,\u0145\3\2\2\2.\u0175\3\2\2\2\60\u0194\3\2\2\2\62" +
            "\u0196\3\2\2\2\64\u01a4\3\2\2\2\66\u01b2\3\2\2\28\u01c8\3\2\2\2:\u01d2" +
            "\3\2\2\2<\u01dd\3\2\2\2>\u01e3\3\2\2\2@\u01eb\3\2\2\2B\u01f9\3\2\2\2D" +
            "E\5\4\3\2EF\7\2\2\3FG\b\2\1\2G\3\3\2\2\2HI\5\f\7\2IJ\b\3\1\2J\5\3\2\2" +
            "\2KL\7\60\2\2LM\b\4\1\2M\7\3\2\2\2NO\5*\26\2OP\5\6\4\2PQ\7\3\2\2QR\5\20" +
            "\t\2RS\7\4\2\2ST\5\34\17\2TU\b\5\1\2U\t\3\2\2\2VW\5\b\5\2WX\b\6\1\2Xf" +
            "\3\2\2\2YZ\7 \2\2Z[\5\6\4\2[\\\5\22\n\2\\]\b\6\1\2]f\3\2\2\2^_\7 \2\2" +
            "_`\5\6\4\2`a\7\"\2\2ab\5\6\4\2bc\5\22\n\2cd\b\6\1\2df\3\2\2\2eV\3\2\2" +
            "\2eY\3\2\2\2e^\3\2\2\2f\13\3\2\2\2gh\5\n\6\2hi\b\7\1\2io\3\2\2\2jk\5\n" +
            "\6\2kl\5\f\7\2lm\b\7\1\2mo\3\2\2\2ng\3\2\2\2nj\3\2\2\2o\r\3\2\2\2pq\5" +
            "*\26\2qr\5\6\4\2rs\b\b\1\2s\17\3\2\2\2t~\b\t\1\2uv\5\16\b\2vw\b\t\1\2" +
            "w~\3\2\2\2xy\5\16\b\2yz\7\5\2\2z{\5\20\t\2{|\b\t\1\2|~\3\2\2\2}t\3\2\2" +
            "\2}u\3\2\2\2}x\3\2\2\2~\21\3\2\2\2\177\u0080\7\6\2\2\u0080\u0081\5\24" +
            "\13\2\u0081\u0082\7\7\2\2\u0082\u0083\b\n\1\2\u0083\23\3\2\2\2\u0084\u0085" +
            "\b\13\1\2\u0085\u0086\b\13\1\2\u0086\u008d\3\2\2\2\u0087\u0088\f\3\2\2" +
            "\u0088\u0089\5\26\f\2\u0089\u008a\b\13\1\2\u008a\u008c\3\2\2\2\u008b\u0087" +
            "\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e" +
            "\25\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092\b\f" +
            "\1\2\u0092\u0097\3\2\2\2\u0093\u0094\5\30\r\2\u0094\u0095\b\f\1\2\u0095" +
            "\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097\27\3\2\2" +
            "\2\u0098\u0099\5\b\5\2\u0099\u009a\b\r\1\2\u009a\31\3\2\2\2\u009b\u009c" +
            "\5*\26\2\u009c\u009d\5\6\4\2\u009d\u009e\7\b\2\2\u009e\u009f\b\16\1\2" +
            "\u009f\33\3\2\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3" +
            "\7\7\2\2\u00a3\u00a4\b\17\1\2\u00a4\35\3\2\2\2\u00a5\u00a6\b\20\1\2\u00a6" +
            "\u00a7\b\20\1\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa\5" +
            " \21\2\u00aa\u00ab\b\20\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad" +
            "\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\37\3\2\2" +
            "\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\b\2\2\u00b2\u0109\b\21\1\2\u00b3" +
            "\u00b4\5\34\17\2\u00b4\u00b5\b\21\1\2\u00b5\u0109\3\2\2\2\u00b6\u00b7" +
            "\5*\26\2\u00b7\u00b8\5$\23\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\b\21\1\2" +
            "\u00ba\u0109\3\2\2\2\u00bb\u00bc\5\6\4\2\u00bc\u00bd\7\t\2\2\u00bd\u00be" +
            "\5:\36\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\b\21\1\2\u00c0\u0109\3\2\2\2" +
            "\u00c1\u00c2\5\6\4\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4\5:\36\2\u00c4\u00c5" +
            "\7\13\2\2\u00c5\u00c6\7\t\2\2\u00c6\u00c7\5:\36\2\u00c7\u00c8\7\b\2\2" +
            "\u00c8\u00c9\b\21\1\2\u00c9\u0109\3\2\2\2\u00ca\u00cb\5.\30\2\u00cb\u00cc" +
            "\7\f\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7\t\2\2\u00ce\u00cf\5:\36\2\u00cf" +
            "\u00d0\7\b\2\2\u00d0\u00d1\b\21\1\2\u00d1\u0109\3\2\2\2\u00d2\u00d3\5" +
            "\6\4\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\b\21\1\2\u00d6" +
            "\u0109\3\2\2\2\u00d7\u00d8\5\6\4\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\7" +
            "\b\2\2\u00da\u00db\b\21\1\2\u00db\u0109\3\2\2\2\u00dc\u00dd\7(\2\2\u00dd" +
            "\u00de\5:\36\2\u00de\u00df\7\b\2\2\u00df\u00e0\b\21\1\2\u00e0\u0109\3" +
            "\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7\b\2\2\u00e3\u0109\b\21\1\2\u00e4" +
            "\u00e5\7%\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\5:\36\2\u00e7\u00e8\7\4" +
            "\2\2\u00e8\u00e9\5 \21\2\u00e9\u00ea\b\21\1\2\u00ea\u0109\3\2\2\2\u00eb" +
            "\u00ec\7%\2\2\u00ec\u00ed\7\3\2\2\u00ed\u00ee\5:\36\2\u00ee\u00ef\7\4" +
            "\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\5 \21\2\u00f2" +
            "\u00f3\b\21\1\2\u00f3\u0109\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f6\7\3" +
            "\2\2\u00f6\u00f7\5:\36\2\u00f7\u00f8\7\4\2\2\u00f8\u00f9\5 \21\2\u00f9" +
            "\u00fa\b\21\1\2\u00fa\u0109\3\2\2\2\u00fb\u00fc\7$\2\2\u00fc\u00fd\7\3" +
            "\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\7\17\2\2\u00ff\u0100\5:\36\2\u0100" +
            "\u0101\7\4\2\2\u0101\u0102\5 \21\2\u0102\u0103\b\21\1\2\u0103\u0109\3" +
            "\2\2\2\u0104\u0105\5:\36\2\u0105\u0106\7\b\2\2\u0106\u0107\b\21\1\2\u0107" +
            "\u0109\3\2\2\2\u0108\u00b1\3\2\2\2\u0108\u00b3\3\2\2\2\u0108\u00b6\3\2" +
            "\2\2\u0108\u00bb\3\2\2\2\u0108\u00c1\3\2\2\2\u0108\u00ca\3\2\2\2\u0108" +
            "\u00d2\3\2\2\2\u0108\u00d7\3\2\2\2\u0108\u00dc\3\2\2\2\u0108\u00e1\3\2" +
            "\2\2\u0108\u00e4\3\2\2\2\u0108\u00eb\3\2\2\2\u0108\u00f4\3\2\2\2\u0108" +
            "\u00fb\3\2\2\2\u0108\u0104\3\2\2\2\u0109!\3\2\2\2\u010a\u010b\5\6\4\2" +
            "\u010b\u010c\b\22\1\2\u010c\u0113\3\2\2\2\u010d\u010e\5\6\4\2\u010e\u010f" +
            "\7\t\2\2\u010f\u0110\5:\36\2\u0110\u0111\b\22\1\2\u0111\u0113\3\2\2\2" +
            "\u0112\u010a\3\2\2\2\u0112\u010d\3\2\2\2\u0113#\3\2\2\2\u0114\u0115\5" +
            "\"\22\2\u0115\u0116\b\23\1\2\u0116\u011d\3\2\2\2\u0117\u0118\5\"\22\2" +
            "\u0118\u0119\7\5\2\2\u0119\u011a\5$\23\2\u011a\u011b\b\23\1\2\u011b\u011d" +
            "\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0117\3\2\2\2\u011d%\3\2\2\2\u011e" +
            "\u011f\7&\2\2\u011f\u0127\b\24\1\2\u0120\u0121\7)\2\2\u0121\u0127\b\24" +
            "\1\2\u0122\u0123\7\37\2\2\u0123\u0127\b\24\1\2\u0124\u0125\7+\2\2\u0125" +
            "\u0127\b\24\1\2\u0126\u011e\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0122\3" +
            "\2\2\2\u0126\u0124\3\2\2\2\u0127\'\3\2\2\2\u0128\u0129\5\6\4\2\u0129\u012a" +
            "\b\25\1\2\u012a)\3\2\2\2\u012b\u012c\b\26\1\2\u012c\u012d\5&\24\2\u012d" +
            "\u012e\b\26\1\2\u012e\u0133\3\2\2\2\u012f\u0130\5(\25\2\u0130\u0131\b" +
            "\26\1\2\u0131\u0133\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u012f\3\2\2\2\u0133" +
            "\u0139\3\2\2\2\u0134\u0135\f\5\2\2\u0135\u0136\7\20\2\2\u0136\u0138\b" +
            "\26\1\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139" +
            "\u013a\3\2\2\2\u013a+\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0146\b\27\1\2" +
            "\u013d\u013e\5*\26\2\u013e\u013f\b\27\1\2\u013f\u0146\3\2\2\2\u0140\u0141" +
            "\5*\26\2\u0141\u0142\7\5\2\2\u0142\u0143\5,\27\2\u0143\u0144\b\27\1\2" +
            "\u0144\u0146\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013d\3\2\2\2\u0145\u0140" +
            "\3\2\2\2\u0146-\3\2\2\2\u0147\u0148\b\30\1\2\u0148\u0149\7\'\2\2\u0149" +
            "\u014a\5*\26\2\u014a\u014b\7\n\2\2\u014b\u014c\5:\36\2\u014c\u014d\7\13" +
            "\2\2\u014d\u014e\b\30\1\2\u014e\u0176\3\2\2\2\u014f\u0150\7\'\2\2\u0150" +
            "\u0151\5\6\4\2\u0151\u0152\b\30\1\2\u0152\u0176\3\2\2\2\u0153\u0154\5" +
            "\6\4\2\u0154\u0155\b\30\1\2\u0155\u0176\3\2\2\2\u0156\u0157\5\6\4\2\u0157" +
            "\u0158\7\n\2\2\u0158\u0159\5:\36\2\u0159\u015a\7\13\2\2\u015a\u015b\b" +
            "\30\1\2\u015b\u0176\3\2\2\2\u015c\u015d\7/\2\2\u015d\u0176\b\30\1\2\u015e" +
            "\u015f\7*\2\2\u015f\u0176\b\30\1\2\u0160\u0161\7#\2\2\u0161\u0176\b\30" +
            "\1\2\u0162\u0163\5\6\4\2\u0163\u0164\7\3\2\2\u0164\u0165\5<\37\2\u0165" +
            "\u0166\7\4\2\2\u0166\u0167\b\30\1\2\u0167\u0176\3\2\2\2\u0168\u0169\7" +
            "\3\2\2\u0169\u016a\5*\26\2\u016a\u016b\7\4\2\2\u016b\u016c\5.\30\5\u016c" +
            "\u016d\b\30\1\2\u016d\u0176\3\2\2\2\u016e\u016f\7\63\2\2\u016f\u0176\b" +
            "\30\1\2\u0170\u0171\7\3\2\2\u0171\u0172\5:\36\2\u0172\u0173\7\4\2\2\u0173" +
            "\u0174\b\30\1\2\u0174\u0176\3\2\2\2\u0175\u0147\3\2\2\2\u0175\u014f\3" +
            "\2\2\2\u0175\u0153\3\2\2\2\u0175\u0156\3\2\2\2\u0175\u015c\3\2\2\2\u0175" +
            "\u015e\3\2\2\2\u0175\u0160\3\2\2\2\u0175\u0162\3\2\2\2\u0175\u0168\3\2" +
            "\2\2\u0175\u016e\3\2\2\2\u0175\u0170\3\2\2\2\u0176\u0186\3\2\2\2\u0177" +
            "\u0178\f\b\2\2\u0178\u0179\7\f\2\2\u0179\u017a\5\6\4\2\u017a\u017b\b\30" +
            "\1\2\u017b\u0185\3\2\2\2\u017c\u017d\f\7\2\2\u017d\u017e\7\f\2\2\u017e" +
            "\u017f\5\6\4\2\u017f\u0180\7\3\2\2\u0180\u0181\5<\37\2\u0181\u0182\7\4" +
            "\2\2\u0182\u0183\b\30\1\2\u0183\u0185\3\2\2\2\u0184\u0177\3\2\2\2\u0184" +
            "\u017c\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2" +
            "\2\2\u0187/\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\21\2\2\u018a\u018b" +
            "\5.\30\2\u018b\u018c\b\31\1\2\u018c\u0195\3\2\2\2\u018d\u018e\7\22\2\2" +
            "\u018e\u018f\5.\30\2\u018f\u0190\b\31\1\2\u0190\u0195\3\2\2\2\u0191\u0192" +
            "\5.\30\2\u0192\u0193\b\31\1\2\u0193\u0195\3\2\2\2\u0194\u0189\3\2\2\2" +
            "\u0194\u018d\3\2\2\2\u0194\u0191\3\2\2\2\u0195\61\3\2\2\2\u0196\u0197" +
            "\b\32\1\2\u0197\u0198\5\60\31\2\u0198\u0199\b\32\1\2\u0199\u01a1\3\2\2" +
            "\2\u019a\u019b\f\4\2\2\u019b\u019c\5@!\2\u019c\u019d\5\60\31\2\u019d\u019e" +
            "\b\32\1\2\u019e\u01a0\3\2\2\2\u019f\u019a\3\2\2\2\u01a0\u01a3\3\2\2\2" +
            "\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a1" +
            "\3\2\2\2\u01a4\u01a5\b\33\1\2\u01a5\u01a6\5\62\32\2\u01a6\u01a7\b\33\1" +
            "\2\u01a7\u01af\3\2\2\2\u01a8\u01a9\f\4\2\2\u01a9\u01aa\5> \2\u01aa\u01ab" +
            "\5\62\32\2\u01ab\u01ac\b\33\1\2\u01ac\u01ae\3\2\2\2\u01ad\u01a8\3\2\2" +
            "\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\65" +
            "\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\b\34\1\2\u01b3\u01b4\5\64\33" +
            "\2\u01b4\u01b5\b\34\1\2\u01b5\u01bd\3\2\2\2\u01b6\u01b7\f\4\2\2\u01b7" +
            "\u01b8\5B\"\2\u01b8\u01b9\5\64\33\2\u01b9\u01ba\b\34\1\2\u01ba\u01bc\3" +
            "\2\2\2\u01bb\u01b6\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd" +
            "\u01be\3\2\2\2\u01be\67\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\5\66\34" +
            "\2\u01c1\u01c2\7\23\2\2\u01c2\u01c3\58\35\2\u01c3\u01c4\b\35\1\2\u01c4" +
            "\u01c9\3\2\2\2\u01c5\u01c6\5\66\34\2\u01c6\u01c7\b\35\1\2\u01c7\u01c9" +
            "\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c99\3\2\2\2\u01ca" +
            "\u01cb\58\35\2\u01cb\u01cc\7\24\2\2\u01cc\u01cd\5:\36\2\u01cd\u01ce\b" +
            "\36\1\2\u01ce\u01d3\3\2\2\2\u01cf\u01d0\58\35\2\u01d0\u01d1\b\36\1\2\u01d1" +
            "\u01d3\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d3;\3\2\2\2" +
            "\u01d4\u01de\b\37\1\2\u01d5\u01d6\5:\36\2\u01d6\u01d7\b\37\1\2\u01d7\u01de" +
            "\3\2\2\2\u01d8\u01d9\5:\36\2\u01d9\u01da\7\5\2\2\u01da\u01db\5<\37\2\u01db" +
            "\u01dc\b\37\1\2\u01dc\u01de\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d5\3" +
            "\2\2\2\u01dd\u01d8\3\2\2\2\u01de=\3\2\2\2\u01df\u01e0\7\25\2\2\u01e0\u01e4" +
            "\b \1\2\u01e1\u01e2\7\21\2\2\u01e2\u01e4\b \1\2\u01e3\u01df\3\2\2\2\u01e3" +
            "\u01e1\3\2\2\2\u01e4?\3\2\2\2\u01e5\u01e6\7\26\2\2\u01e6\u01ec\b!\1\2" +
            "\u01e7\u01e8\7\27\2\2\u01e8\u01ec\b!\1\2\u01e9\u01ea\7\30\2\2\u01ea\u01ec" +
            "\b!\1\2\u01eb\u01e5\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec" +
            "A\3\2\2\2\u01ed\u01ee\7\31\2\2\u01ee\u01fa\b\"\1\2\u01ef\u01f0\7\32\2" +
            "\2\u01f0\u01fa\b\"\1\2\u01f1\u01f2\7\33\2\2\u01f2\u01fa\b\"\1\2\u01f3" +
            "\u01f4\7\34\2\2\u01f4\u01fa\b\"\1\2\u01f5\u01f6\7\35\2\2\u01f6\u01fa\b" +
            "\"\1\2\u01f7\u01f8\7\36\2\2\u01f8\u01fa\b\"\1\2\u01f9\u01ed\3\2\2\2\u01f9" +
            "\u01ef\3\2\2\2\u01f9\u01f1\3\2\2\2\u01f9\u01f3\3\2\2\2\u01f9\u01f5\3\2" +
            "\2\2\u01f9\u01f7\3\2\2\2\u01faC\3\2\2\2\34en}\u008d\u0096\u00ae\u0108" +
            "\u0112\u011c\u0126\u0132\u0139\u0145\u0175\u0184\u0186\u0194\u01a1\u01af" +
            "\u01bd\u01c8\u01d2\u01dd\u01e3\u01eb\u01f9";
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public latteParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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

    private static String[] makeRuleNames() {
        return new String[]{
            "start_Prog", "prog", "identP", "funct", "topDef", "listTopDef", "arg",
            "listArg", "clsBlock", "listClsDef", "clsDef", "clsMethod", "clsAttr",
            "block", "listStmt", "stmt", "item", "listItem", "primitiveType", "classType",
            "type", "listType", "expr6", "expr5", "expr4", "expr3", "expr2", "expr1",
            "expr", "listExpr", "addOp", "mulOp", "relOp"
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
        return "latteParser.g4";
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
    public ATN getATN() {
        return _ATN;
    }

    public final Start_ProgContext start_Prog() throws RecognitionException {
        Start_ProgContext _localctx = new Start_ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start_Prog);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                ((Start_ProgContext) _localctx).x = prog();
                setState(67);
                match(EOF);
                ((Start_ProgContext) _localctx).result = ((Start_ProgContext) _localctx).x.result;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_prog);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                ((ProgContext) _localctx).p_1_1 = listTopDef();
                var prog = new latte.Absyn.Program(((ProgContext) _localctx).p_1_1.result);
                prog.line_num = _localctx.start.getLine();
                prog.col_num = _localctx.start.getChannel();
                ((ProgContext) _localctx).result = prog;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdentPContext identP() throws RecognitionException {
        IdentPContext _localctx = new IdentPContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_identP);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                ((IdentPContext) _localctx).p_1_1 = match(IDENT);
                var ident = new latte.Absyn.IdentPos(((IdentPContext) _localctx).p_1_1.getText());
                ident.line_num = _localctx.start.getLine();
                ident.col_num = _localctx.start.getChannel();
                ((IdentPContext) _localctx).result = ident;

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctContext funct() throws RecognitionException {
        FunctContext _localctx = new FunctContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_funct);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                ((FunctContext) _localctx).p_1_1 = type(0);
                setState(77);
                ((FunctContext) _localctx).p_1_2 = identP();
                setState(78);
                match(Surrogate_id_SYMB_0);
                setState(79);
                ((FunctContext) _localctx).p_1_4 = listArg();
                setState(80);
                match(Surrogate_id_SYMB_1);
                setState(81);
                ((FunctContext) _localctx).p_1_6 = block();
                var fun = new latte.Absyn.Function(((FunctContext) _localctx).p_1_1.result, ((FunctContext) _localctx).p_1_2.result, ((FunctContext) _localctx).p_1_4.result, ((FunctContext) _localctx).p_1_6.result);
                fun.line_num = _localctx.start.getLine();
                fun.col_num = _localctx.start.getChannel();
                ((FunctContext) _localctx).result = fun;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TopDefContext topDef() throws RecognitionException {
        TopDefContext _localctx = new TopDefContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_topDef);
        try {
            setState(99);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(84);
                    ((TopDefContext) _localctx).p_1_1 = funct();
                    var fnDef = new latte.Absyn.FnDef(((TopDefContext) _localctx).p_1_1.result);
                    fnDef.line_num = _localctx.start.getLine();
                    fnDef.col_num = _localctx.start.getChannel();
                    ((TopDefContext) _localctx).result = fnDef;
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(87);
                    match(Surrogate_id_SYMB_29);
                    setState(88);
                    ((TopDefContext) _localctx).p_2_2 = identP();
                    setState(89);
                    ((TopDefContext) _localctx).p_2_3 = clsBlock();
                    var classDef = new latte.Absyn.ClassDef(((TopDefContext) _localctx).p_2_2.result, ((TopDefContext) _localctx).p_2_3.result);
                    classDef.line_num = _localctx.start.getLine();
                    classDef.col_num = _localctx.start.getChannel();
                    ((TopDefContext) _localctx).result = classDef;
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(92);
                    match(Surrogate_id_SYMB_29);
                    setState(93);
                    ((TopDefContext) _localctx).p_3_2 = identP();
                    setState(94);
                    match(Surrogate_id_SYMB_31);
                    setState(95);
                    ((TopDefContext) _localctx).p_3_4 = identP();
                    setState(96);
                    ((TopDefContext) _localctx).p_3_5 = clsBlock();
                    var classDefExtend = new latte.Absyn.ClassDefExtend(((TopDefContext) _localctx).p_3_2.result, ((TopDefContext) _localctx).p_3_4.result, ((TopDefContext) _localctx).p_3_5.result);
                    classDefExtend.line_num = _localctx.start.getLine();
                    classDefExtend.col_num = _localctx.start.getChannel();
                    ((TopDefContext) _localctx).result = classDefExtend;
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListTopDefContext listTopDef() throws RecognitionException {
        ListTopDefContext _localctx = new ListTopDefContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_listTopDef);
        try {
            setState(108);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(101);
                    ((ListTopDefContext) _localctx).p_1_1 = topDef();
                    ((ListTopDefContext) _localctx).result = new latte.Absyn.ListTopDef();
                    _localctx.result.addLast(((ListTopDefContext) _localctx).p_1_1.result);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(104);
                    ((ListTopDefContext) _localctx).p_2_1 = topDef();
                    setState(105);
                    ((ListTopDefContext) _localctx).p_2_2 = listTopDef();
                    ((ListTopDefContext) _localctx).result = ((ListTopDefContext) _localctx).p_2_2.result;
                    _localctx.result.addFirst(((ListTopDefContext) _localctx).p_2_1.result);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArgContext arg() throws RecognitionException {
        ArgContext _localctx = new ArgContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_arg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                ((ArgContext) _localctx).p_1_1 = type(0);
                setState(111);
                ((ArgContext) _localctx).p_1_2 = identP();
                var arg = new latte.Absyn.Argument(((ArgContext) _localctx).p_1_1.result, ((ArgContext) _localctx).p_1_2.result);
                arg.line_num = _localctx.start.getLine();
                arg.col_num = _localctx.start.getChannel();
                ((ArgContext) _localctx).result = arg;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListArgContext listArg() throws RecognitionException {
        ListArgContext _localctx = new ListArgContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_listArg);
        try {
            setState(123);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    ((ListArgContext) _localctx).result = new latte.Absyn.ListArg();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(115);
                    ((ListArgContext) _localctx).p_2_1 = arg();
                    ((ListArgContext) _localctx).result = new latte.Absyn.ListArg();
                    _localctx.result.addLast(((ListArgContext) _localctx).p_2_1.result);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(118);
                    ((ListArgContext) _localctx).p_3_1 = arg();
                    setState(119);
                    match(Surrogate_id_SYMB_2);
                    setState(120);
                    ((ListArgContext) _localctx).p_3_3 = listArg();
                    ((ListArgContext) _localctx).result = ((ListArgContext) _localctx).p_3_3.result;
                    _localctx.result.addFirst(((ListArgContext) _localctx).p_3_1.result);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClsBlockContext clsBlock() throws RecognitionException {
        ClsBlockContext _localctx = new ClsBlockContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_clsBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                match(Surrogate_id_SYMB_3);
                setState(126);
                ((ClsBlockContext) _localctx).p_1_2 = listClsDef(0);
                setState(127);
                match(Surrogate_id_SYMB_4);
                var classBlock = new latte.Absyn.ClassBlock(((ClsBlockContext) _localctx).p_1_2.result);
                classBlock.line_num = _localctx.start.getLine();
                classBlock.col_num = _localctx.start.getChannel();
                ((ClsBlockContext) _localctx).result = classBlock;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    private ListClsDefContext listClsDef(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ListClsDefContext _localctx = new ListClsDefContext(_ctx, _parentState);
        ListClsDefContext _prevctx = _localctx;
        int _startState = 18;
        enterRecursionRule(_localctx, 18, RULE_listClsDef, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    ((ListClsDefContext) _localctx).result = new latte.Absyn.ListClsDef();
                }
                _ctx.stop = _input.LT(-1);
                setState(139);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ListClsDefContext(_parentctx, _parentState);
                                _localctx.p_2_1 = _prevctx;
                                _localctx.p_2_1 = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_listClsDef);
                                setState(133);
                                if (!(precpred(_ctx, 1)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(134);
                                ((ListClsDefContext) _localctx).p_2_2 = clsDef();
                                ((ListClsDefContext) _localctx).result = ((ListClsDefContext) _localctx).p_2_1.result;
                                _localctx.result.addLast(((ListClsDefContext) _localctx).p_2_2.result);
                            }
                        }
                    }
                    setState(141);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final ClsDefContext clsDef() throws RecognitionException {
        ClsDefContext _localctx = new ClsDefContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_clsDef);
        try {
            setState(148);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(142);
                    ((ClsDefContext) _localctx).p_1_1 = clsAttr();
                    var classDefAttr = new latte.Absyn.ClassDefAttr(((ClsDefContext) _localctx).p_1_1.result);
                    classDefAttr.line_num = _localctx.start.getLine();
                    classDefAttr.col_num = _localctx.start.getChannel();
                    ((ClsDefContext) _localctx).result = classDefAttr;
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(145);
                    ((ClsDefContext) _localctx).p_2_1 = clsMethod();
                    var classDefMethod = new latte.Absyn.ClassDefMethod(((ClsDefContext) _localctx).p_2_1.result);
                    classDefMethod.line_num = _localctx.start.getLine();
                    classDefMethod.col_num = _localctx.start.getChannel();
                    ((ClsDefContext) _localctx).result = classDefMethod;
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClsMethodContext clsMethod() throws RecognitionException {
        ClsMethodContext _localctx = new ClsMethodContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_clsMethod);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(150);
                ((ClsMethodContext) _localctx).p_1_1 = funct();
                var classMethod = new latte.Absyn.ClassMethod(((ClsMethodContext) _localctx).p_1_1.result);
                classMethod.line_num = _localctx.start.getLine();
                classMethod.col_num = _localctx.start.getChannel();
                ((ClsMethodContext) _localctx).result = classMethod;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListClsDefContext listClsDef() throws RecognitionException {
        return listClsDef(0);
    }

    public final ClsAttrContext clsAttr() throws RecognitionException {
        ClsAttrContext _localctx = new ClsAttrContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_clsAttr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(153);
                ((ClsAttrContext) _localctx).p_1_1 = type(0);
                setState(154);
                ((ClsAttrContext) _localctx).p_1_2 = identP();
                setState(155);
                match(Surrogate_id_SYMB_5);

                var classAttribute = new latte.Absyn.ClassAttribute(((ClsAttrContext) _localctx).p_1_1.result, ((ClsAttrContext) _localctx).p_1_2.result);
                classAttribute.line_num = _localctx.start.getLine();
                classAttribute.col_num = _localctx.start.getChannel();
                ((ClsAttrContext) _localctx).result = classAttribute;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                match(Surrogate_id_SYMB_3);
                setState(159);
                ((BlockContext) _localctx).p_1_2 = listStmt(0);
                setState(160);
                match(Surrogate_id_SYMB_4);

                var blockOfStatements = new latte.Absyn.BlockOfStatements(((BlockContext) _localctx).p_1_2.result);
                blockOfStatements.line_num = _localctx.start.getLine();
                blockOfStatements.col_num = _localctx.start.getChannel();
                ((BlockContext) _localctx).result = blockOfStatements;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    private ListStmtContext listStmt(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ListStmtContext _localctx = new ListStmtContext(_ctx, _parentState);
        ListStmtContext _prevctx = _localctx;
        int _startState = 28;
        enterRecursionRule(_localctx, 28, RULE_listStmt, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    ((ListStmtContext) _localctx).result = new latte.Absyn.ListStmt();
                }
                _ctx.stop = _input.LT(-1);
                setState(172);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ListStmtContext(_parentctx, _parentState);
                                _localctx.p_2_1 = _prevctx;
                                _localctx.p_2_1 = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_listStmt);
                                setState(166);
                                if (!(precpred(_ctx, 1)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(167);
                                ((ListStmtContext) _localctx).p_2_2 = stmt();
                                ((ListStmtContext) _localctx).result = ((ListStmtContext) _localctx).p_2_1.result;
                                _localctx.result.addLast(((ListStmtContext) _localctx).p_2_2.result);
                            }
                        }
                    }
                    setState(174);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final StmtContext stmt() throws RecognitionException {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_stmt);
        try {
            setState(262);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(175);
                    match(Surrogate_id_SYMB_5);

                    var empty = new latte.Absyn.Empty();
                    empty.line_num = _localctx.start.getLine();
                    empty.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = empty;
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(177);
                    ((StmtContext) _localctx).p_2_1 = block();
                    var bStmt = new latte.Absyn.BStmt(((StmtContext) _localctx).p_2_1.result);
                    bStmt.line_num = _localctx.start.getLine();
                    bStmt.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = bStmt;
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(180);
                    ((StmtContext) _localctx).p_3_1 = type(0);
                    setState(181);
                    ((StmtContext) _localctx).p_3_2 = listItem();
                    setState(182);
                    match(Surrogate_id_SYMB_5);
                    var decl = new latte.Absyn.Decl(((StmtContext) _localctx).p_3_1.result, ((StmtContext) _localctx).p_3_2.result);
                    decl.line_num = _localctx.start.getLine();
                    decl.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = decl;
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(185);
                    ((StmtContext) _localctx).p_4_1 = identP();
                    setState(186);
                    match(Surrogate_id_SYMB_6);
                    setState(187);
                    ((StmtContext) _localctx).p_4_3 = expr();
                    setState(188);
                    match(Surrogate_id_SYMB_5);
                    var ass = new latte.Absyn.Ass(((StmtContext) _localctx).p_4_1.result, ((StmtContext) _localctx).p_4_3.result);
                    ass.line_num = _localctx.start.getLine();
                    ass.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = ass;
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(191);
                    ((StmtContext) _localctx).p_5_1 = identP();
                    setState(192);
                    match(Surrogate_id_SYMB_7);
                    setState(193);
                    ((StmtContext) _localctx).p_5_3 = expr();
                    setState(194);
                    match(Surrogate_id_SYMB_8);
                    setState(195);
                    match(Surrogate_id_SYMB_6);
                    setState(196);
                    ((StmtContext) _localctx).p_5_6 = expr();
                    setState(197);
                    match(Surrogate_id_SYMB_5);
                    var assArr = new latte.Absyn.AssArr(((StmtContext) _localctx).p_5_1.result, ((StmtContext) _localctx).p_5_3.result, ((StmtContext) _localctx).p_5_6.result);
                    assArr.line_num = _localctx.start.getLine();
                    assArr.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = assArr;
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(200);
                    ((StmtContext) _localctx).p_6_1 = expr6(0);
                    setState(201);
                    match(Surrogate_id_SYMB_9);
                    setState(202);
                    ((StmtContext) _localctx).p_6_3 = identP();
                    setState(203);
                    match(Surrogate_id_SYMB_6);
                    setState(204);
                    ((StmtContext) _localctx).p_6_5 = expr();
                    setState(205);
                    match(Surrogate_id_SYMB_5);
                    var assAttr = new latte.Absyn.AssAttr(((StmtContext) _localctx).p_6_1.result, ((StmtContext) _localctx).p_6_3.result, ((StmtContext) _localctx).p_6_5.result);
                    assAttr.line_num = _localctx.start.getLine();
                    assAttr.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = assAttr;
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(208);
                    ((StmtContext) _localctx).p_7_1 = identP();
                    setState(209);
                    match(Surrogate_id_SYMB_10);
                    setState(210);
                    match(Surrogate_id_SYMB_5);
                    var incr = new latte.Absyn.Incr(((StmtContext) _localctx).p_7_1.result);
                    incr.line_num = _localctx.start.getLine();
                    incr.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = incr;
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(213);
                    ((StmtContext) _localctx).p_8_1 = identP();
                    setState(214);
                    match(Surrogate_id_SYMB_11);
                    setState(215);
                    match(Surrogate_id_SYMB_5);
                    var decr = new latte.Absyn.Decr(((StmtContext) _localctx).p_8_1.result);
                    decr.line_num = _localctx.start.getLine();
                    decr.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = decr;
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(218);
                    match(Surrogate_id_SYMB_37);
                    setState(219);
                    ((StmtContext) _localctx).p_9_2 = expr();
                    setState(220);
                    match(Surrogate_id_SYMB_5);
                    var ret = new latte.Absyn.Ret(((StmtContext) _localctx).p_9_2.result);
                    ret.line_num = _localctx.start.getLine();
                    ret.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = ret;
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(223);
                    match(Surrogate_id_SYMB_37);
                    setState(224);
                    match(Surrogate_id_SYMB_5);
                    var vret = new latte.Absyn.VRet();
                    vret.line_num = _localctx.start.getLine();
                    vret.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = vret;
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(226);
                    match(Surrogate_id_SYMB_34);
                    setState(227);
                    match(Surrogate_id_SYMB_0);
                    setState(228);
                    ((StmtContext) _localctx).p_11_3 = expr();
                    setState(229);
                    match(Surrogate_id_SYMB_1);
                    setState(230);
                    ((StmtContext) _localctx).p_11_5 = stmt();
                    var cond = new latte.Absyn.Cond(((StmtContext) _localctx).p_11_3.result, ((StmtContext) _localctx).p_11_5.result);
                    cond.line_num = _localctx.start.getLine();
                    cond.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = cond;
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(233);
                    match(Surrogate_id_SYMB_34);
                    setState(234);
                    match(Surrogate_id_SYMB_0);
                    setState(235);
                    ((StmtContext) _localctx).p_12_3 = expr();
                    setState(236);
                    match(Surrogate_id_SYMB_1);
                    setState(237);
                    ((StmtContext) _localctx).p_12_5 = stmt();
                    setState(238);
                    match(Surrogate_id_SYMB_30);
                    setState(239);
                    ((StmtContext) _localctx).p_12_7 = stmt();
                    var condElse = new latte.Absyn.CondElse(((StmtContext) _localctx).p_12_3.result, ((StmtContext) _localctx).p_12_5.result, ((StmtContext) _localctx).p_12_7.result);
                    condElse.line_num = _localctx.start.getLine();
                    condElse.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = condElse;
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(242);
                    match(Surrogate_id_SYMB_41);
                    setState(243);
                    match(Surrogate_id_SYMB_0);
                    setState(244);
                    ((StmtContext) _localctx).p_13_3 = expr();
                    setState(245);
                    match(Surrogate_id_SYMB_1);
                    setState(246);
                    ((StmtContext) _localctx).p_13_5 = stmt();
                    var aWhile = new latte.Absyn.While(((StmtContext) _localctx).p_13_3.result, ((StmtContext) _localctx).p_13_5.result);
                    aWhile.line_num = _localctx.start.getLine();
                    aWhile.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = aWhile;
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(249);
                    match(Surrogate_id_SYMB_33);
                    setState(250);
                    match(Surrogate_id_SYMB_0);
                    setState(251);
                    ((StmtContext) _localctx).p_14_3 = arg();
                    setState(252);
                    match(Surrogate_id_SYMB_12);
                    setState(253);
                    ((StmtContext) _localctx).p_14_5 = expr();
                    setState(254);
                    match(Surrogate_id_SYMB_1);
                    setState(255);
                    ((StmtContext) _localctx).p_14_7 = stmt();
                    var aFor = new latte.Absyn.For(((StmtContext) _localctx).p_14_3.result, ((StmtContext) _localctx).p_14_5.result, ((StmtContext) _localctx).p_14_7.result);
                    aFor.line_num = _localctx.start.getLine();
                    aFor.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = aFor;
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(258);
                    ((StmtContext) _localctx).p_15_1 = expr();
                    setState(259);
                    match(Surrogate_id_SYMB_5);
                    var exp = new latte.Absyn.SExp(((StmtContext) _localctx).p_15_1.result);
                    exp.line_num = _localctx.start.getLine();
                    exp.col_num = _localctx.start.getChannel();
                    ((StmtContext) _localctx).result = exp;
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ItemContext item() throws RecognitionException {
        ItemContext _localctx = new ItemContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_item);
        try {
            setState(272);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(264);
                    ((ItemContext) _localctx).p_1_1 = identP();
                    var noInit = new latte.Absyn.NoInit(((ItemContext) _localctx).p_1_1.result);
                    noInit.line_num = _localctx.start.getLine();
                    noInit.col_num = _localctx.start.getChannel();
                    ((ItemContext) _localctx).result = noInit;
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(267);
                    ((ItemContext) _localctx).p_2_1 = identP();
                    setState(268);
                    match(Surrogate_id_SYMB_6);
                    setState(269);
                    ((ItemContext) _localctx).p_2_3 = expr();
                    var init = new latte.Absyn.Init(((ItemContext) _localctx).p_2_1.result, ((ItemContext) _localctx).p_2_3.result);
                    init.line_num = _localctx.start.getLine();
                    init.col_num = _localctx.start.getChannel();
                    ((ItemContext) _localctx).result = init;
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListItemContext listItem() throws RecognitionException {
        ListItemContext _localctx = new ListItemContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_listItem);
        try {
            setState(282);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(274);
                    ((ListItemContext) _localctx).p_1_1 = item();
                    ((ListItemContext) _localctx).result = new latte.Absyn.ListItem();
                    _localctx.result.addLast(((ListItemContext) _localctx).p_1_1.result);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(277);
                    ((ListItemContext) _localctx).p_2_1 = item();
                    setState(278);
                    match(Surrogate_id_SYMB_2);
                    setState(279);
                    ((ListItemContext) _localctx).p_2_3 = listItem();
                    ((ListItemContext) _localctx).result = ((ListItemContext) _localctx).p_2_3.result;
                    _localctx.result.addFirst(((ListItemContext) _localctx).p_2_1.result);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListStmtContext listStmt() throws RecognitionException {
        return listStmt(0);
    }

    public final PrimitiveTypeContext primitiveType() throws RecognitionException {
        PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_primitiveType);
        try {
            setState(292);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Surrogate_id_SYMB_35:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(284);
                    match(Surrogate_id_SYMB_35);
                    var anInt = new latte.Absyn.Int();
                    anInt.line_num = _localctx.start.getLine();
                    anInt.col_num = _localctx.start.getChannel();
                    ((PrimitiveTypeContext) _localctx).result = anInt;
                }
                break;
                case Surrogate_id_SYMB_38:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(286);
                    match(Surrogate_id_SYMB_38);
                    var str = new latte.Absyn.Str();
                    str.line_num = _localctx.start.getLine();
                    str.col_num = _localctx.start.getChannel();
                    ((PrimitiveTypeContext) _localctx).result = str;
                }
                break;
                case Surrogate_id_SYMB_28:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(288);
                    match(Surrogate_id_SYMB_28);
                    var bool = new latte.Absyn.Bool();
                    bool.line_num = _localctx.start.getLine();
                    bool.col_num = _localctx.start.getChannel();
                    ((PrimitiveTypeContext) _localctx).result = bool;
                }
                break;
                case Surrogate_id_SYMB_40:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(290);
                    match(Surrogate_id_SYMB_40);
                    var aVoid = new latte.Absyn.Void();
                    aVoid.line_num = _localctx.start.getLine();
                    aVoid.col_num = _localctx.start.getChannel();
                    ((PrimitiveTypeContext) _localctx).result = aVoid;
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassTypeContext classType() throws RecognitionException {
        ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_classType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(294);
                ((ClassTypeContext) _localctx).p_1_1 = identP();
                var classT = new latte.Absyn.ClassT(((ClassTypeContext) _localctx).p_1_1.result);
                classT.line_num = _localctx.start.getLine();
                classT.col_num = _localctx.start.getChannel();
                ((ClassTypeContext) _localctx).result = classT;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    private TypeContext type(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        TypeContext _localctx = new TypeContext(_ctx, _parentState);
        TypeContext _prevctx = _localctx;
        int _startState = 40;
        enterRecursionRule(_localctx, 40, RULE_type, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(304);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Surrogate_id_SYMB_28:
                    case Surrogate_id_SYMB_35:
                    case Surrogate_id_SYMB_38:
                    case Surrogate_id_SYMB_40: {
                        setState(298);
                        ((TypeContext) _localctx).p_2_1 = primitiveType();
                        var primitive = new latte.Absyn.Primitive(((TypeContext) _localctx).p_2_1.result);
                        primitive.line_num = _localctx.start.getLine();
                        primitive.col_num = _localctx.start.getChannel();
                        ((TypeContext) _localctx).result = primitive;
                    }
                    break;
                    case IDENT: {
                        setState(301);
                        ((TypeContext) _localctx).p_3_1 = classType();
                        var aClass = new latte.Absyn.Class(((TypeContext) _localctx).p_3_1.result);
                        aClass.line_num = _localctx.start.getLine();
                        aClass.col_num = _localctx.start.getChannel();
                        ((TypeContext) _localctx).result = aClass;
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(311);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new TypeContext(_parentctx, _parentState);
                                _localctx.p_1_1 = _prevctx;
                                _localctx.p_1_1 = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_type);
                                setState(306);
                                if (!(precpred(_ctx, 3)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                setState(307);
                                match(Surrogate_id_SYMB_13);
                                var arrayT = new latte.Absyn.ArrayT(((TypeContext) _localctx).p_1_1.result);
                                arrayT.line_num = _localctx.start.getLine();
                                arrayT.col_num = _localctx.start.getChannel();
                                ((TypeContext) _localctx).result = arrayT;
                            }
                        }
                    }
                    setState(313);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final ListTypeContext listType() throws RecognitionException {
        ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_listType);
        try {
            setState(323);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    ((ListTypeContext) _localctx).result = new latte.Absyn.ListType();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(315);
                    ((ListTypeContext) _localctx).p_2_1 = type(0);
                    ((ListTypeContext) _localctx).result = new latte.Absyn.ListType();
                    _localctx.result.addLast(((ListTypeContext) _localctx).p_2_1.result);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(318);
                    ((ListTypeContext) _localctx).p_3_1 = type(0);
                    setState(319);
                    match(Surrogate_id_SYMB_2);
                    setState(320);
                    ((ListTypeContext) _localctx).p_3_3 = listType();
                    ((ListTypeContext) _localctx).result = ((ListTypeContext) _localctx).p_3_3.result;
                    _localctx.result.addFirst(((ListTypeContext) _localctx).p_3_1.result);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    private Expr6Context expr6(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Expr6Context _localctx = new Expr6Context(_ctx, _parentState);
        Expr6Context _prevctx = _localctx;
        int _startState = 44;
        enterRecursionRule(_localctx, 44, RULE_expr6, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(371);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                    case 1: {
                        setState(326);
                        match(Surrogate_id_SYMB_36);
                        setState(327);
                        ((Expr6Context) _localctx).p_1_2 = type(0);
                        setState(328);
                        match(Surrogate_id_SYMB_7);
                        setState(329);
                        ((Expr6Context) _localctx).p_1_4 = expr();
                        setState(330);
                        match(Surrogate_id_SYMB_8);
                        var newArray = new latte.Absyn.ENewArray(((Expr6Context) _localctx).p_1_2.result, ((Expr6Context) _localctx).p_1_4.result);
                        newArray.line_num = _localctx.start.getLine();
                        newArray.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = newArray;
                    }
                    break;
                    case 2: {
                        setState(333);
                        match(Surrogate_id_SYMB_36);
                        setState(334);
                        ((Expr6Context) _localctx).p_2_2 = identP();
                        var newObject = new latte.Absyn.ENewObject(((Expr6Context) _localctx).p_2_2.result);
                        newObject.line_num = _localctx.start.getLine();
                        newObject.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = newObject;
                    }
                    break;
                    case 3: {
                        setState(337);
                        ((Expr6Context) _localctx).p_3_1 = identP();
                        var eVar = new latte.Absyn.EVar(((Expr6Context) _localctx).p_3_1.result);
                        eVar.line_num = _localctx.start.getLine();
                        eVar.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = eVar;
                    }
                    break;
                    case 4: {
                        setState(340);
                        ((Expr6Context) _localctx).p_4_1 = identP();
                        setState(341);
                        match(Surrogate_id_SYMB_7);
                        setState(342);
                        ((Expr6Context) _localctx).p_4_3 = expr();
                        setState(343);
                        match(Surrogate_id_SYMB_8);
                        var arrayElem = new latte.Absyn.EArrayElem(((Expr6Context) _localctx).p_4_1.result, ((Expr6Context) _localctx).p_4_3.result);
                        arrayElem.line_num = _localctx.start.getLine();
                        arrayElem.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = arrayElem;
                    }
                    break;
                    case 5: {
                        setState(346);
                        ((Expr6Context) _localctx).p_5_1 = match(INTEGER);
                        var anInt = new latte.Absyn.ELitInt(Integer.parseInt(((Expr6Context) _localctx).p_5_1.getText()));
                        anInt.line_num = _localctx.start.getLine();
                        anInt.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = anInt;
                    }
                    break;
                    case 6: {
                        setState(348);
                        match(Surrogate_id_SYMB_39);
                        var aTrue = new latte.Absyn.ELitTrue();
                        aTrue.line_num = _localctx.start.getLine();
                        aTrue.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = aTrue;
                    }
                    break;
                    case 7: {
                        setState(350);
                        match(Surrogate_id_SYMB_32);
                        var aFalse = new latte.Absyn.ELitFalse();
                        aFalse.line_num = _localctx.start.getLine();
                        aFalse.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = aFalse;
                    }
                    break;
                    case 8: {
                        setState(352);
                        ((Expr6Context) _localctx).p_10_1 = identP();
                        setState(353);
                        match(Surrogate_id_SYMB_0);
                        setState(354);
                        ((Expr6Context) _localctx).p_10_3 = listExpr();
                        setState(355);
                        match(Surrogate_id_SYMB_1);
                        var app = new latte.Absyn.EApp(((Expr6Context) _localctx).p_10_1.result, ((Expr6Context) _localctx).p_10_3.result);
                        app.line_num = _localctx.start.getLine();
                        app.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = app;
                    }
                    break;
                    case 9: {
                        setState(358);
                        match(Surrogate_id_SYMB_0);
                        setState(359);
                        ((Expr6Context) _localctx).p_11_2 = type(0);
                        setState(360);
                        match(Surrogate_id_SYMB_1);
                        setState(361);
                        ((Expr6Context) _localctx).p_11_4 = expr6(3);
                        var cast = new latte.Absyn.ECast(((Expr6Context) _localctx).p_11_2.result, ((Expr6Context) _localctx).p_11_4.result);
                        cast.line_num = _localctx.start.getLine();
                        cast.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = cast;
                    }
                    break;
                    case 10: {
                        setState(364);
                        ((Expr6Context) _localctx).p_12_1 = match(STRING);
                        var aString = new latte.Absyn.EString(((Expr6Context) _localctx).p_12_1.getText().substring(1, ((Expr6Context) _localctx).p_12_1.getText().length() - 1));
                        aString.line_num = _localctx.start.getLine();
                        aString.col_num = _localctx.start.getChannel();
                        ((Expr6Context) _localctx).result = aString;
                    }
                    break;
                    case 11: {
                        setState(366);
                        match(Surrogate_id_SYMB_0);
                        setState(367);
                        ((Expr6Context) _localctx).p_13_2 = expr();
                        setState(368);
                        match(Surrogate_id_SYMB_1);
                        ((Expr6Context) _localctx).result = ((Expr6Context) _localctx).p_13_2.result;
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(388);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(386);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                                case 1: {
                                    _localctx = new Expr6Context(_parentctx, _parentState);
                                    _localctx.p_8_1 = _prevctx;
                                    _localctx.p_8_1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr6);
                                    setState(373);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(374);
                                    match(Surrogate_id_SYMB_9);
                                    setState(375);
                                    ((Expr6Context) _localctx).p_8_3 = identP();
                                    var attr = new latte.Absyn.EAttr(((Expr6Context) _localctx).p_8_1.result, ((Expr6Context) _localctx).p_8_3.result);
                                    attr.line_num = _localctx.start.getLine();
                                    attr.col_num = _localctx.start.getChannel();
                                    ((Expr6Context) _localctx).result = attr;
                                }
                                break;
                                case 2: {
                                    _localctx = new Expr6Context(_parentctx, _parentState);
                                    _localctx.p_9_1 = _prevctx;
                                    _localctx.p_9_1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr6);
                                    setState(378);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(379);
                                    match(Surrogate_id_SYMB_9);
                                    setState(380);
                                    ((Expr6Context) _localctx).p_9_3 = identP();
                                    setState(381);
                                    match(Surrogate_id_SYMB_0);
                                    setState(382);
                                    ((Expr6Context) _localctx).p_9_5 = listExpr();
                                    setState(383);
                                    match(Surrogate_id_SYMB_1);
                                    var method = new latte.Absyn.EMethod(((Expr6Context) _localctx).p_9_1.result, ((Expr6Context) _localctx).p_9_3.result, ((Expr6Context) _localctx).p_9_5.result);
                                    method.line_num = _localctx.start.getLine();
                                    method.col_num = _localctx.start.getChannel();
                                    ((Expr6Context) _localctx).result = method;
                                }
                                break;
                            }
                        }
                    }
                    setState(390);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final Expr5Context expr5() throws RecognitionException {
        Expr5Context _localctx = new Expr5Context(_ctx, getState());
        enterRule(_localctx, 46, RULE_expr5);
        try {
            setState(402);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Surrogate_id_SYMB_14:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(391);
                    match(Surrogate_id_SYMB_14);
                    setState(392);
                    ((Expr5Context) _localctx).p_1_2 = expr6(0);
                    var neg = new latte.Absyn.Neg(((Expr5Context) _localctx).p_1_2.result);
                    neg.line_num = _localctx.start.getLine();
                    neg.col_num = _localctx.start.getChannel();
                    ((Expr5Context) _localctx).result = neg;
                }
                break;
                case Surrogate_id_SYMB_15:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(395);
                    match(Surrogate_id_SYMB_15);
                    setState(396);
                    ((Expr5Context) _localctx).p_2_2 = expr6(0);
                    var not = new latte.Absyn.Not(((Expr5Context) _localctx).p_2_2.result);
                    not.line_num = _localctx.start.getLine();
                    not.col_num = _localctx.start.getChannel();
                    ((Expr5Context) _localctx).result = not;
                }
                break;
                case Surrogate_id_SYMB_0:
                case Surrogate_id_SYMB_32:
                case Surrogate_id_SYMB_36:
                case Surrogate_id_SYMB_39:
                case INTEGER:
                case IDENT:
                case STRING:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(399);
                    ((Expr5Context) _localctx).p_3_1 = expr6(0);
                    ((Expr5Context) _localctx).result = ((Expr5Context) _localctx).p_3_1.result;
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    private Expr4Context expr4(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Expr4Context _localctx = new Expr4Context(_ctx, _parentState);
        Expr4Context _prevctx = _localctx;
        int _startState = 48;
        enterRecursionRule(_localctx, 48, RULE_expr4, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(405);
                    ((Expr4Context) _localctx).p_2_1 = expr5();
                    ((Expr4Context) _localctx).result = ((Expr4Context) _localctx).p_2_1.result;
                }
                _ctx.stop = _input.LT(-1);
                setState(415);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Expr4Context(_parentctx, _parentState);
                                _localctx.p_1_1 = _prevctx;
                                _localctx.p_1_1 = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_expr4);
                                setState(408);
                                if (!(precpred(_ctx, 2)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(409);
                                ((Expr4Context) _localctx).p_1_2 = mulOp();
                                setState(410);
                                ((Expr4Context) _localctx).p_1_3 = expr5();
                                var mul = new latte.Absyn.EMul(((Expr4Context) _localctx).p_1_1.result, ((Expr4Context) _localctx).p_1_2.result, ((Expr4Context) _localctx).p_1_3.result);
                                mul.line_num = _localctx.start.getLine();
                                mul.col_num = _localctx.start.getChannel();
                                ((Expr4Context) _localctx).result = mul;
                            }
                        }
                    }
                    setState(417);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    private Expr3Context expr3(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Expr3Context _localctx = new Expr3Context(_ctx, _parentState);
        Expr3Context _prevctx = _localctx;
        int _startState = 50;
        enterRecursionRule(_localctx, 50, RULE_expr3, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(419);
                    ((Expr3Context) _localctx).p_2_1 = expr4(0);
                    ((Expr3Context) _localctx).result = ((Expr3Context) _localctx).p_2_1.result;
                }
                _ctx.stop = _input.LT(-1);
                setState(429);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Expr3Context(_parentctx, _parentState);
                                _localctx.p_1_1 = _prevctx;
                                _localctx.p_1_1 = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_expr3);
                                setState(422);
                                if (!(precpred(_ctx, 2)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(423);
                                ((Expr3Context) _localctx).p_1_2 = addOp();
                                setState(424);
                                ((Expr3Context) _localctx).p_1_3 = expr4(0);
                                var add = new latte.Absyn.EAdd(((Expr3Context) _localctx).p_1_1.result, ((Expr3Context) _localctx).p_1_2.result, ((Expr3Context) _localctx).p_1_3.result);
                                add.line_num = _localctx.start.getLine();
                                add.col_num = _localctx.start.getChannel();
                                ((Expr3Context) _localctx).result = add;
                            }
                        }
                    }
                    setState(431);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    private Expr2Context expr2(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
        Expr2Context _prevctx = _localctx;
        int _startState = 52;
        enterRecursionRule(_localctx, 52, RULE_expr2, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(433);
                    ((Expr2Context) _localctx).p_2_1 = expr3(0);
                    ((Expr2Context) _localctx).result = ((Expr2Context) _localctx).p_2_1.result;
                }
                _ctx.stop = _input.LT(-1);
                setState(443);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Expr2Context(_parentctx, _parentState);
                                _localctx.p_1_1 = _prevctx;
                                _localctx.p_1_1 = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_expr2);
                                setState(436);
                                if (!(precpred(_ctx, 2)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(437);
                                ((Expr2Context) _localctx).p_1_2 = relOp();
                                setState(438);
                                ((Expr2Context) _localctx).p_1_3 = expr3(0);
                                var rel = new latte.Absyn.ERel(((Expr2Context) _localctx).p_1_1.result, ((Expr2Context) _localctx).p_1_2.result, ((Expr2Context) _localctx).p_1_3.result);
                                rel.line_num = _localctx.start.getLine();
                                rel.col_num = _localctx.start.getChannel();
                                ((Expr2Context) _localctx).result = rel;
                            }
                        }
                    }
                    setState(445);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        return type(0);
    }

    public final Expr1Context expr1() throws RecognitionException {
        Expr1Context _localctx = new Expr1Context(_ctx, getState());
        enterRule(_localctx, 54, RULE_expr1);
        try {
            setState(454);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(446);
                    ((Expr1Context) _localctx).p_1_1 = expr2(0);
                    setState(447);
                    match(Surrogate_id_SYMB_16);
                    setState(448);
                    ((Expr1Context) _localctx).p_1_3 = expr1();
                    var and = new latte.Absyn.EAnd(((Expr1Context) _localctx).p_1_1.result, ((Expr1Context) _localctx).p_1_3.result);
                    and.line_num = _localctx.start.getLine();
                    and.col_num = _localctx.start.getChannel();
                    ((Expr1Context) _localctx).result = and;
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(451);
                    ((Expr1Context) _localctx).p_2_1 = expr2(0);
                    ((Expr1Context) _localctx).result = ((Expr1Context) _localctx).p_2_1.result;
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_expr);
        try {
            setState(464);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(456);
                    ((ExprContext) _localctx).p_1_1 = expr1();
                    setState(457);
                    match(Surrogate_id_SYMB_17);
                    setState(458);
                    ((ExprContext) _localctx).p_1_3 = expr();
                    var or = new latte.Absyn.EOr(((ExprContext) _localctx).p_1_1.result, ((ExprContext) _localctx).p_1_3.result);
                    or.line_num = _localctx.start.getLine();
                    or.col_num = _localctx.start.getChannel();
                    ((ExprContext) _localctx).result = or;
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(461);
                    ((ExprContext) _localctx).p_2_1 = expr1();
                    ((ExprContext) _localctx).result = ((ExprContext) _localctx).p_2_1.result;
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ListExprContext listExpr() throws RecognitionException {
        ListExprContext _localctx = new ListExprContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_listExpr);
        try {
            setState(475);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    ((ListExprContext) _localctx).result = new latte.Absyn.ListExpr();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(467);
                    ((ListExprContext) _localctx).p_2_1 = expr();
                    ((ListExprContext) _localctx).result = new latte.Absyn.ListExpr();
                    _localctx.result.addLast(((ListExprContext) _localctx).p_2_1.result);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(470);
                    ((ListExprContext) _localctx).p_3_1 = expr();
                    setState(471);
                    match(Surrogate_id_SYMB_2);
                    setState(472);
                    ((ListExprContext) _localctx).p_3_3 = listExpr();
                    ((ListExprContext) _localctx).result = ((ListExprContext) _localctx).p_3_3.result;
                    _localctx.result.addFirst(((ListExprContext) _localctx).p_3_1.result);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Expr6Context expr6() throws RecognitionException {
        return expr6(0);
    }

    public final AddOpContext addOp() throws RecognitionException {
        AddOpContext _localctx = new AddOpContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_addOp);
        try {
            setState(481);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Surrogate_id_SYMB_18:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(477);
                    match(Surrogate_id_SYMB_18);
                    var plus = new latte.Absyn.Plus();
                    plus.line_num = _localctx.start.getLine();
                    plus.col_num = _localctx.start.getChannel();
                    ((AddOpContext) _localctx).result = plus;
                }
                break;
                case Surrogate_id_SYMB_14:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(479);
                    match(Surrogate_id_SYMB_14);
                    var minus = new latte.Absyn.Minus();
                    minus.line_num = _localctx.start.getLine();
                    minus.col_num = _localctx.start.getChannel();
                    ((AddOpContext) _localctx).result = minus;
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MulOpContext mulOp() throws RecognitionException {
        MulOpContext _localctx = new MulOpContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_mulOp);
        try {
            setState(489);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Surrogate_id_SYMB_19:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(483);
                    match(Surrogate_id_SYMB_19);
                    var times = new latte.Absyn.Times();
                    times.line_num = _localctx.start.getLine();
                    times.col_num = _localctx.start.getChannel();
                    ((MulOpContext) _localctx).result = times;
                }
                break;
                case Surrogate_id_SYMB_20:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(485);
                    match(Surrogate_id_SYMB_20);
                    var div = new latte.Absyn.Div();
                    div.line_num = _localctx.start.getLine();
                    div.col_num = _localctx.start.getChannel();
                    ((MulOpContext) _localctx).result = div;
                }
                break;
                case Surrogate_id_SYMB_21:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(487);
                    match(Surrogate_id_SYMB_21);
                    var mod = new latte.Absyn.Mod();
                    mod.line_num = _localctx.start.getLine();
                    mod.col_num = _localctx.start.getChannel();
                    ((MulOpContext) _localctx).result = mod;
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Expr4Context expr4() throws RecognitionException {
        return expr4(0);
    }

    public final RelOpContext relOp() throws RecognitionException {
        RelOpContext _localctx = new RelOpContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_relOp);
        try {
            setState(503);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Surrogate_id_SYMB_22:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(491);
                    match(Surrogate_id_SYMB_22);
                    ((RelOpContext) _localctx).result = new latte.Absyn.LTH();
                }
                break;
                case Surrogate_id_SYMB_23:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(493);
                    match(Surrogate_id_SYMB_23);
                    ((RelOpContext) _localctx).result = new latte.Absyn.LE();
                }
                break;
                case Surrogate_id_SYMB_24:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(495);
                    match(Surrogate_id_SYMB_24);
                    ((RelOpContext) _localctx).result = new latte.Absyn.GTH();
                }
                break;
                case Surrogate_id_SYMB_25:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(497);
                    match(Surrogate_id_SYMB_25);
                    ((RelOpContext) _localctx).result = new latte.Absyn.GE();
                }
                break;
                case Surrogate_id_SYMB_26:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(499);
                    match(Surrogate_id_SYMB_26);
                    ((RelOpContext) _localctx).result = new latte.Absyn.EQU();
                }
                break;
                case Surrogate_id_SYMB_27:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(501);
                    match(Surrogate_id_SYMB_27);
                    ((RelOpContext) _localctx).result = new latte.Absyn.NE();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Expr3Context expr3() throws RecognitionException {
        return expr3(0);
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 9:
                return listClsDef_sempred((ListClsDefContext) _localctx, predIndex);
            case 14:
                return listStmt_sempred((ListStmtContext) _localctx, predIndex);
            case 20:
                return type_sempred((TypeContext) _localctx, predIndex);
            case 22:
                return expr6_sempred((Expr6Context) _localctx, predIndex);
            case 24:
                return expr4_sempred((Expr4Context) _localctx, predIndex);
            case 25:
                return expr3_sempred((Expr3Context) _localctx, predIndex);
            case 26:
                return expr2_sempred((Expr2Context) _localctx, predIndex);
        }
        return true;
    }

    public final Expr2Context expr2() throws RecognitionException {
        return expr2(0);
    }

    private boolean listClsDef_sempred(ListClsDefContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean listStmt_sempred(ListStmtContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean type_sempred(TypeContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private boolean expr6_sempred(Expr6Context _localctx, int predIndex) {
        switch (predIndex) {
            case 3:
                return precpred(_ctx, 6);
            case 4:
                return precpred(_ctx, 5);
        }
        return true;
    }

    private boolean expr4_sempred(Expr4Context _localctx, int predIndex) {
        switch (predIndex) {
            case 5:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean expr3_sempred(Expr3Context _localctx, int predIndex) {
        switch (predIndex) {
            case 6:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
        switch (predIndex) {
            case 7:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static class Start_ProgContext extends ParserRuleContext {
        public latte.Absyn.Prog result;
        public ProgContext x;

        public Start_ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(latteParser.EOF, 0);
        }

        public ProgContext prog() {
            return getRuleContext(ProgContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_start_Prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterStart_Prog(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitStart_Prog(this);
        }
    }

    public static class ProgContext extends ParserRuleContext {
        public latte.Absyn.Prog result;
        public ListTopDefContext p_1_1;

        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ListTopDefContext listTopDef() {
            return getRuleContext(ListTopDefContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitProg(this);
        }
    }

    public static class ListTopDefContext extends ParserRuleContext {
        public latte.Absyn.ListTopDef result;
        public TopDefContext p_1_1;
        public TopDefContext p_2_1;
        public ListTopDefContext p_2_2;

        public ListTopDefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TopDefContext topDef() {
            return getRuleContext(TopDefContext.class, 0);
        }

        public ListTopDefContext listTopDef() {
            return getRuleContext(ListTopDefContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listTopDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListTopDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListTopDef(this);
        }
    }

    public static class ListArgContext extends ParserRuleContext {
        public latte.Absyn.ListArg result;
        public ArgContext p_2_1;
        public ArgContext p_3_1;
        public ListArgContext p_3_3;

        public ListArgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ArgContext arg() {
            return getRuleContext(ArgContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_2() {
            return getToken(latteParser.Surrogate_id_SYMB_2, 0);
        }

        public ListArgContext listArg() {
            return getRuleContext(ListArgContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listArg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListArg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListArg(this);
        }
    }

    public static class ClsBlockContext extends ParserRuleContext {
        public latte.Absyn.ClsBlock result;
        public ListClsDefContext p_1_2;

        public ClsBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_3() {
            return getToken(latteParser.Surrogate_id_SYMB_3, 0);
        }

        public TerminalNode Surrogate_id_SYMB_4() {
            return getToken(latteParser.Surrogate_id_SYMB_4, 0);
        }

        public ListClsDefContext listClsDef() {
            return getRuleContext(ListClsDefContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_clsBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterClsBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitClsBlock(this);
        }
    }

    public static class ListClsDefContext extends ParserRuleContext {
        public latte.Absyn.ListClsDef result;
        public ListClsDefContext p_2_1;
        public ClsDefContext p_2_2;

        public ListClsDefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ListClsDefContext listClsDef() {
            return getRuleContext(ListClsDefContext.class, 0);
        }

        public ClsDefContext clsDef() {
            return getRuleContext(ClsDefContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listClsDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListClsDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListClsDef(this);
        }
    }

    public static class ClsDefContext extends ParserRuleContext {
        public latte.Absyn.ClsDef result;
        public ClsAttrContext p_1_1;
        public ClsMethodContext p_2_1;

        public ClsDefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ClsAttrContext clsAttr() {
            return getRuleContext(ClsAttrContext.class, 0);
        }

        public ClsMethodContext clsMethod() {
            return getRuleContext(ClsMethodContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_clsDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterClsDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitClsDef(this);
        }
    }

    public static class ClsMethodContext extends ParserRuleContext {
        public latte.Absyn.ClsMethod result;
        public FunctContext p_1_1;

        public ClsMethodContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctContext funct() {
            return getRuleContext(FunctContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_clsMethod;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterClsMethod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitClsMethod(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public latte.Absyn.Block result;
        public ListStmtContext p_1_2;

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_3() {
            return getToken(latteParser.Surrogate_id_SYMB_3, 0);
        }

        public TerminalNode Surrogate_id_SYMB_4() {
            return getToken(latteParser.Surrogate_id_SYMB_4, 0);
        }

        public ListStmtContext listStmt() {
            return getRuleContext(ListStmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitBlock(this);
        }
    }

    public static class ListStmtContext extends ParserRuleContext {
        public latte.Absyn.ListStmt result;
        public ListStmtContext p_2_1;
        public StmtContext p_2_2;

        public ListStmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ListStmtContext listStmt() {
            return getRuleContext(ListStmtContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listStmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListStmt(this);
        }
    }

    public static class ListItemContext extends ParserRuleContext {
        public latte.Absyn.ListItem result;
        public ItemContext p_1_1;
        public ItemContext p_2_1;
        public ListItemContext p_2_3;

        public ListItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ItemContext item() {
            return getRuleContext(ItemContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_2() {
            return getToken(latteParser.Surrogate_id_SYMB_2, 0);
        }

        public ListItemContext listItem() {
            return getRuleContext(ListItemContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListItem(this);
        }
    }

    public static class PrimitiveTypeContext extends ParserRuleContext {
        public latte.Absyn.PrimitiveType result;

        public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_35() {
            return getToken(latteParser.Surrogate_id_SYMB_35, 0);
        }

        public TerminalNode Surrogate_id_SYMB_38() {
            return getToken(latteParser.Surrogate_id_SYMB_38, 0);
        }

        public TerminalNode Surrogate_id_SYMB_28() {
            return getToken(latteParser.Surrogate_id_SYMB_28, 0);
        }

        public TerminalNode Surrogate_id_SYMB_40() {
            return getToken(latteParser.Surrogate_id_SYMB_40, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primitiveType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterPrimitiveType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitPrimitiveType(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public latte.Absyn.Type result;
        public TypeContext p_1_1;
        public PrimitiveTypeContext p_2_1;
        public ClassTypeContext p_3_1;

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public ClassTypeContext classType() {
            return getRuleContext(ClassTypeContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_13() {
            return getToken(latteParser.Surrogate_id_SYMB_13, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitType(this);
        }
    }

    public static class ListTypeContext extends ParserRuleContext {
        public latte.Absyn.ListType result;
        public TypeContext p_2_1;
        public TypeContext p_3_1;
        public ListTypeContext p_3_3;

        public ListTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_2() {
            return getToken(latteParser.Surrogate_id_SYMB_2, 0);
        }

        public ListTypeContext listType() {
            return getRuleContext(ListTypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListType(this);
        }
    }

    public static class Expr5Context extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr6Context p_1_2;
        public Expr6Context p_2_2;
        public Expr6Context p_3_1;

        public Expr5Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_14() {
            return getToken(latteParser.Surrogate_id_SYMB_14, 0);
        }

        public Expr6Context expr6() {
            return getRuleContext(Expr6Context.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_15() {
            return getToken(latteParser.Surrogate_id_SYMB_15, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr5;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr5(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr5(this);
        }
    }

    public static class Expr4Context extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr4Context p_1_1;
        public Expr5Context p_2_1;
        public MulOpContext p_1_2;
        public Expr5Context p_1_3;

        public Expr4Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Expr5Context expr5() {
            return getRuleContext(Expr5Context.class, 0);
        }

        public Expr4Context expr4() {
            return getRuleContext(Expr4Context.class, 0);
        }

        public MulOpContext mulOp() {
            return getRuleContext(MulOpContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr4;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr4(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr4(this);
        }
    }

    public static class Expr3Context extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr3Context p_1_1;
        public Expr4Context p_2_1;
        public AddOpContext p_1_2;
        public Expr4Context p_1_3;

        public Expr3Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Expr4Context expr4() {
            return getRuleContext(Expr4Context.class, 0);
        }

        public Expr3Context expr3() {
            return getRuleContext(Expr3Context.class, 0);
        }

        public AddOpContext addOp() {
            return getRuleContext(AddOpContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr3;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr3(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr3(this);
        }
    }

    public static class Expr2Context extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr2Context p_1_1;
        public Expr3Context p_2_1;
        public RelOpContext p_1_2;
        public Expr3Context p_1_3;

        public Expr2Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Expr3Context expr3() {
            return getRuleContext(Expr3Context.class, 0);
        }

        public Expr2Context expr2() {
            return getRuleContext(Expr2Context.class, 0);
        }

        public RelOpContext relOp() {
            return getRuleContext(RelOpContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr2;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr2(this);
        }
    }

    public static class IdentPContext extends ParserRuleContext {
        public latte.Absyn.IdentP result;
        public Token p_1_1;

        public IdentPContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENT() {
            return getToken(latteParser.IDENT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identP;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterIdentP(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitIdentP(this);
        }
    }

    public static class Expr1Context extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr2Context p_1_1;
        public Expr1Context p_1_3;
        public Expr2Context p_2_1;

        public Expr1Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_16() {
            return getToken(latteParser.Surrogate_id_SYMB_16, 0);
        }

        public Expr2Context expr2() {
            return getRuleContext(Expr2Context.class, 0);
        }

        public Expr1Context expr1() {
            return getRuleContext(Expr1Context.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr1;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr1(this);
        }
    }

    public static class FunctContext extends ParserRuleContext {
        public latte.Absyn.Funct result;
        public TypeContext p_1_1;
        public IdentPContext p_1_2;
        public ListArgContext p_1_4;
        public BlockContext p_1_6;

        public FunctContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_0() {
            return getToken(latteParser.Surrogate_id_SYMB_0, 0);
        }

        public TerminalNode Surrogate_id_SYMB_1() {
            return getToken(latteParser.Surrogate_id_SYMB_1, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        public ListArgContext listArg() {
            return getRuleContext(ListArgContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funct;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterFunct(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitFunct(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr1Context p_1_1;
        public ExprContext p_1_3;
        public Expr1Context p_2_1;

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_17() {
            return getToken(latteParser.Surrogate_id_SYMB_17, 0);
        }

        public Expr1Context expr1() {
            return getRuleContext(Expr1Context.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr(this);
        }
    }

    public static class TopDefContext extends ParserRuleContext {
        public latte.Absyn.TopDef result;
        public FunctContext p_1_1;
        public IdentPContext p_2_2;
        public ClsBlockContext p_2_3;
        public IdentPContext p_3_2;
        public IdentPContext p_3_4;
        public ClsBlockContext p_3_5;

        public TopDefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctContext funct() {
            return getRuleContext(FunctContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_29() {
            return getToken(latteParser.Surrogate_id_SYMB_29, 0);
        }

        public List<IdentPContext> identP() {
            return getRuleContexts(IdentPContext.class);
        }

        public IdentPContext identP(int i) {
            return getRuleContext(IdentPContext.class, i);
        }

        public ClsBlockContext clsBlock() {
            return getRuleContext(ClsBlockContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_31() {
            return getToken(latteParser.Surrogate_id_SYMB_31, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_topDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterTopDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitTopDef(this);
        }
    }

    public static class ListExprContext extends ParserRuleContext {
        public latte.Absyn.ListExpr result;
        public ExprContext p_2_1;
        public ExprContext p_3_1;
        public ListExprContext p_3_3;

        public ListExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_2() {
            return getToken(latteParser.Surrogate_id_SYMB_2, 0);
        }

        public ListExprContext listExpr() {
            return getRuleContext(ListExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterListExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitListExpr(this);
        }
    }

    public static class ArgContext extends ParserRuleContext {
        public latte.Absyn.Arg result;
        public TypeContext p_1_1;
        public IdentPContext p_1_2;

        public ArgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterArg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitArg(this);
        }
    }

    public static class AddOpContext extends ParserRuleContext {
        public latte.Absyn.AddOp result;

        public AddOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_18() {
            return getToken(latteParser.Surrogate_id_SYMB_18, 0);
        }

        public TerminalNode Surrogate_id_SYMB_14() {
            return getToken(latteParser.Surrogate_id_SYMB_14, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_addOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterAddOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitAddOp(this);
        }
    }

    public static class ClsAttrContext extends ParserRuleContext {
        public latte.Absyn.ClsAttr result;
        public TypeContext p_1_1;
        public IdentPContext p_1_2;

        public ClsAttrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_5() {
            return getToken(latteParser.Surrogate_id_SYMB_5, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_clsAttr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterClsAttr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitClsAttr(this);
        }
    }

    public static class MulOpContext extends ParserRuleContext {
        public latte.Absyn.MulOp result;

        public MulOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_19() {
            return getToken(latteParser.Surrogate_id_SYMB_19, 0);
        }

        public TerminalNode Surrogate_id_SYMB_20() {
            return getToken(latteParser.Surrogate_id_SYMB_20, 0);
        }

        public TerminalNode Surrogate_id_SYMB_21() {
            return getToken(latteParser.Surrogate_id_SYMB_21, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mulOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterMulOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitMulOp(this);
        }
    }

    public static class StmtContext extends ParserRuleContext {
        public latte.Absyn.Stmt result;
        public BlockContext p_2_1;
        public TypeContext p_3_1;
        public ListItemContext p_3_2;
        public IdentPContext p_4_1;
        public ExprContext p_4_3;
        public IdentPContext p_5_1;
        public ExprContext p_5_3;
        public ExprContext p_5_6;
        public Expr6Context p_6_1;
        public IdentPContext p_6_3;
        public ExprContext p_6_5;
        public IdentPContext p_7_1;
        public IdentPContext p_8_1;
        public ExprContext p_9_2;
        public ExprContext p_11_3;
        public StmtContext p_11_5;
        public ExprContext p_12_3;
        public StmtContext p_12_5;
        public StmtContext p_12_7;
        public ExprContext p_13_3;
        public StmtContext p_13_5;
        public ArgContext p_14_3;
        public ExprContext p_14_5;
        public StmtContext p_14_7;
        public ExprContext p_15_1;

        public StmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_5() {
            return getToken(latteParser.Surrogate_id_SYMB_5, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public ListItemContext listItem() {
            return getRuleContext(ListItemContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_6() {
            return getToken(latteParser.Surrogate_id_SYMB_6, 0);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode Surrogate_id_SYMB_7() {
            return getToken(latteParser.Surrogate_id_SYMB_7, 0);
        }

        public TerminalNode Surrogate_id_SYMB_8() {
            return getToken(latteParser.Surrogate_id_SYMB_8, 0);
        }

        public TerminalNode Surrogate_id_SYMB_9() {
            return getToken(latteParser.Surrogate_id_SYMB_9, 0);
        }

        public Expr6Context expr6() {
            return getRuleContext(Expr6Context.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_10() {
            return getToken(latteParser.Surrogate_id_SYMB_10, 0);
        }

        public TerminalNode Surrogate_id_SYMB_11() {
            return getToken(latteParser.Surrogate_id_SYMB_11, 0);
        }

        public TerminalNode Surrogate_id_SYMB_37() {
            return getToken(latteParser.Surrogate_id_SYMB_37, 0);
        }

        public TerminalNode Surrogate_id_SYMB_34() {
            return getToken(latteParser.Surrogate_id_SYMB_34, 0);
        }

        public TerminalNode Surrogate_id_SYMB_0() {
            return getToken(latteParser.Surrogate_id_SYMB_0, 0);
        }

        public TerminalNode Surrogate_id_SYMB_1() {
            return getToken(latteParser.Surrogate_id_SYMB_1, 0);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        public TerminalNode Surrogate_id_SYMB_30() {
            return getToken(latteParser.Surrogate_id_SYMB_30, 0);
        }

        public TerminalNode Surrogate_id_SYMB_41() {
            return getToken(latteParser.Surrogate_id_SYMB_41, 0);
        }

        public TerminalNode Surrogate_id_SYMB_33() {
            return getToken(latteParser.Surrogate_id_SYMB_33, 0);
        }

        public TerminalNode Surrogate_id_SYMB_12() {
            return getToken(latteParser.Surrogate_id_SYMB_12, 0);
        }

        public ArgContext arg() {
            return getRuleContext(ArgContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitStmt(this);
        }
    }

    public static class RelOpContext extends ParserRuleContext {
        public latte.Absyn.RelOp result;

        public RelOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_22() {
            return getToken(latteParser.Surrogate_id_SYMB_22, 0);
        }

        public TerminalNode Surrogate_id_SYMB_23() {
            return getToken(latteParser.Surrogate_id_SYMB_23, 0);
        }

        public TerminalNode Surrogate_id_SYMB_24() {
            return getToken(latteParser.Surrogate_id_SYMB_24, 0);
        }

        public TerminalNode Surrogate_id_SYMB_25() {
            return getToken(latteParser.Surrogate_id_SYMB_25, 0);
        }

        public TerminalNode Surrogate_id_SYMB_26() {
            return getToken(latteParser.Surrogate_id_SYMB_26, 0);
        }

        public TerminalNode Surrogate_id_SYMB_27() {
            return getToken(latteParser.Surrogate_id_SYMB_27, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterRelOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitRelOp(this);
        }
    }

    public static class ItemContext extends ParserRuleContext {
        public latte.Absyn.Item result;
        public IdentPContext p_1_1;
        public IdentPContext p_2_1;
        public ExprContext p_2_3;

        public ItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        public TerminalNode Surrogate_id_SYMB_6() {
            return getToken(latteParser.Surrogate_id_SYMB_6, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitItem(this);
        }
    }

    public static class ClassTypeContext extends ParserRuleContext {
        public latte.Absyn.ClassType result;
        public IdentPContext p_1_1;

        public ClassTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterClassType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitClassType(this);
        }
    }

    public static class Expr6Context extends ParserRuleContext {
        public latte.Absyn.Expr result;
        public Expr6Context p_8_1;
        public Expr6Context p_9_1;
        public TypeContext p_1_2;
        public ExprContext p_1_4;
        public IdentPContext p_2_2;
        public IdentPContext p_3_1;
        public IdentPContext p_4_1;
        public ExprContext p_4_3;
        public Token p_5_1;
        public IdentPContext p_10_1;
        public ListExprContext p_10_3;
        public TypeContext p_11_2;
        public Expr6Context p_11_4;
        public Token p_12_1;
        public ExprContext p_13_2;
        public IdentPContext p_8_3;
        public IdentPContext p_9_3;
        public ListExprContext p_9_5;

        public Expr6Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Surrogate_id_SYMB_36() {
            return getToken(latteParser.Surrogate_id_SYMB_36, 0);
        }

        public TerminalNode Surrogate_id_SYMB_7() {
            return getToken(latteParser.Surrogate_id_SYMB_7, 0);
        }

        public TerminalNode Surrogate_id_SYMB_8() {
            return getToken(latteParser.Surrogate_id_SYMB_8, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public IdentPContext identP() {
            return getRuleContext(IdentPContext.class, 0);
        }

        public TerminalNode INTEGER() {
            return getToken(latteParser.INTEGER, 0);
        }

        public TerminalNode Surrogate_id_SYMB_39() {
            return getToken(latteParser.Surrogate_id_SYMB_39, 0);
        }

        public TerminalNode Surrogate_id_SYMB_32() {
            return getToken(latteParser.Surrogate_id_SYMB_32, 0);
        }

        public TerminalNode Surrogate_id_SYMB_0() {
            return getToken(latteParser.Surrogate_id_SYMB_0, 0);
        }

        public TerminalNode Surrogate_id_SYMB_1() {
            return getToken(latteParser.Surrogate_id_SYMB_1, 0);
        }

        public ListExprContext listExpr() {
            return getRuleContext(ListExprContext.class, 0);
        }

        public Expr6Context expr6() {
            return getRuleContext(Expr6Context.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(latteParser.STRING, 0);
        }

        public TerminalNode Surrogate_id_SYMB_9() {
            return getToken(latteParser.Surrogate_id_SYMB_9, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr6;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).enterExpr6(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof latteParserListener)
                ((latteParserListener) listener).exitExpr6(this);
        }
    }
}