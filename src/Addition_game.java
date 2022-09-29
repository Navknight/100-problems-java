import java.util.Scanner;

public class Addition_game {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
            sum += a[i];
        }

        if(sum%2 == 0)
            System.out.println("1");
        else
            System.out.println("2");
    }
}
