package Day33;

public class RecursionProblems9 {
    static int minCost(int[] h, int n, int idx){
        //base case
        if(idx == n-1) return 0;

        //self work
        int opt1 = minCost(h, n, idx+1) + Math.abs(h[idx+1] - h[idx]);
        if(idx == n-2) return opt1;
        int opt2 = minCost(h, n, idx+2) + Math.abs(h[idx+2] - h[idx]);

        return Math.min(opt1, opt2);
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        int minCostOfFrogJump = minCost(arr, arr.length, 0);
        System.out.println(minCostOfFrogJump);
    }
}
