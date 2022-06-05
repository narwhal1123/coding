package iteration;

import java.util.Scanner;

public class q10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            if (c < b) {
                System.out.printf("%d ", c);
            }
        }
    }
}
