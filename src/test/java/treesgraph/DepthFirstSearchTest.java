package treesgraph;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class DepthFirstSearchTest {

    private Graph graph;

    @Before
    public void createGraph(){
        Graph.Node n1 = new Graph.Node(1);
        Graph.Node n2 = new Graph.Node(2);
        Graph.Node n3 = new Graph.Node(6);
        Graph.Node n4 = new Graph.Node(10);
        Graph.Node n5 = new Graph.Node(9);
        Graph.Node n6 = new Graph.Node(11);

        n1.addVertices(n2,n3);
        n2.addVertices(n1,n3);
        n3.addVertices(n1,n2,n4);
        n4.addVertices(n3);

        n5.addVertices(n6);
        n6.addVertices(n5);

        this.graph = new Graph(n1,n2,n3,n4,n5,n6);
    }

    @Test
    public void testDfs(){
        boolean hasPath211 = this.graph.hasPathDfs(2, 11);
        Assert.assertFalse(hasPath211);
    }

    @Test
    public void testDfsRecursive(){
        boolean hasPath211 = this.graph.hasPathDfsRecursive(2, 11);
        Assert.assertFalse(hasPath211);
    }


    @Test
    public void testBFS(){
        boolean shouldbefalse = this.graph.hasPathBfs(2, 11);
        Assert.assertFalse(shouldbefalse);

        boolean shouldbetrue = this.graph.hasPathBfs(2,10);
        Assert.assertTrue(shouldbetrue);
    }

}
