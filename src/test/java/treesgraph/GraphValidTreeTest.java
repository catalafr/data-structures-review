package treesgraph;

import org.junit.Assert;
import org.junit.Test;

public class GraphValidTreeTest {

    int size = 5;
    int [][] vertices = {{0,1}, {0,2}, {0,3}, {1,4}};

    @Test
    public void testValidGraph(){
        GraphValidTree gvt = new GraphValidTree();
        System.out.println(gvt.validTree(size, vertices));
    }

}
