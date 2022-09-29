import java.util.Scanner;

public class longest_valid_parentheses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int left = 0;
        int right = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                left++;
            else
                right++;
            if (left == right)
                length = (length > 2 * right) ? length : 2 * right;
            else if (right >= left)
                left = right = 0;
        }
        left = 0;
        right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(')
                left++;
            else
                right++;
            if (left == right)
                length = (length > 2 * left) ? length : 2 * left;
            else if (left >= right)
                left = right = 0;
        }
        System.out.println(length);
    }
}
