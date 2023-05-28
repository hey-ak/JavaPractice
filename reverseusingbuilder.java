public class reverseusingbuilder {
    public static void main(String[] args) {
        String word = "Akshay";

        StringBuilder b1 = new StringBuilder(word);

        StringBuilder rev = b1.reverse();
        System.out.println(rev.toString());
    }
    
}
