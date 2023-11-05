package homework_week_9;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");

 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_ArrayListComparison {
    public static void main(String[] args) {
        // Delare and initialize the first Arraylist
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare and initialize the second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
       c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Find elements present in c1 but not in c2
        ArrayList<String> elementsOnlyInC1 = new ArrayList<>(c1);
        elementsOnlyInC1.removeAll(c2);

        // Find elements present in c2 but not in c1
        ArrayList<String> elementsOnlyInC2 = new ArrayList<>(c2);
        elementsOnlyInC2.removeAll(c1);

        System.out.println("Elements present in c1 but not in c2: ");
        for (String element : elementsOnlyInC1) {
            System.out.println(element);
        }
        System.out.println("Elements present in c2 but not in c1: ");
        for (String element : elementsOnlyInC2){
            System.out.println(element);
        }
    }
}