package Day06;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 6, 7, 5};
        int ans = 0;
        int max = 0;
        int x = 5;
        int index = -1;

        // Find the sum of all the elements in the array
        for(int i = 0; i < arr.length; i++){
            ans += arr[i];
        }
        System.out.println("Sum is - " + ans);

        // Find the Maximum value out of all the elements in the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is - " + max);

        // Find the Maximum value out of all the elements in the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                index = i;
            }
        }
        System.out.println("X is present at index - " + index);
    }
}
