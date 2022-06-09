package strings;

import java.util.Arrays;
import java.util.Scanner;

public class q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < word.length(); i++) {
            int temp = word.charAt(i) - 'a';
            if (alphabet[temp] == -1) {
                alphabet[temp] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("%d ", alphabet[i]);
        }
    }
}
