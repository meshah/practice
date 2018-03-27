package arrays;

public class MoveZeros {

    public static void main(String [] args){
        MoveZeros mz = new MoveZeros();
        int [] nums = {1, 1, 0, 3, 12};
        int [] n = mz.moveZeroes(nums);
        for(int i=0;i<n.length;i++)
            System.out.print(n[i]+" ");
    }
    public int[] moveZeroes(int[] nums) {
        int l = nums.length;
        int i=0;
        int count = 0;
        while(i<l){
            if(nums[i]==0){
                count++;
                int j=i;
                if(j<=l-count){
                    while(j<l-count){
                        nums[j] = nums[j+1];
                        j++;
                    }
                    if(j==(l-count))
                        nums[l-count] = 0;
                }
                else
                    i++;

            }
            else
                i++;
        }
        return nums;
    }
}
