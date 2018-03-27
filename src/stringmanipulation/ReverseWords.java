package stringmanipulation;

public class ReverseWords {
    public static void main(String [] args){
        ReverseWords rw = new ReverseWords();
        String s = "This is a string";
        rw.reverse(s);
    }

    void reverse(String s){
        String [] words = s.split(" ");
        String res = "";
        for(int i=words.length-1;i>=0;i--){
            if(i!=0)
                res = res+words[i]+" ";
            else
                res = res+words[i];
        }
        System.out.println(res);
    }
}
