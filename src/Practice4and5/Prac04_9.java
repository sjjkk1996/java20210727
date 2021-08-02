package Practice4and5;

import javax.swing.*;

public class Prac04_9 {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog(
                "합하고자 하는 숫자를 입력하시오"));
        int sum = 0;
        while (input > 0){
            sum += input%10;
            input /= 10;

        }
        System.out.println(input);
        System.out.println("total: " + sum);
    }

}
//        int num = 12345;
//        int sum = 0;
//        while (num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println("sum=" + sum);
