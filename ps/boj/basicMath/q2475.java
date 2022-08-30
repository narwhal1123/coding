package boj.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] input = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
            sum += input[i] * input[i];
        }
        System.out.println(sum % 10);
    }
}
