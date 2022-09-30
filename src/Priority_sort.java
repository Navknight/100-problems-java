import java.util.Scanner;

public class Priority_sort {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        for(int i = 0; i < n; i++)
            p[i] = scn.nextInt();

        for(int i = 0; i < n; i++){
            ans[n - p[i]] = a[i];
        }
        for(int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }
}
