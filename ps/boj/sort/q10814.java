package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int num = Integer.parseInt(bufferedReader.readLine());

        String[][] person = new String[num][2];
        for (int i = 0; i < num; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            person[i][0] = stringTokenizer.nextToken();
            person[i][1] = stringTokenizer.nextToken();
        }

        Arrays.sort(person, (p1, p2)-> {
            if (!p1[0].equals(p2[0])) {
                return Integer.parseInt(p1[0]) - Integer.parseInt(p2[0]);
            }
            return 0;
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(person[i][0] + " " + person[i][1] + "\n");
        }

        System.out.println(stringBuilder);
    }
}
