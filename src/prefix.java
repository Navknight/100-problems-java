import java.util.Scanner;

import java.io.*;
import java.util.*;

public class prefix {
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();

        String[] a = new String[n];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = scn.nextLine();
        }
        int length = a[0].length();
        String s = a[0];

        for(int i = 1; i < a.length; i++)
        {
            String s1;
            if(a[i].length()<length)
            {
                s1 = a[i];
                length = a[i].length();
            }
            else {
                s1 = s;
            }
            while(a[i].indexOf(s1) != 0)
                {
                    length--;

                    s1 = s1.substring(0, length);
                    
                    if(length == 0)
                    {
                        System.out.println("-1");
                        return;
                    }
                }
        }

        System.out.println(a[0].substring(0,length));
    }
}
