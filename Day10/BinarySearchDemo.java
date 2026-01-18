package Day10;

import java.util.Scanner;
public class BinarySearchDemo {
    static int BinarySearch(int[] arr, int x){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        // Condition till we get our target
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                start = ++mid;
            }else{
                end = --mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target : - ");
        int target = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Binary Search Algorithm
        int targetIndex = BinarySearch(arr, target);
        System.out.println(targetIndex);
    }
}
