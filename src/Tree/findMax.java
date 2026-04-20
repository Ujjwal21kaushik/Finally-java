package Tree;



public class findMax {
    public static void main(String[] args) {
        

    }
    public int maxTree(){
        return maxTree(root);
    }

    private static int maxTree(Node root) {
        if(root == null) return Integer.MIN_VALUE;

        int lmax = maxTree(root.left);
        int rmax = maxTree(root.right);

        return Math.max(lmax,Math.max(rmax,root.data));
    }

    public boolean find(int val){
        return find(root,val);
    }
    private boolean find(Node root, int val) {
        if (root == null) return false;

        
        if (root.data == val) return true;
        
        return find(root.left, val) || find(root.right, val);
    }
}
