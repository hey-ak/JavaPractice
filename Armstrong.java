import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
            }

        }
    }
}
