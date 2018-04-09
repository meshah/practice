package LinkedList;

public class Solution {
    Node head, sortedhead;
    public static void main(String [] args){
        Solution s = new Solution();
        s.push(new Node(3));
        s.push(new Node(1));
        s.push(new Node(5));
        s.push(new Node(18));
        s.push(new Node(10));
        s.sort(s.head);
    }

    void push(Node n){
        if(head==null){
            head = n;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    void sort(Node n){
        sortedhead = null;
        Node t = n;
        while(t!=null){
            if(sortedhead == null){
                sortedhead = new Node(t.value);
            }
            else if(t.value<=sortedhead.value){
                Node temp = new Node(t.value);
                temp.next = sortedhead;
                sortedhead = temp;
            }
            else{
                Node curr = sortedhead;
                while((curr.next!=null) && (t.value>curr.next.value) ){
                    curr = curr.next;
                }
                Node temp = new Node(t.value);
                temp.next = curr.next;
                curr.next = temp;
            }
            t = t.next;
        }

        while(sortedhead!=null){
            System.out.print(sortedhead.value+" ");
            sortedhead= sortedhead.next;
        }
    }
}
