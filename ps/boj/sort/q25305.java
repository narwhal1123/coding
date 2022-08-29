package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int student = Integer.parseInt(stringTokenizer.nextToken());
        int prize = Integer.parseInt(stringTokenizer.nextToken());

        int[] score = new int[student];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < student; i++) {
            score[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < student - 1; i++) {
            for (int j = i + 1; j < student; j++) {
                if (score[i] < score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        System.out.println(score[prize - 1]);
    }
}
