package iteration;

import java.util.Scanner;

public class q10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        for (int i = 0; i < test; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
