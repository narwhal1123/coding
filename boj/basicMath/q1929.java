package basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int first = Integer.parseInt(stringTokenizer.nextToken());
        int last = Integer.parseInt(stringTokenizer.nextToken());

        while (first <= last) {
            if (first == 1) {
                first++;
                continue;
            } else if (first == 2) {
                System.out.println(first);
                first++;
                continue;
            }

            int isPrime = 0;
            for (int i = 2; i * i < first; i++) {
                if (first % i == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0) {
                System.out.println(first);
            }
            first++;
        }
    }
}
