package trees;

public class CreateTree {

    Node root;

    CreateTree(){
        root = null;
    }

    CreateTree(int val){
        root = new Node(val);
    }

    public static void main(String [] args){
        CreateTree ct = new CreateTree();
        ct.root = new Node(1);
        ct.root.left = new Node(2);
        ct.root.right = new Node(3);
        ct.root.left.left = new Node(4);
    }
}
