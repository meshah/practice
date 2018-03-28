package LinkedList;

public class ReverseLinkedList {

    Node head;
    Node reversed;

    public static void main(String [] args){
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.head = new Node(1);
        rll.head.next = new Node(2);
        rll.head.next.next = new Node(3);
        rll.head.next.next.next = new Node(4);
        Node head = rll.reverse(rll.head);
        while(head!=null){
            System.out.print(head.value+" ");
            head = head.next;
        }

    }

    Node reverse(Node n){
        Node prev = null;
        Node next = n.next;
        Node curr = n;
        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        n=prev;
        return n;

    }
}
