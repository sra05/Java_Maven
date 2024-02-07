package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeAndSort {
    public static List<String> capitalizeAndSort(String[] inputArray) {
        return Arrays.stream(inputArray)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)) // Capitalize first letter
                .sorted() // Sort alphabetically
                .collect(Collectors.toList());
    }
}
