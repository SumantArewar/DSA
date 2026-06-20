package Day29;

public class RecursionProblem5 {
    static int printMax(int[] arr, int idx){
        if(idx == arr.length-1) return  arr[idx];
        int smallAns = printMax(arr, idx+1);
        return Math.max(arr[idx], smallAns);
    }

    static int SumOfElements(int[] arr, int i){
        if(i == arr.length) return 0;
        return SumOfElements(arr, i+1)+ arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 5, 8};
        int maxValue = printMax(arr, 0);
        System.out.println(maxValue);
        int sum = SumOfElements(arr, 0);
        System.out.println(sum);
    }
}
