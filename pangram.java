public class pangram {
    public static void main(String[] args) {
        String s = "abaracadabra";
        String target = "abrax";

        char ch[] = s.toCharArray();
        

        for (int i = 0; i < target.length(); i++) {
            char x = target.charAt(i);
            boolean flag = false;

            for (int j = 0; j < ch.length; j++) {
                if (x == ch[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Not pnagram");
                return;
            }

        }
        System.out.println("panagrm");
        
    }
    
}
