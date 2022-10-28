package boj.twodarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int col = 0;
        int row = 0;

        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.printf("%d\n%d %d", max, row + 1, col + 1);
    }
}
