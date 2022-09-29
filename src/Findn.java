import java.util.Scanner;

public class Findn {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int k = scn.nextInt();

        int count = 0;
        for(int i = 0; i < n1; i++){
            if(scn.nextInt() == k)
                count++;
        }
        for(int i = 0; i < n2; i++){
            if(scn.nextInt() == k)
                count++;
        }
        System.out.println(count);
    }
}
