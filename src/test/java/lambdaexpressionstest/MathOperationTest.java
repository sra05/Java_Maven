package lambdaexpressionstest;

import lambdaexpressions.MathOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MathOperationTest {

    @Test
    void testAddition() {
        // Implementing addition using lambda expression
        MathOperation addition = (a, b) -> a + b;

        // Test addition operation
        int result = addition.operate(5, 3);
        assertEquals(8, result);
    }
}