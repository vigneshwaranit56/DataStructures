package com.practice;

import com.problems.FindSingleNumber;
import com.test.FindNonRepeatingCharacter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)


public class FindSingleNumberTest implements ITestCaseTemplate{



    @Test
    public void positiveCase(){
        FindSingleNumber findSingleNumber = new FindSingleNumber();

        int[] arr = {4,1,2,1,2};
       int singleNumber = findSingleNumber.solution(arr);
        assertEquals(4,singleNumber);

    }

    @Test
    public void negativeCase(){
        FindSingleNumber findSingleNumber = new FindSingleNumber();

        int[] arr = {2,2,1};
        int singleNumber = findSingleNumber.solution(arr);
        assertEquals(1,singleNumber);

    }

    @Test
    public void averageCase(){
        FindSingleNumber findSingleNumber = new FindSingleNumber();

        int[] arr = {1};
        int singleNumber = findSingleNumber.solution(arr);
        assertEquals(1,singleNumber);

    }
}
