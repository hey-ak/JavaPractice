import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int result [] = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            

            sum += arr[i];
            result[i] = sum;
            

        }
        System.out.println(Arrays.toString(result));

        
    }
    
}
