package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[][] point = new int[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            point[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            point[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(point, (p1, p2) -> {
            if (p1[1] == p2[1]) {
                return p1[0] - p2[0];
            } else {
                return p1[1] - p2[1];
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(point[i][0] + " " + point[i][1] + "\n");
        }

        System.out.println(stringBuilder);
    }
}
