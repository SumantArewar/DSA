package Day03;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();
        System.out.print("Enter your age - ");
        int age = sc.nextInt();
        System.out.print("Enter the Day - ");
        int day = sc.nextInt();

        //If Else
        if(num%2==0){
            System.out.println(num + " is Even number.");
        }else{
            System.out.println(num + " is Odd number.");
        }

        //If-elseif-else & Nested if
        if(age <= 12){
            if(age < 5){
                System.out.println("You are a Toddler");
            }else{
                System.out.println("You are a Child");
            }
        }else if (age > 12 && age < 18){
            System.out.println("You are a Teenager.");
        }else{
            System.out.println("You are an Adult.");
        }

        //Ternary Operator
        String ans;
        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);

        //Switch Case
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Day Number");
                break;
        }
    }
}
