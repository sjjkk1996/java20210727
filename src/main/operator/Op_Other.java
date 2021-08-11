package main.operator;

public class Op_Other {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x >> 2); //100(2)이진수 4인 x를 >>2 2칸오른쪽으로 shift(밀어내기)를하여 001(2)이진수 1로 바꿈
        System.out.println(x << 1);
        System.out.println(x^2); //0100 (이진수)4 와
                                 //0010 (이진수)2 를
                                 //0110 (이진수)6 이렇게 합하여 나타난 이진수의 값을 반환함
        System.out.println(x&2); //&은 ^ 와반대 같은거 끼리만 나오게함 그래서 0000이 돼서 0이 값으로 나옴
        System.out.println(~x); //0100의 not
        System.out.println(x|2); //or 0100 4
                                 //   0010 2
                                 //   0110 6
        System.out.println(x *= 10 + 5); //x = x*(10+5)

    }
}
