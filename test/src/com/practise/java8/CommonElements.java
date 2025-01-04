package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElements {
    public static void reverseElements(int[] arr){
        IntStream.range(0,arr.length/2).forEach(i->{
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        });
        System.out.println("Reversed Arrays: "+ Arrays.toString(arr));
    }
    //length of longeststring from arr[]
    public static void longestString(String[] string){
        Optional<String> str  = Optional.of(Arrays.stream(string).max(String::compareTo).orElse("no value"));
        int largeString =Arrays.stream(string).mapToInt(strig-> strig.length()).max().orElse(0);
        System.out.println("Longest String : "+largeString);
        System.out.println("lrgest string name: "+ str);

    }

    //common elements in 2 strings
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        List<Integer> common =Arrays.stream(arr1).filter(number-> Arrays.stream(arr2).anyMatch(arr2Num-> arr2Num == number)).boxed().collect(Collectors.toList());
        System.out.println(common);
        int[] arr ={1,2,3,4,5};
        reverseElements(arr);
        String[] arrays = {"apple","mango", "Avacado","pineapple"};
        List<String> a1 =Arrays.stream(arrays).filter(a-> a.startsWith("a")).collect(Collectors.toList());
        System.out.println(a1);
        longestString(arrays);
    }
}
