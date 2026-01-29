package Day15;

import java.util.Scanner;

public class Arrays2DProblems2 {
    //Spiral Matrix Traversal
    static void printInSpiralOrder(int[][] arr, int r, int c){
        int topRow= 0; int bottomRow= 0; int leftCol= 0; int rightCol= 0;
        int totalElements = 0;
        while(totalElements < r * c){
            for(int i = leftCol; i <= rightCol; i++){
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            topRow++;
            for(int j = topRow; j <= rightCol; j++){
                System.out.print(arr[j][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for(int i = rightCol; i >= leftCol; i++){
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            bottomRow--;
            for(int j = bottomRow; j >= topRow; j++){
                System.out.print(arr[j][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13 ,14 ,15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        printInSpiralOrder(arr, 5, 5);
    }
}
