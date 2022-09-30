import java.util.Scanner;

public class profit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int profit = 0;
        for(int i = 0; i < n -1;i++){
            if(a[i] < a[i+1]){
                profit+= a[i+1]-a[i];
            }
        }
        System.out.println(profit);
    }
}
