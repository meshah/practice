package trees;

import java.util.*;

public class EncodeDecode {
    Node root;
    public static void main(String [] args){
        EncodeDecode ed = new EncodeDecode();
        ed.root = new Node(1);
        ed.root.left = new Node(2);
        ed.root.right = new Node(3);
        ed.root.left.right = new Node(5);
        ed.root.left.left = new Node(4);
        ed.root.right.right = new Node(7);
        ed.root.right.left = new Node(6);
        StringBuilder sb = new StringBuilder();
        String s = ed.encode(ed.root,sb);
        System.out.println(s);
        Node newroot = ed.decode(s);
        StringBuilder sb1 = new StringBuilder();
        String s1 = ed.encode(newroot,sb1);
        System.out.println(s1);
    }

    String encode(Node n, StringBuilder sb){
        if(n==null)
            sb.append("n").append(",");
        else{
            sb.append(n.key).append(",");
            encode(n.left,sb);
            encode(n.right,sb);
        }
        return sb.toString();

    }

    Node decode(String s){
        Queue<String> dq = new LinkedList<>();
        dq.addAll(Arrays.asList(s.split(",")));
        return buildTree(dq);
    }

    Node buildTree(Queue <String> d){
        String v = d.remove();
        if(v.equals("n"))
            return null;
        else{
            Node n = new Node(Integer.valueOf(v));
            n.left = buildTree(d);
            n.right = buildTree(d);
            return n;
        }

    }
}
