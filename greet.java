import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Print greeting message
        System.out.println("Hello, " + name + "! Nice to meet you.");
    }
}
