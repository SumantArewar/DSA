package Day31;

import java.util.Scanner;

public class RecursionProblems7 {
    static String removeOccurrences(String s, int idx){
        if(idx == s.length()) return "";
        String smallAns = removeOccurrences(s, idx+1);
        char curr = s.charAt(idx);
        if(curr != 'a'){
            return curr + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverseString(String s, int idx){
        if(idx == s.length()) return "";
        String smallAns = reverseString(s, idx+1);
        return smallAns + s.charAt(idx);
    }

    static boolean isPalindrome(String s, int l, int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "abacadafagahaja";
        String ss = "abcd";
        String Ans = removeOccurrences(s, 0);
        String revStr = reverseString(str, 0);
//        System.out.println(Ans);
//        System.out.println(revStr);
//        if(str.equals(revStr)){
//            System.out.printf("%s is Palindrome ", str);
//        }else{
//            System.out.printf("%s is not Palindrome ", str);
//        }
//        boolean isPalindrome = isPalindrome(str, 0, str.length()-1);
//        if(isPalindrome){
//            System.out.printf("%s is Palindrome ", str);
//        }else{
//            System.out.printf("%s is not Palindrome ", str);
//        }
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
