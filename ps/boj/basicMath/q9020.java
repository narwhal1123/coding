package boj.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int testcase = Integer.parseInt(stringTokenizer.nextToken());

        int[] prime = new int[10001];
        Arrays.fill(prime, 1);
        prime[1] = 0;

        // 소수가 아니면 0
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = 2 * i; j < prime.length; j += i) {
                prime[j] = 0;
            }
        }


        for (int i = 0; i < testcase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int input = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = input / 2; j >= 2; j--) {
                if (prime[j] == 0) {
                    continue;
                } else {
                    if (prime[input - j] == 1) {
                        System.out.printf("%d %d\n", j, input - j);
                        break;
                    }
                }
            }
        }
    }
}
