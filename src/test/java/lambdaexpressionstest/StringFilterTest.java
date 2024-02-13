package lambdaexpressionstest;
import lambdaexpressions.StringFilter;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringFilterTest {

    @Test
    void testFilterStringsStartingWithA() {
        List<String> input = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Grapes");
        List<String> expected = Arrays.asList("Apple", "Apricot");

        List<String> result = StringFilter.filterStringsStartingWithA(input, s -> s.startsWith("A"));

        assertEquals(expected, result);
    }
}