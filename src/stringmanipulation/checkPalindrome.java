package stringmanipulation;

public class checkPalindrome {
    public static void main(String [] args){
        checkPalindrome cp = new checkPalindrome();
        String s = "ABBA";
        boolean res = cp.checkPalindrome(s);
        if(res==true)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }

    boolean checkPalindrome(String s){
        char [] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<=r){
            if(ch[l]!=ch[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
}
