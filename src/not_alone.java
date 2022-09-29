import java.util.*;

public class not_alone {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int k = scn.nextInt();

        for(int i = 0; i < n; i++){
            if(a[i] == k){
                if(i == 0 || i == n-1)
                    continue;
                else if(a[i - 1] != a[i] && a[i + 1] != a[i]){
                    a[i] = Math.max(a[i - 1], a[i + 1]);
                }
            }
        }
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
