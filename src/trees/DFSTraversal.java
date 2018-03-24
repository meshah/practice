package trees;

public class DFSTraversal {

    Node root;

    DFSTraversal(){
        root = null;
    }

    DFSTraversal(int val){
        root = new Node(val);
    }

    public static void main(String [] args){
        DFSTraversal df = new DFSTraversal();
        df.root = new Node(1);
        df.root.left = new Node(2);
        df.root.right = new Node(3);
        df.root.left.left = new Node(4);
        df.root.left.right = new Node(5);
        df.inorderTraversal();
        df.postorderTraversal();
        df.preorderTraversal();
    }

    void inorderTraversal(){
        System.out.println("\nInorder Traversal: ");
        inorderTraversal(root);
    }

    void inorderTraversal(Node n){
        if (n==null)
            return;
        inorderTraversal(n.left);
        System.out.print(n.key+" ");
        inorderTraversal(n.right);

    }

    void postorderTraversal(){
        System.out.println("\nPostorder Traversal: ");
        postorderTraversal(root);
    }

    void postorderTraversal(Node n){
        if (n==null)
            return;
        postorderTraversal(n.left);
        postorderTraversal(n.right);
        System.out.print(n.key+" ");

    }

    void preorderTraversal(){
        System.out.println("\nPreorder Traversal: ");
        preorderTraversal(root);
    }

    void preorderTraversal(Node n){
        if (n==null)
            return;
        System.out.print(n.key+" ");
        preorderTraversal(n.left);
        preorderTraversal(n.right);
    }
}
