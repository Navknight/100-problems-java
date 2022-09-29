import java.util.Scanner;

public class maximum_product {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        int d = c / 2 + 1;
        int p = 0;
        for (int i = 2 * d - 1; i > 0; i--) {
            for (int j = 2 * d - 2; j > 0; j--) {
                if ((i ^ j) == c) {
                    if (i * j > p)
                        p = i * j;
                }
            }
        }
        System.out.println(p);
        scn.close();
    }
}
