package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // Convert ArrayList to Array
        String[] stringArray = convertArrayListToArray(stringList);

        // Display the result
        System.out.println("ArrayList: " + stringList);
        System.out.println("Array: " + Arrays.toString(stringArray));
    }

    // Function to convert ArrayList of Strings to Array
    public static String[] convertArrayListToArray(ArrayList<String> list) {
        // Create a new array with the same size as the ArrayList
        String[] array = new String[list.size()];

        // Convert ArrayList to Array
        list.toArray(array);

        return array;
    }
}
