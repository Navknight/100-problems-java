import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[mini]) {
                    mini = j;
                }
            }
            int temp = a[mini];
            a[mini] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
