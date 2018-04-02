package stringmanipulation;
import java.util.*;
public class ValidParanthesis {
    public static void main(String [] args){
        ValidParanthesis vp = new ValidParanthesis();
        String s = "{}[{(})()]";
        boolean res = vp.check(s);
        if(res==true)
            System.out.println("Valid!");
        else
            System.out.println("Invalid!");
    }

    boolean check(String s){
        char [] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c:ch){
            if(c=='[')
                st.push(']');
            else if(c=='{')
                st.push('}');
            else if(c=='(')
                st.push(')');
            else if(st.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }
}
