package arrays;

public class SearchInsertDeleteUnsorted {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 6, 40};
        SearchInsertDeleteUnsorted obj = new SearchInsertDeleteUnsorted();

        boolean searchres = obj.search(arr, 112);
        if (searchres == true)
            System.out.println("Found!");
        else
            System.out.println("not Found!");

        obj.insert(arr, 11);

        boolean deleteres = obj.delete(arr, 10);
        if (deleteres == true)
            System.out.println("Deleted!");
        else
            System.out.println("Number not Found!");

    }

    boolean search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }

    void insert(int[] arr, int num) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i != temp.length - 1)
                temp[i] = arr[i];
            else
                temp[i] = num;
        }
        arr = new int[temp.length];
        arr = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    boolean delete(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            int[] temp = new int[arr.length - 1];
            for (int i = 0; i < temp.length; i++)
                temp[i] = arr[i];
            arr = new int[temp.length];
            arr = temp;
            System.out.println("New Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            return true;
        }
        return false;
    }

}
