package Day09;

public class Arrays4 {
    //Print Array
    static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Swap Elements
    static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Reverse an Array
    static int[] ReverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    //Reverse an Array without using another Array
    static void ReverseArrayInPlace(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            Swap(arr, left, right);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5, 6, 7};
         PrintArray(arr);
//        System.out.println();
//         int[] reverseArray = ReverseArray(arr);
//         PrintArray(reverseArray);
        ReverseArrayInPlace(arr);
        PrintArray(arr);
    }
}
