package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int person = Integer.parseInt(stringTokenizer.nextToken());
        int del = Integer.parseInt(stringTokenizer.nextToken());

        Queue<Integer> josep = new LinkedList<Integer>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < person; i++) {
            josep.offer(i + 1);
        }

        stringBuilder.append("<");
        while (josep.size() > 1) {
            for (int i = 0; i < del; i++) {
                if (i == del - 1) { // del번째 사람은 제거, 아니면 다시 큐 뒤에 넣어주기
                    stringBuilder.append(josep.poll());
                    stringBuilder.append(", ");
                } else {
                    josep.offer(josep.poll());
                }
            }
        }
        stringBuilder.append(josep.poll());
        stringBuilder.append(">");

        System.out.println(stringBuilder);
    }
}
