package main.generics;

public class EnumEx2 {
  public static void main(String[] args) {
    for (Direct d : Direct.values()) {
      System.out.printf("%s = %d,%s %n", d.name(),
              d.getValue(), d.getSymbol());
    }
  }
}
enum Direct{
  EAST(1,"a"), SOUTH(2,"b"), WEST(3,"c"), NORTH(4,"d");

  private final int value; private final String symbol;

  Direct(int value, String symbol) {
    this.value = value; this.symbol = symbol;
  }

  public int getValue() {return value;}
  public String getSymbol() {return symbol;}
}