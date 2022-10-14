package test123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class outputTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        System.out.println(existKoreanWithString(input));
    }

    protected static boolean existKoreanWithString(String value) {

        boolean vCheck = false;

        if(value == null || value.length() <= 0 ) return vCheck;

        byte [] vBytes = value.getBytes();

        for (int i = 0; i < vBytes.length; i++) {
            System.out.println(vBytes[i]);
            if(vBytes[i] < 0) {
                vCheck = true;
                break;
            }
        }

        return vCheck;
    }
}
