package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class q1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int setACount = Integer.parseInt(stringTokenizer.nextToken());
        int setBCount = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < setACount; i++) {
            hashMap.put(Integer.parseInt(stringTokenizer.nextToken()), 1);
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < setBCount; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if (hashMap.containsKey(temp)) {
                hashMap.put(temp, 2);
            } else {
                hashMap.put(temp, 1);
            }
        }

        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (Objects.equals(entry.getValue(), 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
