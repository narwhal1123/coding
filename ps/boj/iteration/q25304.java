package boj.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int total = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int num = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < num; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int price = Integer.parseInt(stringTokenizer.nextToken());
            int amount = Integer.parseInt(stringTokenizer.nextToken());
            total -= price * amount;
        }

        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
