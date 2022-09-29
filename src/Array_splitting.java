import java.util.Scanner;

public class Array_splitting {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        n = 2*n;
        int sum = 0;
        for(int i = 0; i < n; i++)
            sum+= (scn.nextInt()%2);

        System.out.println((sum == n/2)?"Yes":"No");
    }
}
