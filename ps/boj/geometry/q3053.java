package boj.geometry;

import java.util.Scanner;

public class q3053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double pi = Math.PI;
        System.out.printf("%.4f\n%.4f", radius * radius * pi, radius * radius * 2);
    }
}
