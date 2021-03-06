package boj.onedarray;

import java.util.Scanner;

public class q2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[9];

        for (int i = 0; i < 9; i++) {
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        int index = 1;
        for (int i = 1; i < 9; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i + 1;
            }
        }

        System.out.printf("%d\n%d", max, index);
    }
}
