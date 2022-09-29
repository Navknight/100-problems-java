import java.io.*;
import java.util.*;

public class Merge_Arrays {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int[] a3 = new int[n1+n2];

        for(int i = 0; i < n1+n2; i++)
        {
            a3[i] = scn.nextInt();
        }
        for(int i = 0; i < n1+n2 - 1; i++)
        {
            int mini = i;
            for(int j = i+1; j<n1+n2; j++)
            {
                if(a3[j]<a3[mini])
                    mini = j;
            }
            int temp = a3[mini];
            a3[mini] = a3[i];
            a3[i] = temp;
        }
        
        for(int y = 0; y < n1+n2; y++)
        {
            System.out.print(a3[y]+" ");
        }
    }
}
