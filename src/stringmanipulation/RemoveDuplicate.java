//Remove all duplicates from a given string without using Collections

package stringmanipulation;
import java.util.Arrays;
public class RemoveDuplicate {

    public static void main(String [] args){
        RemoveDuplicate rd = new RemoveDuplicate();
        String s = "Geeks for geeks";
        rd.removeDuplicate(s);
    }

    void removeDuplicate(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        int index = 1;
        int i=0;
        while(i<ch.length-1){
            if(ch[i]!=ch[i+1]){
                ch[index]=ch[i+1];
                index++;
            }
            i++;
        }
        s = new String(ch);
        s = s.substring(0,8);
        System.out.println(s);

    }

}
