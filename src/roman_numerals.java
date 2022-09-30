import java.util.Scanner;

public class roman_numerals {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans = "";
        int j = 0;
        for(int i : nums){
            while(n >= i){
                ans+=romans[j];
                n -= i;
            }
            j++;
        }
        System.out.println(ans);
    }
}
