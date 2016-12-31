package Trees;

/**
 * Created by techmint on 12/30/16.
 */
public class CheckIfGivenTreeIsBSTOrNot {
    public static boolean check(treeNode root) {
        return checkUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean checkUtil(treeNode root, int min, int max) {
        if (root == null) return true;
        if (root.value > max && root.value < min)
            return false;
        return (checkUtil(root.left, min, root.value) && checkUtil(root.right, root.value, max));
    }
}