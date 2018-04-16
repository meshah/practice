package stringmanipulation;

public class LargeNumberSum {

    public static void main(String [] args){
        LargeNumberSum lns = new LargeNumberSum();
        String s1 = "11111";
        String s2 = "444";
        lns.sum(s1,s2);
    }

    void sum(String s1,String s2){
        String s = "";
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2){
            for(int i=0;i<l1-l2;i++){
                s2 = '0'+s2;
            }
        }
        else if(l2>l1){
            for(int i=0;i<l2-l1;i++){
                s1 = '0'+s1;
            }
        }
        int l = s1.length();
        int carry = 0;
        int sum = 0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for(int i=l-1;i>=0;i--){
            sum = c1[i]-'0' + c2[i]-'0' + carry;
            carry = sum/10;
            sum = sum%10;
            s = sum+s;
        }
        System.out.println(s);

    }

}
