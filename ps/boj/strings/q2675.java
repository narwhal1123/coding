package boj.strings;

import java.util.Scanner;

public class q2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        for (int i = 0; i < testcase; i++) {
            int iter = scanner.nextInt();
            String word = scanner.next();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < iter; k++) {
                    System.out.printf("%c", word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
