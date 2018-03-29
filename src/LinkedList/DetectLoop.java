package LinkedList;
import java.util.*;
public class DetectLoop {
    Node head;
    public static void main(String [] args){
        DetectLoop dl = new DetectLoop();
        dl.head = new Node(1);
        dl.head.next = new Node(2);
        dl.head.next.next = new Node(3);
        dl.head.next.next.next = new Node(4);
        dl.head.next.next.next.next = new Node(5);
        dl.head.next.next.next.next.next = dl.head.next.next;
        boolean res = dl.findLoop(dl.head);
        if(res)
            System.out.println("Loop is present!");
        else
            System.out.println("Loop is not present!");
    }

    boolean findLoop(Node head){
        Map<Node,Integer> hm = new HashMap<Node,Integer>();
        while(head!=null){
            if(hm.containsKey(head)){
                return true;
            }
            else
                hm.put(head,1);
            head = head.next;
        }
        return false;

    }

}
