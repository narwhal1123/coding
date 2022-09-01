package boj.algebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int num1 = Integer.parseInt(stringTokenizer.nextToken());
        int num2 = Integer.parseInt(stringTokenizer.nextToken());

        int temp = 0;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int temp1 = num1;
        int temp2 = num2;
        int gcd = 0;
        while (temp2 != 0) {
            gcd = temp1 % temp2;
            temp1 = temp2;
            temp2 = gcd;
        }

        System.out.println(temp1);
        System.out.println(num1 * num2 / temp1);
    }
}
