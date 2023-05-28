public class replacesubstr {
    public static void main(String[] args) {
        String b1 = "hey hey hey hey ha ha";

        StringBuilder b2 = new StringBuilder(b1);
        String targetSubstr = "hey";
        String replaceStr = "hi";

        int index = 0;
        while (index < b2.length()) {
            index = b2.indexOf(targetSubstr, index);
            if (index == -1) {
                break;
            }

            b2.replace(index, index + targetSubstr.length(), replaceStr);
            index += replaceStr.length();
        }

        System.out.println(b2.toString());
    }
}
