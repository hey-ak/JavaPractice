import java.util.Scanner;

public class pythagorian  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        if (n * n + m * m == l * l) {
            System.out.println("Pyhtagorian Trilet");
        }
        else {
            System.out.println("Not Pythagorian Triplet");
        }

        
    }
    
}
