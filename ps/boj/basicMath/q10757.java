package boj.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class q10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        BigInteger b1 = new BigInteger(stringTokenizer.nextToken());
        BigInteger b2 = new BigInteger(stringTokenizer.nextToken());

        System.out.println(b1.add(b2));
    }
}
