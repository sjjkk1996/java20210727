package main.loop;

public class GugudanEx {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d" + "단 %n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d %n", i, j, i * j);
            }
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %2d  ", j, i, i * j);
            }
            System.out.println();
        }

        for (int i = 2; i < 10; i += 3) {
            for (int j = 1; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i + k != 10) {
                        System.out.printf("%d * %d = %2d  ", i + k, j, (i + k) * j);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
