package lambdaexpressionstest;
import lambdaexpressions.FilterAndDouble;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class FilterAndDoubleTest {

    @Test
    public void testFilterAndDouble() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(2, 6, 10);
        List<Integer> result = FilterAndDouble.filterAndDouble(input);
        assertEquals(expected, result);
    }

    @Test
    public void testFilterAndDoubleEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FilterAndDouble.filterAndDouble(input);
        assertEquals(expected, result);
    }
}

