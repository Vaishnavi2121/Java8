package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapDigits {
    public static void main(String args[]){

        List<Integer> list = Arrays.asList(12,14,56,57);

        for(int i=0;i<=list.size()-1;i+=2){

            int temp = list.get(i);
            list.set(i, list.get(i+1));
             list.set(i+1,temp);

        }
        System.out.println(list);

        //Swap every third number with the number before it

        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6);
        for(int n =1;n<=digits.size();n += 3){
            int temp1 = digits.get(n);
            digits.set(n, digits.get(n+1));
            digits.set(n+1,temp1);
        }
        System.out.println(digits);

        //Reverse a list using a for loop

        List<Integer> reversed = new ArrayList<>();
        for(int j= list.size()-1;j>=0;j--){
            reversed.add(list.get(j));

        }
        System.out.println(reversed);
    }
}
