package Day06;

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

    // Find the number of elements strictly greater than x
    static boolean IsSorted(int[] arr){
        boolean isSorted = false;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] <= arr[i+1])
                isSorted = true;
        }
        return isSorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 2, 7, 2};
        int totalCount = CountOccurrences(arr, n);
        System.out.println(totalCount);
        int lastIndex = FindLastOccurrence(arr, n);
        System.out.println(lastIndex);
        int countStrictlyGreater = StrictlyGreater(arr, n);
        System.out.println(countStrictlyGreater);
        boolean isSorted = IsSorted(arr);
        System.out.println(isSorted);
    }
}
