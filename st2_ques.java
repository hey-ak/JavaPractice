import java.util.Arrays;

public class st2_ques {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 2;
        int m = 4;

        int[] ans = new int[arr.length];
        int x = 0;

        for (int index = n; index >= 0; index--) {
            ans[x++] = arr[index];
        }

        for (int index = m; index >= n + 1; index--) {
            ans[x++] = arr[index];
        }
        
        System.out.println(Arrays.toString(ans));
    }
}
