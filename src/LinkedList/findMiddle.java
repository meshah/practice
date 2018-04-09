package LinkedList;

public class findMiddle {
    Node head;
    public static void main(String [] args){
        findMiddle fm = new findMiddle();
        fm.push(new Node(1));
        fm.push(new Node(2));
        fm.push(new Node(3));
        fm.push(new Node(4));
        fm.push(new Node(5));
        int middle = fm.findMid(fm.head);
        System.out.println(middle);

    }

    void push(Node n){
        if(head==null)
            head = n;
        else{
            Node temp = head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=n;
        }
    }

    int findMid(Node n){
        Node midptr = n;
        Node endptr = n;
        while(endptr.next!=null && endptr.next.next!=null){
            midptr=midptr.next;
            endptr=endptr.next.next;
        }
        return midptr.value;
    }
}
