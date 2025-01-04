package com.practise.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

//i/p : hi Code Decode code decode welcomes you
//o/p hi= 1,code =2, decode=2, welcomes =1,you =1
public class CountOfWords {
    public static void main(String[] args) {
        String s ="hi code decode code decode welcomes you decode";
       List<String> words = Arrays.asList(s.split("  "));
       //[hi, code, decode, code, decode, welcomes, you]
       System.out.println(words);
       //words and count/frequency {hi=1, welcomes=1, code=2, decode=2, you=1}
        Map<String, Long> count =words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
        //based on frequency(value) return key [code, decode]
        List<String> key =count.entrySet().stream().filter(entry -> entry.getValue()>1).map(entry-> entry.getKey()).collect(Collectors.toList());
        System.out.println(key);
        Set< String> count1=words.stream().filter(i->Collections.frequency(words, i)>1).collect(Collectors.toSet());//tolist->[code, decode, code, decode, decode]
        System.out.println(count1);




    }
}
