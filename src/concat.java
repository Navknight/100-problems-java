import java.io.*;
import java.util.*;

public class concat {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        String s1 = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                s1 = s.substring(i+1);
                s = s.substring(0, i);
            }
        }

        char c = s.charAt(s.length() - 1);

        int ind = s.length() - 1;
        int ind1 = 0;
        for(int i = s.length() - 1; i>=0; i--){
            if(s.charAt(i) == c)
                ind = i;
            else
                break;
        }

        s = s.substring(0, ind);
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == c)
                ind1 = i + 1;
            else
                break;
        }

        s1 = s1.substring(ind1);
        System.out.println(s+c+s1);

        scn.close();
    }
}