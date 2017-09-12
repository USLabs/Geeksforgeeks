package Arrays.Basics;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by uslabs on 9/10/17.
 */
public class GivenAnArrayAndNumberXCheckForPairInArrayWithSumAsX {
    public static void solution() {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int x = 16;
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1; i < j; ) {
            if ((arr[i] + arr[j]) == x) {
                System.out.println(arr[i] + " , " + arr[j]);
                return;
            }

            if ((arr[i] + arr[j]) < x) {
                i++;
                continue;
            }

            if ((arr[i] + arr[j]) > x) {
                j--;
                continue;
            }
        }
        System.out.println("No Pair Found.");
    }

    public static void solution2() {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int x = 16;

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            map.put(new Integer(i), true);
        }

        for (int i : arr) {
            if (map.get(x - i) != null) {
                System.out.println(i + " , " + (x - i));
                return;
            }
        }

        System.out.println("No Pair Found.");
    }
}
