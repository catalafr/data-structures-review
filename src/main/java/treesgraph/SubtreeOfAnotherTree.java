package treesgraph;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        HashSet<Integer> listS = new LinkedHashSet<>();
        HashSet<Integer> listT = new LinkedHashSet<>();

        toList(s, listS);
        toList(t, listT);

        listT.removeAll(listS);

        return listT.isEmpty();
    }

    public void toList(TreeNode s, HashSet<Integer> list){
        if(s == null) return;

        list.add(s.val);

        toList(s.left, list);
        toList(s.right, list);
    }

}
