package object1;

import object2.ProtectedClass;

public class ProtectedClassEx {
  public static void main(String[] args) {
    ExtendedProtectedClass protectedClass = new ExtendedProtectedClass();

  }
}

class ExtendedProtectedClass extends ProtectedClass {
  void out() {
    System.out.println(name);
    print();
  }
}