package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEvery {

    public static void main(String args[]){

        List<String> str = Arrays.asList("Panasonic","LG","Whirpool","Haier");

        str = str.stream()
                .map(s-> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(str);

        //Reverse the string if it starts with P
        List<String> str1 = Arrays.asList("Python", "Java", "Perl", "PHP", "C++", "panda");

        str1.stream()
                .filter(s->s.toLowerCase().startsWith("p"))
                .map(s-> new StringBuilder(s).reverse().toString())
                .forEach(System.out::println);

        //Reverse the string that does not starts with Vowel

        List<String> input = Arrays.asList("Apple", "Stream", "Orange", "Graph", "Elephant");

        input.stream()
                .filter(s->{
                    String lower = s.toLowerCase();
                    return !(s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") ||
                            s.startsWith("u"));
                })
                .collect(Collectors.toList());

        //Reverse the string at Even indexes

        List<String> input1 = Arrays.asList("One", "Two", "Three", "Four", "Five");
        List<String> output = reverseEvenIndexed(input1);
        System.out.println(output);

        //Reverse and collect only that contains the letter "a"

        List<String> result = str1.stream()
                .filter(s->s.contains("a"))
                .collect(Collectors.toList());

        System.out.println(result);


    }
    private static List<String> reverseEvenIndexed(List<String> input1) {

        return IntStream.range(0, input1.size())
                .mapToObj(i-> {
                    String s = input1.get(i);
                    return(i%2 ==0)
                            ? new StringBuilder(s).reverse().toString()
                            : s;
                })
                .collect(Collectors.toList());

    }
}
