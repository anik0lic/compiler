package org.example.lexer;

public class Type {
    private final String wordTypeName;
    private final String regex;

    public Type(String wordTypeName, String regex) {
        this.wordTypeName = wordTypeName;
        this.regex = regex;
    }

    public String getWordTypeName() {
        return wordTypeName;
    }

    public String getRegex() {
        return regex;
    }
}
