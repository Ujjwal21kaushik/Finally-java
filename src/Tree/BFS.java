package Tree;
import java.util.*;


public class BFS{
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {
        }
        
    }
    public void level(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode rv = q.poll();
            System.out.print(rv +" ");

            if(rv.left != null) q.add(rv.left);
            if(rv.right != null) q.add(rv.right);
        }
    }
}