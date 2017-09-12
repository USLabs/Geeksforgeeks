package Basics.Array;

import java.util.HashMap;

/**
 * Created by uslabs on 9/10/17.
 */
public class MajorityElement {
    public static void solution() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(i) == null) {
                if (1 > arr.length / 2) {
                    System.out.println(i);
                    return;
                }
                map.put(i, 1);
            } else {
                int count = map.get(i) + 1;
                if (count > arr.length / 2) {
                    System.out.println(i);
                    return;
                }
                map.put(i, count);
            }
        }
        System.out.println("No Majority Element found.");
    }

    //Moore's Voting Algorithm

    public static void solution2() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int count = 1, majorityIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                majorityIndex = i;
            }

            if (arr[majorityIndex] == arr[i])
                count++;
            else
                count--;
        }
        if (count > 0) {
            count = 0;
            for (int i : arr) {
                if (i == arr[majorityIndex])
                    count++;
            }
            if (count > arr.length / 2) {
                System.out.println(arr[majorityIndex]);
                return;
            }

        }
        System.out.println("No Majority Element found");
    }
}
