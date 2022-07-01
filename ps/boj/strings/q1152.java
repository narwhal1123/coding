package boj.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        String input = bufferedReader.readLine();
        input = input.trim();
        stringTokenizer = new StringTokenizer(input);

        System.out.println(stringTokenizer.countTokens());
    }
}
