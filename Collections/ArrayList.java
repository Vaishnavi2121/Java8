package Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayList {
    public static void main(String args[]){

//        Add  integers to a list and print only the even numbers.

        List<Integer> numbers = Arrays.asList(12, 7, 8, 15, 22, 33, 40, 55, 66, 91);

        numbers.stream()
                .filter(s->s %2 == 0)
                .forEach(System.out::println);

//        Remove all duplicates from a list of strings

        List<String> countries = Arrays.asList("USA","Australia","Canada","USA");

        Set<String> country = countries.stream()
                .collect(Collectors.toSet());

        System.out.println(country);

//        Find the second-largest number in a list of integers.

        List<Integer> number = Arrays.asList(12,13,76,45,89,38,555);

        Optional<Integer> secondLargest = number.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondLargest.ifPresent(n -> System.out.println("Second largest number: " + n));

//        Reverse a list without using Collections.reverse().

        List<Integer> nos = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> num = IntStream.range(0, nos.size())
                .mapToObj(n-> nos.get(nos.size()-1-n))
                .collect(Collectors.toList());

        System.out.println(num);

//        Merge two list and remove duplicate

        List<String> l1 = Arrays.asList("Spring","Boot","Core","Java");
        List<String> l2 = Arrays.asList("Spring","Boot","Multi","Threading");

        List<String> merge = Stream.concat(l1.stream(),l2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(merge);

//        Replace all occurrences of "Java" with "Python" in a list.

        List<String> languages = Arrays.asList("Spring","java","Python","Java");
        languages = languages.stream()
                .map(s->s.equalsIgnoreCase("Java") ? "Python" : s)
                .collect(Collectors.toList());

        System.out.println(languages);

//        Count how many times each word appears in a list.

        List<String> python = languages.stream()
                .filter(s->s.equalsIgnoreCase("Python"))
                .collect(Collectors.toList());
        System.out.println(python.size());

//        Sort a list of strings based on their length.

        List<String> language = Arrays.asList("Java", "Python", "C", "Go", "JavaScript");
        List<String> sorted = language.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(sorted);

//        Remove all null objects from a list

        List<String> items = Arrays.asList("Java", null, "C", null, "JavaScript");

        List<String> nonNullItems = items.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(nonNullItems);


    }
}
