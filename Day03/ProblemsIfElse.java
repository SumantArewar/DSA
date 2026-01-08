package Day03;

import java.util.Scanner;

public class ProblemsIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();

        //If Number is Even and divisible by 3
        if(num % 2 == 0 && num % 3 ==0){
            System.out.println(num + " is Even and divisible by 3");
        }

        //If Number is divisible by 3 or divisible by 5
        if(num % 3 == 0 || num % 5 ==0){
            System.out.println(num + " is Even and divisible by 3");
        }

        //If num is odd, print Weird.
        //If num is even and in the inclusive range of 2 to 5, print Not Weird
        //If num is even and in the inclusive range of 6 to 20, print Weird.
        //If num is even and greater than 20, print Not Weird
        if(num % 2 != 0){
            System.out.println("Weird");
        } else{
            if(num>=2 && num<=5)
                System.out.println("Not Weird");
            else if(num>=6 && num<=20)
                System.out.println("Weird");
            else if(num>=20)
                System.out.println("Not Weird");
        }
    }
}
