package Day30;

public class RecursionProblem6 {

    static boolean isExists (int[] arr, int target, int n, int idx){
        if(idx >= n ) return false;
        if(arr[idx] == target) return true;
        return isExists(arr, target, n, idx+1);
    }

    static void findIndices (int[] arr, int target, int n, int idx){
        if(idx >= n ) return;
        if(arr[idx] == target) System.out.print(idx + " ");;
        findIndices(arr, target, n, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 6, 5, 8, 6};
        boolean ans = isExists(arr,6, arr.length, 0);
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        findIndices(arr,6, arr.length, 0);

    }
}