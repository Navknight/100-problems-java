import java.io.*;
import java.util.*;

public class Capitals {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        boolean all_upper = true;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isUpperCase(c) == false)
            {
                all_upper = false;
                break;
            }
        }

        if(all_upper == true)
        {
            System.out.println("true");
            return;
        }

        char f = s.charAt(0);
        boolean only_one = true;
        if(Character.isUpperCase(f) == true)
        {
            for(int i = 1; i < s.length(); i++)
            {
                char c = s.charAt(i);
                if(Character.isUpperCase(c) == true)
                {
                    only_one = false;
                    break;
                }
            }
            if(only_one == true)
        {
            System.out.println("true");
            return;
        }
        }
        

        boolean all_lower = true;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isUpperCase(c) == true)
            {
                all_lower = false;
                break;
            }
        }
        if(all_lower == true)
        {
            System.out.println("true");
            return;
        }

        System.out.println("false");
    }
}