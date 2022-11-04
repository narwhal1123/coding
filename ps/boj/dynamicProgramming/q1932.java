package boj.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
문제
        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때,
이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

입력
첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

출력
첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.

5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

30
 */
public class q1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());

        int[][] triangle = new int[size][size];
        for (int i = 0; i < size; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int[] sum = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = i; j >= 0; j--) { // 앞에 부터 더하면 더해진 값에 또 더하는 식이라 뒤에 부터 더해야 한다.
                if (j == 0) {
                    sum[0] = sum[0] + triangle[i][0];
                } else if(j == i){
                    sum[j] = sum[j - 1] + triangle[i][j];
                } else {
                    sum[j] = Math.max(sum[j - 1], sum[j]) + triangle[i][j];
                }
            }
        }

        Arrays.sort(sum);
        System.out.println(sum[size - 1]);
    }
}
