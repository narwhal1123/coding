package boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int input = Integer.parseInt(stringTokenizer.nextToken());
        char[][] star = new char[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                star[i][j] = ' ';
            }
        }

        setPattern(0, 0, input, star);
        printPattern(input, star);
    }

    public static void setPattern(int x, int y, int count, char[][] star) {
        if (count == 1) {
            star[x][y] = '*';
            return ;
        }

        count /= 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != 1 || j != 1) {
                    setPattern((x + i * count), (y + j * count), count, star);
                }
            }
        }
    }

    // 단순히 system.out.print로 찍으면 시간초과
    public static void printPattern(int n, char[][] star) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stringBuilder.append(star[i][j]);
            }
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder);
    }
}
