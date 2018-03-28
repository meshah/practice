package Stack;

class Element{
    int value;
    int minval;
    Element next;

    Element(int v, int mv){
        value = v;
        minval = mv;
    }
}

public class MinStack {
    Element top;
    public static void main(String [] args){
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(1);
        ms.pop();
        ms.findmin();
        ms.push(9);
        ms.push(2);
        ms.push(0);
        ms.findmin();
        ms.pop();
        ms.push(11);
        ms.findmin();
    }

    void push(int v){
        if(top == null){
            top = new Element(v,v);
        }
        else{
            Element e = new Element(v,Math.min(v,top.minval));
            e.next = top;
            top = e;
        }
    }

    void pop(){
        if(top==null)
            return;
        else
            top=top.next;
    }

    void findmin(){
        System.out.println(top.minval);
    }
}
