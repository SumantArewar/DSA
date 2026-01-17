package Day09;

import java.util.Scanner;

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

    //Reverse an Array without using another Array
    static void Reverse(int[] arr, int left, int right){
        while(left < right){
            Swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Rotate the Given Array 'a' by k steps, k is non-negative
    static int[] RotateArrayByKSteps(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    static int[] MakeFreqArray(int[] arr){
        int[] freq = new int[100005];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    // Rotate the Given Array 'a' by k steps, k is non-negative
    static void RotateArrayByKStepsInPlace(int[] arr, int k){
        int n = arr.length;
        Reverse(arr, 0, n-k-1);
        Reverse(arr, n-k, n-1);
        Reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
         PrintArray(arr);
//        System.out.println();
//         int[] reverseArray = ReverseArray(arr);
//         PrintArray(reverseArray);
//        ReverseArrayInPlace(arr);
//        PrintArray(arr);
//         int[] rotatedArray = RotateArrayByKSteps(arr, k);
//         PrintArray(rotatedArray);
         RotateArrayByKStepsInPlace(arr, k);
         PrintArray(arr);

         int[] freq = MakeFreqArray(arr);
         int q = sc.nextInt();
         while(q > 0){
             System.out.println("Enter number to be searched: ");
             int x = sc.nextInt();
             if(freq[x] > 0){
                 System.out.println("YES");
             }else{
                 System.out.println("NO");
             }
             q--;
         }
    }
}
