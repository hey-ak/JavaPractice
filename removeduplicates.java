public class removeduplicates {
    public static void main(String[] args) {
        String a = "abaracadabra";

        boolean arr1[] = new boolean[256];

        StringBuilder b1 = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (!arr1[ch]) {
                b1.append(ch);
                arr1[ch] = true;

            }

        }
        System.out.println(b1.toString());
        
    }
    
}
