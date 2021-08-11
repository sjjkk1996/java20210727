package main.object2;

public class InterfaceEx2 {
    public static void main(String[] args) {
    Child3 c = new Child3(); //인스턴스 생성
    c.method1(); //메서드1 호출
    c.method2(); //메서드2 호출
    MyInterface.staticMethod();
    MyInterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements  MyInterface, MyInterface2{
    public  void method1(){
        System.out.println("method1() in Child3");
    }
}
class Parent3 {
    public void method2(){
        System.out.println("method2() in Parent3");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}
interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
