package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;
import java.util.StringTokenizer;

public class q1620 {
    // 시간초과 (value 검색이 느림)
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
//
//        int dic_num = Integer.parseInt(stringTokenizer.nextToken());
//        int q_num = Integer.parseInt(stringTokenizer.nextToken());
//
//        HashMap<String, String> hashMap = new HashMap<>();
//        for (int i = 0; i < dic_num; i++) {
//            hashMap.put(bufferedReader.readLine(), String.valueOf(i + 1));
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < q_num; i++) {
//            String temp = bufferedReader.readLine();
//            if (hashMap.containsKey(temp)) { // get value from key
//                stringBuilder.append(hashMap.get(temp) + "\n");
//            } else if (hashMap.containsValue(temp)) { // get key from value
//                stringBuilder.append(getKeyByValue(hashMap, temp) + "\n");
//            }
//        }
//
//        System.out.println(stringBuilder);
//    }
//
//    private static <K, V> K getKeyByValue(HashMap<K, V> hashMap, String value) {
//        for (HashMap.Entry<K, V> entry : hashMap.entrySet()) {
//            if (Objects.equals(value, entry.getValue())) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int dic_num = Integer.parseInt(stringTokenizer.nextToken());
        int q_num = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (int i = 1; i <= dic_num; i++) {
            String temp = bufferedReader.readLine();
            hashMap1.put(temp, String.valueOf(i));
            hashMap2.put(String.valueOf(i), temp);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < q_num; i++) {
            String temp = bufferedReader.readLine();
            if (hashMap1.containsKey(temp)) {
                stringBuilder.append(hashMap1.get(temp) + "\n");
            } else if (hashMap2.containsKey(temp)) {
                stringBuilder.append(hashMap2.get(temp) + "\n");
            }
        }

        System.out.println(stringBuilder);
    }
}
