import java.util.Scanner;
import java.util.StringTokenizer;

public class Countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String arr1[] = str.split(" ");
        System.out.println(arr1.length);
    
    }
}