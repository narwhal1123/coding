package boj.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

출력
총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

제한
1 ≤ N ≤ 100,000
1 ≤ M ≤ 100,000
1 ≤ i ≤ j ≤ N

5 3
5 4 3 2 1
1 3
2 4
5 5

12
9
1
 */
public class q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int numCount = Integer.parseInt(stringTokenizer.nextToken());
        int sumCount = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] input = new int[numCount];
        int[] prefixSum = new int[numCount + 1];
        for (int i = 0; i < numCount; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
            prefixSum[i + 1] = prefixSum[i] + input[i]; // 누적 합
        }

        for (int i = 0; i < sumCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            System.out.println(-prefixSum[Integer.parseInt(stringTokenizer.nextToken()) - 1] + prefixSum[Integer.parseInt(stringTokenizer.nextToken())]);
        }
    }
}
