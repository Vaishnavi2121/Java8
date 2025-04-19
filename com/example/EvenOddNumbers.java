package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        //Double the value of every odd number in list

        list.stream()
                .map(x->x%2!=0 ? x*2:x)
                .forEach(System.out::println);

        System.out.println(list);

        //return a list where every digit is a sum of index and its own

        for(int i=0;i<list.size();i++){
           list.set(i, list.get(i) + i);

        }
        System.out.println(list);

        //Return a list of squares of even numbers only using stream
       List<Integer> evenSquare =  list.stream()
                .filter(n->n%2==0)
                .map( n -> n*n)
                .collect(Collectors.toList());

        System.out.println(evenSquare);

        //Return a list of squares of even numbers only using for Loop

        List<Integer> list1 = Arrays.asList(0,7,5,4,6,8,9,5);
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ;i<list1.size();i++){
            int num = list1.get(i);
            if(num%2 == 0){
                result.add(num * num);
            }
        }
        System.out.println(result);

        //Return a list of squares of odd numbers only

        List<Integer> oddSquare =  list.stream()
                .filter(n->n%2!=0)
                .map( n -> n*n)
                .collect(Collectors.toList());

        System.out.println(oddSquare);

        //Return a list of squares of odd numbers only using for Loop
        List<Integer> result1 = new ArrayList<>();
        for(int i =0;i<list1.size();i++){
            int num = list1.get(i);
            if(num %2 != 0){
                result1.add(num * num);
            }
        }
        System.out.println(result1);
    }
}
