package strings;

import java.util.Scanner;

public class q2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int count = input.length();
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '=') {
                if (input.charAt(i - 1) == 'c' || input.charAt(i - 1) == 's' || input.charAt(i - 1) == 'z') {
                    if (i >= 2 && input.charAt(i - 1) == 'z' && input.charAt(i - 2) == 'd') {
                        count--;
                    }
                    count--;
                }
            } else if (input.charAt(i) == '-') {
                if (input.charAt(i - 1) == 'c' || input.charAt(i - 1) == 'd') {
                    count--;
                }
            } else if (input.charAt(i) == 'j') {
                if (input.charAt(i - 1) == 'l' || input.charAt(i - 1) == 'n') {
                    count--;
                }
            }
        }
        System.out.println(count);
        // 다른 사람들 풀이 보니까 배열에 값 넣어놓고 같은 값이 검색되면 replace() 사용한 다음에 길이 구하는 방법도 있었다.
    }
}
