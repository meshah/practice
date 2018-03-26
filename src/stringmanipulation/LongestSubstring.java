package stringmanipulation;
import java.util.*;
public class LongestSubstring {

    public static void main(String [] args){
        LongestSubstring ls = new LongestSubstring();
        String s = "abcabcdbb";
        int res = ls.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();


        String subset = "";
        int index = -1;
        while (index < ch.length-2) {
            Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
            String temp = "";
            for (int i = index + 1; i < ch.length; i++) {
                if (hm.containsKey(ch[i])) {
                    for (char key : hm.keySet()) {
                        System.out.println(key);
                        temp = temp + key;
                    }
                    System.out.println("----");
                    if (temp.length() > subset.length()){
                        subset = temp;
                        //System.out.println(subset);
                    }

                    index = hm.get(ch[i]);
                    break;
                } else
                    hm.put(ch[i], i);
            }
        }
        return subset.length();
    }

}
