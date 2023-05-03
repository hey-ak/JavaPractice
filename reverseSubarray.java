import java.util.Arrays;
import java.util.Scanner;

public class reverseSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter first index:");
        int k = sc.nextInt();
        System.out.println("Enter second index:");
        int l = sc.nextInt();

        // int copyarr[] = new int[n];

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = l; i >= k; i--) {
            System.out.print(arr[i]+" ");
        }
        for (int i = l + 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // System.out.println(Arrays.toString(arr));
    }
}
