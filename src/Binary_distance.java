import java.io.*;
import java.util.*;


public class Binary_distance {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int quo = 1;
        int rem = 1;
        String num = "";
        for(int i = 0; quo != 0 ; i++)
        {
            quo = a/2;
            rem = a%2;
            a = quo;

            num  = (char)(48 + rem) + num;
        }
        int l = 0;
        int index = -1;

        for(int i = 0; i < num.length(); i++)
        {
            if(num.charAt(i) == '1')
            {
                index = i;
                break;
            }
        }
        for(int i = index + 1; i < num.length(); i++)
        {
            if(num.charAt(i) == '1')
            {
                if(i - index > l)
                {
                    l = i - index;
                    index = i;
                }
            }
        }
        System.out.println(l);
    }
}
