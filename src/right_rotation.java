import java.util.Scanner;

public class right_rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int[] a1 = new int[n];
        while (t > 0) {
            for (int i = 1; i < n; i++) {
                a1[i] = a[i - 1];
            }
            a1[0] = a[n - 1];
            for (int i = 0; i < n; i++)
                a[i] = a1[i];
            t--;
        }

        for (int i = 0; i < n; i++)
            System.out.print(a1[i] + " ");
    }
}
