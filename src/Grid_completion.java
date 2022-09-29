import java.util.Scanner;

public class Grid_completion {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
        StringBuilder string = new StringBuilder(s);
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == 'D')
                string.setCharAt(i, 'U');
            if(s.charAt(i) == 'U')
                string.setCharAt(i, 'D');
        }
        System.out.println(string);
    }
}
