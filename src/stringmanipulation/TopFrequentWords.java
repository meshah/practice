package stringmanipulation;
import java.util.*;
public class TopFrequentWords {
    Map <String,Integer> hm = new HashMap<String,Integer>();
    int count=0;
    public static void main(String [] args){
        TopFrequentWords tfw = new TopFrequentWords();
        tfw.visit("abc.com");
        tfw.findTopURLs(4);
        tfw.visit("abcnews.com");
        tfw.visit("abchellonews.com");
        tfw.findTopURLs(4);
        tfw.visit("abc.com");
        tfw.visit("fakenews.com");
        tfw.visit("fakenews.com");
        tfw.visit("fakenews.com");
        tfw.visit("fakenews.com");
        tfw.visit("mehanews.com");
        tfw.visit("mehanews.com");
        tfw.visit("mehanews.com");
        tfw.findTopURLs(3);
    }

    void visit(String s){
        if(hm.containsKey(s))
            hm.put(s,hm.get(s)+1);
        else
            hm.put(s,1);
    }

    void findTopURLs(int k){
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1,w2) -> hm.get(w1)!=hm.get(w2)?hm.get(w1)-hm.get(w2):w2.compareTo(w1)

        );

        for(String url:hm.keySet()){
            heap.add(url);
            if(heap.size()>k)
                heap.poll();
        }

        List<String> res = new ArrayList<>();
        while(!heap.isEmpty())
            res.add(heap.poll());

        Collections.reverse(res);

        for(String u:res)
            System.out.println(u);

        System.out.println("------------");
    }
}
