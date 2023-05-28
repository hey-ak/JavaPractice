public class CapitalizeStringFirst {
    public static void main(String[] args) {
        String Sentence = "a quick brown fox jumps over the lazy dog";

        String arr1[] = Sentence.split(" ");
        StringBuilder b1 = new StringBuilder();

        for (String element : arr1) {
            b1.append(Character.toUpperCase(element.charAt(0))).append(element.substring(1)).append(" ");

        }
        System.out.println(b1.toString().trim());
        
    }


    
}
