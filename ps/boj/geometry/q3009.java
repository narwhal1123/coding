package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            x[i] = Integer.parseInt(stringTokenizer.nextToken());
            y[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        if (x[0] == x[1]) {
            System.out.printf("%d ", x[2]);
        } else if (x[0] == x[2]) {
            System.out.printf("%d ", x[1]);
        } else {
            System.out.printf("%d ", x[0]);
        }

        if (y[0] == y[1]) {
            System.out.printf("%d", y[2]);
        } else if (y[0] == y[2]) {
            System.out.printf("%d", y[1]);
        } else {
            System.out.printf("%d", y[0]);
        }
    }
}
