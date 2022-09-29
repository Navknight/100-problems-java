import java.io.*;
import java.util.*;

public class Reverse_vowels {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        int l = s.length();

        char[] c = s.toCharArray();
        String stor = "";

        for(int i = 0; i < l; i++)
        {
            if(c[i] == 65 || c[i] == 69 || c[i] == 73 || c[i] == 79 || c[i] == 85 || c[i] == 97 || c[i] == 101 || c[i] == 105 || c[i] == 111 || c[i] == 117)
            {
                stor += c[i];
            }
        }
        int l1 = stor.length();
         
        String rstor = "";
        for(int i = 0; i < l1; i++)
        {
            char d = stor.charAt(l1 - i - 1);
            rstor += d;
        }
        int j = 0;
        for(int i = 0; i < l; i++)
        {
            if(c[i] == 65 || c[i] == 69 || c[i] == 73 || c[i] == 79 || c[i] == 85 || c[i] == 97 || c[i] == 101 || c[i] == 105 || c[i] == 111 || c[i] == 117)
            {
                System.out.print(rstor.charAt(j));
                j++;
            }
            else
            {
                System.out.print(c[i]);
            }
        }
    }
}
