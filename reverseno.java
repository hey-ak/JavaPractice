public class reverseno{
    public static void main(String[] args){
        int num = 123;
        String x = Integer.toString(num);

        for (int i = x.length() - 1; i >= 0; i--) {
            System.out.print(x.charAt(i));
            
        }

        // int new_num = 0;
        // while (num > 0) {
        //     int lastdigit = num % 10;
        //     new_num = lastdigit + new_num * 10;
        //     num /= 10;
        // }
        // System.out.println(new_num);
    }
}