package Practice;

public class Prac04_1 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(x>10 && x <20);
        char ch = 'A';
        System.out.println(ch!=' ' || ch != '\t');
        System.out.println(!(ch ==' ' && ch == '\t'));
        System.out.println(ch >= '0' && ch <='9');
        System.out.println(ch>='a' && ch <= 'z' || ch >= 'A' && ch <='Z');
        int year = 0;
        System.out.println((year%400==0)||(year%4==0 && year%100!=0));
        boolean powerOn = false;
        System.out.println(!powerOn);
        System.out.println(powerOn==false);
        String str = "yes";
        System.out.println(str.equals(str));
        System.out.println("yes".equals(str));

    }
}
