package boj.prefixSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
승재는 인간-컴퓨터 상호작용에서 생체공학 설계를 공부하다가 키보드 자판이 실용적인지 궁금해졌다.
이를 알아보기 위해 승재는 다음과 같은 생각을 했다.

'문자열에서 특정 알파벳이 몇 번 나타나는지 알아봐서
자주 나타나는 알파벳이 중지나 검지 위치에 오는 알파벳인지 확인하면 실용적인지 확인할 수 있을 것이다.'

승재를 도와 특정 문자열 $S$, 특정 알파벳 $\alpha$와 문자열의 구간 $[l,r]$이 주어지면
$S$의 $l$번째 문자부터 $r$번째 문자 사이에 $\alpha$가 몇 번 나타나는지 구하는 프로그램을 작성하여라.
승재는 문자열의 문자는 $0$번째부터 세며, $l$번째와 $r$번째 문자를 포함해서 생각한다.
주의할 점은 승재는 호기심이 많기에 (통계적으로 크게 무의미하지만) 같은 문자열을 두고 질문을 $q$번 할 것이다.

입력
첫 줄에 문자열 $S$가 주어진다. 문자열의 길이는 $200,000$자 이하이며 알파벳 소문자로만 구성되었다.
두 번째 줄에는 질문의 수 $q$가 주어지며, 문제의 수는 $1\leq q\leq 200,000$을 만족한다.
세 번째 줄부터 $(q+2)$번째 줄에는 질문이 주어진다.
각 질문은 알파벳 소문자 $\alpha_i$와 $0\leq l_i\leq r_i<|S|$를 만족하는 정수 $l_i,r_i$가 공백으로 구분되어 주어진다.

출력
각 질문마다 줄을 구분해 순서대로 답변한다.
$i$번째 줄에 $S$의 $l_i$번째 문자부터 $r_i$번째 문자 사이에 $\alpha_i$가 나타나는 횟수를 출력한다.

서브태스크 1 (50점)
문자열의 길이는 $2,000$자 이하, 질문의 수는 $2,000$개 이하이다.

서브태스크 2 (50점)
추가 제한 조건이 없다.

seungjaehwang
4
a 0 5
a 0 6
a 6 10
a 7 10

0
1
2
1
 */
public class q16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int num = Integer.parseInt(bufferedReader.readLine());

        char[] inputArr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputArr[i] = input.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            char alpha = stringTokenizer.nextToken().charAt(0);
            int[] prefixSum = new int[inputArr.length + 1];
            for (int j = 1; j <= input.length(); j++) {
                prefixSum[j] = prefixSum[j - 1];
                if (inputArr[j - 1] == alpha) {
                    prefixSum[j]++;
                }
            }

            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            stringBuilder.append(-prefixSum[start] + prefixSum[end + 1]).append('\n');
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            alpha = stringTokenizer.nextToken().charAt(0);
//            start = Integer.parseInt(stringTokenizer.nextToken());
//            end = Integer.parseInt(stringTokenizer.nextToken());
//            stringBuilder.append(-prefixSum[start] + prefixSum[end + 1]).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
