import java.util.*;
public class CheckAn {
    public static void main(String[] args) {

        String a = "Amit";
        String b = "mitA";

        if (a.length() != b.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // if (arr1.equals(arr2)) {
        //     System.out.println("Anagram");
        // }
        if(Arrays.equals(arr1, arr2))
            System.out.println("Anagram");

    }
    
}
