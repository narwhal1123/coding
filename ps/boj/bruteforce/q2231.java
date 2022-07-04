package boj.bruteforce;

import java.util.Scanner;

public class q2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i < input; i++) {
            int temp = i;
            int sum = temp;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == input) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
