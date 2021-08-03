package object2;

public class InheritanceAndInterfaceEx2 {
    //자식>=부모
    //참조형 변수에도 형변환 일어난다 자식 -> 부모로 가는건 ㄴ상관
    //부모 -> 자식로 가는건 자식의 큰부분을 형변환이 불가능
    //자식 -> 부모 ->자식 이렇게는 형변환 가능
    public static void main(String[] args) {
        Mammalia[] mammalias = new Mammalia[2];
        Bird[] birds = new Bird[2];
        mammalias[0] = (Mammalia) new Tiger();
        //원래는 앞에 (Mammalia)형변환 해줘야하지만 자식의 범위가
        // 커서 묵시적으로 형변환이 가능하여 (Mammalia) 생략가능
        mammalias[1] = new Bat();
        //자식에서 부모로 묵시적 형변환이 일어난 케이스
        birds[0] = new Eagle();
        birds[1] = new Ostrich();
        Iground[] igrounds = new Iground[2];
        Ifly[] iflies = new Ifly[2];
        igrounds[0] = new Tiger();
        igrounds[1] = new Ostrich();
        for (int i = 0; i < iflies.length; i++) {
            igrounds[i].run();

        }
    }
}

class Mammalia { }
class Bird { }

class Tiger extends  Mammalia implements Iground{
    @Override
    public void run() {
        System.out.println("으르렁으르렁");
    }
}

class Bat extends  Mammalia implements Ifly {
    @Override
    public void fly() {
        System.out.println("쉬쉭");
    }
}

class Eagle extends Bird implements Ifly {
    @Override
    public void fly() {
        System.out.println("위익");
    }
}
class Ostrich extends Bird implements Iground {
    @Override
    public void run() {
        System.out.println("타조");
    }
}

interface  Ifly {
    public  abstract  void fly();
}

interface Iground{
    void run();
}