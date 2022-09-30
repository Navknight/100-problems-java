import java.util.Arrays;
import java.util.Scanner;

class QuickSort {

    int partition(int a[], int low, int high) {
        int pi = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (a[j] <= pi) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }


    void quick_sort(int a[], int low, int high) {
        if (low < high) {

            int pi = partition(a, low, high);

            quick_sort(a, low, pi - 1);
            quick_sort(a, pi + 1, high);
        }
    }
}

public class Quick_sort {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        QuickSort obj = new QuickSort();
        obj.quick_sort(a, 0, n - 1);
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}