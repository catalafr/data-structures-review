package treesgraph;

import java.util.*;


public class BinaryTreeVerticalOrderTraversal {

    public List<List<Integer>> verticalOrder(TreeNode root) {

        List<List<Integer>> res = new LinkedList<>();


        Map<Integer, List> holder = new HashMap<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        Deque<Integer> cols = new ArrayDeque<>();


        int minIndex = 0;
        int maxIndex = 0;

        s.add(root);
        cols.add(0);


        while(!s.isEmpty()){

            TreeNode node = s.poll();
            int col = cols.poll();

            if(!holder.containsKey(col)){
                holder.put(col, new LinkedList());
            }

            holder.get(col).add(node.val);

            //Go left.
            if(node.left != null){
                s.add(node.left);
                cols.add(col - 1);
                minIndex = Math.min(minIndex, col -1);
            }

            if(node.right != null){
                s.add(node.right);
                cols.add(col +1);
                maxIndex = Math.max(maxIndex, col +1);
            }
        }

        for(int i = minIndex; i <= maxIndex ; i++)
            res.add(holder.get(i));


        return res;
    }
}
