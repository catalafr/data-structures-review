package treesgraph;

import org.junit.Before;
import org.junit.Test;

public class NumOfIslandTest {

    char [][] test;

    @Before
    public void createArray(){
        //[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
        //[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
        char[][]grid = new char[4][5];
        grid[0] = new char[]{'1','1','1','0','0'};
        grid[1] = new char[]{'1','1','0','1','0'};
        grid[2] = new char[]{'1','1','0','0','0'};
        grid[3] = new char[]{'0','0','0','0','0'};

        this.test = grid;

        char[][]grid2 = new char[4][5];
        grid2[0] = new char[]{'1','1','0','0','0'};
        grid2[1] = new char[]{'1','1','0','0','0'};
        grid2[2] = new char[]{'0','0','1','0','0'};
        grid2[3] = new char[]{'0','0','0','1','1'};
        this.test = grid2;


        char[][]grid3 = new char[3][3];
        grid3[0] = new char[]{'1','1','1'};
        grid3[1] = new char[]{'0','1','0'};
        grid3[2] = new char[]{'1','1','1'};
        this.test = grid3;
    }

    @Test
    public void testNumOfIslands(){
        NumberOfIslands noi = new NumberOfIslands();
        noi.numIslands(test);
    }
}
