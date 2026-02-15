package Day23;

public class PlusOneQuestion {

    static int[] myPlusOne(int[] digits) {
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

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        // Solved LeetCode - Array - Plus One question
        int[] arr = {1, 2, 3};
        int[] ans = plusOne(arr);
        System.out.println(ans);
    }
}
