package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FrequencyMap {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(10,10,34,34,57,99,99,87,99);

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



    }
}
