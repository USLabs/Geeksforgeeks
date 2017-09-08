package Sorting;

/**
 * Created by uslabs on 9/5/17.
 */
public class QuickSort {
    public static void Solution() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSortRecur(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void quickSortRecur(int[] arr, int start, int end) {
        if (end <= start)
            return;
        if (end - start == 1) {
            if (arr[start] > arr[end]) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                return;
            }
        }
        int partition = (start + end) / 2;

        for (int i = start; i <= end; i++) {
            if ((arr[i] > arr[partition] && i < partition) || (arr[i] < arr[partition] && i > partition)) {
                int temp = arr[i];
                arr[i] = arr[partition];
                arr[partition] = temp;
                partition = i;
            }
        }

        quickSortRecur(arr, start, partition);
        quickSortRecur(arr, partition, end);
    }
}
