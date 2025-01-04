package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args){
    List<Integer> num = Arrays.asList(1,2,3,5,4,6,7);
    Map<Boolean,Integer> sumCount = num.stream().collect(Collectors.partitioningBy(n->n%2==0, Collectors.summingInt(Integer::intValue)));
    int oddSum = sumCount.get(false);
    int evenSum = sumCount.get(true);
    System.out.println("Odd Sum"+oddSum);
    System.out.println("Even Sum"+evenSum);
}}
