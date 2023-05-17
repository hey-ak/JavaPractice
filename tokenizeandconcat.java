import java.util.StringTokenizer;

public class tokenizeandconcat {
    public static void main(String[] args) {
        String str = "This is a sample string";
        String delimiter = "-";
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
            if (st.hasMoreTokens()) {
                sb.append(delimiter);
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}