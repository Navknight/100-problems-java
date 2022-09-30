import java.util.Scanner;

public class duplicate_and_delete {
    public static String g(String s, int k){
        while(s.length()<k){
            s = s+s;
        }
        while(s.length()>k){
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();

        String p = "";
        p += s.charAt(0);
        String ans = g(p, k);
        for(int i = 1; i < n; i++){
            if(s.charAt(i) > s.charAt(0))
                break;
            p += s.charAt(i);
            ans = (ans.compareTo(g(p,k)) < 0)?ans:g(p,k);
        }
        System.out.println(ans);
    }
}
