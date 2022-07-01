package boj.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int input = Integer.parseInt(stringTokenizer.nextToken());
            if (input == 0) {
                break;
            }
            countPrime(input);
        }
    }

    public static void countPrime(int input) {
        int count = 0;
        int max = 2 * input;
        input++;

        while (input <= max) {
            if (input == 1) {
                input++;
                continue;
            } else if (input == 2) {
                count++;
                input++;
                continue;
            }

            int isPrime = 0;
            for (int i = 2; i * i <= input; i++) {
                if (input % i == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0) {
                count++;
            }
            input++;
        }

        System.out.println(count);
    }
}
