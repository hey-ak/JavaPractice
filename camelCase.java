import java.util.Scanner;

public class camelCase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i == 0) {
                word = word.toLowerCase();
            } else {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                word = firstChar + restOfWord;
            }

            builder.append(word+" ");
        }

        String camelCase = builder.toString();
        System.out.println("Camel case string: " + camelCase.trim());

        scanner.close();
    }
}
