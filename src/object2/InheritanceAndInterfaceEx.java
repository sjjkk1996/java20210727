package object2;

public class InheritanceAndInterfaceEx {
    public static void main(String[] args) {

    }
}
//ctrl + o 오버라이딩가능
class SiegeTank extends Terran{

}
class BattleCruiser extends Terran implements Flyable{
    @Override
    public void fly() {

    }
}
//interface는 i+a or a+able로 이름을 짓는다
interface Flyable{
    static int ENGINE = 4; //원래 풀네임은 public final static int ENGINE = 4;
    void fly();//<-추상메서드(완성되지않은 메서드) 원래 풀네임은 public abstract void fly();
}
interface Groudable{

}