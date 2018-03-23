package arrays;

public class MissingNumber {
    public static void main(String [] args){
        MissingNumber mi = new MissingNumber();
        int [] arr = {1,2,3,5,6};
        mi.find(arr);
    }

    void find(int []arr){
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum = sum-arr[i];
        }
        System.out.println(sum);
    }
}
