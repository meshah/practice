package trees;
import java.util.*;
public class ZigZagTree {
    Node root;
    public static void main(String [] args){
        ZigZagTree tree_level = new ZigZagTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.right.left = new Node(5);
        tree_level.root.left.left.left = new Node(6);
        tree_level.root.left.left.right = new Node(7);
        tree_level.root.right.left.right = new Node(8);
        tree_level.printTree(tree_level.root);
    }

    void printTree(Node n){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(n);
        boolean lefttoright = true;
        while(!s1.isEmpty()){
            Node curr = s1.pop();
            System.out.print(curr.key+" ");
            if(lefttoright){
                if(curr.left!=null)
                    s2.push(curr.left);
                if(curr.right!=null)
                    s2.push(curr.right);
            }
            else{
                if(curr.right!=null)
                    s2.push(curr.right);
                if(curr.left!=null)
                    s2.push(curr.left);
            }

            if(s1.isEmpty()){
                lefttoright=!lefttoright;
                Stack <Node> temp = s1;
                s1 = s2;
                s2 = temp;
                System.out.print("\n");
            }

        }
    }
}
