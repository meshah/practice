package LinkedList;

public class RemoveMiddleNode {
    Node head;
    public static void main(String [] args){
        RemoveMiddleNode rll = new RemoveMiddleNode();
        rll.head = new Node(1);
        rll.head.next = new Node(2);
        rll.head.next.next = new Node(3);
        rll.head.next.next.next = new Node(4);
        rll.head.next.next.next.next = new Node(5);
        Node n = rll.find(rll.head);
        rll.deleteNode(n.value);
    }

    Node find(Node n){
        Node n1 = n;
        Node n2 = n;
        while (n2!=null && n2.next!=null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        return n1;
    }

    void deleteNode(int n){
        Node curr = head;
        if(head.value==n){
            head = head.next;
        }
        else{
            Node prev = curr;
            curr = curr.next;
            boolean flag = false;
            while(curr!=null){
                if(curr.value==n){
                    prev.next = curr.next;
                    flag=true;
                    break;
                }
                else{
                    prev = curr;
                    curr = curr.next;
                }

            }
            if(flag==false)
                System.out.println("Number not found!");
            else
                System.out.println("Deleted!");
            Node c = head;
            while(c!=null){
                System.out.println(c.value+" ");
                c = c.next;
            }
        }
    }
}
