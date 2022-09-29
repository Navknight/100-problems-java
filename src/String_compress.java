import java.util.Scanner;

public class String_compress {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1)
                s1 = s1 + s.charAt(i);
            else {
                s1 = s1 + s.charAt(i);
                s1 = s1 + (count);
            }

        }
        System.out.println(s1.length());
    }
}
