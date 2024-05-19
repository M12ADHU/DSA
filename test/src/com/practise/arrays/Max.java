package com.practise.arrays;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {41,42,36,4,5,6};
        /*for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }*/
       // System.out.println(maxRange(arr));
        System.out.println(max(arr));
    }
//with indexes
    public static int  maxRange(int[] arr){
        int start=2;
        int end=4;
        int largeNumber = arr[start];
        if(start>end){
            return -1;
        }
        if (arr != null) {
            for (int i = start; i <= end; i++) {
                if (arr[i] > largeNumber) {
                    largeNumber = arr[i];
                }
            }
            return largeNumber;
        } else {
            return -1;

        }
    }

    private static int max(int[] arr) {
        int large= arr[0];
        int secondlarge = arr[0];
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>large ) {
                large = arr[i];
            }
        }
        for(int i=0;i< arr.length;i++){
            if(large!= arr[i] && secondlarge<arr[i]) {
                secondlarge = arr[i];
            }
        }
        return secondlarge;
    }
}
