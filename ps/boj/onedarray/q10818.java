package boj.onedarray;

import java.util.Scanner;

public class q10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] num = new int[a];

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            num[i] = b;
        }

        int max = num[0];
        int min = num[0];

        for (int i = 1; i < a; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}
