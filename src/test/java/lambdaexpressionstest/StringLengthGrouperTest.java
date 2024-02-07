package lambdaexpressionstest;
import lambdaexpressions.StringLengthGrouper;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class StringLengthGrouperTest {

    @Test
    public void testGroupByLength() {
        List<String> input = Arrays.asList("apple", "banana", "orange", "grape");
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(5, Arrays.asList("apple"));
        expected.put(6, Arrays.asList("banana", "orange"));
        expected.put(5, Arrays.asList("apple","grape"));
        Map<Integer, List<String>> result = StringLengthGrouper.groupByLength(input);
        assertEquals(expected, result);
    }

    @Test
    public void testGroupByLengthWithEmptyList() {
        List<String> input = Arrays.asList();
        Map<Integer, List<String>> expected = new HashMap<>();
        Map<Integer, List<String>> result = StringLengthGrouper.groupByLength(input);
        assertEquals(expected, result);
    }
}

