package Practice4and5;

import javax.swing.*;

public class Prac04_7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "합하고자 하는 숫자를 입력하시오");
        int sum = 0;
        for (int i =0; i < input.length(); i++){
            sum += input.charAt(i)-48;
        }
        System.out.println("total: " + sum);
    }
}
//    String str = "12345";
//    int sum = 0;
//        for(int i=0; i < str.length(); i++) {
//        sum +=  str.charAt(i);
//        }
//        System.out.println("sum="+sum);