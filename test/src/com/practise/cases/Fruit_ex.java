package com.practise.cases;

import java.util.Scanner;

public class Fruit_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "Mango":
            {
                System.out.println("Good fruit");
            break;}
            case "Apple":
            {
                System.out.println("Red fruit");
            break;}
            case "Orange":{
                System.out.println("RoundFruit");
                break;
            }
            default:{
                System.out.println("Enter valid fruit");
            }

        }

    }
}
