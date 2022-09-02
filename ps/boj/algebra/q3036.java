package boj.algebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] input = new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < num; i++) {
            stringBuilder.append(input[0] / getGcd(input[i], input[0]) + "/" + input[i] / getGcd(input[i], input[0]) + '\n');
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
