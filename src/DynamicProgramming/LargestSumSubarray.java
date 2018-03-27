package DynamicProgramming;

public class LargestSumSubarray {
    public static void main(String [] args){
        int [] arr = { -2, -3, 4, -1, -2, 1, 5, -3};
        LargestSumSubarray lss = new LargestSumSubarray();
        lss.find(arr);
    }

    void find(int[] arr){
        int max_so_far = 0;
        int curr_max = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for(int i=0;i<arr.length;i++){
            curr_max+=arr[i];

            if(max_so_far<curr_max){
                max_so_far = curr_max;
                start = s;
                end = i;

            }

            if(curr_max<0){
                curr_max = 0;
                s = i+1;
            }

        }
        System.out.println("Largest sum is "+max_so_far);
        System.out.println("Start index is "+start+" and end index is "+end);
    }
}
