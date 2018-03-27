package trees;
import java.util.*;
public class LevelOrderTraversalQueue {

    Node root;

    public static void main(String [] args){
        LevelOrderTraversalQueue tree_level = new LevelOrderTraversalQueue();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.getLevelOrder(tree_level.root);
    }

    void getLevelOrder(Node root){
        Queue <Node> q = new LinkedList <Node> ();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.poll();
            System.out.print(current.key+" ");
            if(current.left!=null)
                q.add(current.left);
            if(current.right!=null)
                q.add(current.right);
        }
    }
}
