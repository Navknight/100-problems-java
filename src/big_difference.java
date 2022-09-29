import java.util.*;

public class big_difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        Arrays.sort(a);

        int diff = a[n - 1] - a[1];
        System.out.println(diff);
    }
}
