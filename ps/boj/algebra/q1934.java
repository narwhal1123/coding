package boj.algebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[][] numbers = new int[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            numbers[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            numbers[i][1] = Integer.parseInt(stringTokenizer.nextToken());

            int gcd = 0;
            int num1 = Math.max(numbers[i][0], numbers[i][1]);
            int num2 = Math.min(numbers[i][0], numbers[i][1]);
            while (num2 > 0) {
                gcd = num1 % num2;
                num1 = num2;
                num2 = gcd;
            }

            System.out.println(numbers[i][0] * numbers[i][1] / num1);
        }
    }
}
