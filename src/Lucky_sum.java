import java.util.Scanner;

public class Lucky_sum {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        for(int i = 0; i < n; i++)
        {
            int temp = scn.nextInt();
            if(Math.abs(temp) == 13)
                break;
            sum += temp;
        }
        System.out.println(sum);
    }
}
