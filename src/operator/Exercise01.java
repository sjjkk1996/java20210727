package operator;

public class Exercise01 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
        b = (byte)i; // 큰 -> 작 생략 불가
        ch = (char)b; // -128~127 -> 0~65535
        short s = (short)ch; //char 0~65535  -> -32768~32767
        float f = (float)l; //생략가능하다 long보다 float의 표현범위가 커서
        i = (int)ch; //
    }
}
