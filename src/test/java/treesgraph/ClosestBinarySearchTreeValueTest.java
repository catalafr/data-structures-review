package treesgraph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClosestBinarySearchTreeValueTest {

    private TreeNode testTree;

    @Before
    public void createTrees(){

        TreeNode tn1 = new TreeNode(2);
        TreeNode tn2 = new TreeNode(1);
        TreeNode tn3 = new TreeNode(6);
        TreeNode tn4 = new TreeNode(5);
        TreeNode tn5 = new TreeNode(8);
        TreeNode tn6 = new TreeNode(7);
        TreeNode tn7 = new TreeNode(9);

        tn1.left = tn2;
        tn1.right = tn3;
        tn3.left = tn4;
        tn3.right = tn5;
        tn5.left = tn6;
        tn5.right = tn7;

        testTree = tn1;
    }

    @Test
    public void testRecursion() {
        ClosestBinarySearchTreeValue b = new ClosestBinarySearchTreeValue();
        TreeNode tn = b.searchNode(testTree, 8);
        Assert.assertNotEquals(null, tn);
        Assert.assertSame(tn, testTree.right.right);
    }

    @Test
    public void testIteration(){
        ClosestBinarySearchTreeValue b = new ClosestBinarySearchTreeValue();
        b.iterateAndPrint(testTree);
    }
}
