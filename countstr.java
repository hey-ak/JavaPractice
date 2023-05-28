import java.util.Scanner;

public class countstr {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String a = sc.nextLine();
        System.out.println("Enter Substring");
        String b = sc.nextLine();
        int count = 0;
        int index = 0;

        while (index < a.length()) {
            index = a.indexOf(b, index);

            if (index != -1) {
                count++;

                index = b.length() + index;
            } else {
                break;
            }

        }
        System.out.println(count);
        
 }
    
}
