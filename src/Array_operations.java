import java.util.Scanner;

public class Array_operations {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        for(int i = 0; i < n -1; i++){
            while(a[i] > 0 && a[i+1] > 0){
                a[i] -= 1;
                a[i+1] -= 1;
            }
        }

        for(int i = 0; i < n; i++){
            if(a[i] != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
