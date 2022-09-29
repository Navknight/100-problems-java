import java.util.Scanner;

public class Create_tags {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String t = scn.nextLine();

        if(t.indexOf("font") != -1) {
            System.out.println("<font>TIMESNEWROMAN</font>");
            return;
        }


        int ind = 0;
        for(int i = 0; i < t.length(); i++)
            if(t.charAt(i) == 32)
                ind = i;
        String w = t.substring(ind+1);
        t = t.substring(0, ind);
        t = t.toLowerCase();
        System.out.println("<"+t+">"+w+"</"+t+">");
    }
}
