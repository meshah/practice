package Miscelleneous;

public class ReverseInteger {
    int rev;
    public static void main(String [] args){
        long num = 1000000045;
        ReverseInteger ri = new ReverseInteger();
        long res = ri.reverse(num);
        System.out.println(res);
    }

    long reverse(long num){
        long revnum=0;
        while(num!=0){
            long currdigit = num%10;
            revnum=revnum*10+currdigit;
            num=num/10;
        }
        return revnum;
    }
}
