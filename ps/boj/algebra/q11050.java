package boj.algebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int num1 = Integer.parseInt(stringTokenizer.nextToken());
        int num2 = Integer.parseInt(stringTokenizer.nextToken());

        int num3 = 1;
        int num4 = 1;
        for (int i = num1; i > num1 - num2; i--) {
            num3 *= i;
        }
        for (int i = 1; i <= num2; i++) {
            num4 *= i;
        }

        System.out.println(num3 / num4);
    }
}
