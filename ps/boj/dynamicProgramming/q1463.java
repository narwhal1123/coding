package boj.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

입력
첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.

출력
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

2
1

10
3
 */
public class q1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());

        int[] calc = new int[input + 1]; //input 가는데 가장 적은 계산 횟수 저장
        calc[0] = 0;
        calc[1] = 0;
        if (input > 1) {
            calc[2] = 1;
        }
        if (input > 2) {
            calc[3] = 1;
        }

        for (int i = 4; i <= input; i++) {
            int div3 = 999;
            int div2 = 999;
            int minus1 = calc[i - 1] + 1;
            if (i % 3 == 0) {
                div3 = calc[i/3] + 1;
            }
            if (i % 2 == 0) {
                div2 = calc[i/2] + 1;
            }

            calc[i] = Math.min(Math.min(div3, div2), minus1);
        }

        System.out.println(calc[input]);
        bufferedReader.close();
    }
}
