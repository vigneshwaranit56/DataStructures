package learning.practice;

import learning.problems.FindSumOfSquareNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FindSumOfSquareNumbersTest {

    @Test
    @DisplayName("works for only perfect squares")
    public void positiveCase(){
        FindSumOfSquareNumber findSumOfSquareNumbersTest = new FindSumOfSquareNumber();
        assertEquals(1,findSumOfSquareNumbersTest.convert(64));
    }

    @Test
    @DisplayName("works for best case")
    public void bestCase(){
        FindSumOfSquareNumber findSumOfSquareNumbersTest = new FindSumOfSquareNumber();
        // 7*7 49
        // 3*3 9
        // 2*2 4
        // 1*1 1
        // = 4 counts
        assertEquals(4,findSumOfSquareNumbersTest.convert(63));

    }


}
