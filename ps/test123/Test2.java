package test123;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("M A E D".indexOf("M"));

        String abc = "ICN SEL PUS GMP KIH CJU KWJ".indexOf("GMP") > -1 ? "GMP" : "ICN";
        System.out.println(abc);
//        System.out.println( "ICN SEL PUS GMP KIH CJU KWJ".indexOf("GMP"));
        int temp = 12;

        System.out.printf("%s\n", String.format("%02d", temp));

        String input = "jyh@kcnet.co.kr|don@kcnet.co.kr";
        String[] inputArr = input.split("[|]");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);
        }

    }
}
