package strings;

import java.util.Scanner;

public class q1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] alpha = new int[26];

        word = word.toLowerCase();
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int temp = alpha[word.charAt(i) - 'a']++;
            if (max < temp) {
                max = temp;
            }
        }

        int count = 0;
        int alphaNum = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == max) {
                count++;
                alphaNum = i;
            }
        }

        if (count == 1) {
            System.out.println(alphaNum);
        } else {
            System.out.println("?");
        }
    }
}
