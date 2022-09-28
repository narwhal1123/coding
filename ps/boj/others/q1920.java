package boj.others;
/*
문제
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다.
다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

5
4 1 5 2 3
5
1 3 7 9 5

1
1
0
0
1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(bufferedReader.readLine());
        int[] numArr = new int[arrSize];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < arrSize; i++) {
            numArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int inputSize = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] inputArr = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            inputArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < inputSize; i++) {
            int count = 0;
            for (int j = 0; j < arrSize; j++) {
                if (numArr[j] == inputArr[i]) {
                    count++;
                    break;
                }
            }
            if (count != 0) {
                stringBuilder.append("1\n");
            } else {
                stringBuilder.append("0\n");
            }
        }

        System.out.println(stringBuilder);
    }
}
