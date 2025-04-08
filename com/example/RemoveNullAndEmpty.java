package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullAndEmpty {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("","","abc","");

        List<String> output = str.stream()
                .filter(s->s !=null && !s.trim().isEmpty())
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
