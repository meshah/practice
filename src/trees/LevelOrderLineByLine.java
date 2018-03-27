package trees;
import java.util.*;
public class LevelOrderLineByLine {

    Node root;

    public static void main(String [] args){
        LevelOrderLineByLine lol = new LevelOrderLineByLine();
        lol.root = new Node(1);
        lol.root.left = new Node(2);
        lol.root.right = new Node(3);
        lol.root.left.right = new Node(5);
        lol.root.left.left = new Node(4);
        lol.getOrder(lol.root);
    }

    void getOrder(Node root){
        Queue <Node> q1 = new LinkedList <Node> ();
        Queue <Node> q2 = new LinkedList <Node> ();
        q1.add(root);
        while(!q1.isEmpty() || !q2.isEmpty()){
            while(!q1.isEmpty()){
                Node current1 = q1.poll();
                System.out.print(current1.key+" ");
                if(current1.left!=null)
                    q2.add(current1.left);
                if(current1.right!=null)
                    q2.add(current1.right);
            }
            System.out.print("\n");
            while(!q2.isEmpty()){
                Node current2 = q2.poll();
                System.out.print(current2.key+" ");
                if(current2.left!=null)
                    q1.add(current2.left);
                if(current2.right!=null)
                    q1.add(current2.right);
            }
            System.out.print("\n");
        }
    }
}
