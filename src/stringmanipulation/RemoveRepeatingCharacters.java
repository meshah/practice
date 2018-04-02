package stringmanipulation;

public class RemoveRepeatingCharacters {
    public static void main(String [] args){
        RemoveRepeatingCharacters rrc = new RemoveRepeatingCharacters();
        String s = "basaadddakhhhar";
        String res = rrc.remove(s);
        System.out.println(res);
    }

    String remove(String s){
        if(s.length()==0)
            return "";
        String res = s;
        String prev = s;
        while(res.length()!=0){
            s = res;
            res = "";
            char [] ch = s.toCharArray();
            int count = 1;
            int start_index=0;
            int end_index=0;
            for(int i=0;i<ch.length-1;i++){
                if(ch[i]==ch[i+1]){
                    count++;
                }
                else{
                    count=1;
                }
                if(count==3){
                    end_index = i-1;
                    res = res+s.substring(start_index,end_index);
                    start_index = i+2;
                }
            }
            res = res+s.substring(start_index);
            if(prev.length()==res.length())
                break;
            else
                prev = res;
        }

        return res;
    }
}
