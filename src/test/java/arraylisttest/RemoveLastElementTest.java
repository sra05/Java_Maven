package arraylisttest;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import arraylist.RemoveLastElement;

public class RemoveLastElementTest {

    @Test
    public void testRemoveLastElement() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        RemoveLastElement.removeLastElement(stringList);

        // Expected result after removal
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add("Banana");
        expectedList.add("Orange");

        // Compare expected list with actual list
        assertEquals(expectedList, stringList);
    }

    @Test
    public void testRemoveLastElementEmptyList() {
        ArrayList<String> emptyList = new ArrayList<>();

        // Removing from an empty list should not throw an exception
        RemoveLastElement.removeLastElement(emptyList);

        // The list should remain empty
        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testRemoveLastElementSingleElementList() {
        ArrayList<String> singleElementList = new ArrayList<>();
        singleElementList.add("Apple");

        RemoveLastElement.removeLastElement(singleElementList);

        // The list should become empty after removal
        assertTrue(singleElementList.isEmpty());
    }
}
