package arrays;

public class MergeSortedArray {

    public static void main(String [] args){
        MergeSortedArray msa = new MergeSortedArray();
        int [] nums1 = {};
        int m=0;
        int [] nums2 = {1};
        int n=0;
        msa.merge(nums1,m,nums2,n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        if (m == 0)
            nums1 = nums2;
        else {
            while ((i < n) && (j < m)) {
                while ((nums1[j] < nums2[i]) && (j < m)) {
                    j++;
                }
                for (int k = m; k > j; k--) {
                    nums1[k] = nums1[k - 1];
                }
                nums1[j] = nums2[i];
                i++;
            }
        }
        for(int ii=0;ii<nums1.length;ii++)
            System.out.print(nums1[ii]+" ");
    }
}
