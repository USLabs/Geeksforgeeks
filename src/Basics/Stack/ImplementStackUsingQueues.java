package Basics.Stack;

import Utility.MyQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by uslabs on 9/12/17.
 */
public class ImplementStackUsingQueues {
    public static void solution() {
        QueuingStack.push(1);
        QueuingStack.push(2);
        QueuingStack.push(3);
        QueuingStack.push(4);
        QueuingStack.push(5);
        for (int i = QueuingStack.size(); i > 0; i--) {
            System.out.println(QueuingStack.pop());
        }
    }

    public static class QueuingStack {
        static MyQueue queue = new MyQueue();

        public static int size() {
            return queue.size();
        }

        public static void push(Object o) {
            queue.add(o);
        }

        public static Object pop() {
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
            return queue.poll();
        }

        public static Object peek() {
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
            Object o = queue.poll();
            queue.add(o);
            return o;
        }

    }
}
