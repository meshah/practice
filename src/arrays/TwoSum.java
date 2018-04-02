package arrays;
import java.util.*;
public class TwoSum {
    public static void main(String [] args){
        TwoSum ts = new TwoSum();
        int [] arr = {4,11,6,2,8};
        ts.find(arr,12);
    }

    void find(int [] arr,int sum){
        Map <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(sum-arr[i]))
                hm.put(arr[i],i);
            else{
                System.out.println((sum-arr[i])+" "+arr[i]);
                break;
            }
        }
    }
}
