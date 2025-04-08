package com.example;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    public static void main(String args[]){

        List<String> items = Arrays.asList("TestCase", "UnitTest", "MockTest", "exam", "testRun");

       boolean startsWithTest=  items.stream()
               .anyMatch(s->s.toLowerCase().startsWith("test"));

        System.out.println("Any element starts with 'Test'? " + startsWithTest);
    }

}
