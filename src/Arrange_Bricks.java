import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Arrange_Bricks {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int sb = scn.nextInt();
        int bb = scn.nextInt();
        int l = scn.nextInt();

        int length = l;

        int smallb = 1;
        int bigb = 7;

        int i = 0;

        for(i = 0; i <= bb && i*bigb<= l; i++); 
        i = i - 1;


        l = l - bigb*i;

        int j = 0;

        for(j = 0; j <= sb && j*smallb <= l; j++);
        j--;

        if(j*smallb + i*bigb == length)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
