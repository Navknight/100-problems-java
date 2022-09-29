import java.util.Scanner;

public class lone_sum_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        for(int i = 0; i < n; i++){
            int temp = a[i];
            for(int j = 0; j < n; j++){
                if(j == i)
                    continue;
                if(temp == a[j])
                    a[i] = a[j] = 0;
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
