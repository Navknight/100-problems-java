import java.util.Arrays;
import java.util.Scanner;

public class Lonesum {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int[] a = new int[3];
        for(int i = 0; i < 3; i++)
        {
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < 3; i++)
        {
            int temp = 0;
            for(int j = 0; j < 3; j++)
            {
                if(j == i)
                    continue;
                if(a[i] == a[j])
                    temp = -1;
            }
            if(temp == 0)
                sum+=a[i];
            else
                continue;
        }
        System.out.println(sum);
        scn.close();
    }
}
