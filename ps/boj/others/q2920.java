package boj.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int asc= 0;
        int desc = 0;
        for (int i = 0; i < 7; i++) {
            if (input[i] > input[i + 1]) {
                desc++;
            } else {
                asc++;
            }
        }

        if (desc == 7) {
            System.out.println("descending");
        } else if (asc == 7) {
            System.out.println("ascending");
        } else {
            System.out.println("mixed");
        }
    }
}
