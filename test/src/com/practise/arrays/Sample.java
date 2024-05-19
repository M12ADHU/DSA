package com.practise.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //arr[i]= sc.nextInt();
        /*arr[0] =1;
        arr[1] =2;
        arr[3] =3;
        System.out.println(arr[3]);*/


        /*for(int i =0;i<5;i++){
            arr[i]= sc.nextInt();
           // System.out.print(arr[i]);
        }
        System.out.print(Arrays.toString(arr));*/

        // array of objects
        String[] str = new String[5];
        for(int i=0; i< str.length;i++) {
            str[i] = sc.nextLine();
        }
        str[2] = "hey";
        System.out.println(Arrays.toString(str));
    }
}
