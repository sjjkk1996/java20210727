package Practice;

public class Prac_04_5 {
    public static void main(String[] args) {
        int i = 0, j = 0;

        while (i <= 10) {
            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
