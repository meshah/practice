package arrays;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,1,2,1,5,5,5,5,5};
        MajorityElement me = new MajorityElement();
        me.findElement(arr);
    }

    void findElement(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        boolean flag = false;
        int val=-1;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int count = hm.get(arr[i])+1;
                hm.put(arr[i],count);
                if(count>=(arr.length/2)+1){
                    flag = true;
                    val = arr[i];
                    break;
                }
            }
            else
                hm.put(arr[i],1);
        }
        if(flag==true)
            System.out.println("element found: "+val);
        else
            System.out.println("element not found!");
    }
}