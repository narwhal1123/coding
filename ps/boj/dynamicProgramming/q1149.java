package boj.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다.
각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

입력
첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다.
집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.

3
26 40 83
49 60 57
13 89 99

96

8
71 39 44
32 83 55
51 37 63
89 29 100
83 58 11
65 13 15
47 25 29
60 66 19

253
 */
public class q1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int house = Integer.parseInt(bufferedReader.readLine());

        int[][] rgb = new int[house][3];
        for (int i = 0; i < house; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            rgb[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            rgb[i][1] = Integer.parseInt(stringTokenizer.nextToken());
            rgb[i][2] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] sum0 = new int[house];
        int[] sum1 = new int[house];
        int[] sum2 = new int[house];

        sum0[0] = rgb[0][0]; // 마지막으로 더한 색이 R
        sum1[0] = rgb[0][1]; // 마지막으로 더한 색이 G
        sum2[0] = rgb[0][2]; // 마지막으로 더한 색이 B

        // 각각 색깔을 칠했을때 최소값을 저장
        for (int i = 1; i < house; i++) {
            sum0[i] = Math.min(sum1[i - 1] + rgb[i][0], sum2[i - 1] + rgb[i][0]);
            sum1[i] = Math.min(sum0[i - 1] + rgb[i][1], sum2[i - 1] + rgb[i][1]);
            sum2[i] = Math.min(sum0[i - 1] + rgb[i][2], sum1[i - 1] + rgb[i][2]);
        }

        // 최소값 출력
        if (sum0[house - 1] <= sum1[house - 1] && sum0[house - 1] <= sum2[house - 1]) {
            System.out.println(sum0[house - 1]);
        } else if (sum1[house - 1] <= sum0[house - 1] && sum1[house - 1] <= sum2[house - 1]) {
            System.out.println(sum1[house - 1]);
        } else if (sum2[house - 1] <= sum0[house - 1] && sum2[house - 1] <= sum1[house - 1]) {
            System.out.println(sum2[house - 1]);
        }
    }
}
