package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String args[]){

        List<String> list = Arrays.asList("apple","Apple","Banana","banana","Mango");

        System.out.println(list);

       list=  list.stream()
                .map(s->s.toUpperCase())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
