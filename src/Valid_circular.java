import java.util.Scanner;
import java.io.*;

public class Valid_circular {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.nextLine();

        String s = scn.nextLine();
        int t = n;

        while(t > 0)
        {
            String s1 = "";
            for(int i = 0; i < n - 1; i++)
            {
                s1 += s.charAt(i);
            }
            s1 = s.charAt(n-1) + s1;
            s = s1;
            
            int ind = s1.indexOf('1');
            int ind1 = s1.indexOf('1', ind+1);
            while(ind != -1 && ind1 != -1)
            {
                if(Math.abs(ind1 - ind - 1) <= k)
                {
                    System.out.println("YES");
                    return;
                }
                ind = s1.indexOf('1', ind1);
                ind1 = s1.indexOf('1', ind+1);
            }
            t--;
        }
        System.out.println("NO");
    }
}
