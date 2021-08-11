package main.variable;

public class PrintfEx {
    public static void main(String[] args) {
        int i = 100;
        float f = 3.141592f;
        char c = 'A';
        String str = "Hello~!";

        System.out.printf("총점은 %d입니다. \n", i); //\n 다음코드 한줄 내리기
        //%d, decimal-십진수
        System.out.printf("원주율은 %10.7f입니다. %n", f); //%n 다음코드 한줄 내리기
        //%f, float-실수
        System.out.printf("영어 대문자의 시작은 %c입니다. \n", c);
        //%c, char
        System.out.printf("\"안녕 세상아\" = \"%s\"", str);
        //%s, String
        System.out.printf("\"안녕 세상아\" = \"%15s\"", str);
        System.out.printf("\"안녕 세상아\" = \"%-15s\"", str);

    }
}
