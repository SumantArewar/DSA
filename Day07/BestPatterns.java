package Day07;

import java.util.Scanner;

public class BestPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        //9 Best Patterns in Java

        /* 1. Print Rectangular pattern -
         *****
         *****
         *****
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        /* 2. Print Hollow Rectangular pattern -
         * * * * *
         *       *
         *       *
         * * * * *
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= c; j++){
//                if(i == 1 || j == 1 || i == n || j == c){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        /* 3. Print Half Pyramid pattern -
         *
         * *
         * * *
         * * * *
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* 4. Print Inverted Half Pyramid pattern -
         * * * *
         * * *
         * *
         *
         */
//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* 5. Print Inverted & Rotated Half  Pyramid pattern -
                 *
               * *
             * * *
           * * * *
         * * * * *
         */
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        /* 6. Print Half Pyramid with Numbers pattern -
           1
           12
           123
           1234
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        /* 7. Print Inverted Half Pyramid with Numbers pattern -
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */
//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /* 8. Print this Pyramid pattern - Floyd's Triangle
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         */
//        int num = 1;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }

        /* 9. Print this Pyramid pattern - 0-1 Triangle
         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1
         */
//        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

}
