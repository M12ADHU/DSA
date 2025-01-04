package com.practise.java8;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MapFlatMap {
    private long id;
    private String name;
    private List<String> cities;


    public static void main(String[] args) {
        List<String> citiies = Arrays.asList("Hyd","Bglr","noida");
        MapFlatMap employee1 = new MapFlatMap(1,"ravi",citiies);
        List<String> citiies2 = Arrays.asList("Hyd","noida");
        MapFlatMap employee2 = new MapFlatMap(2,"ram",citiies2);
        List<MapFlatMap> employeeList =  new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        System.out.println(employeeList.stream().map(MapFlatMap::getId).collect(Collectors.toList()));
        System.out.println(employeeList.stream().map(MapFlatMap:: getCities).collect(Collectors.toList()));
        System.out.println(employeeList.stream().flatMap(x-> x.getCities().stream()).collect(Collectors.toSet()));

    }

}
