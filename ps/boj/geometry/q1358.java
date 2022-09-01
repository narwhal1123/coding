package boj.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int width = Integer.parseInt(stringTokenizer.nextToken());
        int height = Integer.parseInt(stringTokenizer.nextToken());
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());
        int person = Integer.parseInt(stringTokenizer.nextToken());
        int count = 0;

        for (int i = 0; i < person; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int personX = Integer.parseInt(stringTokenizer.nextToken());
            int personY = Integer.parseInt(stringTokenizer.nextToken());
            if (personX < x) {
                if ((x - personX) * (x - personX) + ((y + height / 2) - personY) * ((y + height / 2) - personY) <= (height / 2) * (height / 2)) {
                    count++;
                }
            } else if (personX >= x && personX <= x + width) {
                if (personY <= y + height && personY >= y) {
                    count++;
                }
            } else {
                if (((x + width) - personX) * ((x + width) - personX) + ((y + height / 2) - personY) * ((y + height / 2) - personY) <= (height / 2) * (height / 2)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
