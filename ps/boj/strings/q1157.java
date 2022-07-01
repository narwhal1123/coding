package boj.strings;

import java.util.Scanner;

public class q1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] alpha = new int[26];

        // 소문자로 변환
        word = word.toLowerCase();

        // 사용된 알파벳의 숫자 올리기, 알파벳 최대 사용횟수 구하기
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int temp = ++alpha[word.charAt(i) - 'a'];

            if (max < temp) {
                max = temp;
            }
        }

        // 최대 사용된 알파벳 찾기
        int count = 0;
        int alphaNum = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == max) {
                count++;
                alphaNum = i;
            }
        }

        if (count == 1) {
            System.out.println((char)(alphaNum + 'A'));
        } else {
            System.out.println("?");
        }
    }
}
