package org.example.lexer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Types {
    public static final Map<String, Type> REGEXES = new LinkedHashMap<>();
    private static void putTypeToMap(Type word){
        REGEXES.put(word.getRegex(), word);
    }

    public static final Type MAIN = new Type("main", "glavna");

    public static final Type ASSIGN = new Type("assign", "\\=");
    public static final Type SEMICOLON = new Type("semicolon", "\\;");

    public static final Type NAME = new Type("name", "[a-zA-Z_][a-zA-Z0-9_]*");

    public static final Type IF = new Type("if", "ako");
    public static final Type ELSE_IF = new Type("else_if", "osim-ako");
    public static final Type ELSE = new Type("else", "onda");
    public static final Type FOR = new Type("for", "za");
    public static final Type WHILE = new Type("while", "dok");
    public static final Type DO = new Type("do", "radi");
    public static final Type SWITCH = new Type("switch", "prekidac");

    public static final Type SCAN = new Type("scan", "ucitaj");
    public static final Type SCAN_ASSIGN = new Type("scan_assign", "\\>\\>");
    public static final Type PRINT = new Type("print", "stampaj");
    public static final Type PRINT_ASSIGN = new Type("print_assign", "\\<\\<");

    public static final Type INT_TYPE = new Type("int_type", "br");
    public static final Type INT = new Type("int", "[+-]?([1-9][0-9]*|0)");
    public static final Type DOUBLE_TYPE = new Type("double_type", "dec");
    public static final Type DOUBLE = new Type("double", "[+-]?(0|[1-9][0-9]*)\\.[0-9]+");
    public static final Type CHAR_TYPE = new Type("char_type", "karakter");
    public static final Type CHAR = new Type("char", "\\'.\\'");
    public static final Type STRING_TYPE = new Type("string_type", "string");
    public static final Type STRING = new Type("string", "\\\".*\\\"");
    public static final Type BOOLEAN_TYPE = new Type("boolean_type", "logika");
    public static final Type BOOLEAN = new Type("boolean", "tacno|netacno");
    public static final Type ARRAY = new Type("array", "(" + INT_TYPE.getRegex() + "|" +
            DOUBLE_TYPE.getRegex() + "|" + STRING_TYPE.getRegex() + "|" + CHAR_TYPE.getRegex() + "|" + BOOLEAN_TYPE.getRegex() + ")\\<\\>");
    public static final Type SET = new Type("set", "(" + INT_TYPE.getRegex() + "|" +
            DOUBLE_TYPE.getRegex() + "|" + STRING_TYPE.getRegex() + "|" + CHAR_TYPE.getRegex() + "|" + BOOLEAN_TYPE.getRegex() + ")\\<set\\>");

    public static final Type ELEMENTS = new Type("elements", "\\{.*\\}");
    public static final Type ELEMENT = new Type("element", NAME.getRegex() + "\\[(" + INT.getRegex() + "|" + NAME.getRegex() + ")\\]");
    public static final Type ADD = new Type("add", NAME.getRegex() + "\\.dodaj\\(" + NAME.getRegex() + "\\)");
    public static final Type DELETE = new Type("delete", NAME.getRegex() + "\\.obrisi\\(" + NAME.getRegex() + "\\)");
    public static final Type SIZE = new Type("size", NAME.getRegex() + "\\.duzina\\(\\)");
    public static final Type SORT = new Type("sort", NAME.getRegex() + "\\.sortiraj\\(\\)");
    public static final Type DESC = new Type("sort_desc", NAME.getRegex() + "\\.sortiraj\\(-1\\)");

    public static final Type PLUS = new Type("plus", "\\+");
    public static final Type MINUS = new Type("minus", "\\-");
    public static final Type TIMES = new Type("times", "\\*");
    public static final Type DIV = new Type("div", "/");
    public static final Type MOD = new Type("mod", "\\%");
    public static final Type PLUS_PLUS = new Type("plus_plus", "\\+\\+");
    public static final Type MINUS_MINUS = new Type("minus_minus", "\\-\\-");
    public static final Type EXP = new Type("exp", "\\*\\*");

    public static final Type EQUALS = new Type("equals", "\\=\\=");
    public static final Type NOT_EQUALS = new Type("not_equals", "\\!\\=");
    public static final Type LESS_THAN = new Type("less_than", "\\<");
    public static final Type LESS_OR_EQUALS = new Type("less_or_equals", "\\<\\=");
    public static final Type GREATER_THAN = new Type("greater_than", "\\>");
    public static final Type GREATER_OR_EQUALS = new Type("greater_or_equals", "\\>\\=");

    public static final Type AND = new Type("and", "i");
    public static final Type OR = new Type("or", "ili");
    public static final Type NOT = new Type("not", "ne");

    public static final Type RETURN = new Type("return", "vrati");
    public static final Type CONTINUE = new Type("continue", "nastavi");
    public static final Type BREAK = new Type("break", "zaustavi");
    public static final Type CASE = new Type("case", "slucaj");
    public static final Type DEFAULT = new Type("default_case", "opsti");

    public static final Type OPEN_BRACKET = new Type("open_bracket", "\\(");
    public static final Type CLOSED_BRACKET = new Type("closed_bracket", "\\)");
    public static final Type OPEN_BLOCK = new Type("open_block", "\\.\\_");
    public static final Type CLOSED_BLOCK = new Type("closed_block", "\\_\\.");

    static{
        putTypeToMap(MAIN);

        putTypeToMap(IF);
        putTypeToMap(ELSE_IF);
        putTypeToMap(ELSE);
        putTypeToMap(FOR);
        putTypeToMap(WHILE);
        putTypeToMap(DO);
        putTypeToMap(SWITCH);

        putTypeToMap(SCAN);
        putTypeToMap(SCAN_ASSIGN);
        putTypeToMap(PRINT);
        putTypeToMap(PRINT_ASSIGN);

        putTypeToMap(INT_TYPE);
        putTypeToMap(DOUBLE_TYPE);
        putTypeToMap(CHAR_TYPE);
        putTypeToMap(STRING_TYPE);
        putTypeToMap(BOOLEAN_TYPE);
        putTypeToMap(ARRAY);
        putTypeToMap(SET);

        putTypeToMap(ELEMENTS);
        putTypeToMap(ELEMENT);
        putTypeToMap(ADD);
        putTypeToMap(DELETE);
        putTypeToMap(SIZE);
        putTypeToMap(SORT);
        putTypeToMap(DESC);

        putTypeToMap(OPEN_BLOCK);
        putTypeToMap(CLOSED_BLOCK);
        putTypeToMap(OPEN_BRACKET);
        putTypeToMap(CLOSED_BRACKET);

        putTypeToMap(PLUS);
        putTypeToMap(MINUS);
        putTypeToMap(TIMES);
        putTypeToMap(DIV);
        putTypeToMap(MOD);
        putTypeToMap(PLUS_PLUS);
        putTypeToMap(MINUS_MINUS);
        putTypeToMap(EXP);

        putTypeToMap(ASSIGN);
        putTypeToMap(SEMICOLON);

        putTypeToMap(EQUALS);
        putTypeToMap(NOT_EQUALS);
        putTypeToMap(LESS_THAN);
        putTypeToMap(LESS_OR_EQUALS);
        putTypeToMap(GREATER_THAN);
        putTypeToMap(GREATER_OR_EQUALS);

        putTypeToMap(AND);
        putTypeToMap(OR);
        putTypeToMap(NOT);

        putTypeToMap(RETURN);
        putTypeToMap(CONTINUE);
        putTypeToMap(BREAK);
        putTypeToMap(CASE);
        putTypeToMap(DEFAULT);

        putTypeToMap(INT);
        putTypeToMap(DOUBLE);
        putTypeToMap(CHAR);
        putTypeToMap(STRING);
        putTypeToMap(BOOLEAN);

        putTypeToMap(NAME);
    }

    private Types(){

    }

}
