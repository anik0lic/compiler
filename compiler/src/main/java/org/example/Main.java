package org.example;

import org.example.lexer.Lexer;
import org.example.lexer.Token;
import org.example.loader.FileLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String code = FileLoader.getFileLoader().load("program05.an");
        System.out.println(code);

        List<Token> tokens = Lexer.getLexer().lex(code);
        for(Token t : tokens){
            System.out.println(t);
        }
    }
}