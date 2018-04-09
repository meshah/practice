package arrays;
import java.util.*;
public class TwoSumAll {
    public static void main(String [] args){
        int [] arr = {1,3,4,2,1,2,7,5};
        TwoSumAll tsa = new TwoSumAll();
        tsa.find(arr,6);
    }

    void find(int [] arr, int sum){
        Map <Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!m.containsKey(sum-arr[i]))
                m.put(arr[i],i);
            else
                System.out.println(arr[i]+" "+(sum-arr[i]));
        }
    }
}
