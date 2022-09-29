import java.util.Scanner;

public class fraction {

    public static boolean power(int n, int a) {
        double x = Math.log(n)/Math.log(a);
        if (Math.ceil(x) == Math.floor(x))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int s = 0;

        if (n % d == 0) System.out.println(n / d);
        else if (power(d, 2) || power(d, 5)) System.out.println((float) n / (float) d);
        else {
            String str = (float) n / (float) d + "";
            String dec = str.substring(2);
            String c = "";
            for (int i = 1; i < str.length() - 2; i++) {
                if (dec.substring(0, i).equals(dec.substring(i, i + i))) {
                    c = dec.substring(0, i);
                    break;
                }
            }
            System.out.println(str.substring(0, 2) + "(" + c + ")");
        }
    }
}

