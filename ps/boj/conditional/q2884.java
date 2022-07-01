package boj.conditional;

import java.util.Scanner;

public class q2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b >= 45) {
            System.out.printf("%d %d", a, b - 45);
        } else {
            if (a == 0) {
                System.out.printf("%d %d", 23, b + 15);
            } else {
                System.out.printf("%d %d", a - 1, b + 15);
            }
        }
    }
}
