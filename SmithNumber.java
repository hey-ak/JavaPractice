public class SmithNumber {
    static int digitcal(int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;

        }
        return sum;
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num<2){
                return false;
            }
            if (num % i == 0) {
                return false;
                
            }
            
        }
        return true;
    }

    static int primecal(int num){
        int n = 2;
        int sum = 0;

        while (num > 1) {
        
                if (num % n == 0 && isPrime(n)) {
                    sum = sum + digitcal(n);
                    num = num / n;
                } else {
                    n++;
                
                
            }
           

        }
        return sum;
    }

    public static void main(String[] args) {
        int orig = 24;
        int a = digitcal(orig);
        int b = primecal(orig);

        if (a == b) {
            System.out.println("Smith");
        }
        else {
            System.out.println("Non smith");
        }
        
    }
}