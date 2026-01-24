package Day13;

import java.util.Scanner;

public class TwoDimensionalArray {

    //Addition of 2 matrix
    static void SumOf2DArrays(int[][] arr1, int[][] arr2){
        int r = arr1.length;
        int r2 = arr2.length;
        int c = arr1[0].length;
        int c2 = arr2[0].length;
        if(r != r2 || c != c2){
            System.out.println("Wrong Inputs");
            return;
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        Print2DArray(arr1);
    }

    //Addition of 2 matrix
    static void Multiply2DArrays(int[][] arr1, int[][] arr2){
        int r1 = arr1.length;
        int r2 = arr2.length;
        int c1 = arr1[0].length;
        int c2 = arr2[0].length;
        if(c1 != r2){
            System.out.println("Wrong Inputs");
            return;
        }

        int[][] mul = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                for(int k = 0; k < c2; k++){
                    mul[i][k] += (arr1[i][j] * arr2[j][k]);
                }
            }
        }
        Print2DArray(mul);
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter column: ");
        int columns = sc.nextInt();
        int[][] arr2D = new int[rows][columns];
        System.out.println("Enter 2D Array elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }System.out.println();

        int[][] arr = {
                        {2, 1},
                        {1, 3},
                        {1, 1},
                      };
//
//        int[][] arr = {
//                        {1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9},
//                        {10, 11, 12},
//                      };

//        Print2DArray(arr2D);
//        SumOf2DArrays(arr2D, arr);
        Multiply2DArrays(arr2D, arr);
    }
}
