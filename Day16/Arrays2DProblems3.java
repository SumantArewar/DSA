package Day16;

public class Arrays2DProblems3 {

    // Sum of Rectangle (Brute Force Approach)
    static int findSum(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    // Sum of Rectangle (Precalculating Horizontal Sum of each row)


    // Sum of Rectangle (Prefix Sum over both Rows & Columns)

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13 ,14 ,15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        int sum = findSum(arr, 0, 0, 4, 4);
        System.out.println("Sum of the selected Rectangle is - " + sum);
    }
}
