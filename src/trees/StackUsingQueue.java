package trees;
import java.util.*;
public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList();
    Queue<Integer> q2 = new LinkedList();
    int top;

    public static void main(String [] args){
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(2);
        sq.push(1);
        sq.findTop();
        sq.push(4);
        sq.pop();
        sq.findTop();
        sq.push(11);
        sq.findTop();
    }

    void push(int v){
        q1.add(v);
        top = v;
    }

    void pop(){
        while(q1.size()>1){
            int temp = q1.remove();
            q2.add(temp);
            top = temp;
        }
        q1.remove();
        Queue t = q1;
        q1 = q2;
        q2 = t;
    }

    void findTop(){
        System.out.println("Top is "+top);
    }
}
