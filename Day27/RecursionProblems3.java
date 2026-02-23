package Day27;

public class RecursionProblems3 {
    // Print k multiple of num
    static void kMultiples(int num, int k){
        // base case
        if(k == 0)
            return;
        // smaller problem
        kMultiples(num, k-1);
        // self work
        System.out.print(num * k + " ");
    }

    static int alternateSum(int n){
        if(n == 0)
            return 0;

        if(n % 2 == 0){
            return alternateSum(n-1) - n;
        }
        else{
            return alternateSum(n-1) + n;
        }
    }

    public static void main(String[] args) {
//        kMultiples(12, 5);
//        System.out.println();
//        kMultiples(3, 8);
//        System.out.println();
//        kMultiples(5, 10);
//        System.out.println();

        int sum = alternateSum(10);
        System.out.println(sum);
    }
}
