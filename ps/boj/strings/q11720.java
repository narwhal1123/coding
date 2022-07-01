package boj.strings;

import java.util.Scanner;

public class q11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String num = scanner.next();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
//          sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
