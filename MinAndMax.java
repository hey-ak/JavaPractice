import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter the number of elements: ");
        int count = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            number = sc.nextInt();
            list.add(number);
        }
        
        int smallest = Collections.min(list);
        int largest = Collections.max(list);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        sc.close();
    }
}
