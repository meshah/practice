package stringmanipulation;
import java.util.Arrays;
public class CheckPangram {
    public static void main(String [] args){
        String s = "The quick brown fox jumps over the little lazy dog";
        CheckPangram cp = new CheckPangram();
        boolean res = cp.check(s);
        if(res==true)
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram");
    }

    boolean check(String s) {
        boolean[] arr = new boolean[26];
        Arrays.fill(arr, false);
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int i = 0;
        while (i < ch.length) {
            if (ch[i] - 97 >= 0 && ch[i] - 97 < 26) {
                arr[ch[i] - 97] = true;
            }
            i++;
        }
        for (int j = 0; j < 26; j++) {
            if (arr[j] == false) {
                return false;
            }
        }
        return true;
    }
}
