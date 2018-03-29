package stringmanipulation;
import java.util.*;
public class groupAnagrams {
    public static void main(String [] args){
        groupAnagrams gs = new groupAnagrams();
        List <List<String>> l = new ArrayList<List<String>> ();
        String [] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        l = gs.group(s);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }

    List <List<String>> group(String[] s){
        Map <String,List> hm = new HashMap<String,List>();
        for(int i=0;i<s.length;i++){
            char [] temp = s[i].toCharArray();
            Arrays.sort(temp);
            String t = String.valueOf(temp);
            if(!hm.containsKey(t)){
                hm.put(t,new ArrayList());
            }
            hm.get(t).add(s[i]);
        }
        //System.out.println(hm.values());
        return new ArrayList(hm.values());
    }
}
