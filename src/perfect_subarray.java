import java.util.Scanner;

public class perfect_subarray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += a[k];
                }
                for(int w = 1; w <= sum; w++){
                    if(sum == w*w){
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
