import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int n = s.length();
        int j = -1;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                String s1 = "";
                for(int k = i - 1; k > j; k--){
                    s1 += s.charAt(k);
                }
                System.out.print(s1 +" ");
                j = i;
            }
            else if(i == n - 1){
                String s1 = "";
                for(int k = i; k > j; k--){
                    s1 += s.charAt(k);
                }
                System.out.print(s1 +" ");
                j = i;
            }
            else
                continue;
        }
    }
}
