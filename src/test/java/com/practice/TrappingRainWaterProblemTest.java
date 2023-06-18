package com.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TrappingRainWaterProblemTest implements ITestCaseTemplate{
    @Test
    @Override
    public void positiveCase() {
        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWaterProblem trappingRainWaterProblem = new TrappingRainWaterProblem();
        int level = trappingRainWaterProblem.solution(height);
        assertEquals(5,level);
    }

        @Override
    public void averageCase() {

    }

    @Override
    public void negativeCase() {

    }
}
