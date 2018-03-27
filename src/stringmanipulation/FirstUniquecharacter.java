package stringmanipulation;
import java.util.*;
public class FirstUniquecharacter {

    public static void main(String[] args) {
        FirstUniquecharacter f = new FirstUniquecharacter();
        String s = "loveleetcode";
        int i = f.getIndex(s);
        System.out.println(i);
    }

    int getIndex(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
        int index = -1;
        for (int i = 0; i < ch.length; i++) {
            if (hm.containsKey(ch[i]))
                hm.put(ch[i], -1);
            else
                hm.put(ch[i], i);
        }
        for (HashMap.Entry me : hm.entrySet()) {
            index = Integer.parseInt(me.getValue().toString());
            if (index!=-1) {
                break;
            }
        }
        return index;
    }
}
