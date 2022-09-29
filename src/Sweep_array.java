import java.util.Scanner;

public class Sweep_array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int x = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();



        scn.close();
    }
}
