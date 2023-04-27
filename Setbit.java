public class Setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int new_number = bitmask | n;
        System.out.println(new_number);
    }
    
}
