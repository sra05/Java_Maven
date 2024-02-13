package lambdaexpressions;
import java.util.List;
import java.util.Optional;

public class MaxStringFinder {

    public static String findMaxString(List<String> strings) {
        Optional<String> maxString = strings.stream()
                .max(String::compareTo);

        return maxString.orElse(null);
    }
}
