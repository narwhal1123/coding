package boj.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

입력
첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)

출력
첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

5 3
1 2 3 1 2

7
 */
public class q10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int inputCount = Integer.parseInt(stringTokenizer.nextToken());
        int divider = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] prefixSum = new int[inputCount + 1];
        int[] count = new int[divider]; // 나머지 값 저장 배열

        for (int i = 0; i < inputCount; i++) {
            prefixSum[i + 1] = (prefixSum[i] + Integer.parseInt(stringTokenizer.nextToken())) % divider;
            count[prefixSum[i+1]]++;
        }

        // (prefixSum[어떤수] - prefixSum[다른수]) % divider == 0
        // prefixSum[어떤수] % divider - prefixSum[다른수]  % divider == 0
        // prefixSum[어떤수] % divider == prefixSum[다른수]  % divider
        // 따라서 나머지가 같은 값 2개를 고르면 된다
        // count배열에 나머지가 같은 값의 갯수를 저장해 두었으므로 count[어떤수] 에서 2개를 선택하는 경우의 수 를 다 더해주면 됨
        long answer = count[0]; // 나머지 0인거 하나만 선택하는 경우
        for (int i = 0; i < divider; i++) { // 나머지가 같은 2 값을 선택하는 경우
            answer += (long) count[i] *(count[i] - 1) / 2;
        }

        System.out.println(answer);
    }
}
