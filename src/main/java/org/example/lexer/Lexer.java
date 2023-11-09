package org.example.lexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lexer {

    private static Lexer lexer;

    public static Lexer getLexer(){
        if(lexer == null){
            synchronized (Lexer.class){
                if(lexer == null)
                    lexer = new Lexer();
            }
        }
        return lexer;
    }

    private Lexer(){

    }

    public List<Token> lex(String code){
        List<Token> tokens = new ArrayList<>();
        String[] codeSplitted = code.split(" ");
        for(String word : codeSplitted){
            Type type = null;
            for(Map.Entry<String, Type> map : Types.REGEXES.entrySet()){
                if(word.matches(map.getKey())){
                    type = map.getValue();
                    break;
                }
            }
            if(type == null)
                throw new LexerException(word);
            Token t = new Token(word, type);
            tokens.add(t);
        }
        return tokens;
    }
}
