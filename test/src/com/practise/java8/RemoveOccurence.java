package com.practise.java8;

import java.util.stream.Collectors;

public class RemoveOccurence {
    public static void main(String[] args){
        String word = "Hi Code Decode";
        char ch = 'o';
        System.out.println(word.chars().filter(c->c !=ch).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining()));
        String wod = "Hi@Code #Decode !";
        System.out.println(wod.chars().filter(c->  !Character.isLetterOrDigit(c)).mapToObj(c-> String.valueOf((char)c)).collect(Collectors.toList()));
    }
}
