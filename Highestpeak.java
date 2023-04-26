import java.util.*;

public class Highestpeak {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 15, 2, 10, 90, 67 };
        Arrays.sort(arr);

        int result = arr[arr.length - 1];
        System.out.println(result);
        
    }
    
}
