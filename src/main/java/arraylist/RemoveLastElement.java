package arraylist;

import java.util.ArrayList;
public class RemoveLastElement {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Display the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Remove the last object from the ArrayList
        removeLastElement(stringList);

        // Display the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);
    }

    // Function to remove the last object from an ArrayList
    public static void removeLastElement(ArrayList<String> list) {
        // Check if the ArrayList is not empty before removing
        if (!list.isEmpty()) {
            // Remove the last object (element at size()-1 index)
            list.remove(list.size() - 1);
        }
    }
}
