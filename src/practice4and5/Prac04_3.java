package practice4and5;

public class Prac04_3 {
    public static void main(String[] args) {
        int total = 0;
        int totalSum =0;
        for (int i = 1; i <= 10; i++) {
            total += i;
            totalSum += total;
        }
        System.out.print("결과는? " + totalSum);
    }
}
//    int total=0;
//        for (int i = 1; i <= 10; i++) {
//                int tmp = (1+i)*i/2;
//                total += tmp;
//                }
//                System.out.println(total);