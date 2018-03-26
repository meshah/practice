package stringmanipulation;
import java.util.*;
public class JustifyText {
    public static void main(String [] args){
        JustifyText jt = new JustifyText();
        String [] words = {"This", "is", "an", "huhuhuhuhu", "haha","example", "of", "text", "justification."};
        jt.fullJustify(words, 16);
    }
    public void fullJustify(String[] words, int maxWidth) {
        List l = new ArrayList();
        if((words.length<=1) && (words[0].length()<=maxWidth)){
            l.add(words[0]);
        }
        else{
            int len = words.length;
            int finallen = words.length;
            while(len>0){
                int count=0;
                int c = 1;
                int size=maxWidth;
                int prevsize;
                List tl = new ArrayList();
                for(int m=0;m<=words.length;m++) {
                    if((count>=finallen-len) && (count<=finallen)){
                        prevsize = size;
                        if(m!=words.length)
                            size=size-words[m].length();
                            if(c!=1)
                                size = size-1;
                        if((size>=0) && (m!=words.length)){
                            tl.add(words[m]);
                            len = len-1;
                        }
                        else{
                            String sen = "\0";
                            int numOfWords = tl.size();

                            if(prevsize==0){
                                for(int i=0;i<numOfWords;i++){
                                    if(i==0){
                                        //System.out.println(tl.get(i));
                                        sen = (String)tl.get(i);
                                    }

                                    else
                                        sen = sen + " " + tl.get(i);
                                }
                            }
                            else {
                                int val = prevsize;
                                if(numOfWords>1)
                                    val = prevsize/(numOfWords-1);
                                for(int i=0;i<numOfWords;i++){
                                    if(i==0) {
                                        //System.out.println(tl.get(i));
                                        sen = (String)tl.get(i);
                                    }
                                    else{
                                        if(val==0){
                                            val+=1;
                                        }
                                        int temp = val;
                                        String space = " ";
                                        while((temp!=0) && (prevsize!=0)){
                                            space = space + " ";
                                            temp--;
                                            prevsize--;
                                        }
                                        sen = sen + space + tl.get(i);
                                    }
                                }
                            }
                            l.add(sen);
                            break;
                        }
                        c++;
                    }
                    count++;
                }
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}