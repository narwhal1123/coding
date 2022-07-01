package boj.strings;

import java.util.Scanner;

public class q5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += dialTime(input.charAt(i));
        }

        System.out.println(sum);
    }

    public static int dialTime(char a) {
        // 아스키코드값으로 크기 비교로 하면 좀 더 짧아질듯...
        if (a == 'A' || a == 'B' || a == 'C') {
            return 3;
        } else if (a == 'D' || a == 'E' || a == 'F') {
            return 4;
        } else if (a == 'G' || a == 'H' || a == 'I') {
            return 5;
        } else if (a == 'J' || a == 'K' || a == 'L') {
            return 6;
        } else if (a == 'M' || a == 'N' || a == 'O') {
            return 7;
        } else if (a == 'P' || a == 'Q' || a == 'R' || a == 'S') {
            return 8;
        } else if (a == 'T' || a == 'U' || a == 'V') {
            return 9;
        } else {
            return 10;
        }
    }
}
