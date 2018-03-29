package trees;
import java.util.*;
class Node1{
    int value;
    Node1 [] branch = new Node1[10];

    Node1(int v){
        value = v;
        Arrays.fill(branch,null);
    }
}

public class NaryLevelOrder {

    Node1 root;

    public static void main(String [] args){
        NaryLevelOrder nlo = new NaryLevelOrder();
        nlo.root = new Node1(1);
        nlo.root.branch[0] = new Node1(12);
        nlo.root.branch[0].branch[0] = new Node1(75);
        nlo.root.branch[0].branch[1] = new Node1(6);
        nlo.root.branch[2] = new Node1(64);
        nlo.root.branch[2].branch[1] = new Node1(7);
        nlo.root.branch[1] = new Node1(3);
        nlo.getOrder(nlo.root);
    }

    void getOrder(Node1 root){
        Queue <Node1> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            Node1 temp = q.poll();
            System.out.print(temp.value+" ");
            for(int i=0;i<10;i++){
                if(temp.branch[i]!=null){
                    q.add(temp.branch[i]);
                }
            }
        }
    }
}
