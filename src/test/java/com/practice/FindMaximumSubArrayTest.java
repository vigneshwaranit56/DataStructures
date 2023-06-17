package com.practice;

import com.problems.FindMaximumSubArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FindMaximumSubArrayTest implements ITestCaseTemplate {

    @Test
    @Override
    public void positiveCase() {
        FindMaximumSubArray findMaximumSubArray = new FindMaximumSubArray();
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
       int result = findMaximumSubArray.solution(arr);
       assertEquals(6,result);
    }

    @Test
    @Override
    public void averageCase() {
        FindMaximumSubArray findMaximumSubArray = new FindMaximumSubArray();
        int arr[] = new int[]{1};
        int result = findMaximumSubArray.solution(arr);
        assertEquals(1,result);
    }

    @Test
    @Override
    public void negativeCase() {
        FindMaximumSubArray findMaximumSubArray = new FindMaximumSubArray();
        int arr[] = new int[]{5,4,-1,7,8};
        int result = findMaximumSubArray.solution(arr);
        assertEquals(23,result);
    }
}
