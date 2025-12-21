package com.learning.patterns.two_pointers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class FindAPairNumbersInSortedNumber {
    public static void main(String[] args){
        System.out.println("Hello world");
        int[] arr = {2,3,5,8,11};
        int target = 10;
        int[] result;
        result =solution1(arr,target);
        Arrays.stream(result).forEach(System.out::println);

        result =solution2(arr,target);
        Arrays.stream(result).forEach(System.out::println);

        result =solution3(arr,target);
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



       Map<Integer,Integer> map = IntStream.range(0,arr.length).boxed().collect(Collectors.toMap(i->arr[i],i->i));

        for(int i=0;i<arr.length-1; i++){
            int complement = target-arr[i];
            if(map.containsKey(complement) &&  i != map.get(complement)){
                result[0] = arr[i];
                result[1] = target -arr[i];
                System.out.println(i);
                return result;
            }
        };


        return result;
    }

    private static int[] solution3(int[] arr, int target) {
        int[] result = new int[2];

       int left  = 0,right = arr.length-1;

       while(left < right){
           int sum = arr[left]+arr[right];

           if(sum == target){
               result[0] = arr[left];
               result[1] = arr[right];
               return result;
           }else if( sum > target){
               right--;
           }else
               left++;
       }


        return result;
    }
}
