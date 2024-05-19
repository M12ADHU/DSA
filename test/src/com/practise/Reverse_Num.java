package com.practise;

public class Reverse_Num {
    public static void main(String[] args) {
        int n=89034;
        int result=0;
        while(n>0){
            int rem = n%10;
            result = result*10+rem;
            n=n/10;
        }
        System.out.println(result);
    }
}
