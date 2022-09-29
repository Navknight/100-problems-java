import java.util.Scanner;

public class Swapends {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        int temp = a[0];
        a[0] = a[n - 1];
        a[n-1] = temp;

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
