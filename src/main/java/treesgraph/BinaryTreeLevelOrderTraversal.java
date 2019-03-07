package treesgraph;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its level order traversal as:
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> holder = new LinkedList<>();
        addKidsToList(root, holder, 0);
        return holder;
    }

    public void addKidsToList(TreeNode root, List<List<Integer>> current, int level){
        if(root == null)
            return;

        if(level >= current.size()){
            List<Integer> kids = new LinkedList<>();
            current.add(kids);
        }

        current.get(level).add(root.val);

        addKidsToList(root.left, current, level +1);
        addKidsToList(root.right, current, level +1); // check,
    }
}
