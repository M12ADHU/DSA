package com.practise;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char ch = sc.next().trim().charAt(1);
       // System.out.println(sc.nextLine().trim().charAt(9));
        System.out.println("Enter the operation");
        char op = sc.next().trim().charAt(0);
        int res =0;
        while(true){
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                System.out.println("Enter the numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    res = num1+num2;
                }
                if(op == '-'){
                    res = num1-num2;
                }
                if(op == '*'){
                    res = num1*num2;
                }
                if(op == '/'){
                    res = num1/num2;
                }
                if(op == '%'){
                    res = num1%num2;
                }}

            else if(op == 'x' || op == 'X'){
                    break;
                }
            else{
                    System.out.println("Invalid Operation");
                    break;
                }

            System.out.println(res);

        }
        System.out.println(res);



    }
}
