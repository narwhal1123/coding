package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int startX = Integer.parseInt(stringTokenizer.nextToken());
            int startY = Integer.parseInt(stringTokenizer.nextToken());
            int endX = Integer.parseInt(stringTokenizer.nextToken());
            int endY = Integer.parseInt(stringTokenizer.nextToken());

            int planetNum = Integer.parseInt(bufferedReader.readLine());
            int[] planet = new int[3];
            // 시작점, 도착점이 같은 원 안에 없는 경우만 경계를 지남
            int count = 0;
            for (int j = 0; j < planetNum; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                planet[0] = Integer.parseInt(stringTokenizer.nextToken());
                planet[1] = Integer.parseInt(stringTokenizer.nextToken());
                planet[2] = Integer.parseInt(stringTokenizer.nextToken());
                int startPDistance = (planet[0] - startX) * (planet[0] - startX) + (planet[1] - startY) * (planet[1] - startY);
                int endPDistance = (planet[0] - endX) * (planet[0] - endX) + (planet[1] - endY) * (planet[1] - endY);
                if (startPDistance < planet[2] * planet[2] && endPDistance > planet[2] * planet[2]) {
                    count++;
                } else if (startPDistance > planet[2] * planet[2] && endPDistance < planet[2] * planet[2]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
