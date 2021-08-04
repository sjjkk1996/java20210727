package practice7;

public class Pr07_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
class Product {
    private int price; // 제품의 가격
    private int bonusPoint; // 제품구매 시 제공하는 보너스점수
    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}
class Tv extends Product {
    Tv() {}
    public String toString() {
        return "Tv";
    }
}