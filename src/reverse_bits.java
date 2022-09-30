import java.util.Scanner;

public class reverse_bits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long num = 0;
        for(int i = 31; i >= 0; i--){
            long r = n%2;
            n = n/2;
            num+= (long)(r*Math.pow(2,i));
        }
        System.out.println(num);
    }
}
