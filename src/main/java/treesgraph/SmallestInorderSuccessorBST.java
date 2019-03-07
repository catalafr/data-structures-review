package treesgraph;

import java.util.LinkedList;
import java.util.List;

public class SmallestInorderSuccessorBST {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode> elements = new LinkedList<>();
        helper(root, elements);

        for(int i = 0; i < elements.size(); i++){
            if(p == elements.get(i)){
                if(i + 1 < elements.size()){
                    return elements.get(i + 1);
                }
            }
        }

        return null;
    }

    public void helper(TreeNode start, List<TreeNode> elements){
        if(start == null) return;

        helper(start.left, elements);
        elements.add(start);
        helper(start.right, elements);
    }



    public TreeNode recursive(TreeNode s, TreeNode p){
        
        if(s == null)
            return null;

        if(s.val <= p.val){
            return recursive(s.right, p);
        }

        else {
            TreeNode res = recursive(s.left, p);
            return res == null ? s : res;
        }
    }
}
