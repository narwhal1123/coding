package strings;

import java.util.Scanner;

public class q1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < testcase; i++) {
            int[] alpha = new int[26];
            String input = scanner.next();

            for (int j = 0; j < input.length(); j++) {
                // 어떤 알파벳이 나온적이 없으면 연속된 동일한 알파벳 끝까지 인덱스 옮기고 나왔다고 체크
                if (alpha[input.charAt(j) - 'a'] == 0) {
                    alpha[input.charAt(j) - 'a']++;
                    while (j < input.length() - 1 && (input.charAt(j) - 'a') == (input.charAt(j + 1) - 'a')) {
                        j++;
                    }
                } else {
                    break;
                }
                if (j == input.length() - 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
