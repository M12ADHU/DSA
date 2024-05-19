package com.practise.cases;

import java.util.Arrays;

public class Greet {
    public static void main(String[] args) {
        //String hi = myGreet();
        //System.out.println(hi);
       swa();
       name(1,3,4,5,6,7,87);

    }
    static String myGreet(){
        return "hey" ;
    }

    static void swa(){
        int a=10;
        int b=20;
        int  temp= a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }
//variable length arguments
    static void name(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
