package boj.iteration;

import java.util.Scanner;

public class q11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i + 1, b, c, b + c);
        }
    }
}
