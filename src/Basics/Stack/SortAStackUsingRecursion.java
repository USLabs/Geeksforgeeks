package Basics.Stack;

import java.util.Stack;

/**
 * Created by uslabs on 9/12/17.
 */
public class SortAStackUsingRecursion {
    public static void solution() {
        Stack<Integer> stack = new Stack<>();
        stack.push(-3);
        stack.push(14);
        stack.push(18);
        stack.push(-5);
        stack.push(30);
        sortStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void sortStack(Stack<Integer> stack) {
        for (int i = stack.size(); i > 0; i--) {
            sortUtil(stack, Integer.MAX_VALUE, i);
        }
    }

    public static int sortUtil(Stack<Integer> stack, int min, int pos) {
        if (pos == 0) {
            stack.push(min);
            return min;
        }
        int curr = stack.pop();
        min = Math.min(curr, min);
        int fMin = sortUtil(stack, min, --pos);
        if (fMin != curr)
            stack.push(curr);
        return fMin;
    }
}
