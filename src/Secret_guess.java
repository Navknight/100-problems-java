import java.util.Scanner;

public class Secret_guess {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String s1 = scn.nextLine();

        StringBuilder str = new StringBuilder(s);
        StringBuilder str1 = new StringBuilder(s1);


        int b = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s1.charAt(i)) {
                b++;
                str.setCharAt(i, 'a');
                str1.setCharAt(i,'a');
            }
        }
        int a = 0;
        for(int i = 0; i < s1.length(); i++){
            if(str1.charAt(i) == 'a')
                continue;
            else
                if(str.indexOf(str1.substring(i, i+1)) != -1)
                    a++;
        }

        System.out.println(b+"A"+a+"B");
    }
}
