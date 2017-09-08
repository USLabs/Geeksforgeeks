package Sorting;

/**
 * Created by uslabs on 9/5/17.
 */
public class HeapSort {
    public static void Solution() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[0]);
            arr[0] = arr[n - 1];
            n--;
            heapify(arr, n);
        }
    }

    public static void heapify(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = i;
            if (arr[temp] < arr[2 * i])
                temp = 2 * i;
            if (arr[temp] < arr[2 * i + 1])
                temp = 2 * i + 1;
            int tempo = arr[i];
            arr[i] = arr[temp];
            arr[temp] = tempo;
        }
    }
}
