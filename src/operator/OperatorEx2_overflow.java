package operator;

public class OperatorEx2_overflow {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;
        long l = 2000000L;
        long c = a * (long)b;
        long d = a * l;
        System.out.println(c);//형변환 결과값
        System.out.println(d);//L을 붙여준 결과값
        //위 뒤 코드 처럼 안해주면 -1454759936이라는 원치 않는 결과값이 나옴
    }
}
