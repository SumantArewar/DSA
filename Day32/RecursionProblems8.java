package Day32;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionProblems8 {
    static ArrayList<String> getSSQ (String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }

        //self work
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for(String ss: smallAns ){
            ans.add(ss);
            ans.add(curr + ss);
        }

        return ans;
    }

    static void printSSQ(String s, String currAns){
        //base case
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }

        // self work
        char currChar = s.charAt(0);
        String remainingAns = s.substring(1);
        printSSQ(remainingAns, currAns + currChar);
        printSSQ(remainingAns, currAns);
    }

    static void sumOfSubsets(int[] arr, int ans){
        //base case
        if(arr.length == 0){
            System.out.print(ans + " ");
            return ;
        }

        // self work
        int curr = arr[0];
        int[] remainingAns = Arrays.copyOfRange(arr, 1, arr.length);
        sumOfSubsets(remainingAns, ans + curr);
        sumOfSubsets(remainingAns, ans);
    }

    //Alternate method for Sum of all Subsets
    static void subsetSum(int[] a, int n, int idx, int sum){
        //base case
        if(idx >= n){
            System.out.println(sum);
            return;
        }
        subsetSum(a, n, idx+1, sum + a[idx]);
        subsetSum(a, n, idx+1, sum);
    }


    public static void main(String[] args) {
//        ArrayList<String> answer = getSSQ("abc");
//        for(String a: answer ){
//            System.out.println(a);
//        }
//        printSSQ("abc", "");
        int[] arr = {2, 4, 5};
//        sumOfSubsets(arr, 0);
        subsetSum(arr, arr.length,  0, 0);
    }
}
