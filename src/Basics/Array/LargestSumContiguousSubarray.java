package Basics.Array;

/**
 * Created by uslabs on 9/10/17.
 */

// Kadane's Algorithm
public class LargestSumContiguousSubarray {
    public static void solution() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSoFar = 0, maxEndingHere = 0, start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = Integer.max(arr[i], maxEndingHere + arr[i]);
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                start = i;
            } else {
                if (maxSoFar < maxEndingHere) {
                    maxSoFar = maxEndingHere;
                    end = i;
                }
            }
        }
        System.out.println(maxSoFar);
        System.out.println("Subarray from index " + (start + 1) + " to " + end);
    }
}
