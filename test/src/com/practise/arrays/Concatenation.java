package com.practise.arrays;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int[] arr = new int[2* num.length];
        for(int i=0;i< num.length;i++){
            arr[i]= num[i];
            arr[i+ num.length] = num[i];
        }
        System.out.println(Arrays.toString(arr));

    }}
