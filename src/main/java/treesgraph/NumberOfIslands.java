package treesgraph;

import java.util.*;

public class NumberOfIslands {

    private class Pair<X, Y> {
        X x;
        Y y;

        public Pair(X x, Y y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return x.equals(pair.x) &&
                    y.equals(pair.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int numIslands(char[][] grid) {

        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        Deque<Pair<Integer, Integer>> stack = new ArrayDeque<>();

        int numOfIsland = 0;

        for(int i = 0; i< grid.length; i++){
            for(int p = 0; p < grid[i].length ; p++){
                Pair<Integer, Integer> node = new Pair<>(i, p);
                if(grid[i][p] == '1' && !visited.contains(node)){
                    dfs(node, visited, stack, grid);
                    numOfIsland++;
                }
            }
        }

        return numOfIsland;
    }

    public void dfs(Pair<Integer, Integer> start,
                    Set<Pair<Integer, Integer>> visited,
                    Deque<Pair<Integer, Integer>> stack,
                    char[][] grid){

        stack.push(start);
        while(!stack.isEmpty()){
            //Visit all adjacent nodes until we are done.
            Pair<Integer, Integer> current = stack.pop();
            if(visited.contains(current))
                continue;

            System.out.println("Visiting coordinates : " + current.x  + "," + current.y);
            visited.add(current);

            if(current.x - 1 >= 0){ //check left
                int x = current.x - 1;
                int y = current.y;
                Pair<Integer,Integer> leftPair = new Pair<>(x,y);
                if(grid[x][y] == '1' && !visited.contains(leftPair)){
                    stack.push(leftPair);
                }
            }

            if(current.x + 1 < grid.length){
                int x = current.x + 1;
                int y = current.y;
                Pair<Integer,Integer> rightPair = new Pair<>(x,y);
                if(grid[x][y] == '1' && !visited.contains(rightPair)){
                    stack.push(rightPair);
                }
            }

            if(current.y + 1 < grid[0].length){ //Check top
                int x = current.x;
                int y = current.y + 1;
                Pair<Integer,Integer> downPair = new Pair<>(x,y);
                if(grid[x][y] == '1' && !visited.contains(downPair) ){
                    stack.push(downPair);
                }

            }

            if(current.y - 1 >= 0){ //Check down
                int x = current.x;
                int y = current.y - 1;
                Pair<Integer,Integer> topPair = new Pair<>(x,y);
                if(grid[x][y] == '1' && !visited.contains(topPair)){
                    stack.push(topPair);
                }
            }
        }

        System.out.println("ISLAND FINISHED!");
    }


    public int numIslandsOptimized(char[][] grid) {

        int numOfIsland = 0;

        for(int i = 0; i< grid.length; i++){
            for(int p = 0; p < grid[i].length ; p++){
                if(grid[i][p] == '1'){
                    dfsOptimized(i,p,grid);
                    numOfIsland++;
                }
            }
        }

        return numOfIsland;
    }

    public void dfsOptimized(int x, int y, char[][] grid){
        if(x < 0 || y < 0 || x > grid[0].length || y > grid.length || grid[x][y] != '1')

        grid[x][y] = '0';

        dfsOptimized(x - 1, y, grid);
        dfsOptimized(x + 1, y, grid);
        dfsOptimized(x, y + 1 , grid);
        dfsOptimized(x, y - 1, grid);
    }
}
