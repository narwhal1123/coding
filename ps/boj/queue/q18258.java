package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//push X: 정수 X를 큐에 넣는 연산이다.
//        pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        size: 큐에 들어있는 정수의 개수를 출력한다.
//        empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//        front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class q18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[] queue = new int[2000001];
        int startPointer = 0;
        int endPointer = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String order = stringTokenizer.nextToken();
            if (order.equals("push")) {
                int input = Integer.parseInt(stringTokenizer.nextToken());
                queue[endPointer++] = input;
            } else if (order.equals("pop")) {
                if (startPointer == endPointer) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue[startPointer++]);
                    stringBuilder.append("\n");
                }
            } else if (order.equals("size")) {
                stringBuilder.append(endPointer - startPointer);
                stringBuilder.append("\n");
            } else if (order.equals("empty")) {
                if (startPointer == endPointer) {
                    stringBuilder.append("1\n");
                } else {
                    stringBuilder.append("0\n");
                }
            } else if (order.equals("front")) {
                if (startPointer == endPointer) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue[startPointer]);
                    stringBuilder.append("\n");
                }
            } else if (order.equals("back")) {
                if (startPointer == endPointer) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue[endPointer - 1]);
                    stringBuilder.append("\n");
                }
            }
        }

        System.out.println(stringBuilder);
    }
}
