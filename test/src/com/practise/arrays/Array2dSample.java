package com.practise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2dSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        /*for(int row= 0; row< arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }*/
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        //output
        for(int row= 0; row< arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
        }
            System.out.println();
      System.out.println(Arrays.toString(arr[row]));}
    }
}
