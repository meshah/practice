package Sorts;

public class HeapSort {
    public static void main(String [] args){
        HeapSort hs = new HeapSort();
        int [] arr = {4, 10, 3, 5, 1};
        hs.sort(arr);
    }

    void sort(int [] arr){
        int len = (arr.length/2)-1;
        while(len>=0){
            heapify(arr,arr.length,len);
            len--;
        }

        for(int j=arr.length-1;j>=0;j--){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            heapify(arr,j,0);
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    void heapify(int [] arr,int n,int i){
        int lindex = 2*i+1;
        int rindex = 2*i+2;
        int largest = i;
        if(lindex<arr.length && arr[lindex]>arr[largest])
            largest = lindex;
        if(rindex<arr.length && arr[rindex]>arr[largest])
            largest = rindex;
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }
}
