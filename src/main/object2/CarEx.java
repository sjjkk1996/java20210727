package main.object2;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);//주소값나옴
        FireCar fireCar = new FireCar();
        fireCar.drive();
        fireCar.stop();
        SportsCar sportsCar = new SportsCar();
        System.out.println(fireCar instanceof Car?"상속됨":"상속아님");
        System.out.println(sportsCar instanceof Car?"상속됨":"상속아님");
        System.out.println(new Car() instanceof Car?"상속됨":"상속아님");
        System.out.println(fireCar instanceof Object?"상속됨":"상속아님");
        System.out.println(sportsCar instanceof Object?"상속됨":"상속아님");
        System.out.println(car instanceof Object?"상속됨":"상속아님");
        car = fireCar;
//        fireCar = (FireCar) sportsCarl; //수직관계 형성안됨
        // 수평관계라 관련없음
        fireCar = (FireCar) car; // 자 -> 부 -> 자 된 케이스
    }
}
class Engine{}
class Car extends Object { //모든 class 는 Object에 상속되어 있지만 일반적으로 생략된다 class Car 라고 표기하지만 생략되어있다
    int wheel;
    void drive() {}
    void stop() {}
    Engine engine;
    //super. 조상의 멤버변수 참조 ,super() 조상의 생성자 호출 메서드
    @Override//어노테이션(주석처럼 사용되는 의미가 있는단어)
    public String toString() {
        return getClass().getName();
    }
}

class FireCar extends Car {
    void waterGun() {}
}

class SportsCar extends Car {
    int turbo;
}