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

    static void keypadCombinations(String digits, String[] kp, String result){
        if(digits.length() == 0){
            System.out.print(result + " ");
            return;
        }

        int currChar = digits.charAt(0) - '0'; // 2
        String currChoices = kp[currChar]; // "abc"

        for(int i = 0; i < currChoices.length(); i++){
            keypadCombinations(digits.substring(1), kp, result + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        int minCostOfFrogJump = minCost(arr, arr.length, 0);
        System.out.println(minCostOfFrogJump);

        String digits = "23";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //              0   1    2      3      4      5      6       7      8       9

        keypadCombinations(digits, kp, "");
    }
}
