package arraylisttest;
import arraylist.ListToArray;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ListToArrayTest {

    @Test
    public void testConvertArrayListToArray() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        String[] expectedArray = {"Java", "Python", "C++", "JavaScript"};

        String[] resultArray = ListToArray.convertArrayListToArray(stringList);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testConvertEmptyArrayListToArray() {
        ArrayList<String> emptyList = new ArrayList<>();

        String[] resultArray = ListToArray.convertArrayListToArray(emptyList);

        assertEquals(0, resultArray.length);
    }

    @Test
    public void testConvertArrayListWithNullsToArray() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add(null);
        stringList.add("C++");
        stringList.add("JavaScript");

        String[] expectedArray = {"Java", null, "C++", "JavaScript"};

        String[] resultArray = ListToArray.convertArrayListToArray(stringList);

        assertArrayEquals(expectedArray, resultArray);
    }
}
