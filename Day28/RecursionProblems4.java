package Day28;

public class RecursionProblems4 {
    // Find GCD
    static int GCD1(int x, int y){
        int ans = 1;
        int n = Math.min(x, y);
        for(int i = 1; i <= n; i++){
            if(x % i == 0 && y % i == 0){
                ans = i;
            }
        }
        return ans;
    }
    // Find GCD
    static int GCD(int x, int y, int ans){
        int n = Math.min(x, y);
        if(n == 1){
            return n;
        }
        if(x % n == 0 && y % n == 0){
            ans = n;
        }
        GCD(x-1, y-1, ans);
        return ans;
    }
    public static void main(String[] args) {
        int gcd1 = GCD1(4, 8);
        System.out.println(gcd1);
        int gcd = GCD(7, 49, 1);
        System.out.println(gcd);
    }

}
