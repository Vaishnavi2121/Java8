package com.example;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumbers {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10,67,54,34,26,78,59,51);

        // Even Numbers
        list.stream()
                .filter(n->n%2==0)
                        .forEach(System.out::println);

        //Odd Numbers
        list.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);
    }
}
