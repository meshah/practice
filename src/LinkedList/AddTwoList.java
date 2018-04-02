package LinkedList;

public class AddTwoList {
    Node head1,head2,res;
    public static void main(String [] args){
        AddTwoList rll = new AddTwoList();
        rll.head1 = new Node(1);
        rll.head1.next = new Node(5);
        rll.head1.next.next = new Node(6);
        rll.head1.next.next.next = new Node(9);
        rll.head2 = new Node(1);
        rll.head2.next = new Node(3);
        rll.head2.next.next = new Node(3);
        rll.head2.next.next.next = new Node(7);
        rll.head2.next.next.next.next = new Node(9);
        rll.head2.next.next.next.next.next = new Node(9);
        Node n = rll.add(rll.head1,rll.head2);
        while(n!=null){
            System.out.print(n.value+" ");
            n = n.next;
        }
    }

    Node add(Node head1,Node head2){
        if(head1==null)
            return head2;

        if(head2==null)
            return head1;

        int carry = 0;
        int sum = 0;

        while(head1!=null && head2!=null){
            sum = head1.value+head2.value+carry;
            carry = sum/10;
            sum = sum%10;
            push(sum);
            head1 = head1.next;
            head2 = head2.next;
        }


        if(head1!=null){
            while(head1!=null){
                sum = head1.value+carry;
                carry = sum/10;
                sum = sum%10;
                push(sum);
                head1=head1.next;
            }
        }

        if(head2!=null){
            while(head2!=null){
                sum = head2.value+carry;
                carry = sum/10;
                sum = sum%10;
                push(sum);
                head2=head2.next;
            }
        }

        if(carry>0)
            push(carry);

        return res;
    }

    void push(int v){
        Node temp = res;
        if(res==null)
            res = new Node(v);
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(v);
        }
    }
}
