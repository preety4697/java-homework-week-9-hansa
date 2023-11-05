package homework_week_9;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

       // Specify the index of the element you want to retrieve
        int indexToRetrieve = 2;// This will retrieve the element at index 2

        // Check if the specified index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < names.size()) {
            // Retrieve the element at the specified index
            String element = names.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid index specified.");

        }
    }
}
