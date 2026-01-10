package Day04;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 1;

        // While Loop
//        while(index <= n ){
//            System.out.println(index);
//            index++;
//        }

        // Do While Loop
//        do{
//            System.out.println(n);
//            n++;
//        }while(n <= 10 );

        // For Loop
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

        // Break Keyword
        while(true){
            if(index % 5 == 0 && index % 7 == 0){
                System.out.println("Found Answer - " + index);
                break;
            }
            index++;
        }

        // Continue Keyword
        for(int i = 1; i <= 50; i++){
            if(i % 3 == 0)
                continue;
            System.out.println(i);
        }


    }
}
