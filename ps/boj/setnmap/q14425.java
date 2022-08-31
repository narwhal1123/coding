package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int set_num = Integer.parseInt(stringTokenizer.nextToken());
        int check_num = Integer.parseInt(stringTokenizer.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < set_num; i++) {
            hashSet.add(bufferedReader.readLine());
        }

        int count = 0;
        for (int i = 0; i < check_num; i++) {
            if (hashSet.contains(bufferedReader.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
