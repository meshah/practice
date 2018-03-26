package arrays;

public class SpiralMatrix {

    public static void main(String [] args){
        SpiralMatrix sm = new SpiralMatrix();
        int [] [] arr = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        int r = 3;
        int c = 6;
        sm.printSpiralMatrix(arr,r,c);
    }

    void printSpiralMatrix(int [][] arr, int r, int c){
        int i=0;
        int j=0;
        boolean flag;
        while(i!=r) {
            if (i % 2 == 0){
                j = 0;
                flag = true;
            }
            else{
                j = c - 1;
                flag = false;
            }


            while ((j != c) && (j>=0)) {
                System.out.print(arr[i][j] + " ");
                if(flag==true)
                    j++;
                else
                    j--;
            }
            i++;        }

    }
}
