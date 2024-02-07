package lambdaexpressionstest;
import lambdaexpressions.SumOfSquares;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class SumOfSquaresTest {

    @Test
    public void testCalculateSumOfSquares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int expectedSum = 1*1 + 2*2 + 3*3 + 4*4 + 5*5;
        int actualSum = SumOfSquares.calculateSumOfSquares(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumOfSquaresEmptyList() {
        List<Integer> numbers = Arrays.asList();
        int expectedSum = 0;
        int actualSum = SumOfSquares.calculateSumOfSquares(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculateSumOfSquaresNoPositiveNumbers() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -5);
        int expectedSum = 0;
        int actualSum = SumOfSquares.calculateSumOfSquares(numbers);
        assertEquals(expectedSum, actualSum);
    }
}

