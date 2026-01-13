package Day04;

import java.util.Scanner;

public class ProblemsLoops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        //Problems on Loops Part 2
        /* Print Rectangular pattern -
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

        /* Print this Pyramid pattern -
           ****
           ***
           **
           *
         */
//        for(int i = n; i >= 1; i--){
//            for(int j = i; j >= 1; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* Print this Pyramid pattern -
              *
             ***
            *****
           *******
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= (2*i)-1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /* Print Rectangular pattern -
           1234567
           2345671
           3456712
           4567123
           5671234
           6712345
           7123456
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = i; j <= n; j++){
//                System.out.print(j);
//            }
//            for(int k = 1; k <= i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        /* Print Rectangular pattern -
           123456
           123456
           123456
           123456
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= c; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        /* Print Rectangular pattern -
           121212
           121212
           121212
           121212
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= c; j++){
//                if(j % 2 == 0){
//                   System.out.print(2);
//                }else {
//                   System.out.print(1);
//                }
//            }
//            System.out.println();
//        }

        /* Print this Pyramid pattern -
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

        /* Print this Pyramid pattern -
                1
               121
              12321
             1234321
            123454321
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print(k);
//            }
//            for(int l = i-1; l >= 1; l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

        /* Print Hollow Rectangular pattern -
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

        /* Print this Pyramid pattern -
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

        /* Print this Pyramid pattern -
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

        /* Print this Pyramid pattern -
               *
             * *
           * * *
         * * * *
         */
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print("  ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        /* Print this Pyramid pattern -
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

        /* Print this Pyramid pattern - Floyd's Triangle
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

        /* Print this Pyramid pattern - 0-1 Triangle
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
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
