import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // Sort the array in ascending order

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("Number of triplets that can be formed: " + count);
    }
}
