package treesgraph;

/**
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 */

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root){
        return recursive(root, 0);
    }

    public int recursive(TreeNode node, int sum){
        if(node == null) //If node is null, just return 0; has n0 value.
            return 0;

        if(node.left == null && node.right == null) // if its a leaf, compute the sum.
            return sum*10  + node.val;

        sum = sum*10 + node.val;
        return recursive(node.left, sum) + recursive(node.right, sum);
    }

}
