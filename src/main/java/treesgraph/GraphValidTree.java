package treesgraph;

import java.util.*;

public class GraphValidTree {

    public boolean validTree(int n, int[][] edges) {
        if(edges == null){
            return false;
        }

        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i<n; i++){
            graph.add(new ArrayList<>());
        }

        int a,b;
        for(int p=0; p<edges.length ; p++){
            a = edges[p][0];
            b = edges[p][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean [] visited = new boolean[n];


        return !cycles(graph, 0, visited, -1) && !errands(visited);
    }

    private boolean cycles(List<List<Integer>> graph, int current, boolean [] visited, int previous) {
        if(visited[current])
            return true;

        visited[current] = true;

        //From node current, move to it's connecting node.
        for(int i = 0 ; i<graph.get(current).size() ; i++){
            int node = graph.get(current).get(i);

            //Check if the current node is not the ancestor,
            //Check recursively within the targeted node
            if(node != previous && cycles(graph, node, visited, current)){
                    return true;
            }
        }

        return false;
    }

    private boolean errands(boolean[] visited){
        for(boolean b : visited){
            if(!b) return true;
        }
        return false;
    }

}
