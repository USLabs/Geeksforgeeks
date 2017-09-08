package Sorting;

/**
 * Created by uslabs on 7/15/17.
 */
public class InsertionSort {
    public static void Solution() {
        int[] arr = {12, 11, 13, 5, 6};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= temp) {
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    arr[j + 1] = temp;
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void recurSolution() {
        int[] arr = {12, 11, 13, 5, 6};
        recur(0, arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void recur(int start, int[] arr) {
        int temp = arr[start];
        for (int j = start - 1; j >= 0; j--) {
            if (arr[j] >= temp) {
                arr[j + 1] = arr[j];
                arr[j] = temp;
            } else {
                arr[j + 1] = temp;
                break;
            }
        }
        if (start + 1 != arr.length) {
            recur(start + 1, arr);
        }
    }
}
