package boj.onedarray;

import java.util.Scanner;

public class q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String[] quiz = new String[a];
        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = scanner.next();
        }

        for (int i = 0; i < quiz.length; i++) {
            int count = 0;
            int total = 0;
            for (int j = 0; j < quiz[i].length(); j++) {
                if (quiz[i].charAt(j) == 'O') {
                    // O면 점수 올리고 더하기
                    count++;
                    total += count;
                } else {
                    // X면 점수 초기화
                    count = 0;
                }
            }
            System.out.println(total);
        }


    }
}
