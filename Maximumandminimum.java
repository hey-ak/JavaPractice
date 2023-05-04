public class Maximumandminimum {
    static int Maximum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    static int Minimum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int l = 6;

        int max = Maximum(n, m, l);
        System.out.print("MAx: ");
        System.out.println(max);
        System.out.print("Min: ");
        int min = Minimum(l, m, n);
        System.out.println(min);

    }

}
