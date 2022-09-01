package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int melon = Integer.parseInt(bufferedReader.readLine());

        int[][] distance = new int[6][2];
        for (int i = 0; i < 6; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            distance[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            distance[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] maxWidth = new int[2]; // 길이, index
        int[] maxLength = new int[2];

        for (int i = 0; i < 6; i++) {
            if (distance[i][0] <= 2) {
                if (distance[i][1] > maxLength[0]) {
                    maxLength[0] = distance[i][1];
                    maxLength[1] = i;
                }
            } else {
                if (distance[i][1] > maxWidth[0]) {
                    maxWidth[0] = distance[i][1];
                    maxWidth[1] = i;
                }
            }
        }

        int excludeArea = 0;
        // 최대값이 나오고나서 2개 뒤에 빠지는 사각형의 변의 길이가 나옴
        if (maxLength[1] > maxWidth[1]) {
            if (maxLength[1] == 5 && maxWidth[1] == 0) {
                excludeArea = distance[2][1] * distance[3][1];
            } else {
                excludeArea = distance[(maxLength[1] + 2) % 6][1] * distance[(maxLength[1] + 3) % 6][1];
            }
        } else {
            if (maxWidth[1] == 5 && maxLength[1] == 0) {
                excludeArea = distance[2][1] * distance[3][1];
            } else {
                excludeArea = distance[(maxWidth[1] + 2) % 6][1] * distance[(maxWidth[1] + 3) % 6][1];
            }
        }

        System.out.println((maxLength[0] * maxWidth[0] - excludeArea) * melon);
    }
}
