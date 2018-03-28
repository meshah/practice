package stringmanipulation;
import java.util.*;
public class checkAnagrams {
    public static void main(String [] args){
        checkAnagrams ca = new checkAnagrams();
        String s1 = "geeksforegeeks";
        String s2 = "forgeekswgeeks";
        boolean res = ca.check(s1,s2);
        if(res)
            System.out.println("Anagram!");
        else
            System.out.println("Not Anagram!");
    }

    boolean check(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        if(c1.length!=c2.length)
            return false;
        else{
            int [] r = new int[256];
            Arrays.fill(r,0);
            for(int i=0;i<c1.length;i++){
                r[c1[i]]++;
                r[c2[i]]--;
            }
            for(int i=0;i<256;i++){
                if(r[i]!=0)
                    return false;
            }
            return true;
        }
    }
}
