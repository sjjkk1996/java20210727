package object2;

public class InheritanceAndInterfaceEx2 {
  public static void main(String[] args) {
    Mammalia[] mammalias = new Mammalia[2];
    Bird[] birds = new Bird[2];
    mammalias[0] = (Mammalia) new Tiger();//명시적 형변환
    mammalias[1] = new Bat();//형변환 생략가능 묵시적형변환
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

class Tiger extends Mammalia implements Iground{
  @Override
  public void run() {
    System.out.println("으르렁으르렁");
  }
}
class Bat extends Mammalia implements Ifly{
  @Override
  public void fly() {
    System.out.println("쉬쉭");
  }
}

class Eagle extends Bird implements Ifly{
  @Override
  public void fly() {
    System.out.println("위익");
  }
}
class Ostrich extends Bird  implements Iground{
  @Override
  public void run() {
    System.out.println("타조");
  }
}

interface Ifly {
  public abstract void fly();
}

interface Iground{
  void run();
}