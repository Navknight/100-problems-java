import java.util.Scanner;

public class number_of_pairs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int l = scn.nextInt();
        int r = scn.nextInt();
        int count = 0;

        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] + a[j] >= l && a[i] + a[j] <= r )
                    count++;
            }
        }
        System.out.println(count);
    }
}
