package com.practise.java8;

import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Employees {
    private int id;
    private String name;
    private  int salary;
    private int age;
    private String gender;
    public static void main(String[] args) {

        List<Employees> list = new ArrayList<>();
        list.add(new Employees(1, "tej", 200, 23, "Male"));
        list.add(new Employees(2, "teja", 2009, 24, "Female"));
        list.add(new Employees(1, "teju", 2010, 25, "Male"));
        Map<String, Long> cont= list.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.counting()));
        System.out.println(list.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingInt( Employees::getSalary))));
        System.out.println("Count employees with gender"+ cont);
        System.out.println(list.stream().sorted(Comparator.comparing(Employees::getSalary)).skip(2).collect(Collectors.toList()));

    }
}
