package com.practise.cases;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(primeNumbers(n));
        System.out.println(armstrongNumber(n));

    }
    static boolean armstrongNumber(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n %10;
            int cube = rem*rem*rem;
            sum+=cube;
            n=n/10;
    }
        if(original == sum){
            return true;
        }
        return false;
    }

    static boolean primeNumbers(int n){
       int c=2;
       if(n<=1) return false;
       while(c*c<=n){
           if(n%c ==0 ) {
               return false;
           }
       c++;}
       return true;

    }
}
