package org.example.lexer;

public class Token {
    private final String word;
    private final Type type;

    public Token(String word, Type type) {
        this.word = word;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Word: " + word + "\nType: " + type.getWordTypeName() + "\nRegex: " + type.getRegex() + "\n\n";
    }

    public String getWord() {
        return word;
    }

    public Type getType() {
        return type;
    }
}
