import java.util.Scanner;

public class Sumofnaturanlno {
    static int Sumofnaturanlno(int num) {
        int sum = 0;

        for (int i = 1; i <=num; i++) {
            sum = num*(num+1)/2;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int ans = Sumofnaturanlno(n);
        System.out.println(ans);
    }
    
}
