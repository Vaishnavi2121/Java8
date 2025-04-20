package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetQuestions {

    public static void main(String args[]){

        Set<Integer> seen = new HashSet<>();
        List<Integer> ls = Arrays.asList(2, 7, 4, 5, 1, 3);
        int target = 6;

        //Find all pairs in the list that sum to a target value using for loop
        for(int num :ls){
            int complement = target - num ;
            if(seen.contains(complement)){
                System.out.println("(" + complement + ", " + num + ")");
            }
        }

//        Remove duplicates from set
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

        Set<Integer> set = new HashSet<>(listWithDuplicates);
        System.out.println("List Without Duplicates: " + set);

    }
}
