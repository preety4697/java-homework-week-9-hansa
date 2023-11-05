package homework_week_9;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Programme_8_HashSet {
    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet<>();

        // Add the numbers 4, 7, and 8 to the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        //Use a for loop to check numbers between 1 and 10
        for (int i = 1; i <= 10; i++){
            if (numberSet.contains(i)){
                System.out.println(i + " is in the set.");
            }else{
                System.out.println(i + " is not in the set.");
            }
        }

    }
}
