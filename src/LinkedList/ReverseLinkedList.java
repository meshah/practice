package LinkedList;

public class ReverseLinkedList {

    Node head, reversed;

    public static void main(String [] args){
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.head = new Node(1);
        rll.head.next = new Node(3);
        rll.head.next.next = new Node(2);
        rll.head.next.next.next = new Node(4);
        Node head = rll.rev(rll.head);
        while(head!=null){
            System.out.print(head.value+" ");
            head = head.next;
        }

    }

    Node rev(Node n){
        Node curr = n;
        reversed = null;
        while(curr!=null){
            Node temp = new Node(curr.value);
            temp.next = reversed;
            reversed = temp;
            curr = curr.next;
        }
        return reversed;
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
