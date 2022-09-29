import java.util.Scanner;

public class Rare_palindromes {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int[] a = new int[26];
        for(int i = 0; i < 26; i++)
            a[i] = 0;

        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i) - 'a']++;
        }

        int numo = 0;
        int nume = 0;
        int num1 = 0;

        for(int i = 0; i < 26; i++){
            if(a[i] % 2 == 0 && a[i] != 0)
                nume++;
            if(a[i] % 2 == 1 && a[i] != 1)
                numo++;
            if(a[i] == 1)
                num1++;
        }
        if(num1 != 0 && nume == 0 && numo == 0){
            System.out.println("NO");
            return;
        }
        if(num1 > numo + nume) {
            System.out.println("NO");
            return;
        }
        if(nume >= numo){
            System.out.println("YES");
            return;
        }
        if(nume == 0 || numo == 0){
            System.out.println("YES");
            return;
        }


    }
}
