package boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int num = Integer.parseInt(stringTokenizer.nextToken());
        int[][] person = new int[num][2];

        for (int i = 0; i < num; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            person[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            person[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] rank = new int[num];
        Arrays.fill(rank, 1);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(rank[i]);
        }
    }
}
