import java.util.Arrays;
import java.util.Scanner;

public class The_playoff_tournament {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] s  = new int[4];

        for(int i = 0; i < 4; i++)
            s[i] = scn.nextInt();

        int f1 = (s[0] > s[1])?s[0]:s[1];
        int f2 = (s[2] > s[3])?s[2]:s[3];

        Arrays.sort(s);
        if(f1 != s[2] && f1 != s[3]) {
            System.out.println("NO");
            return;
        }
        if(f2 != s[2] && f2 != s[3]){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
