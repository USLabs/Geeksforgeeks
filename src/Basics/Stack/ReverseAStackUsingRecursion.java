package Basics.Stack;

import java.util.Stack;

/**
 * Created by uslabs on 9/12/17.
 */
public class ReverseAStackUsingRecursion {
    public static void solution() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        reverse(stack);
    }

    public static void reverse(Stack stack) {
        for (int i = stack.size(); i > 0; i--) {
            sendElemToPos(stack, -1, -1, i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void sendElemToPos(Stack<Integer> stack, int prev, int target, int pos) {
        if (target == -1) {
            target = stack.pop();
            pos--;
        }
        if (pos == 0) {
            stack.push(target);
            return;
        }
        prev = stack.pop();
        pos--;
        sendElemToPos(stack, prev, target, pos );
        stack.push(prev);
    }
}
