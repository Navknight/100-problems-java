import java.io.*;
import java.util.*;
import java.lang.Math;

public class Excel_sheet 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        char[] c = s.toCharArray();
        
        int l = s.length();
        int num = 0;

        for(int i = 0; i < l; i++)
        {
            int a  = Character.toUpperCase(c[l - i - 1]) - 64;
            num += a * Math.pow(26,i);
        }

        System.out.println(num);
    }
}
