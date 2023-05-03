import java.util.Scanner;

public class primenumber {
  static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}