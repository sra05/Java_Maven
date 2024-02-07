package lambdaexpressionstest;
import lambdaexpressions.CapitalizeAndSort;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CapitalizeAndSortTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] inputArray = {"apple", "strawberry", "banana", "orange", "grape", "pineapple"};
        List<String> expected = Arrays.asList("Apple", "Banana", "Grape", "Orange", "Pineapple", "Strawberry");
        List<String> result = CapitalizeAndSort.capitalizeAndSort(inputArray);
        assertEquals(expected, result);
    }
    @Test
    public void testCapitalizeAndSortWithBrandNames() {
        String[] inputArray = {"apple", "samsung", "google", "microsoft", "sony", "amazon", "apple"};
        List<String> expected = Arrays.asList("Amazon", "Apple", "Apple", "Google", "Microsoft", "Samsung", "Sony");
        List<String> result = CapitalizeAndSort.capitalizeAndSort(inputArray);
        assertEquals(expected, result);
    }

}

