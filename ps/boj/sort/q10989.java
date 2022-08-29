package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int[] input = new int[num];
        int max = 0;

        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
            if (input[i] > max) {
                max = input[i];
            }
        }

        int[] counting = new int[max+1];
        // counting array
        for (int i = 0; i < num; i++) {
            counting[input[i]]++;
        }

        // counting array 누적갯수
        for (int i = 1; i <= max; i++) {
            counting[i] += counting[i - 1];
        }

        int[] result = new int[num];
        // counting array 배치(뒤에서부터)
        for (int i = num - 1; i >= 0; i--) {
            result[--counting[input[i]]] = input[i];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int a: result) {
            stringBuilder.append(a);
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
