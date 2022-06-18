package basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int testcase = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < testcase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int floors = Integer.parseInt(stringTokenizer.nextToken());
            int rooms = Integer.parseInt(stringTokenizer.nextToken());
            int clients = Integer.parseInt(stringTokenizer.nextToken());

            int roomNum = (clients % floors) * 100 + clients / floors + 1;
            if (clients % floors == 0) {
                roomNum = 100 * floors + clients / floors;
            }
            System.out.println(roomNum);
        }
    }
}
