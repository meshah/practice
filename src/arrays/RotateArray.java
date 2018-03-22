package arrays;

public class RotateArray {
    public static void main(String [] args){
        int [] arr  = {1,2,3,4,5,6,7,8};
        RotateArray ra = new RotateArray();
        ra.rotate(arr,7);
    }

    void rotate(int [] arr, int degree){
        int [] temp = new int[degree];
        for(int i=0;i<degree;i++){
            temp[i]=arr[i];
        }

        for(int j=degree;j<arr.length;j++){
            arr[j-degree]=arr[j];
        }

        int l=arr.length-1;
        int ll = temp.length-1;
        while(ll>=0){
            arr[l]=temp[ll];
            l--;
            ll--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
