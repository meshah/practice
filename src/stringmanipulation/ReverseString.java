package stringmanipulation;

public class ReverseString {

    public static void main(String [] args){
        String s = "meha shah";
        ReverseString rs = new ReverseString();
        rs.reverseStr(s);
    }

    void reverseStr(String s){
        if(s.length()>0){
            System.out.println(s.charAt(s.length()-1));
            reverseStr(s.substring(0,s.length()-1));
        }
        else
            System.out.println(s);

    }
}
