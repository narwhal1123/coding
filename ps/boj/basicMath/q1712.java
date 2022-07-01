package boj.basicMath;

import java.util.Scanner;

public class q1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fix = scanner.nextInt();
        int var = scanner.nextInt();
        int sell = scanner.nextInt();

        if (sell - var <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(fix / (sell - var) + 1);
        }
    }
}
