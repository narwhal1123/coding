package boj.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int[] queue = new int[num];
        for (int i = 0; i < num; i++) {
            queue[i] = i + 1;
        }
        int startPointer = 0;
        int endPointer = num - 1;

        while (startPointer != endPointer) {
            startPointer = (startPointer + 1) % num; // 한 개 삭제
            queue[(endPointer + 1) % num] = queue[startPointer]; // 다음 값을 맨 뒤에 넣고
            startPointer = (startPointer + 1) % num;            // start 하나 올리기
            endPointer = (endPointer + 1) % num; // 마지막 포인터 마지막 값으로 옮기기
        }

        System.out.println(queue[endPointer]);
    }
}
