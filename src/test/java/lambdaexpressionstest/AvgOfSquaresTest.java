package lambdaexpressionstest;
import lambdaexpressions.AvgOfSquares;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AvgOfSquaresTest {

    @Test
    void testCalculateAverageOfSquares() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double expected = 33.0; // (1^2 + 3^2 + 5^2 + 7^2 + 9^2) / 5 = 33.0

        double actual = AvgOfSquares.calculateAverageOfSquares(numbers);

        assertEquals(expected, actual, 0.0001); // Allowing for a small margin of error in double comparison
    }

    @Test
    void testCalculateAverageOfSquaresEmptyArray() {
        int[] numbers = {};
        double expected = 0.0; // No odd numbers in an empty array

        double actual = AvgOfSquares.calculateAverageOfSquares(numbers);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testCalculateAverageOfSquaresNoOddNumbers() {
        int[] numbers = {2, 4, 6, 8, 10};
        double expected = 0.0; // No odd numbers in the array

        double actual = AvgOfSquares.calculateAverageOfSquares(numbers);

        assertEquals(expected, actual, 0.0001);
    }

}