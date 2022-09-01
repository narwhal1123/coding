package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] triangle = new int[3];
        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            triangle[0] = Integer.parseInt(stringTokenizer.nextToken());
            triangle[1] = Integer.parseInt(stringTokenizer.nextToken());
            triangle[2] = Integer.parseInt(stringTokenizer.nextToken());
            if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) {
                break;
            }
            Arrays.sort(triangle);
            if (triangle[0] * triangle[0] + triangle[1] * triangle[1] == triangle[2] * triangle[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
