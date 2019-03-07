package design;

import treesgraph.TreeNode;

import java.util.Arrays;


public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb  = new StringBuilder();
        helper(root, sb);

        if(sb.toString().endsWith(","))
            sb.deleteCharAt(sb.toString().length() - 1);

        return sb.toString();
    }

    public void helper(TreeNode root, StringBuilder sb){
        if(root == null)
            return;

        helper(root.left, sb);
        sb.append(root.val);
        sb.append(",");
        helper(root.right, sb);
    }


    /**
     *  1,2,3,4,5,6,9
     *
     *  find middle value, make that root, split array in half.
     *
     * @param tree
     * @return
     */
    public TreeNode deserialize(String tree){
        if( tree == null || tree.equals(""))
            return null;

        String[] valStr = tree.split(",");
        int [] valInt = new int[valStr.length];

        for(int i=0 ; i<valStr.length ; i++){
            valInt[i] = Integer.valueOf(valStr[i]);
        }


        return makeBst(valInt);
    }


    private TreeNode makeBst(int [] vals){
        if(vals == null || vals.length == 0)
            return null;

        int middleIndex = vals.length / 2;
        TreeNode root = new TreeNode(vals[middleIndex]);
        root.left = makeBst(Arrays.copyOfRange(vals, 0, middleIndex));
        root.right = makeBst(Arrays.copyOfRange(vals, middleIndex + 1, vals.length ));
        return root;
    }
}
