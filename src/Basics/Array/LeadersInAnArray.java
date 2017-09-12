package Basics.Array;

/**
 * Created by uslabs on 9/10/17.
 */
public class LeadersInAnArray {
    public static void Solution() {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int maxOnRight = arr[arr.length - 1];
        System.out.println(maxOnRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxOnRight) {
                maxOnRight = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
