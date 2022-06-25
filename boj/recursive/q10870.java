package recursive;

import java.util.Scanner;

public class q10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
