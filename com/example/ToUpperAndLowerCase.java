package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperAndLowerCase {

    public static void main(String[] args){

        List<String> list = Arrays.asList("gfg","tutorialspoint","javatpoint","w3schools");

      List<String> list1 =  list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list1);

        list1 = list1.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
