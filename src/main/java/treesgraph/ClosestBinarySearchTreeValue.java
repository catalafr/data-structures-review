package treesgraph;


public class ClosestBinarySearchTreeValue {

    public TreeNode searchNode(TreeNode node, int value){

        if(node == null) //Base step;
            return null;

        if(node.val == value)
            return node;

        return value > node.val ?  searchNode(node.right, value) : searchNode(node.left, value);
    }

    public void iterateAndPrint(TreeNode node){
        if(node.left != null) iterateAndPrint(node.left);
        if(node.right != null) iterateAndPrint(node.right);
        if(node != null) System.out.println(node.val);
    }

    public int closestValue(TreeNode root, double target){
        return searchClosest(root, root.val, target);
    }

    public int searchClosest(TreeNode root, int currentMin, double target){
        if(root == null)
            return currentMin;

        if(Math.abs(root.val - target) < Math.abs(currentMin - target))
            currentMin = root.val;

        return target > root.val ? searchClosest(root.right, currentMin, target)
                : searchClosest(root.left, currentMin, target);
    }


}