import java.io.*;
import java.util.*;

public class Base_6 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int quo = 1;
        int rem = 1;
        String num = "";
        for(int i = 0; quo != 0 ; i++)
        {
            quo = a/6;
            rem = a%6;
            a = quo;

            num  = (char)(48 + rem) + num;
        }
        System.out.println(num);
    }
}
