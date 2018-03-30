package Sorts;

public class mergeSort {
    public static void main(String [] args){
        int [] arr = {12, 11, 13, 5, 6, 7};
        mergeSort ms = new mergeSort();
        ms.sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void sort(int [] arr,int l, int r){
        if(l<r){
            int m=(l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

    void merge(int [] arr,int l, int m, int r){
        int len1 = m+1-l;
        int len2 = r-m;
        int [] temp1 = new int[len1];
        int [] temp2 = new int[len2];
        for(int i=0;i<len1;++i){
            temp1[i] = arr[i+l];
        }
        for(int j=0;j<len2;++j){
            temp2[j] = arr[j+m+1];
        }
        int t1 = 0;
        int t2 = 0;
        int index=l;
        while(t1<len1 && t2<len2){
            if(temp1[t1]>=temp2[t2]) {
                arr[index] = temp2[t2];
                t2++;
            }
            else{
                arr[index] = temp1[t1];
                t1++;
            }
            index++;
        }

        while(t1<len1){
            arr[index] = temp1[t1];
            t1++;
            index++;
        }
        while(t2<len2){
            arr[index] = temp2[t2];
            t2++;
            index++;
        }
    }
}
