package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

    public static void main(String args[]){

        List<String> names = Arrays.asList("Ankita","Samiksha","Samidha","Samrita") ;

        String name = String.valueOf(names.stream()
                .filter(s->s.toLowerCase().startsWith("s") && s.toLowerCase().endsWith("a"))
                .findFirst()
                        .orElse("No Match"));

        System.out.println("name:"+name);
    }
}
