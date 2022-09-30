import java.util.Scanner;

public class Second_largest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] max = new int[2];
        max[0] = -124234234;
        max[1] = scn.nextInt();
        for(int i = 0; i < n - 1; i++){
            int temp = scn.nextInt();
            if(temp > max[1] && temp > max[0]){
                max[0] = max[1];
                max[1] = temp;
            }
            else if(temp > max[0] && temp < max[1]){
                max[0] = temp;
            }
        }
        System.out.println(max[0]);
        scn.close();
    }
}
