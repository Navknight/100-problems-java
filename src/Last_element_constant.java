import java.util.Scanner;

public class Last_element_constant {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n - 1; i++){
            scn.nextInt();
        }
        int last = scn.nextInt();
        for(int i = 0; i < 2*n-1; i++)
            System.out.print("0 ");
        System.out.print(last);
    }
}
