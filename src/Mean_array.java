import java.util.Scanner;

public class Mean_array {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        float sum = 0;

        for(int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            sum+=a[i];
        }

        if(sum/(float)n == 1.0)
        {
            System.out.println("0");
            return;
        }
        if(sum<0)
        {
            System.out.println("1");
            return;
        }
        int x = (int)sum - n;
        System.out.println(x);
    }
}
