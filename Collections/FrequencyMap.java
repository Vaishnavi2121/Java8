package Collections;

import java.util.*;
import java.util.stream.Collectors;


public class FrequencyMap {

    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(10, 10, 34, 34, 57, 99, 99, 87, 99);

        Map<Integer, Long> freqMap = list.stream()
                .collect(Collectors.groupingBy(
                        x -> x, Collectors.counting()));

        System.out.println(freqMap);

        //find the number with the highest frequency
        int maxFreq = freqMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Number with highest frequency: " + maxFreq);

        //Count frequency of each word in a list of strings.

        List<String> str = Arrays.asList("Java", "Python", "Java", "Kotlin", "React");
        Map<String, Long> count = str.stream()
                .collect(Collectors.groupingBy(
                        x -> x, Collectors.counting()
                ));

        System.out.println(count);

        // Step 2: Find the entry with the highest frequency
        String mostFrequent = count.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("String with highest frequency: " + mostFrequent);

        //Find the most frequent character in a string
        String input = "abracadabra";
        Map<Character, Long> frequent = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(frequent);

        Character ch = frequent.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("character with highest frequency: " + ch);

        //Merge two maps
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 1, "D", 4);

        Map<String , Integer> mergedMap = new HashMap<>(map1);
        map2.forEach((key,value) -> mergedMap.merge(key,value,Integer::sum));

        System.out.println(mergedMap);

//        Remove All Entries With Value Less Than a Threshold

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 2);
        map.put("C", 8);
        map.put("D", 1);

        int threshold = 5;

        map.entrySet().removeIf(entry -> entry.getValue() < threshold);
        System.out.println("Filtered Map: " + map);

//        Swap Keys and Values

        Map<String, String> exchange = Map.of("A", "apple", "B", "banana", "C", "apple");
        System.out.println(exchange);
        Map<String, List<String>> swapped= exchange.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,Collectors.toList())));

        System.out.println(swapped);


    //        Sort a Map by Values
        Map<String, Integer> unsorted = Map.of("A", 3, "B", 1, "C", 2);

            LinkedHashMap<String,Integer> sorted = unsorted.entrySet().stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1,e2) -> e1,
                            LinkedHashMap::new
                    ));
        System.out.println(sorted);

    }
}
