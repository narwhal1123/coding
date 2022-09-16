package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
입력
첫 줄에 테스트케이스의 수가 주어진다. 각 테스트케이스는 두 줄로 이루어져 있다.
테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과,
몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다.
이때 맨 왼쪽은 0번째라고 하자. 두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다.
중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.

출력
각 테스트 케이스에 대해 문서가 몇 번째로 인쇄되는지 출력한다.

3
1 0
5
4 2
1 2 3 4
6 0
1 1 9 1 1 1
*/

public class q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int documents = Integer.parseInt(stringTokenizer.nextToken()); // 문서의 수
            int printDoc = Integer.parseInt(stringTokenizer.nextToken()); // 프린트 하고 싶은 문서의 순서

            Queue<Integer> selectDoc = new LinkedList<>();
            for (int k = 0; k < documents; k++) {
                if (k == printDoc) {
                    selectDoc.offer(1); // 뽑고싶은 문서 표시
                } else {
                    selectDoc.offer(0);
                }
            }

            Queue<Integer> docQueue = new LinkedList<>();
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            Integer[] priority = new Integer[documents]; // 우선순위
            for (int j = 0; j < documents; j++) {
                priority[j] = Integer.parseInt(stringTokenizer.nextToken());
                docQueue.offer(priority[j]);
            }

            Arrays.sort(priority, Collections.reverseOrder()); // 우선순위 정렬
            int count = 0; // 프린트 횟수
            int index = 0; // 출력해야되는 우선순위 인덱스

            while (true) {
                if (priority[index] == docQueue.peek()) { // 우선순위가 같을때
                    if (selectDoc.peek() == 0) { // 뽑고싶은 문서가 아니면
                        docQueue.poll();// 프린트 찍어서 나감
                        selectDoc.poll();
                        count++;
                        index++; // 다음 우선순위로
                    } else {
                        System.out.println(++count); // 우선순위가 같고 뽑고싶은 문서면 출력후 break
                        break;
                    }
                } else {
                    docQueue.offer(docQueue.poll()); // 우선순위가 같지 않을때면 뒤로 밀어야 됨
                    selectDoc.offer(selectDoc.poll());
                }
            }
        }
    }
}
