package practice7;
class Outers { // 외부 클래스
  static class Inner { // (static ) 내부 클래스 클래스
    int iv=200;
  }
}
class Ex07 {
  public static void main(String[] args) {
    Outers.Inner ii = new Outers.Inner();
    System.out.println(ii.iv);
  }
}
