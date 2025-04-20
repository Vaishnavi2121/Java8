package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Concatenate {

    public static void main(String args[]){

        List<String> str = Arrays.asList("Java", "Spring", "RabbitMQ", "Cloud");
        String result = String.join("-", str);
        System.out.println(result);

        //Group list of strings by their length using Collectors.groupingBy
        List<String> string  = Arrays.asList("a", "bb", "ccc", "dd");

        Map<Integer, List<String>> groups =  string.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groups);

        //GroupBy first letter

        List<String> countries = Arrays.asList("India","Italy","Germany","Georgia","Canada");
        Map<Character, List<String>> countriesGroup = countries.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(countriesGroup);


    }
}
