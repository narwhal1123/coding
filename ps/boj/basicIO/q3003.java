package boj.basicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        input[0] = 1 - input[0];
        input[1] = 1 - input[1];
        input[2] = 2 - input[2];
        input[3] = 2 - input[3];
        input[4] = 2 - input[4];
        input[5] = 8 - input[5];

        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", input[i]);
        }
    }
}
