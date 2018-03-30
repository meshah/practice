package stringmanipulation;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String [] args){
        String [] s = {"geeksforgeeks", "geeks", "geekse", "geekszer"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String res = lcp.find(s);
        System.out.println(res);
    }

    String find(String [] s){
        if(s.length==0)
            return "";
        if(s.length==1)
            return s[0];
        int minlen = s[0].length();
        for(String str:s){
            if(str.length()<minlen)
                minlen = str.length();
        }

        for(int i=0;i<minlen;i++){
            for(int j=0;j<s.length-1;j++){
                if(s[j].charAt(i)!=s[j+1].charAt(i))
                    return s[j].substring(0,i);
            }
        }
        return s[0].substring(0,minlen);
    }
}
