package boj.stack;

//입력
//하나 또는 여러줄에 걸쳐서 문자열이 주어진다. 각 문자열은 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")등으로 이루어져 있으며,
//길이는 100글자보다 작거나 같다. 각 줄은 마침표(".")로 끝난다.
//
//입력의 종료조건으로 맨 마지막에 점 하나(".")가 들어온다.
//출력
//각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = bufferedReader.readLine();
            if (input.equals(".")) {
                break;
            }

            char[] stack = new char[101];
            int endPointer = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) != ')' && input.charAt(j) != ']' && input.charAt(j) != '(' && input.charAt(j) != '[') {
                    continue;
                }

                if (endPointer == 0) {
                    if (input.charAt(j) == ')' || input.charAt(j) == ']') {
                        endPointer++;
                        break;
                    } else {
                        stack[endPointer++] = input.charAt(j);
                    }
                } else {
                    if (input.charAt(j) == '(' || input.charAt(j) == '[') {
                        stack[endPointer++] = input.charAt(j);
                    } else if (input.charAt(j) == ')') {
                        if (stack[endPointer - 1] == '(') {
                            endPointer--;
                        } else {
                            break;
                        }
                    } else if (input.charAt(j) == ']') {
                        if (stack[endPointer - 1] == '[') {
                            endPointer--;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (endPointer == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

