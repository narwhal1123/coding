package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        String[] input = new String[num];
        for (int i = 0; i < num; i++) {
            input[i] = bufferedReader.readLine();
        }

        Arrays.sort(input, (s1, s2)-> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        return s1.charAt(i) - s2.charAt(i);
                    }
                }
            }
            return 0; // s1.equals(s2);
        });

        StringBuilder stringBuilder = new StringBuilder(input[0] + "\n");
        for (int i = 1; i < num; i++) {
            if (!input[i].equals(input[i - 1])) {
                stringBuilder.append(input[i] + "\n");
            }
        }

        System.out.print(stringBuilder);
    }
}
