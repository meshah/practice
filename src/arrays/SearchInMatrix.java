package arrays;

public class SearchInMatrix {
    public static void main(String [] args){
        int [] [] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        SearchInMatrix sim = new SearchInMatrix();
        sim.find(arr,1);
    }

    void find(int [] [] arr, int num){
        int numrows = arr.length;
        int numcols = arr[0].length;
        int i=0,j=numcols-1;
        while((i<numrows) && (j>=0)){
            if(arr[i][j]==num){
                System.out.println("Number found at arr["+i+"]["+j+"]");
                return;
            }
            else if(arr[i][j]>num)
                j--;
            else
                i++;

        }
        System.out.println("Number not found!");
        return;
    }
}
