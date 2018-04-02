package LinkedList;

public class MergeSortedLinkedLIst {
    Node head1, head2, res;
    public static void main(String [] args){
        MergeSortedLinkedLIst rll = new MergeSortedLinkedLIst();
        rll.head1 = new Node(1);
        rll.head1.next = new Node(5);
        rll.head1.next.next = new Node(6);
        rll.head1.next.next.next = new Node(9);
        rll.head2 = new Node(1);
        rll.head2.next = new Node(3);
        rll.head2.next.next = new Node(3);
        rll.head2.next.next.next = new Node(7);
        rll.head2.next.next.next.next = new Node(8);
        rll.head2.next.next.next.next.next = new Node(11);
        Node result = rll.merge(rll.head1,rll.head2);
        while(result!=null){
            System.out.print(result.value+" ");
            result = result.next;
        }
    }

    void push(int v){
        if(res==null){
            res = new Node(v);
        }
        else{
            Node n = res;
            while(n.next!=null)
                n = n.next;
            n.next = new Node(v);
        }

    }

    Node merge(Node n1,Node n2){
        if(n1 == null)
            return n2;
        if(n2==null)
            return n1;
        Node temp1 = n1;
        Node temp2 = n2;
        while(temp1!=null && temp2!=null){
            if(temp1.value < temp2.value){
                push(temp1.value);
                temp1 = temp1.next;
            }
            else if(temp1.value > temp2.value){
                push(temp2.value);
                temp2 = temp2.next;
            }
            else{
                push(temp1.value);
                push(temp2.value);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        if(temp1!=null){
            while (temp1!=null){
                push(temp1.value);
                temp1 = temp1.next;
            }

        }

        if(temp2!=null){
            while (temp2!=null){
                push(temp2.value);
                temp2=temp2.next;
            }

        }

        return res;
    }
}
