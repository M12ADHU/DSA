package com.practise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDulicatesfromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
        System.out.println(duplicates(arrSize,arr));
    }
    public static int duplicates(int n,int[] arr){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;

    }

}
