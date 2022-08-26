package boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int width = Integer.parseInt(stringTokenizer.nextToken());
        int length = Integer.parseInt(stringTokenizer.nextToken());

        // board input
        char[][] board = new char[width][length];
        for (int i = 0; i < width; i++) {
            String temp = bufferedReader.readLine();
            for (int j = 0; j < length; j++) {
                board[i][j] = temp.charAt(j);
            }
        }

        // board compare
        int min = 64;

        for (int i = 0; i <= width - 8; i++) {
            for (int j = 0; j <= length - 8; j++) {
                int bw = 0;
                int wb = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (((k + l) % 2 == 0 && board[k][l] == 'W') || ((k + l) % 2 == 1 && board[k][l] == 'B')) {
                            bw++;
                        }
                        if (((k + l) % 2 == 0 && board[k][l] == 'B') || ((k + l) % 2 == 1 && board[k][l] == 'W')) {
                            wb++;
                        }
                    }
                }
                if (bw < min) {
                    min = bw;
                }
                if (wb < min) {
                    min = wb;
                }
            }
        }

        System.out.println(min);
    }
}
