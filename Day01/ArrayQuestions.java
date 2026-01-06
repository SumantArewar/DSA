import java.util.Scanner;

class OneD_Array
{
    void singleArrays()
    {
        int[] ages = new int[3];
        String[] name = new String[3];
        String[] names = {"Messi", "Ronaldo"};

//        System.out.println(ages.length);  // 3
//        System.out.println(names.length); // 2

        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

//        System.out.println(names[0]);
//        System.out.println(names[1]);

        for(int i = 0; i < 3; i++)
        {
            System.out.println(ages[i]);
        }

        for(int age : ages)
        {
            System.out.println(age);
        }

        int i = 0;
        while(i<3)
        {
            System.out.println(ages[i]);
            i++;
        }

    }
}

class TwoD_Array
{
    void multiArrays()
    {
        int[][] arr2 = new int[2][3];
        int[][] arrTwo = {{1,2}, {3,4}, {5,6}};

        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;

        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;

//        System.out.println(arrTwo[0][0]);
//        System.out.println(arrTwo[0][1]);
//        System.out.println(arrTwo[1][0]);
//        System.out.println(arrTwo[1][1]);
//        System.out.println(arrTwo[2][0]);
//        System.out.println(arrTwo[2][1]);
        for(int i = 0; i < arrTwo.length; i++)
        {
            for(int j = 0; j < arrTwo[i].length; j++)
            {
                System.out.println(arrTwo[i][j]);
            }
        }

//        System.out.println(arr2[0][0]);
//        System.out.println(arr2[0][1]);
//        System.out.println(arr2[0][2]);
//        System.out.println(arr2[1][0]);
//        System.out.println(arr2[1][1]);
//        System.out.println(arr2[1][2]);
    }
}

class ThreeD_Array
{
    void thirdArray()
    {
        int[][][] arr3 = new int[1][2][3];
        arr3[0][0][0] = 1;
        System.out.println(arr3[0][0][0]);
    }
}

public class ArrayQuestions
{
    public static void main(String[] args)
    {
        OneD_Array arrOne = new OneD_Array();
//        arrOne.singleArrays();

        TwoD_Array arrTwo = new TwoD_Array();
//        arrTwo.multiArrays();

        ThreeD_Array arrThree = new ThreeD_Array();
//        arrThree.thirdArray();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements in the Array");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}
