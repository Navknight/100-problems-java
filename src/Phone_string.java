import java.util.Scanner;

public class Phone_string {
    public static int f(int n) {
        if(n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;

        return f(n - 1) + f(n - 2) + f(n - 3);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 0;

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 48]++;
        }
        int ans = 1;
        for (int i = 0; i < 10; i++) {
            if (a[i] != 0 && i != 7 && i != 9)
                ans = ans * f(a[i]);
            if (i == 7 || i == 9)
                ans = ans * (f(a[i]) + f(a[i] - 4));
        }
        System.out.println(ans);
    }
}