package trees;

public class CountNodes {

    Node root;

    public static void main(String [] args){
        CountNodes cn = new CountNodes();
        cn.root = new Node(1);
        cn.root.left = new Node(2);
        cn.root.right = new Node(3);
        cn.root.left.left = new Node(4);
        cn.root.left.right = new Node(5);
        cn.root.right.left = new Node(6);
        int c = cn.count(cn.root);
        System.out.println("Number of nodes in a tree are "+c);
    }

    int count(Node root){
        if(root==null)
            return 0;
        return 1+count(root.left)+count(root.right);
    }
}
