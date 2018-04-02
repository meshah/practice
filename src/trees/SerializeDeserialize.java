package trees;
import java.util.*;
class Node2{
    Node2 [] branch = new Node2[10];
    int val;

    Node2(int v){
        for(int i=0;i<branch.length;i++){
            branch[i]=null;
        }
        val = v;
    }
}
public class SerializeDeserialize {
    Node2 root,newroot;
    public static void main(String [] args){
        SerializeDeserialize nlo = new SerializeDeserialize();
        nlo.root = new Node2(1);
        nlo.root.branch[0] = new Node2(12);
        nlo.root.branch[0].branch[0] = new Node2(75);
        nlo.root.branch[0].branch[1] = new Node2(6);
        nlo.root.branch[2] = new Node2(64);
        nlo.root.branch[2].branch[1] = new Node2(7);
        nlo.root.branch[1] = new Node2(3);
        String s = nlo.serialize(nlo.root);
        System.out.println(s);
        nlo.deserialize(s);
    }

    String serialize(Node2 n){
        String res = "";
        if(n==null)
            return res;

        Queue<Node2> q1 = new LinkedList();
        Queue<Node2> q2 = new LinkedList();
        q1.add(n);

        while(!q1.isEmpty() || !q2.isEmpty()){
            while(!q1.isEmpty()){
                Node2 curr1 = q1.poll();
                if(curr1!=null){
                    res = res+curr1.val+" ";
                    for(int i=0;i<curr1.branch.length;i++){
                        if(curr1.branch[i]!=null)
                            q2.add(curr1.branch[i]);
                        else
                            q2.add(null);
                    }
                }
                else
                    res = res+"n ";

            }
            res = res+"&";
            while(!q2.isEmpty()){
                Node2 curr2 = q2.poll();
                if(curr2!=null) {
                    res = res+curr2.val+" ";
                    for(int i=0;i<curr2.branch.length;i++){
                        if(curr2.branch[i]!=null)
                            q1.add(curr2.branch[i]);
                        else
                            q1.add(null);
                    }
                }
                else
                    res = res+"n ";

            }
            res = res+"&";
        }
        return res;
    }

    void deserialize(String s){
        Node2 n = newroot;
        String [] level = s.split("&");
        for(int i=0;i<level.length;i++){
            if(level[i].length()!=0){
                String [] nodes = level[i].split(" ");
                    for(int j=0;j<nodes.length;j++){
                        if(nodes[j].length()==1){
                            if(nodes[j]!="s")
                                n = new Node2(Integer.parseInt(nodes[j]));
                            else
                                n = null;
                    }
                }
            }
        }
    }
}
