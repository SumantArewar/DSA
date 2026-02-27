package Day29;

public class RecursionProblem5 {
    static int printMax(int[] arr, int i){
        int max = Integer.MIN_VALUE;
//        System.out.println(max);
        if(arr[i] < arr[i-1]) max = arr[i-1];
        if(i-1 == 0) return max;
        printMax(arr, i-1);
        return max;
    }

// yet to add remaining methods 

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 5, 8};
        int maxValue = printMax(arr, 4);
        System.out.println(maxValue);
    }
}
