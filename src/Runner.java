import Basics.Stack.InfixToPostficConversionUsingStack;
import Trees.*;

/**
 * Created by techmint on 12/30/16.
 */
public class Runner {
    public static void main(String[] args) {

        InfixToPostficConversionUsingStack.solution();
    }

    static treeNode createTree() {
        treeNode t = new treeNode(3);
        t.left = new treeNode(2);
        t.right = new treeNode(5);
        t.left.left = new treeNode(1);
        t.left.right = new treeNode(4);
        return t;
    }
}