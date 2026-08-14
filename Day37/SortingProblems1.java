package Day37;

public class SortingProblems1 {
    static void sortZeros(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void sortFruits(String[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j].compareTo(arr[min_idx]) < 0) {
                    min_idx = j;
                };
            }
            String temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 2, 0, 3, 0, 4};
        sortZeros(arr1);
        for(int ar : arr1){
            System.out.print(ar + " ");
        }

        String[] fruits = {"kiwi" ,"banana", "apple", "mango"};
        sortFruits(fruits);
        for(String fr : fruits){
            System.out.print(fr + " ");
        }

    }
}
