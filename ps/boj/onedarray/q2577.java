package boj.onedarray;

import java.util.Scanner;

public class q2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] result = new int[10];

        int total = a * b * c;
        int res = 0;
        int num = 0;
        while (total > 0) {
            res = total % 10;
            result[res]++;
            total /=  10;
            num++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }
    }
}
