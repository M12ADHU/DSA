package com.practise;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        int n=7;
        int a = 0;
        int b = 1;
        int cou = 2;
        while(cou <= n){
           int  temp=b;
            b=b+a;
            a=temp;
            cou++;
        }
        System.out.println(b);



    }
}
