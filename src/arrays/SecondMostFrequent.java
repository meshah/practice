package arrays;
import java.util.*;
public class SecondMostFrequent {

    public static void  main(String [] args){
        String str = "geeksforgeeks";
        SecondMostFrequent smf = new SecondMostFrequent();
        smf.findNumber(str);
    }

    void findNumber(String str){
        char [] ch = str.toCharArray();
        HashMap <Character,Integer> hm = new HashMap <Character,Integer> ();
        for(int i=0;i<str.length();i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i],hm.get(ch[i])+1);
            }
            else
                hm.put(ch[i],1);
        }
        int max = -1;
        int secondmax = -1;
        char maxres = '\0';
        char secondmaxres = '\0';

        for(Map.Entry<Character,Integer> me: hm.entrySet()){
            System.out.println(me.getKey()+": "+me.getValue());
            if(me.getValue()>=max) {
                secondmax = max;
                max = me.getValue();
                secondmaxres = maxres;
                maxres = me.getKey();
            }
            else if ((me.getValue() < max) && (me.getValue()>=secondmax)){
                secondmax = me.getValue();
                secondmaxres = me.getKey();
            }
        }

        System.out.println("Second most frequent character is "+maxres);

    }
}
