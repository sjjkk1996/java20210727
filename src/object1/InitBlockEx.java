package object1;

public class InitBlockEx {
    public static void main(String[] args) {
        System.out.println(Bicycle.wheel);
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.gear);
    }
}
class Bicycle {
    static {
        System.out.println("static Constructor");
    }
    {
        System.out.println("instance Constructor");
    }
    String model;
    int gear;
    static int wheel;

    public Bicycle() {
        System.out.println("생성자");
    }
}