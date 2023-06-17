package com.problems;

public class FindMaximumSubArray {
    public int solution(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int tempSum = 0;
        for(int i =0; i< nums.length;  i++){

            tempSum+=nums[i];
            sum = Math.max(sum,tempSum);
            if(tempSum < 0){
                tempSum =0;
            }
        }
        return sum;
    }
}
