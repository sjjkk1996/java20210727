package variable;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class SilsuEx {
    public static void main(String[] args) {
        // float 기본형 0.0f, double 기본형 0.0
        float f1 = 0.1f; //4byte 0.1뒤의 f는 생략 불가능
        double d1 = 0.1; //8byte d,D는 생략가능
        long l1 = 100_000_000_000l;
        f1 = l1; //표현범위가 float가 더 크기 때문에 묵시적 형변환
        l1 = (long) f1; //표현범위가 long 이 작기 때문에 명시적 형변환
        System.out.println(f1);
        System.out.println(d1);
        final float PI = 3.141492f; //상수의 이름은 대문자로 써주는게 좋다
        System.out.println(PI);
    }
}
