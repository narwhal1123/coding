package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[] stack = new int[100001];
        int pointer = 0;
        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(bufferedReader.readLine());
            if (input == 0) {
                pointer--;
            } else {
                stack[pointer] = input;
                pointer++;
            }
        }

        int sum = 0;
        for (int i = 0; i < pointer; i++) {
            sum += stack[i];
        }

        System.out.println(sum);
    }
}
