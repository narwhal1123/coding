package boj.setnmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cardCount = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        HashMap<Integer, Integer> card = new HashMap<>();
        for (int i = 0; i < cardCount; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if (!card.containsKey(temp)) {
                card.put(temp, 1);
            } else if (card.containsKey(temp)) {
                card.put(temp, card.get(temp) + 1);
            }
        }
        int myCardCount = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < myCardCount; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if (card.containsKey(temp)) {
                stringBuilder.append(card.get(temp));
            } else {
                stringBuilder.append("0");
            }
            if (i != myCardCount - 1) {
                stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder);
    }
}
