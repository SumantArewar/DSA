package Day21;

public class SpaceComplexity {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int ans = 0;
        for(int i = 0; i <= n ; i++ ){
            ans += digits[i];
            ans *= 10;
        }

        ans /= 10;
        ans += 1;
        Integer x = Integer.valueOf(ans);
        int l = x.toString().length();
        int[] result = new int[l];
        for(int i = l-1; i >= 0; i--){
            result[i] = ans % 10;
            ans /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {

    }
}
