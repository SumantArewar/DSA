package Day26;

public class RecursionProblems2 {
    static int sumOfDigits(int n){
        int ans = 0;
        // base case
        if(n <= 0){
            return 0;
        }
        return n % 10 + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int sum = sumOfDigits(12345);
        System.out.println("Sum of digits is - " + sum);
    }
}
