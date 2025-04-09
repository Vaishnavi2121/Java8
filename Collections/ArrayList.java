package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String args[]){

        //Add  integers to a list and print only the even numbers.

        List<Integer> numbers = Arrays.asList(12, 7, 8, 15, 22, 33, 40, 55, 66, 91);

        numbers.stream()
                .filter(s->s %2 == 0)
                .forEach(System.out::println);

        //Remove all duplicates from a list of strings

        List<String> countries = Arrays.asList("USA","Australia","Canada","USA");

        Set<String> country = countries.stream()
                .collect(Collectors.toSet());

        System.out.println(country);

        //Find the second-largest number in a list of integers.

        List<Integer> number = Arrays.asList(12,13,76,45,89,38,555);

        Optional<Integer> secondLargest = number.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondLargest.ifPresent(n -> System.out.println("Second largest number: " + n));
    }
}
