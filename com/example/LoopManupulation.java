package com.example;

import java.util.Arrays;
import java.util.List;

public class LoopManupulation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 67, 54, 34, 26, 78, 59, 51);

        //Replace each element with the sum of itself and next element

        for (int i = 0; i < list.size() - 1; i++) {
            list.set(i, list.get(i) + list.get(i + 1));
        }
        System.out.println(list);

        //Replace each element with the difference between it and its index

        for (int i = 0; i < list.size() - 1; i++) {
            list.set(i, list.get(i) - i);
        }
        System.out.println(list);

        //Rotate the list to the right by one position

        int last = list.get(list.size()-1);
        for(int i = list.size()-1 ;i>0;i--){
            list.set(i,list.get(i-1));
        }
        list.set(0,last);
        System.out.println(list);

        //Rotate the list to the left by one position

        int first = list.getFirst();
        for(int i=0 ;i<list.size()-1;i++){
            list.set(i,list.get(i+1));
        }
        list.set(list.size()-1,first);
        System.out.println(list);
    }
}
