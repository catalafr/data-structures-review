package design;

import org.junit.Before;
import org.junit.Test;
import treesgraph.TreeNode;

public class CodecTest {

    private TreeNode testTree;

    @Before
    public void createTrees(){

        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);

        tn1.left = tn2;
        tn1.right = null;


        testTree = tn1;
    }

    @Test
    public void testCodec(){
        Codec c = new Codec();
        System.out.println(c.deserialize(c.serialize(testTree)));

    }
}
