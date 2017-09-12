package Basics.Array;

import Utility.ArrayUtility;

/**
 * Created by uslabs on 9/11/17.
 */
public class ReversalAlgorithmForArrayRotation {
    public static void solution() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        for (int i = 0; i <= d / 2 - 1; i++) {
            swap(arr, i, d - i - 1);
        }
        for (int i = d; i <= d + (arr.length - d) / 2; i++) {
            swap(arr, i, arr.length - i - 1 + d);
        }
        for (int i = 0; i <= arr.length / 2 - 1; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        ArrayUtility.printArray(arr);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
