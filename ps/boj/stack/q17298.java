package boj.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.

예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.

출력
총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.


 */
public class q17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] input = new int[num];
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] stack = new int[num];
        int[] answer = new int[num];
        int endPointer = 0;
        for (int i = num - 1; i >= 0; i--) {
            if (endPointer == 0) { // 스택에 값이 없다면 -1 출력하고 현재 값 넣기
                answer[i] = -1;
                stack[endPointer++] = input[i];
            } else if (input[i] >= stack[endPointer - 1]) { // stack 맨 위의 값보다 크다면 스택을 내려가면서 값 비교
                while (input[i] >= stack[endPointer - 1]) {
                    endPointer--;
                    if (endPointer == 0) {
                        break;
                    }
                }
                if (endPointer == 0) {
                    answer[i] = -1;
                } else {
                    answer[i] = stack[endPointer - 1];
                }
                stack[endPointer++] = input[i];
            } else if (input[i] < stack[endPointer - 1]) { // stack맨 위의 값보다 작다면 맨 위 값 출력 후 현재 값 스택에 넣어둠
                answer[i] = stack[endPointer - 1];
                stack[endPointer++] = input[i];
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int a : answer) {
            stringBuilder.append(a + " ");
        }

        System.out.println(stringBuilder);
    }
}
