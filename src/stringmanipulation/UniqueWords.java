package stringmanipulation;

import java.util.HashSet;
public class UniqueWords {
    public static void main(String [] args){
        String line = "My name is meha is name shah Meha";
        line = line.toLowerCase();
        HashSet <String> hs = new HashSet<String>();
        String [] words = line.split(" ");
        for(int i=0;i<words.length;i++){
            hs.add(words[i]);
        }
        for(String str:hs){
            System.out.println(str);
        }
    }
}
