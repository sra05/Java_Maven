package lambdaexpressions;

import java.util.Arrays;

public class AvgOfSquares {
    public static double calculateAverageOfSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2)) // Square each odd number
                .average() // Calculate average
                .orElse(0.0); // Default value if no odd numbers are present
    }
}