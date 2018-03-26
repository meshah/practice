package LinkedList;

public class InsertionSort {

    Node head;
    Node sorted;
    public static void main(String [] args){
        InsertionSort is = new InsertionSort();
        is.push(5);
        is.push(20);
        is.push(4);
        is.push(3);
        is.push(30);
        System.out.println("UnSorted: ");
        Node c = is.head;
        while(c!=null){
            System.out.print(c.value+" ");
            c = c.next;
        }
        System.out.println("\n");
        is.doInsertionSort(is.head);
    }

    void push(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void doInsertionSort(Node n){
        sorted = null;
        Node current = n;
        while(current!=null){
            if((sorted==null) || (sorted.value >= current.value)){
                current.next = sorted;
                sorted = current;
            }
            else{
                Node temp = sorted;
                while((temp.next!=null) && (temp.next.value < current.value)){
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = current.next;
        }
        while(sorted!=null){
            System.out.print(sorted.value+" ");
            sorted= sorted.next;
        }
    }
}
