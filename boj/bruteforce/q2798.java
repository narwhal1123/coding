package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int cardCount = Integer.parseInt(stringTokenizer.nextToken()); // 카드 갯수
        int goal = Integer.parseInt(stringTokenizer.nextToken()); // 만들어야 하는 수

        int[] cardNum = new int[cardCount]; // 카드 입력
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < cardCount; i++) {
            cardNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int max = 0;
        for (int i = 0; i < cardCount; i++) {
            for (int j = i + 1; j < cardCount; j++) {
                for (int k = j + 1; k < cardCount; k++) {
                    int sum = cardNum[i] + cardNum[j] + cardNum[k];
                    if (sum == goal) {
                        System.out.println(sum);
                        return;
                    } else if (sum < goal){
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
