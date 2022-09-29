import java.util.Scanner;

public class Middle_three {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        if(s.length() % 2 == 0){
            System.out.println("false");
            return;
        }
        else{
            String s1 = s.substring((s.length() - 2)/2, (s.length() + 3)/2);
            System.out.println(s1);
        }
    }
}
