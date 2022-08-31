package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int pointX = Integer.parseInt(stringTokenizer.nextToken());
        int pointY = Integer.parseInt(stringTokenizer.nextToken());
        int recX = Integer.parseInt(stringTokenizer.nextToken());
        int recY = Integer.parseInt(stringTokenizer.nextToken());

        int min = pointX;
        if (recX - pointX < min) {
            min = recX - pointX;
        }
        if (pointY < min) {
            min = pointY;
        }
        if (recY - pointY < min) {
            min = recY - pointY;
        }

        System.out.println(min);
    }
}
