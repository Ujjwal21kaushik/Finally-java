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
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode rv = q.poll();
                list.add(rv.val);

                if(rv.left != null) q.add(rv.left);
                if(rv.right != null) q.add(rv.right);
            }
            
            ans.add(list);
        }
    }
}