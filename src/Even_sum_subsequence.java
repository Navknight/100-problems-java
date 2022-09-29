import java.util.Scanner;

public class Even_sum_subsequence {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println((((n*(n+1))/2)%2 == 1)?n-1:n);
    }
}
