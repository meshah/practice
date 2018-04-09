package arrays;

public class MedianOfSortedArray {
    public static void main(String [] args){
        MedianOfSortedArray msa = new MedianOfSortedArray();
        int [] a1 = {1,4,7,9};
        int [] a2 = {2,3,4,7,11};
        msa.findMedian(a1,a2);
    }

    void findMedian(int [] a1,int [] a2){
        int i=0;
        int j=0;
        int [] finalarr = new int[a1.length+a2.length];
        int index=0;
        while((i<a1.length) && (j<a2.length)){
            if(a1[i]==a2[j]){
                finalarr[index]=a1[i];
                index++;
                i++;
                finalarr[index]=a2[j];
                index++;
                j++;
            }
            else if(a1[i]<a2[j]){
                finalarr[index]=a1[i];
                index++;
                i++;
            }
            else{
                finalarr[index]=a2[j];
                index++;
                j++;
            }
        }

        if(i<a1.length){
            while(i<a1.length){
                finalarr[index]=a1[i];
                index++;
                i++;
            }
        }

        if(j<a2.length){
            while(j<a2.length){
                finalarr[index]=a2[j];
                index++;
                j++;
            }
        }

        for(int k=0;k<finalarr.length;k++)
            System.out.print(finalarr[k]+" ");

        int median = (0+finalarr.length-1)/2;
        System.out.println("\nMedian is "+finalarr[median]);
    }
}
