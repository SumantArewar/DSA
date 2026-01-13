package Day06;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

    // Count the total Occurrences of the number
    static int CountOccurrences(int[] arr, int x){
        int count = 0;
        for(int ar : arr){
            if(ar == x)
                count++;
        }
        return count;
    }

    // Find the Last Occurrence of the number
    static int FindLastOccurrence(int[] arr, int x){
        int index = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == x)
                index = i;
        }
        return index;
    }

    // Find the number of elements strictly greater than x
    static int StrictlyGreater(int[] arr, int x){
        int countGreater = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > x)
                countGreater++;
        }
        return countGreater;
    }

    // Check if the Given Array is Sorted or Not
    static boolean IsSorted(int[] arr){
        boolean isSorted = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    // Find Smallest & Largest Elements of the Given Array
    static int[] FindSmallestAndLargest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int[] Array2 = new int[2];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        Array2[0] = smallest;
        Array2[1] = largest;
        return Array2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 2, 7, 2, 9};
        int[] arr2 = {1, 2, 2, 3, 3, 3, 4, 6, 7, 8};
        int totalCount = CountOccurrences(arr, n);
        System.out.println(totalCount);
        int lastIndex = FindLastOccurrence(arr, n);
        System.out.println(lastIndex);
        int countStrictlyGreater = StrictlyGreater(arr, n);
        System.out.println(countStrictlyGreater);
        boolean isSorted = IsSorted(arr2);
        System.out.println(isSorted);
        int[] arrayPair = FindSmallestAndLargest(arr2);
        System.out.println(Arrays.toString(arrayPair));
    }
}
