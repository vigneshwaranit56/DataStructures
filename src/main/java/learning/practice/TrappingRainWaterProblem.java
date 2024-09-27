package learning.practice;

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

    public int solution2(int[] height) {

//        4,2,0,3,2,5
        int left = 0, right = height.length - 1;
        int leftMax = height[0],rightMax= height[height.length-1];
        int waterLevel = 0;

        while(left < right){

         if(leftMax < rightMax){
             left++;
             if(leftMax < height[left]){
                 leftMax=height[left];
             }else{
                 waterLevel+=leftMax-height[left];
             }
         }else{
             right--;
             if(rightMax < height[right]){
                 rightMax = height[right];
             }else{
                 waterLevel+=rightMax-height[right];
             }
         }

        }



        return waterLevel;

    }
}

