package stringmanipulation;

public class PrintAllSubstring {
    public static void main(String [] args){
        PrintAllSubstring pas = new PrintAllSubstring();
        String s = "abccdssw";
        pas.printsubstring(s);
    }

    void printsubstring(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
