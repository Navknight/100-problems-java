import java.util.Scanner;

public class Minimum_operations {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum+=a[i];
        }

        if(sum%k == 0)
            System.out.println("0");
        else
            System.out.println("1");
    }
}
