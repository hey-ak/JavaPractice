import java.util.Arrays;

public class Motogp {
    public static void main(String[] args) {
        int arr[] = { 25,63,78,21,61,69 };
        int diff =0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                diff = arr[j] - arr[i];
                if (diff < min) {
                    min = diff;
                }

            }

        }
       
        System.out.println(min);
        


           }
}