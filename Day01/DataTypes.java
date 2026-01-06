import java.util.Scanner;

public class DataTypes
{
    public static void main(String [] args)
    {

        // Character Data Types
        char ch;
        ch = 65;
        System.out.println("ch = " + ch); //A
        System.out.println("ch = " + ch+1); // A1

        char ch1;
        ch1 = 50;
        System.out.println("ch = " + ch1); //2
        System.out.println("ch = " + ch1+1); //21

        char ch2;
        ch2 = '97'; // error - java: unclosed character literal
        System.out.println("ch = " + ch2);
        System.out.println("ch = " + ch2+1);

        char ch1 = 65;
        System.out.println(ch1);

        char ch2 = 97;
        System.out.println(ch2);

        char ch3 = true; // error - java: incompatible types: boolean cannot be converted to char
        System.out.println(ch3);

        char ch4 = false; // error - java: incompatible types: boolean cannot be converted to char
        System.out.println(ch4);



        //Short and Long Data Type
        short sh1 = 19;
        short sh2 = 11;
        int sh3 = sh1 + sh2;
        System.out.println(sh3);

        short sh4 = 'A'; // 65 - Prints it's ASCII value
        short sh5 = '1'; // 49 - Prints it's ASCII value
        System.out.println(sh4);
        System.out.println(sh5);

//        long num1 = 123456789101123; // error - java: integer number too large

        long n1;
        int n2 = 200005;
        n1 = n2;
        System.out.println(n1);

        long n3 = 200005;
//        int n4 = n3; // error - java: incompatible types: possible lossy conversion from long to int
        System.out.println(n3);


        //Int Data Type
        int ch = 65;
        char ch1 = ch; // error - java: incompatible types: possible lossy conversion from int to char
        System.out.println(ch);
        System.out.println(ch1);


        //  Boolean Data Type
        boolean var = "true"; // error - java: incompatible types: java.lang.String cannot be converted to boolean

        boolean v1 = 1; // error - java: incompatible types: int cannot be converted to boolean,
        boolean v2 = 0; // error - java: incompatible types: int cannot be converted to boolean

        char c1 = 1; // error - java: incompatible types: int cannot be converted to boolean
        char c2 = 0; // error - java: incompatible types: int cannot be converted to boolean
        System.out.println(c1 + " " + c2);

        char c4 = '1'; // error - java: incompatible types: java.lang.String cannot be converted to char
        System.out.println(c4);
        char c3 = "1"; // error - java: incompatible types: java.lang.String cannot be converted to char
//        byte b = 128; // error - java: incompatible types: possible lossy conversion from int to byte


        // Float and Double Data Type
        int numInt = 10;
        float numFloat = numInt;
        System.out.println(numFloat);

        int numInt1 = 'a';
        float numFloat1 = numInt1;
        System.out.println(numFloat1);
        numFloat1 = 20.005f; // error - java: incompatible types: possible lossy conversion from double to float
        System.out.println(numFloat1);

        int num1 = 'Z';
        float num2 = num1;
//        float num2 = num1; //error - java: variable num2 is already defined in method main(java.lang.String[])
        System.out.println(num2);

        double n1 = 90.89D;
        System.out.println(n1);
//        float n2 = n1; // error - java: incompatible types: possible lossy conversion from double to float
//        System.out.println(n2);

        int a1 = 959697;
        float a2 = 959697.12345f;
        double a3 = a2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        char c1 = 'A';
        int b1 = c1;
        float b2 = b1;
        double b3 = b2;
        System.out.println(c1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
