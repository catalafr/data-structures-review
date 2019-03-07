package treesgraph;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 * stack ---> [5,3,4,6,7]
 *
 *
 * Example 1:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * Output: True
 *
 *
 * Example 2:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * Output: False
 */
public class TwoSumIV {

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> container = new HashSet<>();
        return checkFromSet(root, container, k);
    }

    public boolean checkFromSet(TreeNode root, Set<Integer> container, int k){
        if(root == null) return false;

        if(container.contains(root.val - k)) return true;

        container.add(root.val);
        return checkFromSet(root.left, container, k) || checkFromSet(root.right, container, k);
    }

}
