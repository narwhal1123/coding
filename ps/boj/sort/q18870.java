package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] point = new int[num];
        for (int i = 0; i < num; i++) {
            point[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] sorted = Arrays.copyOf(point, num);
        Arrays.sort(sorted);

        HashMap hashMap = new HashMap<>();
        int order = 0;
        for (int i = 0; i < num; i++) {
            if (!hashMap.containsKey(sorted[i])) {
                hashMap.put(sorted[i], order++);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(hashMap.get(point[i]) + " ");
        }

        System.out.println(stringBuilder);
    }
}
