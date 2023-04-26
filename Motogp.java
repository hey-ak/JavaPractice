import java.util.Arrays;

public class Motogp {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 11, 15, 17 };
        int res =0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                res = arr[j] - arr[i];

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (res < min) {
                min = res;

            }

        }
        System.out.println(min);
        


           }
}