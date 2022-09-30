import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count2 = 0;
        int count5 = 0;
        for(int i = 5; n/i >= 1; i = i*5){
            count5+=n/i;
        }
        System.out.println(count5);
    }
}
