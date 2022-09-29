import java.util.*;

public class is_everywhere {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int k = scn.nextInt();

        boolean isThere = false;

        for(int i =0; i < n; i++){
            if(a[i] == k) {
                isThere = true;
                break;
            }
        }

        if(!isThere){
            System.out.println("false");
            return;
        }

        for (int i = 1; i < n - 1; i++) {
            if (!((a[i + 1] == k && a[i - 1] == k) || a[i] == k)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
