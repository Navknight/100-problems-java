import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class largest_combination {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int[] dig = new int[n];
        for(int i = 0; i < n; i++){
            int length = (int)(Math.log10(a[i]) + 1);
            int temp = a[i];
            for(int j = 0; j < length - 1; j++){
                temp = temp/10;
            }
            dig[i] = temp;
        }
        Arrays.sort(dig);
        String ans = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                int length = (int) (Math.log10(a[j]) + 1);
                int temp = a[j];
                for (int k = 0; k < length - 1; k++) {
                    temp = temp / 10;
                }
                if(temp == dig[i]) {
                    ans = Integer.toString(a[j]) + ans;
                    break;
                }
            }
        }
        System.out.println(ans);
        scn.close();
    }
}
