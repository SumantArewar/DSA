package Day14;

import java.util.Scanner;

public class Arrays2DProblems {
    // Print the 2D Array
    static void Print2DArray(int[][] arr){
        System.out.println("2D Array elements are: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Transpose of Matrix
    static void TransposeMatrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int[][] ans = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = arr[j][i];
            }
        }
        Print2DArray(ans);
    }

    //Transpose of Matrix
    static void TransposeMatrixInPlace(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
         for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        Print2DArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of column: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter 2D Array elements: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }System.out.println();
        int[][] arr2 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                       };
//        TransposeMatrix(arr);
        TransposeMatrixInPlace(arr);
    }
}