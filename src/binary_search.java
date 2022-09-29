import java.util.*;

public class binary_search {
    public static int search(int[] a, int o, int e, int s){
        int m = o + (e - o)/2;
        if(o == e)
            if(a[o] == s)
                return o;
            else
                return -1;
        if(a[m] == s)
            return m;
        if(a[m] > s)
            return search(a, o, m - 1, s);
        return search(a, m + 1, e, s);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        int s = scn.nextInt();
        Arrays.sort(a);

        int ans = search(a,0,n,s);
        if(ans != -1) {
            System.out.println(ans);
        }
        else System.out.println("Not Found");


        scn.close();
    }
}
