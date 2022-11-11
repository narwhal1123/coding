package boj.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

출력
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

1
9

2
17
 */
public class q10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());
        long[][] answer = new long[input][10];

        answer[0][0] = 0;
        for (int i = 1; i < 10; i++) {
            answer[0][i] = 1;
        }

        for (int i = 1; i < input; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    answer[i][1] = (answer[i][1] + answer[i - 1][0]) % 1000000000;
                } else if (j == 9) {
                    answer[i][8] = (answer[i][8] + answer[i - 1][9]) % 1000000000;
                } else {
                    answer[i][j - 1] = (answer[i][j - 1] + answer[i - 1][j]) % 1000000000;
                    answer[i][j + 1] = (answer[i][j + 1] + answer[i - 1][j]) % 1000000000;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + answer[input - 1][i]) % 1000000000;
        }

        System.out.println(sum);
    }
}
