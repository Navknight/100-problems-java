import java.util.Scanner;

public class middleway {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int a = 0;
        int b = 0;

        for(int i = 0; i < n1; i++){
            if(i != n1/2)
                scn.nextInt();
            else
                a = scn.nextInt();
        }

        for(int i = 0; i < n2; i++){
            if(i != n2/2)
                scn.nextInt();
            else
                b = scn.nextInt();
        }

        System.out.println(a+" "+b);
    }
}
