import java.io.*;
import java.util.*;

public class hasRun {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        if(s.indexOf("run") == 0 || s.indexOf("run") == 1)
        {
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}