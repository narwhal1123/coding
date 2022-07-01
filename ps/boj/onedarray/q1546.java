package boj.onedarray;

import java.util.Scanner;

public class q1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double[] score = new double[a];
        double max = 0;

        for (int i = 0; i < a; i++) {
            double b = scanner.nextDouble();
            score[i] = b;
            if (score[i] > max) {
                max = score[i];
            }
        }

        double total = 0;
        for (int i = 0; i < a; i++) {
            score[i] = (score[i] / max) * 100;
            total += score[i];
        }

        System.out.println(total/(double) a);

        // 그냥 다 구하고 결과값 total/a /max * 100 하면 되는데 쓸데없이 반복문 한번 더 돌림

    }
}
