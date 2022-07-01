package boj.onedarray;

import java.util.Scanner;

public class q3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[42];

        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            result[a % 42]++;
        }

        int ans = 0;
        for (int i = 0; i < 42; i++) {
            if (result[i] != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
