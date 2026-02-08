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

    // find Prefix Sum matrix row-wise
    static void findRowPrefixSumMatrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }

    // find Prefix Sum matrix column-wise
    static void findRowColumnPrefixSumMatrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    // Sum of Rectangle (Precalculating Horizontal Sum of each row)
    static int findSum2(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        findRowPrefixSumMatrix(arr);
        for(int i = l1; i <= l2; i++){
            if(r1 >=1 ){
                sum += arr[i][r2] - arr[i][r1-1];
            }else
                sum += arr[i][r2];
        }
        return sum;
    }

    // Sum of Rectangle (Prefix Sum over both Rows & Columns)
    static int findSum3(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        findRowColumnPrefixSumMatrix(arr);
        if(l1 == 0 && r1 == 0){
            sum = arr[l2][r2] ;
        }
        else if(l1 >= 1 && r1 == 0){
            sum = arr[l2][r2] - arr[l1-1][r2];
        }
        else if(l1 == 0 && r1 >= 1 ){
            sum = arr[l2][r2] - arr[l2][r1-1];
        }
        else{
            sum = arr[l2][r2] - (arr[l1-1][r2] + (arr[l2][r1-1] - arr[l1-1][r1-1]));
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13 ,14 ,15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        int sum = findSum(arr, 2, 2, 4, 4);
//        int sum2 = findSum2(arr, 0, 0, 1, 1);
        int sum3 = findSum3(arr, 2, 2, 4, 4);
        System.out.println("Sum of the selected Rectangle is - " + sum);
//        System.out.println("Sum of the selected Rectangle is - " + sum2);
        System.out.println("Sum of the selected Rectangle is - " + sum3);
    }
}
