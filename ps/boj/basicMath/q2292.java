package boj.basicMath;

import java.util.Scanner;

public class q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = 0;

        // 6*(n*(n-1)/2) + 1
        while (a > (3 * n * n - 3 * n + 1)) {
            n++;
        }
        if (a == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
        }
    }
}
