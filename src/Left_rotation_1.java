import java.util.Scanner;

public class Left_rotation_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] a = new int[5];

        int first = 0;
        for(int i = 0; i < 5; i++){
            if(i == 0)
                first = scn.nextInt();
            else
                a[i - 1] = scn.nextInt();
        }
        a[4] = first;
        for(int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
    }
}
