import java.util.*;
import java.io.*;

public class Majority_element {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
        }

        int[] f = new int[n];
        for(int i = 0; i < n; i++)
        {
            f[i] = 0;
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(a[i] == a[j])
                    f[i]++;
            }
        }
        int max = 0;
        int maxi = 0;
        for(int i = 0; i < n; i++)
        {
            if(f[i] > max)
            {
                max = f[i];
                maxi = i;
            }
        }
        System.out.println(a[maxi]);
    }
}
