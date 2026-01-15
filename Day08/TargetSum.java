package Day08;

import java.util.Scanner;

public class TargetSum {
    // Find total no. of pairs whose sum is equal to target x
    static int TotalPairs(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    count++;
                }
            }
        }
        return count;
    }

    // Count total no. of triplets whose sum is equal to target x
    static int TotalTriplets(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i+1; j < arr.length - 1; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Find the Largest number in the given Array
    static int FindLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    // Find the Second-Largest number in the given Array
    static int SecondLargest(int[] arr){
        int largest = FindLargest(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == largest)
                arr[i] = Integer.MIN_VALUE;
        }
        return FindLargest(arr);
    }

    // Find the Unique number in the given Array,
    // where all the elements are being repeated twice.
    static int FindUnique(int[] arr){
        int unique = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int x : arr){
            if(x > 0)
                unique = x;
        }
        return unique;
    }

    // Find the First Repeating Number in the given Array,
    // where all the elements are being repeated twice.
    static void FirstRepeating(int[] arr){
        int firstRepeatingValue = -1;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    firstRepeatingValue = arr[i];
                    System.out.println(firstRepeatingValue);
                    return;
                }
            }
        }
        System.out.println(firstRepeatingValue);
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2, 7, 9};
        int[] arr2 = {1, 4, 5, 6, 3, 9};
        int[] arr3 = {1, 2, 3, 4, 7};
//        int pairsCount = TotalPairs(arr, 7);
//        System.out.println(pairsCount);
//        int tripletsCount = TotalTriplets(arr2, 12);
//        System.out.println(tripletsCount);
//        int secondLargest = SecondLargest(arr2);
//        System.out.println(secondLargest);
//        int uniqueElement = FindUnique(arr3);
//        System.out.println(uniqueElement);
          FirstRepeating(arr3);
    }
}
