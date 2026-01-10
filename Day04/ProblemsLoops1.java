package Day04;

import java.util.Scanner;

public class ProblemsLoops1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Count the number of digits in a given number
         int count = 0;
         while(n > 0){
             count++;
             n/=10;
         }
        System.out.println(count);

//        Find the sum of digits in a given number
         int sumOfDigits = 0;
         while(n > 0){
             sumOfDigits += n % 10;
             n /= 10;
         }
         System.out.println(sumOfDigits);

//        Reverse the digits of a given number
         int reverse = 0;
         while(n > 0){
             reverse = (reverse * 10) + (n % 10);
             n /= 10;
         }
         System.out.println(reverse);

//        Find the sum of the following series
         int sumOfSeries = 0;
         for(int i = 0; i <= n; i++){
             if(i % 2 ==0){
                 sumOfSeries -= i;
             }else{
                 sumOfSeries += i;
             }
         }
         System.out.println(sumOfSeries);

//        Find the first n Factorial of numbers
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println("Factorial of " + i + " is " + factorial);
        }

        //Given 2 number a & b. Find a raise to the power b
        int b = sc.nextInt();
        int pow = 1;
        for (int j = 1; j <= b; j++) {
            pow *= n ;
        }
        System.out.println(pow);
    }
}
