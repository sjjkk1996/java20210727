package object1;

public class MethodEx {
    public static void main(String[] args) {
    MyMath mm = new MyMath();
        System.out.println(mm.add(10,20));
    }
}

class MyMath{
    //return type void, 기본형 8가지,변수는 9가지, 참조형 총 10가지, 리턴에 붙일 수 있는 타입은 10가지
    void add() {
        System.out.println();
    }
    //오버로딩(같은 클래스 내의 같은이름의 메서드) 규칙 이: 이름이 같다, 매: 매개변수 다르다, 리: 리턴타입 상관없다.
    //개발의 용이성 개발자가 이름 하나만 알아도 다양하게 사용할 수 있다.
    boolean add(boolean arg) {return true;}
    boolean add(char arg) {return true;}
    byte add(byte arg) {return 0;}
    short add(short arg) {return 0;}
    int add(int arg) {return 0;}
    long add(long arg) {return 0l;}
    float add(float arg) {return 0.0f;}
    double add(double arg) {return 0.0;}
    int[] add(int[] arg) {return new int[]{0};}
    String add(String arg) {return "";}
    Car add(Car arg) {return new Car();}
    Car[] add(Car[] arg) {return new Car[]{new Car()};}
//    void subtract(){}
    int subtract(){return 0;}

    public long add(int i, int i1) {
        long result;
        result= (long)i +i1;
        return result;
    }
    //리턴타입 메서드명(){     }
}

class Car {}