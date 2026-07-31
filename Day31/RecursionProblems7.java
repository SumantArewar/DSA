package Day31;

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
    public static void main(String[] args) {
        String s = "abacadafagahaja";
        String Ans = removeOccurrences(s, 0);
        System.out.println(Ans);
    }
}
