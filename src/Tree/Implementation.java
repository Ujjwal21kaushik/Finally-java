package Tree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class Implementation {

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; a.right =c;
        b.left = d; b.right =e;
        c.left = f; c.right =g;

        // display(a);
        // System.out.println(size(a));
        // System.out.println(sum(a));
        // System.out.println(level(a));
        // System.out.println(max(a));
        display(a);
        System.out.println();
        invert(a);
        display(a);

    }

    public static void invert(Node root) {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);        
        invert(root.right);        
    }


    private static int level(Node root) {
       if(root == null) return 0;

        return Math.max(level(root.left),level(root.right)) +1;
    }

    private static int sum(Node root) {
        if(root == null) return 0;

        int lsum = sum(root.left);
        int rsum = sum(root.right);

        return lsum + rsum + root.val;
    }

    private static int size(Node root) {
        if(root == null) return 0;

        int lc = size(root.left);
        int rc = size(root.right);

        return lc + rc +1;

    }

    public static void display(Node root) {
        if(root == null) return;

        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        
        int lrmax = Math.max(max(root.left),max(root.right));
        return Math.max(lrmax,  root.val);
    }
}
