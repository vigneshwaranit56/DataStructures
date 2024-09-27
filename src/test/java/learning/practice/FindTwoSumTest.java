package learning.practice;

import learning.problems.FindTwoSum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class FindTwoSumTest implements ITestCaseTemplate {

    @Test
    public void positiveCase(){
        FindTwoSum findTwoSum = new FindTwoSum();
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result =    findTwoSum.solution(arr,target);
        int[] expectedResult = new int[]{0,1};

        for(int i=0,j=0; i<result.length && j<expectedResult.length; i++,j++){
            assertEquals(expectedResult[j],result[i]);

        }
    }
    @Test
    public void negativeCase(){
        FindTwoSum findTwoSum = new FindTwoSum();
        int[] arr = {3,3};
        int target = 6;
        int[] result =    findTwoSum.solution(arr,target);
        int[] expectedResult = new int[]{0,1};

        for(int i=0,j=0; i<result.length && j<expectedResult.length; i++,j++){
            assertEquals(expectedResult[j],result[i]);

        }    }
    @Test
    public void averageCase(){
        FindTwoSum findTwoSum = new FindTwoSum();
        int[] arr = {3,2,4};
        int target = 6;
        int[] result =    findTwoSum.solution(arr,target);
       int[] expectedResult = new int[]{1,2};

        for(int i=0,j=0; i<result.length && j<expectedResult.length; i++,j++){
            assertEquals(expectedResult[j],result[i]);

        }
    }
}
