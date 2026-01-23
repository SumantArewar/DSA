package Day12;

import java.util.Scanner;

public class Arrays6 {
    static void PrintArray(int[] arr){
        for(int ar : arr){
            System.out.print(ar + " ");
        }
        System.out.println();
    }
    //Total Sum of the given Array
    static int totalArraySum(int[] arr){
        int totalSum = 0;
        for(int i: arr){
            totalSum += i;
        }
        return totalSum;
    }
    //Is Equal Sum Partition Possible
    static boolean IsEqualSum(int[] arr){
        int totalSum = totalArraySum(arr);
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum){
                return true;
            }
        }
        return false;
    }
    //Prefix Sum Array
    static int[] PrefixSumArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    //Prefix Sum Array
    static void PrefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] a = {2, 1, 3, 4, 5};
//        PrintArray(a);
//        PrefixSum(a);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements - ");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
//        int[] pref = PrefixSumArray(arr);
//        PrintArray(pref);

//        System.out.print("Enter the number of queries: ");
//        int q = sc.nextInt();
//
//        while (q-- > 0){
//            System.out.print("Enter the range: ");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = pref[r] - pref[l-1];
//            System.out.println("Sum of this range is - " + ans);
//        }

        boolean isPossible = IsEqualSum(arr); 
        System.out.println(isPossible);
    }
}
