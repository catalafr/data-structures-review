package treesgraph;

import java.util.*;

public class Graph {

    private Map<Integer, Node> helper = new HashMap<>();

    public static class Node {
        private int data;
        private List<Node> adjacent;
        public Node(int data){
            this.data = data;
            this.adjacent = new LinkedList<>();
        }

        public void addVertices(Node ... destinations){
            for(Node n : destinations){
                this.adjacent.add(n);
            }
        }
    }

    private Node getNode(int i){
        return this.helper.get(i);
    }


    public Graph(Node... nodes){
        for(Node n: nodes){
            this.helper.put(n.data, n);
        }
    }

    /**
     * Depth first search works with a stack.
     *
     * 1- Starting from destination put node in stack and move pointer to the next connected node.
     * 2- Visited items are marked as they will not be visited twice.
     * 3- When all elements have been visited and the hashset is full, we are done.
     *
     *
     * @param source
     * @param destination
     * @return
     */
    public boolean hasPathDfs(int source, int destination){
        Node srcNode = getNode(source);
        Node destNode = getNode(destination);

        Deque<Node> stack = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(srcNode);
        while(!stack.isEmpty()){
            Node current = stack.pop();

            if(visited.contains(current.data))
                continue;

            if(current.data == destNode.data)
                return true;

            visited.add(current.data);
            System.out.println("Visiting node :" + current.data);
            for(Node n : current.adjacent){
                if(!visited.contains(n.data)){
                    stack.add(n);
                    break; //Only add a single one that has not been visited.
                }
            }
        }

        return false;
    }

    public boolean hasPathDfsRecursive(int source, int destination){
        Node srcNode = getNode(source);
        Node destNode = getNode(destination);
        Set<Integer> visited = new HashSet<>();
        return dfsRecursive(srcNode, destNode, visited);
    }

    public boolean dfsRecursive(Node source, Node destination, Set<Integer> visited){
        if (visited.contains(source.data))
            return false;

        visited.add(source.data);
        if(source.data == destination.data)
            return true;

        for(Node child : source.adjacent){
            if(dfsRecursive(child, destination, visited))
                return true;
        }

        return false;
    }


    public boolean hasPathBfs(int source, int destination){
        Node sourceN = getNode(source);
        Node destN = getNode(destination);


        Queue<Node> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();


        queue.offer(sourceN);
        while(!queue.isEmpty()){
            Node current = queue.poll();

            if(visited.contains(current.data))
                continue;

            if(current.data == destN.data)
                return true;

            visited.add(current.data);
            for(Node ajd : current.adjacent){
                if(!visited.contains(ajd.data)){
                    queue.add(ajd);
                }
            }
        }

        return false;
    }

}
