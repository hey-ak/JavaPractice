import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Generate the Fibonacci series
        int prev = 0;
        int curr = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}
