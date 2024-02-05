package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeAndSort {
    public static void main(String[] args) {
        String[] inputArray = {"apple", "strawberry", "banana", "orange", "grape", "pineapple"};

        List<String> result = Arrays.stream(inputArray)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)) // Capitalize first letter
                .sorted() // Sort alphabetically
                .collect(Collectors.toList());

        // Print the result
        result.forEach(System.out::println);
    }
}