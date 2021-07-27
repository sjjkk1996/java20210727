package variable;

public class JungsuEx {
    //여기서 변수선언
    byte b1; //바이트는 기본값 0
    short s1; //쇼트도 0
    int i1; //인트도 0
    long l1; //롱도 0

    public JungsuEx() { }

    public static void main(String[] args) {
        //여기 밑에 new는 생성연산자 생성연산자가 초기화 시킴 
        //()가 붙으면 메서드 입니다. 그런데 여기서 처럼 클래스 이름에()가 붙으면 생성자입니다.
        JungsuEx j = new JungsuEx();
        byte b2=(byte) 130;
        System.out.println(j.b1);
        System.out.println(j.s1);
        System.out.println(j.i1);
        System.out.println(j.l1);
        System.out.println(b2);
        System.out.println(j.b1 + b2);
        System.out.println(j.s1 + b2);
        j.i1 = 130 + j.s1;// s1은 쇼트이지만 int에 맞춰 형변환이 됨
        j.s1 = (short)j.i1;// 큰int에서 short인 s1이랑 연산을하려면 short로 형변환을 걸어줘야함
                           // 위에줄을 다르게 표현하면 큰데서 작은데(명시적 형변환)
        j.i1 = j.s1; //작은데서 큰데로(묵시적 형변환 => 생략가능)
        System.out.println(j.i1);
        j.l1 = 10_000_000_000l;//l을 붙여서 long 타입인임을 확인시켜줘야함
        System.out.println(j.l1);
    }
}
