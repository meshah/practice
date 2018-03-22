package arrays;

import java.util.Arrays;

public class checkPair {
    public static void main(String [] args){
        int [] arr = {1,4,2,9,11,3};
        checkPair cp = new checkPair();
        boolean res = cp.find(arr,2);
        if(res==true)
            System.out.println("Pair exists!");
        else
            System.out.println("Pair does not exists!");
    }

    boolean find(int[] arr, int sum){
        Arrays.sort(arr);
        int l=0;
        int r = arr.length-1;
        return findPair(arr,sum,l,r);
    }

    boolean findPair(int [] arr, int sum, int l, int r){
        if(l<r){
            if(arr[l]+arr[r]==sum){
                return true;
            }
            else if(arr[l]+arr[r]>sum){
                r--;
                return findPair(arr,sum,l,r);
            }
            else{
                l++;
                return findPair(arr,sum,l,r);
            }
        }
        return false;
    }
}
