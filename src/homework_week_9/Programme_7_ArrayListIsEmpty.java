package homework_week_9;
/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7_ArrayListIsEmpty {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();

        if (isEmpty) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
        // Add an element to the ArrayList
        numbers.add(42);

        //Check again if the ArrayList is empty
        isEmpty = numbers.isEmpty();

        if (isEmpty) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
