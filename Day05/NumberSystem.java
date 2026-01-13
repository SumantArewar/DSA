package Day05;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int binary = sc.nextInt();
//        int pw = 1;
//        int decimal = 0;
//        int unit_digit = 0;

        // Convert Binary to Decimal
//        while(binary > 0){
//            int unit_digit = binary % 10;
//            decimal += (unit_digit * pw);
//            pw *= 2;
//            binary /= 10;
//        }
//        System.out.println(decimal);

        int decimal_number = sc.nextInt();
        int binary_number = 0;
        int power = 1;
        // Convert Decimal to Binary
        while(decimal_number > 0){
            int parity = decimal_number % 2;
            binary_number += (parity * power);
            power *= 10;
            decimal_number /= 2;
        }
        System.out.println(binary_number);
    }
}
