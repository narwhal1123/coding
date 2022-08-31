package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int card_num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        HashSet<Integer> card = new HashSet<>();
        for (int i = 0; i < card_num; i++) {
            card.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        int num = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < num; i++) {
            if (card.contains(Integer.parseInt(stringTokenizer.nextToken()))) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
            if (i != num - 1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}
