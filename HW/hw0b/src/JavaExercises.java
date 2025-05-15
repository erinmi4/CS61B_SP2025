import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] dice = new int[]{1, 2, 3, 4, 5, 6} ;
        return dice ;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        if (customer.equals("Ergun")){
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        }
        if (customer.equals("Erik")){
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        }
        return new String[3];

    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // Assuming the array is nonempty as per the method documentation
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) { // Start from the second element
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) { // Use else if to avoid setting min to a larger value
                min = array[i];
            }
        }

        return Math.abs(max - min); // Return the absolute difference
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }
    public static boolean is_even(int i ){
        if (i % 2 == 0 ) {
            return true ;
        }
        return false ;
    }

    public static boolean is_odd(int i ){
        if (i % 2 == 1 ) {
            return true ;
        }
        return false ;
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        while (x != 1 ) {
            list.add(x) ;
            if (is_even(x)){
                x /= 2 ;
            }
            else {
                x = x * 3 + 1 ;
            }
        }
        list.add(x) ;
        return list ;

    }

}
