import java.util.Scanner;

public class Regular_expression_matching {
    public static boolean regular(String s, String p) {

        if (p.length() == 0) return s.length() == 0;

        if (p.length() > 1 && p.charAt(1) == '*') {
            if (regular(s, p.substring(2))) {
                return true;
            }
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)))
                return regular(s.substring(1), p);
        } else {
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)))
                return regular(s.substring(1), p.substring(1));
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String p = scn.nextLine();
        System.out.println(regular(s, p));
    }
}
