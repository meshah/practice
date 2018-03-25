package arrays;
import java.util.HashMap;
public class ThreeSum {

    public static void main(String [] args){
        int [] arr = {1,4,5,2,6,6,7,2};
        ThreeSum ts = new ThreeSum();
        ts.findNumbers(arr,18);
    }

    void findNumbers(int []arr, int sum){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            hm.put(i,arr[i]);
        }
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            int newsum = sum-arr[i];
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    int v = newsum-arr[j];
                    if((hm.containsValue(v)) && (v!=arr[i] && v!=arr[j])){
                        System.out.println(arr[i]+" "+arr[j]+" "+v);
                        flag=true;
                        break;
                    }
                }
            }
            if(flag==true)
                break;
        }
    }
}
