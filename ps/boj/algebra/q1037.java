package boj.algebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] divisor = new int[num];
        for (int i = 0; i < num; i++) {
            divisor[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(divisor);
        if (num % 2 == 0) {
            System.out.println(divisor[0] * divisor[num - 1]);
        } else {
            System.out.println(divisor[num / 2] * divisor[num / 2]);
        }
    }
}
