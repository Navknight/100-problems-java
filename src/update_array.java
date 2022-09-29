import java.util.Arrays;
import java.util.Scanner;

public class update_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        Arrays.sort(a);

        int t = k - a[0];
        System.out.println((t>=0)?t:"0");
    }
}
