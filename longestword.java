public class longestword {
    public static void main(String[] args) {
        String sentence = "Akshay jhaaaaaaaaaaa is a good boy";
        String[] words = sentence.split(" ");
        String LongestWord = "";

        for (String word : words) {
            if (word.length() > LongestWord.length()) {
                LongestWord = word;

            }

        }
        System.out.println(LongestWord);
    }
    
}
