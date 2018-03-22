package stringmanipulation;

public class ReverseStringSpecial {

    public static void main(String [] args){
        String s = "Ab,c,de!$";
        ReverseStringSpecial rss = new ReverseStringSpecial();
        rss.reverse(s);

    }

    void reverse(String s){

        int l = 0;
        int r = s.length()-1;
        char[] ch = s.toCharArray();

        while(l<r){
            if(isAlphabet(ch[l]) && isAlphabet(ch[r])){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l = l+1;
                r = r-1;
            }
            else if(!isAlphabet(ch[l])){
                    l = l+1;
            }
            else if(!isAlphabet(ch[r])){
                    r = r-1;
            }
        }

        System.out.println(ch);
    }

    boolean isAlphabet(char c){
        if(((c>=65)&&(c<=90))||((c>=97)&&(c<122)))
            return true;
        else
            return false;
    }
}
