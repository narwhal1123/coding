package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[] t = new int[6];
        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < 6; j++) {
                t[j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            int distance = (t[0] - t[3]) * (t[0] - t[3]) + (t[1] - t[4]) * (t[1] - t[4]);
            int longR;
            int shortR;
            if (t[2] >= t[5]) {
                longR = t[2];
                shortR = t[5];
            } else {
                longR = t[5];
                shortR = t[2];
            }

            if (distance == 0 && longR == shortR) {
                System.out.println(-1);
            } else if (distance < longR * longR) { // distance < longR
                if (distance < (longR - shortR) * (longR - shortR)) { // distance + shortR < longR
                    System.out.println(0);
                } else if (distance == (longR - shortR) * (longR - shortR)) { // distance + shortR == longR
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else if (distance == longR * longR) { // distance == longR
                System.out.println(2);
            } else { // distance > longR
                if (distance > (longR + shortR) * (longR + shortR)) { // distance > longR + shortR
                    System.out.println(0);
                } else if (distance == (longR + shortR) * (longR + shortR)) { // distance == longR + shortR
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
