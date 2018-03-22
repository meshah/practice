package arrays;

public class SearchInsertDeleteSorted {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9, 10};
        SearchInsertDeleteSorted obj = new SearchInsertDeleteSorted();

        boolean searchres = obj.search(arr, 10);
        if (searchres == true)
            System.out.println("Found!");
        else
            System.out.println("not Found!");

        obj.insert(arr, 9);

        /*boolean deleteres = obj.delete(arr, 10);
        if (deleteres == true)
            System.out.println("Deleted!");
        else
            System.out.println("Number not Found!");*/
    }

    boolean search(int[] arr, int num) {
        int l = arr.length - 1;
        boolean res = binarysearch(arr, num, l, 0);
        return res;
    }


    boolean binarysearch(int[] arr, int num, int l, int f){
        int mid = (f + l) / 2;
        if((f>=0 && f<=arr.length-1) && (l>=0 && l<=arr.length-1)){
            if(arr[mid] == num)
                return true;
            else if(num > arr[mid])
                return binarysearch(arr,num,l,mid+1);
            else
                return binarysearch(arr,num,mid-1,0);
        }
        return false;

    }

    void insert(int [] arr, int num){
        int[] temp = new int[arr.length + 1];
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=num){
                index=i;
                break;
            }
            else
                index=arr.length;
            temp[i]=arr[i];
        }

        temp[index]=num;
        if(index!=arr.length){
            for(int i=index+1;i<=arr.length;i++){
                temp[i]=arr[i-1];
            }
        }
        arr = new int[temp.length];
        arr = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }




}
