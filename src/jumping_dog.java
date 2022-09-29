import java.util.Scanner;

public class jumping_dog {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int g = scn.nextInt();
        int c = scn.nextInt();

        System.out.println((c*c)/(2*g));
    }
}
