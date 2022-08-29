package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int a: input) {
            System.out.println(a);
        }
    }
}
