package boj.conditional;

import java.util.Scanner;

public class q2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int cook = scanner.nextInt();

        hour += cook / 60;
        min += cook % 60;

        if (min >= 60) {
            hour += min/60;
            min %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.printf("%d %d", hour, min);
    }
}
