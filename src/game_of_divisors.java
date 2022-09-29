import java.util.Scanner;

public class game_of_divisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = n - 1;
        int count = 0;
        for (i = 2; i < n; i++) {
            if(n == 1)
                break;
            if (n % i == 0) {
                n -= i;
                count++;
                i--;
            }

        }
        System.out.println((count % 2 == 0) ? "Suresh" : "Ramesh");
    }
}
