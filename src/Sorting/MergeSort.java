package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by uslabs on 7/15/17.
 */
public class MergeSort {
    public static void Solution() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        iterMergeSort(arr);
        //mergeSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1)
            return;
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                arr[0] = arr[0] ^ arr[1];
                arr[1] = arr[0] ^ arr[1];
                arr[0] = arr[0] ^ arr[1];
            }
            return;
        }
        int[] left = new int[arr.length / 2];
        int[] right = new int[(arr.length % 2 == 0) ? arr.length / 2 : arr.length / 2 + 1];
        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, left.length, right, 0, right.length);
        /*
        // Could also use
        left = Arrays.copyOfRange(arr, 0, left.length);
        right = Arrays.copyOfRange(arr, left.length, arr.length);
        */
        mergeSort(left);
        mergeSort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.length || j < right.length) {
            if (i == left.length) {
                arr[k] = right[j];
                j++;
                k++;
                continue;
            }
            if (j == right.length) {
                arr[k] = left[i];
                i++;
                k++;
                continue;
            }
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }

    public static void iterMergeSort(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {

        }
    }
}