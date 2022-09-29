import java.util.Scanner;
public class String_decode_my {
    static int i = 0;
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        while (i < s.length()) {
            if (s.charAt(i) == ']') {
                i++;
                return result.toString();
            }
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i++;
                String r = decodeString(s);
                int j = 0;
                while (j < num) {
                    result.append(r);
                    j++;
                }
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String s1 = decodeString(s);
        System.out.println(s1);
    }
}