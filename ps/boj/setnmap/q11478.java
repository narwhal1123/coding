package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 1; i <= input.length(); i++) { // i : length of substring
            for (int j = 0; i + j <= input.length(); j++) { // j : offset
                hashSet.add(input.substring(j, i + j));
            }
        }
        System.out.println(hashSet.size());
    }
}
