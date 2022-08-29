package boj.sort;

import java.io.*;
import java.util.Arrays;

public class q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(input);

        StringBuilder stringBuilder = new StringBuilder();
        for (int a: input) {
            stringBuilder.append(a);
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
