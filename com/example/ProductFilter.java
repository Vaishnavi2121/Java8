package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class ProductFilter {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Lamp", "Phone", "Printer", "Tablet", "Charger", "camera");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter to filter products: ");
        String input = scanner.nextLine().trim();

        char letter = Character.toLowerCase((input.charAt(0)));
        products.stream()
                .filter(p->Character.toLowerCase(p.charAt(0))==letter)
                .forEach(System.out::println);

        //List of products that have more than 5 characters

        List<String> pr = products.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());

        System.out.println(pr);

        //Longest String

        Optional<String> length = products.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println(length);

        //filter strings longer than the average length
        double avg = (int) products.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        List<String> longerThanAverage = products.stream()
                .filter(s -> s.length() > avg)
                .collect(Collectors.toList());
        System.out.println("Average  Length :" +avg);
        System.out.println("Longer than Average :" +longerThanAverage);

        //filter strings shorter than the average length

        List<String> shorterThaAverage = products.stream()
                .filter(s -> s.length() < avg)
                .collect(Collectors.toList());
        System.out.println("Shorter than Average :" +shorterThaAverage);

        //filter strings that is equals to the average length

        List<String> equalsToAverage = products.stream()
                .filter(s -> s.length() == avg)
                .collect(Collectors.toList());

        System.out.println("Equals to Average :" +equalsToAverage);
    }
}
