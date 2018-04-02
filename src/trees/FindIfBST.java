package trees;

public class FindIfBST {
    Node root;

    public static void main(String [] args){
        FindIfBST cn = new FindIfBST();
        cn.root = new Node(1);
        cn.root.left = new Node(1);
        //cn.root.right = new Node(5);
        //cn.root.left.left = new Node(1);
        //cn.root.left.right = new Node(3);
        boolean res = cn.checkBST(cn.root);
        if(res)
            System.out.println("The given tree is BST!");
        else
            System.out.println("The given tree is not BST!");
    }

    boolean checkBST(Node root){
        if ((root.left==null) && (root.right==null)){
            return true;
        }
        else if ((root.left.key<root.key) && (root.right==null)){
            return checkBST(root.left);
        }
        else if ((root.left==null) && (root.right.key>root.key)){
            return checkBST(root.right);
        }
        else if ((root.left.key<root.key) && (root.right.key>root.key)) {
            return (checkBST(root.left) && checkBST(root.right));
        }
        else{
            return false;
        }
    }
}
