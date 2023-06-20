package com.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class TrappingRainWaterProblem {
    public int solution(int[] height) {
        int highest = height[0];
        int waterLevel = 0;
        for (int i = 1; i < height.length; i++) {
            if (highest > height[i]) {
                OptionalInt rMax = Arrays.stream(height, i, height.length)
                        .max();
                if (rMax.getAsInt() < highest) {
                    highest = rMax.getAsInt();
                }
            //    if (rMax.isPresent() && rMax.getAsInt() >= highest) {
                    waterLevel += highest - height[i];
           //     }

            } else
                highest = height[i];
        }

        return waterLevel;
    }
}

