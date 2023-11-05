package homework_week_9;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {
        // Create a Hash map to store String keys and integer value
        Map<String, Integer> people = new HashMap<>();

        //Add some key value pairs to the map

        people.put("Dev", 21);
        people.put("john", 35);
        people.put("Ami", 20);
        people.put("David", 28);
        people.put("Bob", 25);

        // Use a for loop to iterate over the value in the map
        for(Integer age : people.values()){
            System.out.println("Age : " + age);
        }


    }
}
