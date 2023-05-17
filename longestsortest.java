import java.util.StringTokenizer;

public class longestsortest {
    public static void main(String[] args) {
        String str = "This is a sample string";
        StringTokenizer st = new StringTokenizer(str);
        String longest = "";
        String shortest = st.nextToken();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.length() > longest.length()) {
                longest = token;
            }
            if (token.length() < shortest.length()) {
                shortest = token;
            }
        }
        System.out.println("Longest word: " + longest);
        System.out.println("Shortest word: " + shortest);
    }
}