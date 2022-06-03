package conditional;

import java.util.Scanner;

public class q2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + 1000 * a);
        } else if (a == b || b == c || a == c) {
            if (a == b || a == c) {
                System.out.println(1000 + 100 * a);
            } else {
                System.out.println(1000 + 100 * b);
            }
        } else {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println(100 * max);
        }
    }
}
