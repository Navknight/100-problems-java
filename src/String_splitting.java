import java.util.*;
import java.io.*;

public class String_splitting {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();

        for(int i = 0; i < n; i++)
        {
            String s1 = s.substring(0,i);
            String s2 = s.substring(i,n);
            if(s1.indexOf(s2) != -1)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
