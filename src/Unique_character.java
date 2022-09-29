import java.io.*;
import java.util.*;


public class Unique_character {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        boolean is_repeating;
        int i;

        for(i = 0; i < s.length(); i++)
        {
            is_repeating = false;
            for(int j = 0; j < s.length(); j++)
            {
                if(i == j)
                    continue;
                if(s.charAt(i) == (s.charAt(j)))
                    is_repeating = true;
            }
            if(is_repeating == false)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
