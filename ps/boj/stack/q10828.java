package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
public class q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[] stack = new int[10001];
        int startPointer = 0;
        int endPointer = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String order = stringTokenizer.nextToken();
            if (order.equals("push")) {
                int input = Integer.parseInt(stringTokenizer.nextToken());
                stack[endPointer] = input;
                endPointer++;
            } else if (order.equals("pop")) {
                if (startPointer == endPointer) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[endPointer - 1]);
                    endPointer--;
                }
            } else if (order.equals("size")) {
                System.out.println(endPointer - startPointer);
            } else if (order.equals("empty")) {
                if (endPointer == startPointer) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (order.equals("top")) {
                if (endPointer == startPointer) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[endPointer - 1]);
                }
            }
        }
    }
}
