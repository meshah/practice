package LinkedList;
import java.util.*;
public class RemoveDuplicate {
    Node head;
    public static void main(String [] args){
        RemoveDuplicate rll = new RemoveDuplicate();
        rll.head = new Node(1);
        rll.head.next = new Node(1);
        rll.head.next.next = new Node(3);
        rll.head.next.next.next = new Node(7);
        rll.head.next.next.next.next = new Node(8);
        rll.head.next.next.next.next.next = new Node(7);
        Node result = rll.remove(rll.head);
        while(result!=null){
            System.out.print(result.value+" ");
            result = result.next;
        }
    }

    Node remove(Node head){
       Node temp = head;
       if(temp==null)
           return head;
       Node prev = head;
       Map<Integer,Integer> hm = new HashMap<>();
       while(temp!=null){
           if(!hm.containsKey(temp.value)){
               hm.put(temp.value,1);
               prev = temp;
           }
           else{
               prev.next = temp.next;
               temp = prev;
           }
           temp = temp.next;
       }
       return head;
    }
}
