package boj.functions;

import java.util.Scanner;

public class q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        q1065 fun = new q1065();
        int a = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (fun.findHansu(i) == 1) {
                count++;
            }
        }

        System.out.println(count);
    }

    int findHansu(int num) {
        if (num < 100) {
            return 1;
        }

        int hundred = num / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;

        // 등차니까 두 수의 차이가 같음
        if ((hundred - ten) == (ten - one)) {
            return 1;
        }
        return 0;
    }
}
