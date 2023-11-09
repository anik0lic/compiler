package org.example.lexer;

public class LexerException extends RuntimeException{

    public LexerException(String word) {
        super("The word " + word + " doesn't belong to any type");
    }
}
