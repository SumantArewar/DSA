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
// Remaining methods Yet to add

// Solved Problems 3 as well 
 
    public static void main(String[] args) {
        int sum = sumOfDigits(12345);
        System.out.println("Sum of digits is - " + sum);
    }
}
