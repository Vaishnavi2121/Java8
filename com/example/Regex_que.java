package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Regex_que {

    public static void main(String args[]){

        //Filter the words that only contains digits
        List<String> list = Arrays.asList("123!", "abc", "4567", "a1b2");

        List <String> str  = list.stream()
                .filter(s->s.matches("^\\d+$"))
                .collect(Collectors.toList());

        System.out.println(str);

        //Find the string that start with capital letters

       List<String> input =  Arrays.asList("Apple", "banana", "Carrot", "dog");
       List<String> upperCase = input.stream()
               .filter(s->s.matches("^[A-Z].*"))
               .collect(Collectors.toList());

        System.out.println(upperCase);

        //get the string that have valid phone numbers

        List<String> numbers = Arrays.asList("4536789239","34526564889","45362845","437");

        List<String> numbers1 = numbers.stream()
                .filter(s->s.matches("^\\d{10}"))
                .collect(Collectors.toList());

        System.out.println(numbers1);

        //Filter string with only lowercase letters

        List<String> lowerCase = input.stream()
                .filter(s->s.matches("^[a-z].*"))
                .collect(Collectors.toList());

        System.out.println(lowerCase);

        //find string that contains atleast one digit
        List<String> digits = Arrays.asList("test1", "hello", "123", "none");
        List<String> digits1 = digits.stream()
                .filter(s->s.matches(".*\\d"))
                .collect(Collectors.toList());

        System.out.println(digits1);

        //Extract string that contains only special characters
        List<String> special = Arrays.asList("!@#", "abc", "$$$", "hello");

        List<String> specials1 = special.stream()
                .filter(s->!s.matches("^[a-zA-Z]+$"))
                .collect(Collectors.toList());

        System.out.println(specials1);

        //Filter string that matches date format

        List<String> date = Arrays.asList("2024-04-08", "08/04/2024", "1999-12-31");
        List<String> dates = date.stream()
                .filter(s->s.matches("^\\d{2}/\\d{2}/\\d{4}"))
                .collect(Collectors.toList());

        System.out.println(dates);

        //Find string that represent floating point numbers

        List<String> floating = Arrays.asList("-0.88", "3.14", "99-12");

        List<String> floats = floating.stream()
                .filter(s->s.matches("-?\\d+\\.\\d+"))
                .collect(Collectors.toList());

        System.out.println(floats);



    }
}
