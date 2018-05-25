package c2j;

import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;

//Java vocabulary
public class J {
    public static final int
            ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, CATCH = 7, CHAR = 8,
            CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, DO = 13, DOUBLE = 14, ELSE = 15,
            ENUM = 16, EXTENDS = 17, FINAL = 18, FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23,
            IMPLEMENTS = 24, IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29,
            NATIVE = 30, NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36,
            SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42,
            THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, VOLATILE = 49,
            WHILE = 50, IntegerLiteral = 51, FloatingPointLiteral = 52, BooleanLiteral = 53,
            CharacterLiteral = 54, StringLiteral = 55, NullLiteral = 56, LPAREN = 57, RPAREN = 58,
            LBRACE = 59, RBRACE = 60, LBRACK = 61, RBRACK = 62, SEMI = 63, COMMA = 64, DOT = 65,
            ASSIGN = 66, GT = 67, LT = 68, BANG = 69, TILDE = 70, QUESTION = 71, COLON = 72, EQUAL = 73,
            LE = 74, GE = 75, NOTEQUAL = 76, AND = 77, OR = 78, INC = 79, DEC = 80, ADD = 81, SUB = 82,
            MUL = 83, DIV = 84, BITAND = 85, BITOR = 86, CARET = 87, MOD = 88, ARROW = 89, COLONCOLON = 90,
            ADD_ASSIGN = 91, SUB_ASSIGN = 92, MUL_ASSIGN = 93, DIV_ASSIGN = 94, AND_ASSIGN = 95,
            OR_ASSIGN = 96, XOR_ASSIGN = 97, MOD_ASSIGN = 98, LSHIFT_ASSIGN = 99, RSHIFT_ASSIGN = 100,
            URSHIFT_ASSIGN = 101, Identifier = 102, AT = 103, ELLIPSIS = 104, WS = 105, COMMENT = 106,
            LINE_COMMENT = 107;

    private static final String[] _LITERAL_NAMES = {
            null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
            "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
            "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
            "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
            "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
            "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
            "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
            "'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null,
            null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'",
            "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
            "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'",
            "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='",
            "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='",
            "'>>>='", null, "'@'", "'...'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
            "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
            "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE",
            "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
            "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
            "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral",
            "BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral",
            "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA",
            "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL",
            "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL",
            "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN",
            "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN",
            "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier",
            "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
}
