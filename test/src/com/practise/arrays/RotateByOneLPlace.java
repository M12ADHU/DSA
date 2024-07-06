package com.practise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateByOneLPlace {
    // input=[1,2,3,4] output[2,3,4,1]
    public static int[] leftRotate(int[] arr, int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]=temp;
        //return arr[];
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        int n= arr.length;
        for(int i=0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(leftRotate(arr,n)));
    }
}
