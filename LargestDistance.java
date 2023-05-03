import java.util.Arrays;

public class LargestDistance {
    public static void main(String[] args) {
        int arr[] = { 25, 63, 78, 69, 21 };
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int diff = 0;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                
                diff = arr[j] - arr[i];
                if (diff > max) {
                    max = diff;
                }

            }

        }
        
        System.out.println(max);
    }
    
}
