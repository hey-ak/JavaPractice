import java.util.Scanner;

public class currencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the amount in Indian Rupees: ");
        double rupees = scanner.nextDouble();

        // Convert rupees to dollars
        double dollars = rupees / 74.26; // Exchange rate as of April 2023

        // Display the result
        System.out.println("USD " + dollars);
    }
}
