package com.practise.sort;

import java.util.Scanner;

public class Selectionsort {
    //choose minimum number and swap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

       // selection(arr);
        //BubbleSort(arr);
        insertionSort(arr);
    }

    /*private static void swap(int[] arr,int i, int i1) {
        int temp = arr[i1];
        arr[i1]= arr[i];
        arr[i] = temp;
    }*/
    public static void selection(int[] arr){
        for(int i = 0; i<= arr.length-2; i++){
            int min=i;
            for(int j=i+1;j<= arr.length-1;j++){

                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println("After selection sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //first chooses the max values from the array and place at last index of the array
    public static void BubbleSort(int[] arr){
        for(int i=arr.length-1;i>=1;i--){
            int didSwap =0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
            System.out.println("count");
        }
        System.out.println("After BubbleSort:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] =temp;
                j--;
            }
        }
        for(int i =0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
