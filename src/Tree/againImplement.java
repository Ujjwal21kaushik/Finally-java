package Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class againImplement {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(10);

        // Let's Connect hehehehe

        a.left = b;  a.right = c;
        b.left = d;   b.right = e;
        c.left = f;   c.right = g;

        // Function start...

        postOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        preOrder(a);
        
       
    }
    private static void postOrder(TreeNode root) {
      if(root == null) return;

      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.val+" ");
    }
    private static void inOrder(TreeNode root) {
        if(root == null) return;
        
        postOrder(root.left);
        System.out.print(root.val+" ");
        postOrder(root.right);
    }
    private static void preOrder(TreeNode root) {
      if(root == null) return;

      System.out.print(root.val+" ");
      postOrder(root.left);
      postOrder(root.right);
    }

    

}
