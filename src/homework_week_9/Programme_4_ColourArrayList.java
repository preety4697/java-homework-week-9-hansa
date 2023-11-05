package homework_week_9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colours (strings)
        ArrayList<String> colours = new ArrayList<>();


        // Add some colours to the ArrayList
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Purple");

        // Print the collection using a for each loop
        System.out.println("Colour in the ArrayList:");
        for (String colour : colours){
            System.out.println(colour);
        }
    }
}
