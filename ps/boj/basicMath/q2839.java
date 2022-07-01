package boj.basicMath;

import java.util.Scanner;

public class q2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int fivek = 0; // 5키로 봉지 수
        int threek = 0; // 3키로 봉지 수

        while (input > 0) {
            if (input % 5 != 0) {
                input -= 3;
                threek++;
            } else {
                fivek = input / 5;
                break;
            }
        }

        if (input < 0) {
            System.out.println(-1);
        } else {
            System.out.println(fivek + threek);
        }
    }
}
