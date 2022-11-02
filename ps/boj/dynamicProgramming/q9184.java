package boj.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
재귀 호출만 생각하면 신이 난다! 아닌가요?

다음과 같은 재귀함수 w(a, b, c)가 있다.

if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
    1

if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)

if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)

otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
위의 함수를 구현하는 것은 매우 쉽다. 하지만, 그대로 구현하면 값을 구하는데 매우 오랜 시간이 걸린다. (예를 들면, a=15, b=15, c=15)

a, b, c가 주어졌을 때, w(a, b, c)를 출력하는 프로그램을 작성하시오.

입력
입력은 세 정수 a, b, c로 이루어져 있으며, 한 줄에 하나씩 주어진다. 입력의 마지막은 -1 -1 -1로 나타내며, 세 정수가 모두 -1인 경우는 입력의 마지막을 제외하면 없다.

출력
입력으로 주어진 각각의 a, b, c에 대해서, w(a, b, c)를 출력한다.

제한
-50 ≤ a, b, c ≤ 50

1 1 1
2 2 2
10 4 6
50 50 50
-1 7 18
-1 -1 -1

w(1, 1, 1) = 2
w(2, 2, 2) = 4
w(10, 4, 6) = 523
w(50, 50, 50) = 1048576
w(-1, 7, 18) = 1
 */
public class q9184 {
    public static void main(String[] args) throws IOException {

        int[][][] memo = new int[21][21][21];
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                for (int k = 0; k <= 20; k++) {
                    if (i <= 0 || j <= 0 || k <= 0) {
                        memo[i][j][k] = 1;
                    } else if (i < j && j < k) {
                        memo[i][j][k] = memo[i][j][k - 1] + memo[i][j - 1][k - 1] - memo[i][j - 1][k];
                    }  else {
                        memo[i][j][k] = memo[i - 1][j][k] + memo[i - 1][j - 1][k] + memo[i - 1][j][k - 1] - memo[i - 1][j - 1][k - 1];
                    }
                }
            }
        }


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());

            int num1 = a;
            int num2 = b;
            int num3 = c;

            if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
                num1 = 0;
                num2 = 0;
                num3 = 0;
            } else if (num1 > 20 || num2 > 20 || num3 > 20) {
                num1 = 20;
                num2 = 20;
                num3 = 20;
            }

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            int answer = memo[num1][num2][num3];

            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, answer);
        }
    }
}
