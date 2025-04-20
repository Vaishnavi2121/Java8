package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirst {

    public static void main(String args[]){

        List<String> names = Arrays.asList("Ankita","Samiksha","Samidha","Samrita") ;

        String name = String.valueOf(names.stream()
                .filter(s->s.toLowerCase().startsWith("s") && s.toLowerCase().endsWith("a"))
                .findFirst()
                        .orElse("No Match"));

        System.out.println("name:"+name);

        //Get the top 3 highest numbers from a list

        List<Integer> list = Arrays.asList(3,5,7,6,9,2);
       List<Integer> result =  list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);

        //Get the smallest 3  numbers from a list

        List<Integer> smallest =  list.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(smallest);

        //Find all pairs in the list that sum to a target value using for loop

        List<Integer> ls = Arrays.asList(2, 7, 4, 5, 1, 3);
        int target = 6;

        for(int i=0;i<ls.size();i++){
            for(int j=i+1;j<ls.size()-1;j++){
                if(ls.get(i) + ls.get(j) == target){
                    System.out.println("(" + ls.get(i) + ", " + ls.get(j) + ")");
                }
            }
        }
    }
}
