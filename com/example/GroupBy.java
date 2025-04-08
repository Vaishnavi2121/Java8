package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String args[]){

        List<String> str = Arrays.asList("ABC","ACB","ARC","CRD","BRB");

        Map<Character , List<String>>  map = str.stream()
                .filter(s->!s.isEmpty())
                .collect(Collectors.groupingBy(s->Character.toLowerCase(s.charAt(0))));

        System.out.println(map);
    }
}
