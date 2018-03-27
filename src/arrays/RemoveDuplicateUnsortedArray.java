package arrays;
import java.util.*;
public class RemoveDuplicateUnsortedArray {
    public static void main(String [] args){
        RemoveDuplicateUnsortedArray rd = new RemoveDuplicateUnsortedArray();
        int [] arr = {0,5,9,5,6,7,6,9};
        rd.remove(arr);
    }

    void remove(int [] arr){
        Set <Integer> s = new LinkedHashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int v:s)
            System.out.print(v + " ");
    }
}
