package homework_week_9;
/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_ArrayListIterator {
    public static void main(String[] args) {

        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Get an Iterator for the Array list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate through the elements using the Iterator
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
        }

    }
}
