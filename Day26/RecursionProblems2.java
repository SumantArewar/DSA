package Day26;

public class RecursionProblems2 {
    static int sumOfDigits(int n){
        if(n <= 0) return 0;
        return n % 10 + sumOfDigits(n/10);
    }
<<<<<<< HEAD
    static int countOfDigits(int n, int count){
        if(n <= 0) return count;
        return countOfDigits(n/10, count+1);
    }
    static int pow(int p, int q){
        if(q==1) return p;
        return p * pow(p, q-1);
    }
    static int pow2(int p, int q){
        if(q==0) return 1;
        int smallPow = pow2(p,q/2);
        if(p % 2 == 0){
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }

=======
// Remaining methods Yet to add

// Solved Problems 3 as well 
 
>>>>>>> 879687a36f0998a0e1064f4266d24a9201602ec4
    public static void main(String[] args) {
        int sum = sumOfDigits(12345);
        System.out.println("Sum of digits is - " + sum);
        int count = countOfDigits(12345, 0);
        System.out.println("Count of digits is - " + count);
        int pow = pow(2, 3);
        System.out.println("P to the Power Q is - " + pow);
        int pow2 = pow2(5, 3);
        System.out.println("P to the Power Q is - " + pow2);
    }
}
