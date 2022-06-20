package basicMath;

import java.util.Scanner;

public class q2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        int[][] apartment = new int[15][15];
        for (int i = 0; i < 15; i++) {
            apartment[0][i] = i + 1;
            apartment[i][0] = 1;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
            }
        }

        for (int i = 0; i < testcase; i++) {
            int floor = scanner.nextInt();
            int roomNum = scanner.nextInt();
            System.out.println(apartment[floor][roomNum - 1]);
        }
    }
}
