import java.util.Scanner;

public class The_domino {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt();
        int v = (n * m) / 2 - k;

        if (n % 2 == 1) {
            k -= m / 2;
            if (k < 0) {
                System.out.println("NO");
                return;
            }
        } else if (m % 2 == 1) {
            v -= n / 2;
            if (v < 0) {
                System.out.println("NO");
                return;
            }
        }
        if (k % 2 == 1 || v % 2 == 1) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
