package Practice;

public class Prac_04_3 {
    public static void main(String[] args) {
        int total=0;
        for (int i = 1; i <= 10; i++) {
            int tmp = (1+i)*i/2;
            total += tmp;
        }
        System.out.println(total);
    }
}
