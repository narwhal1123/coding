package boj.algebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[] input = new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(input);
        int gcd = input[1] - input[0];
        for (int i = 2; i < num; i++) {
            gcd = getGcd(gcd, input[i] - input[i - 1]);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= gcd; i++) {
            if (gcd % i == 0) {
                stringBuilder.append(i + " ");
            }
        }

        System.out.println(stringBuilder);
    }

    private static int getGcd(int num1, int num2) {
        while (num2 > 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        return num1;
    }
}
