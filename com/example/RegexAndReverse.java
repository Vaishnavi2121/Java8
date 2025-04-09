package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RegexAndReverse {

    public static void main(String args[]){

        List<String> str = Arrays.asList("madam", "level", "hello", "world");

        str = str.stream()
                .filter(s->s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());


        System.out.println(str);
    }
}
