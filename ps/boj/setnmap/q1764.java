package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int notHeard = Integer.parseInt(stringTokenizer.nextToken());
        int notSeen = Integer.parseInt(stringTokenizer.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < notHeard; i++) {
            hashMap.put(bufferedReader.readLine(), 1);
        }

        ArrayList<String> notHeardSeen = new ArrayList<>();
        for (int i = 0; i < notSeen; i++) {
            String temp = bufferedReader.readLine();
            if (hashMap.containsKey(temp)) {
                notHeardSeen.add(temp);
            }
        }

        Collections.sort(notHeardSeen);
        StringBuilder stringBuilder = new StringBuilder();
        for (String person : notHeardSeen) {
            stringBuilder.append(person + "\n");
        }

        System.out.println(notHeardSeen.size() + "\n" + stringBuilder);
    }
}
