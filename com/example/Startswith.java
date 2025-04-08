package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Startswith {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(111,124,567,345,189,134);

        //Find the numbers that starts with 1

         list.stream()
                 .map(s->s+"")
                 .filter(s ->s.startsWith("1"))
                 .forEach(System.out::println);


         //find the numbers that does not starts with with 1

        list.stream()
                .map(s->s+"")
               .filter(s -> {
                   return !s.startsWith("1");
                })
                .forEach(System.out::println);

        List<String> str = new ArrayList<>();
        str.add("USA");
        str.add("Canada");
        str.add("Switzerland");
        str.add("Australia");
        str.add("Austria");

        str.stream()
                .filter(s->s.startsWith("A") || s.startsWith("S"))
                .forEach(System.out::println);

        //Print that starts with Vowels

        List<String> str1 = new ArrayList<>();
        str1.add("anna");
        str1.add("Ankita");
        str1.add("visv");
        str1.add("Narayani");
        str1.add("radnyee");

        str1.stream()
                .filter(s->s.startsWith("A") || s.startsWith("E") || s.startsWith("I") || s.startsWith("O") || s.startsWith("U"))
                .distinct()
                .forEach(System.out::println);


        //starts and Ends with same alphabet

        str1.stream()
                .map(s->s.toLowerCase())
                .filter(s->{
                    String lower = s.toLowerCase();
                    return lower.charAt(0) == lower.charAt(lower.length()-1);
                })
                .forEach(System.out::println);

        //Starts with Lower Case

        str1.stream()
                .filter(s->Character.isLowerCase(s.charAt(0)))
                .forEach(System.out::println);


       // Count how many words startswith S

        List<String> list1 = new ArrayList<>();
        list1.add("Sanaiya");
        list1.add("Sana");
        list1.add("Sukanya");
        list1.add("Samiksha");
        list1.add("sunaiya");

        list1.stream()
                .filter(s->s.toUpperCase().startsWith("S"))
                .forEach(System.out::println);

      //  Count the words that start with S

       long count =  list1.stream()
                .filter(s -> s.toLowerCase().startsWith("s"))
                .count();

       System.out.println("Count:"+count);

       //filter the words that starts with 'Ja'
        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Jakarta");
        list2.add("JVM");
        list2.add("JDK");
        list2.add("ja");

        list2.stream()
                .filter(s->s.startsWith("Ja"))
                .forEach(System.out::println);

    }
}
