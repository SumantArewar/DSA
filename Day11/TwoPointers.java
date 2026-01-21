package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers {
    static void PrintArray(int[] arr){
        for(int ar : arr){
            System.out.print(ar + " ");
        }
        System.out.println();
    }
    //Swap Elements
    static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] SquareOfSortedArray(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int[] ans = new int[n];
        int k = 0;
        while(start <= end){
            if(Math.abs(arr[start]) > Math.abs(arr[end])){
                ans[k++] = arr[start] * arr[start];
                start++;
            }
            else{
                ans[k++] = arr[end] * arr[end];
                end--;
            }
        }
        return ans;
    }
    //Sort Array such that odd numbers should appear in the beginning and even numbers at the last
    static void SortEvenOdd(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if((arr[left] % 2 == 0) && (arr[right] % 2 == 1)){
                Swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 1){
                left++;
            }
            if(arr[right] % 2 == 0){
                right--;
            }
        }
    }

    //Sort Array of 0s & 1s using 2 Pointers
    static void Sort0and1using2pointers(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                Swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    //Sort Array of 0s & 1s
    static void SortZerosAndOnes(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int x: arr){
            if(x == 0)
                count++;
        }
        for(int i = 0; i < n; i++){
            if(i < count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(arr));
//        SortZerosAndOnes(arr);
//        Sort0and1using2pointers(arr);
//        System.out.println(Arrays.toString(arr));
//        SortEvenOdd(arr2);
//        PrintArray(arr2);
        PrintArray(arr2);
        int[] sortedSquares = SquareOfSortedArray(arr2);
        PrintArray(sortedSquares);
   }
}
