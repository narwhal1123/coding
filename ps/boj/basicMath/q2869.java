package boj.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

//        이렇게 쓰는게 더 명확했을듯
//        int up = Integer.parseInt(st.nextToken());
//        int down = Integer.parseInt(st.nextToken());
//        int length = Integer.parseInt(st.nextToken());

        int day = 0;
        // input[0] : up, input[1] : down, input[2] : height
        if ((input[2] - input[1]) % (input[0] - input[1]) == 0) {
            day = (input[2] - input[1]) / (input[0] - input[1]);
        } else {
            day = (input[2] - input[1]) / (input[0] - input[1]) + 1;
        }
        System.out.println(day);
    }
}
