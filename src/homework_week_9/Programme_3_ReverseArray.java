package homework_week_9;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5}; // Replace with your array
        int length = originalArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = originalArray[length - 1 - i];
        }
        System.out.print("Originai Array: ");
        for (int num : originalArray){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed Array: ");
        for (int num : reversedArray){
            System.out.print(num + " ");
        }
    }
}
