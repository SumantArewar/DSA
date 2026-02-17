package Day25;

public class RecursionProblems {
    //Find the factorial of n
    static int factorial(int n){
        //base case
        if(n == 1){
            return 1;
        }

        //recursive work
        //self work
        return n * factorial(n-1);
    }

    //Find nth fibonacci number
    static int fibonacci(int n){
        //base case
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        //recursive work
        //self work
        return n + factorial(n-1);
    }

    public static void main(String[] args) {
//        int factorial = factorial(5);
//        System.out.println(factorial);
        int fibonacci = fibonacci(5);
        System.out.println(fibonacci);
    }
}
