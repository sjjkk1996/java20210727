package operator;
import static java.lang.Math.*;
public class Exercise03 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println((int) (floor(num / pow(10, 2)) * pow(10, 2)));
        System.out.println(num%100 > 0?num/100*100:num);
        System.out.println(num/100*100);
        System.out.println(num-(num%100));
    }
}
