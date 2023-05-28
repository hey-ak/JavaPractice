import java.util.*;
public class replacestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inpuString = sc.nextLine();
        char targetStr = sc.nextLine().charAt(0);
        char replaceStr = sc.nextLine().charAt(0);

        StringBuilder sb = new StringBuilder(inpuString);


        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == targetStr) {
                sb.setCharAt(i, replaceStr);

            }

        }
        System.out.println(inpuString);
        System.out.println(sb);

    }
    
}
