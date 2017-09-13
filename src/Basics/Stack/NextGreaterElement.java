package Basics.Stack;

import java.util.Stack;

/**
 * Created by uslabs on 9/12/17.
 */
public class NextGreaterElement {
    public static void solution() {
        int[] arr = {11, 13, 21, 3};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() < arr[i])
                System.out.println(stack.pop() + "  ----------->  " + arr[i]);
            stack.push(arr[i]);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop() + "  ----------->  " + -1);
    }
}
