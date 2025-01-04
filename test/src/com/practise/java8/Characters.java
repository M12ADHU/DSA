package com.practise.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Characters {
    //frequency of charater
    public static void characterFrequency(){
        String word = "Hi Code Decode";
        Map<Character, Long> ch = word.chars().mapToObj(c->(char)c).filter(c-> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity()
                , LinkedHashMap:: new,Collectors.counting()));
        System.out.println(ch);
        System.out.println(ch.entrySet().stream().filter(entry-> entry.getValue() ==1).map(entry-> entry.getKey()).findFirst());
        /*{H=1, i=1, C=1, o=2, d=2, e=3, D=1, c=1}
        Optional[H]*/
    }

    public static void main(String[] args) {
        characterFrequency();

    }
}
