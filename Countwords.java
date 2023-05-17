import java.util.Scanner;
import java.util.StringTokenizer;

public class Countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();
        System.out.println("Total number of words in the string: " + count);
    }
}