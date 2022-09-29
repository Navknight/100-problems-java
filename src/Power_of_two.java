import java.io.*;
import java.util.*;

public class Power_of_two {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n == 1)
        {
            System.out.println("true");
            return;
        }

        for(int i = 0; n != 1; i++)
        {            
            int rem = n%2;
            n = n/2;
            if(rem == 1 && n!=0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
