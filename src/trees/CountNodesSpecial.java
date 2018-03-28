package trees;

public class CountNodesSpecial {
    Node root;
    public static void main(String [] args){
        CountNodesSpecial cn = new CountNodesSpecial();
        cn.root = new Node(4);
        cn.root.left = new Node(2);
        cn.root.right = new Node(5);
        cn.root.left.left = new Node(1);
        cn.root.left.right = new Node(3);
        int count = cn.count(cn.root);
        System.out.println("Count is "+count);
    }

    int count(Node root){
        if(root.left==null && root.right==null)
            return 0;
        else if(root.left==null && root.right.key>root.key)
            return 1 + count(root.right);
        else if(root.left.key<root.key && root.right==null)
            return 1 + count(root.left);
        else if(root.left.key<root.key && root.right.key>root.key)
            return 1 + count(root.left) + count(root.right);
        else
            return 0;
    }

}
