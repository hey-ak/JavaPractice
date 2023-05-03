public class wordsSay {
    public static void main(String[] args) {
        int n = 6;
        String ans[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        for (int i = n-1; i >=1; i--) {
            if (n % i == 0) {
                System.out.println(ans[i-1]);
                break;
            }
        }
    
        
    }
    
}
