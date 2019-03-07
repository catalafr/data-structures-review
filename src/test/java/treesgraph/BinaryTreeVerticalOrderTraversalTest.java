package treesgraph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BinaryTreeVerticalOrderTraversalTest {

    private TreeNode testTree;

    @Before
    public void createTrees(){

        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(9);
        TreeNode tn3 = new TreeNode(20);
        TreeNode tn4 = new TreeNode(15);
        TreeNode tn5 = new TreeNode(7);

        tn1.left = tn2;
        tn1.right = tn3;
        tn3.left = tn4;
        tn3.right = tn5;


        testTree = tn1;
    }

    @Test
    public void testLevelOrderTraversal(){
        BinaryTreeVerticalOrderTraversal btot = new BinaryTreeVerticalOrderTraversal();
        List<List<Integer>> mylist =  btot.verticalOrder(testTree);

        System.out.println(mylist);
    }
}
