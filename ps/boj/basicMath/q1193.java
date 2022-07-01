package boj.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int input = Integer.parseInt(stringTokenizer.nextToken());

        int line = 1;
        while ((line * (line + 1) / 2) < input) {
            line++;
        }

        if (line % 2 == 0) {
            input = input - (line * (line - 1) / 2);
            System.out.printf("%d/%d\n", input, line + 1 - input);
        } else {
            input = input - (line * (line - 1) / 2);
            System.out.printf("%d/%d\n", line + 1 - input, input);
        }
    }
}
