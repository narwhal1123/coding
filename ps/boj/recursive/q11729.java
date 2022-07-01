package boj.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11729 {

    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());

        System.out.println((int) Math.pow(2, input) - 1); // 이동횟수
        hanoi(input, 1, 3);
        System.out.println(stringBuilder);
    }

    // 순서 출력을 엄청 고민했는데 결국 혼자서는 해결 못하고 검색해서 확인함
    // 막대 번호를 숫자로 주고 합계로 구하는게 엄청 뛰어난 발상인거 같다.
    // 하노이의 탑은 제일 큰거 하나를 원하는곳에 옮기고 위에거를 처음부터 다시옮기기를 반복하는 재귀적인 문제임
    // 그래서 재귀로 나타내면 원래 주어진 판의 갯수보다 하나 적게 가운데에 옮기고
    // 가장 큰 마지막 판을 원하는 곳에 옮기고
    // 나머지를 다시 가운데에서 원하는 곳으로 옮기는 것을 반복하는 것임
    // System.out.printf("%d %d\n", from, to); 사용시 시간초과
    public static void hanoi(int plates, int from, int to) {
        if (plates == 0) {
            return;
        }

        int remain = 6 - from - to;
        hanoi(plates - 1, from, remain); // 원래 주어진 판의 갯수보다 하나 적게 가운데에 옮기고
        stringBuilder.append(from + " " + to + "\n"); // 가장 큰 마지막 판을 원하는 곳에 옮기고
        hanoi(plates - 1, remain, to); // 나머지를 다시 가운데에서 원하는 곳으로 옮기는 것
    }
}
