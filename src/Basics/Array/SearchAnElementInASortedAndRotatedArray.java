package Basics.Array;

/**
 * Created by uslabs on 9/10/17.
 */
public class SearchAnElementInASortedAndRotatedArray {
    public static void solution() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int x = 3;
        searchUtil(arr, 0, arr.length - 1, 9);
    }

    public static void searchUtil(int[] arr, int start, int end, int x) {
        if (end < start)
            return;


        if (end - start == 0) {
            if (x == arr[start])
                System.out.println(start);
            return;
        }

        int middle = start + (end - start) / 2;
        if (x == arr[middle]) {
            System.out.println(middle);
            return;
        }

        if (end - start == 1) {
            if (arr[start] == x)
                System.out.println(start);
            if (arr[end] == x)
                System.out.println(end);
            return;
        }

        if (arr[middle] > arr[start]) {
            if (x >= arr[start] && x <= arr[middle]) {
                searchUtil(arr, start, middle, x);
                return;
            } else {
                searchUtil(arr, middle, end, x);
                return;
            }
        } else {
            if (x >= arr[middle] && x <= arr[end]) {
                searchUtil(arr, middle, end, x);
                return;
            } else {
                searchUtil(arr, start, middle, x);
                return;
            }
        }
    }
}
