public class kthPrimenumber {
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;        
    }

    public static void main(String[] args) {
        int n = 15;
        int k = 2;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                count++;
                if (count == k) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
