package com.learning.patterns.two_pointers;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.singletonList;

public class FindAPairNumbersInSortedNumber {
    public static void main(String[] args){
        System.out.println("Hello world");
        int[] arr = {3,5,2,8,11};
        int target = 10;
        int[] result;
        result =solution1(arr,target);
        Arrays.stream(result).forEach(System.out::println);

        result =solution2(arr,target);
        Arrays.stream(result).forEach(System.out::println);


    }

    private static int[] solution2(int[] arr, int target) {
        int[] result = new int[2];

        for(int i=0;i<arr.length-1; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    result[0] = arr[i];
                    result[1] = arr[j];
                return result;
                }
            }
        }



        return result;
    }

    private static int[] solution1(int[] arr, int target) {
        int[] result = new int[2];

        return result;
    }
}
