package main.object1;

public class PrimitiveTypeArgs {
    public static void main(String[] args) {
        Data d = new Data(); //d는 주소값을 가짐
        System.out.println(d.x); //0
        d.x= 10;
        System.out.println(d.x); //10
        //1번 메서드 호출
        change(d.x); //값을 넘겨줌
        System.out.println(d.x); //10
        //2번 메서드 호출
        change(d); //주소값을 넘겨줌
        System.out.println(d.x); //1000
        //3번 메서드 호출
        Data d2 = copy(d);
        System.out.println("d2.x:" +d2.x);
        System.out.println(d2);
    }

    //1번
    static void change(int x) {
        x = 1000;
        System.out.printf("change() : %d %n", x);
    }
    //2번
    static void change(Data d) {
        d.x = 1000;
        System.out.printf("change() : %d %n", d.x);
    }
    //3번
    static Data copy(Data d) {
        Data tmp = new Data(); tmp.x = d.x;
        System.out.println("d의 주소값:"+d);
        System.out.println("tmp의 주소값:"+tmp);
        return tmp;
    }
}
class Data{
    int x;
}