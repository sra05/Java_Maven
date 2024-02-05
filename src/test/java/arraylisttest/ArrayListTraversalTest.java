package arraylisttest;
import arraylist.ArrayListTraversal;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ArrayListTraversalTest {

    @Test
    public void testArrayListTraversal() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // Traverse using for loop
        System.out.println("Traversing using for loop:");
        StringBuilder forLoopOutput = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            forLoopOutput.append(element).append("\n");
        }

        // Traverse using enhanced for loop
        System.out.println("\nTraversing using enhanced for loop:");
        StringBuilder enhancedForLoopOutput = new StringBuilder();
        for (String element : stringList) {
            enhancedForLoopOutput.append(element).append("\n");
        }

        // Expected output
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Java\n");
        expectedOutput.append("Python\n");
        expectedOutput.append("C++\n");
        expectedOutput.append("JavaScript\n");

        // Compare expected output with actual output
        assertEquals(expectedOutput.toString(), forLoopOutput.toString());
        assertEquals(expectedOutput.toString(), enhancedForLoopOutput.toString());
    }
}

