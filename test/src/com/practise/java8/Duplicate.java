package com.practise.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,3,5,6,2,80,90,80);
        Set<Integer> uniqueElemets = new HashSet<>();
        //uniqueElements
       // list.stream().filter(x -> uniqueElemets.add(x)).forEach(System.out::println);
        //only duplicate
        list.stream().filter(x->!uniqueElemets.add(x)).distinct().forEach(System.out::println);
    }
}
