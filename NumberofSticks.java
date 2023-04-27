import java.util.*;

public class NumberofSticks {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 8, 9, 10 };
        int target = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while (start <= end) { // fixed the condition
                int mid = start + (end - start) / 2;
                if (arr[mid] + s == target) {
                    count++;
                    break; // added break statement
                } else if (arr[mid] == target) {
                    count++;
                    break; // added break statement
                } else if (arr[mid] + s < target) {
                    start = mid + 1;
                } else { // added else statement
                    end = mid - 1;
                }
            }
        }
        System.out.println(count);
    }
}