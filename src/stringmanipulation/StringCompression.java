package stringmanipulation;
import java.util.*;
public class StringCompression {

    public static void main(String [] args) {
        StringCompression sc = new StringCompression();
        char [] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        int v = sc.compress(c);
        System.out.println("\n"+v);
    }

    int compress(char[] chars) {
        if(chars.length==0)
            return 0;
        if(chars.length==1)
            return 1;
        int count=1;
        int index=0;
        char c;
        int num=1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
                c = chars[i];
                num = count;
            }
            else{
                index++;
                count=1;
                if(num!=1){
                    int n1 = num/10;
                    int n2 = num%10;
                    if(n1==0){
                        chars[index]=(char)(n2+'0');
                        index++;
                    }

                    else{
                        chars[index] = (char)(n1+'0');
                        index++;
                        chars[index] = (char)(n2+'0');
                        index++;
                    }
                }
            }

        }
        index++;
        if(num>1) {
            int n1 = num / 10;
            int n2 = num % 10;
            if (n1 == 0) {
                chars[index] = (char) (n2 + '0');
                index++;
            } else {
                chars[index] = (char) (n1 + '0');
                index++;
                chars[index] = (char) (n2 + '0');
                index++;
            }
        }
        if(index<chars.length){
            chars = Arrays.copyOfRange(chars, 0, index);
        }
        for(char cc:chars)
            System.out.print(cc+" ");
        return index;
}
}