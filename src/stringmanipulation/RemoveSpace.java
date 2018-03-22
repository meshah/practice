//Removce spaces from the given string
package stringmanipulation;

public class RemoveSpace {

    public static void main(String [] args){
        String s = "     g  eeks   for ge  eeks  ";
        RemoveSpace rs = new RemoveSpace();
        rs.remove(s);
    }

    void remove(String s){
        char[] ch = s.toCharArray();
        int index = 0;
        int i=0;
        while(i<ch.length){
            if(ch[i]!=' '){
                ch[index]=ch[i];
                index++;
            }
            i++;
        }
        s = new String(ch);
        s = s.substring(0,index-1);
        System.out.println(s);
    }
}
