//Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times.
// Find the number in O(n) time & constant space.
package arrays;

public class OddOccuringNumber {
    public static void main(String [] args){
        int [] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        OddOccuringNumber oon = new OddOccuringNumber();
        oon.findNumber(arr);
    }

    void findNumber(int [] arr){
        int res = arr[0];
        for(int i=1;i<arr.length;i++)
            res = res ^ arr[i];
        System.out.println(res);
    }

}


