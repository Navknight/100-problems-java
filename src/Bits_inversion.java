import java.util.Scanner;

public class Bits_inversion {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        int ans = 0;

        for(int i = 0; i < a.length(); i+=2)
        {
            if(a.charAt(i) == b.charAt(i))
                continue;
            while(i < a.length() && a.charAt(i) != b.charAt(i))
                i+=2;
            ans++;
        }
        for(int i = 1; i < a.length(); i+=2)
        {
            if(a.charAt(i) == b.charAt(i))
                continue;
            while(i < a.length() && a.charAt(i) != b.charAt(i))
                i+=2;
            ans++;
        }
        System.out.println(ans);
    }
}
