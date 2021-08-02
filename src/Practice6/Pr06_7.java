package Practice6;

public class Pr06_7 {
    public static void main(String[] args) {
        Marine marine = new Marine();
        System.out.println(marine.weapon);
        Marine marine2 = new Marine();
        System.out.println(marine2.weapon);

        marine.weaponUp();
        System.out.println(marine.weapon);
        System.out.println(marine2.weapon);
    }
}
class Marine{
    int x = 0, y = 0 ;
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x , int y) {
        this.x = x;
        this.y = y;
    }
}