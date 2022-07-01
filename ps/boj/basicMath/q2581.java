package boj.basicMath;

import java.util.Scanner;

public class q2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int primeSum = 0;
        int primeMin = 0;
        int count = 0;

        while (min <= max) {
            if (min == 2) {
                primeMin = min;
                primeSum += min;
                count++;
            }

            int prime = 0;
            for (int i = 2; i * i <= min; i++) {
                if (min % i == 0) {
                    prime = 1;
                    break;
                }
            }

            if (min > 2 && prime == 0) {
                if (primeMin == 0) {
                    primeMin = min;
                }
                primeSum += min;
            }

            min++;
        }
        if (primeMin == 0) {
            System.out.println(-1);
        } else {
            System.out.println(primeSum);
            System.out.println(primeMin);
        }
    }
}
