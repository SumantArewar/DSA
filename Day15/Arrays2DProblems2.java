package Day15;

import java.util.Scanner;

public class Arrays2DProblems2 {

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

    //Spiral Matrix Traversal
    static void printInSpiralOrder(int[][] arr, int r, int c){
        int topRow = 0; int bottomRow = r-1; int leftCol = 0; int rightCol = c-1;
        int totalElements = 0;
        while(totalElements < r * c){
            for(int i = leftCol; i <= rightCol && totalElements < r * c; i++){
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            topRow++;

            for(int j = topRow; j <= bottomRow && totalElements < r * c; j++){
                System.out.print(arr[j][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            for(int i = rightCol; i >= leftCol && totalElements < r * c; i--){
                System.out.print(arr[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;

            for(int j = bottomRow; j >= topRow && totalElements < r * c; j--){
                System.out.print(arr[j][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    //Spiral Matrix Traversal
    static int[][] generalSpiralMatrix(int n){
        int[][] arr = new int[n][n];
        int topRow = 0; int bottomRow = n-1; int leftCol = 0; int rightCol = n-1;
        int current = 1;
        while(current <= n * n){
            for(int i = leftCol; i <= rightCol && current <= n * n; i++){
                arr[topRow][i] = current++;
            }
            topRow++;

            for(int j = topRow; j <= bottomRow && current <= n * n; j++){
                arr[j][rightCol] = current++;
            }
            rightCol--;

            for(int i = rightCol; i >= leftCol && current <= n * n; i--){
                arr[bottomRow][i] = current++;
            }
            bottomRow--;

            for(int j = bottomRow; j >= topRow && current <= n * n; j--){
                arr[j][leftCol] = current++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13 ,14 ,15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
//        printInSpiralOrder(arr, 5, 5);
        int[][] ans = generalSpiralMatrix(5);
        Print2DArray(ans);
    }
}