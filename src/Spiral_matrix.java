import javax.swing.*;
import java.util.Scanner;

public class Spiral_matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] a = new int[r][c];
        boolean[][] m = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                a[i][j] = scn.nextInt();
        }

        int count = 0;
        int i = 0;
        int j = 0;


        while (count <= r + c - 2) {
            for (j = j; j < c; j++) {
                if (!m[i][j]) {
                    System.out.print(a[i][j] + " ");
                    m[i][j] = true;
                }
                else break;
            }
            count++;
            j--;
            i++;
            for (i = i; i < r; i++) {
                if (!m[i][j]) {
                    System.out.print(a[i][j] + " ");
                    m[i][j] = true;
                }
                else break;
            }
            count++;
            i--;
            j--;

            for (j = j; j >= 0; j--) {
                if (!m[i][j]) {
                    System.out.print(a[i][j] + " ");
                    m[i][j] = true;
                }
                else break;
            }
            count++;
            j++;
            i--;

            for (i = i; i >= 0; i--) {
                if (!m[i][j]) {
                    System.out.print(a[i][j] + " ");
                    m[i][j] = true;
                }
                else break;
            }
            count++;
            i++;
            j++;
        }

        scn.close();
    }
}
