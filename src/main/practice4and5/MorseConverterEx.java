package main.practice4and5;

import java.util.Scanner;

public class MorseConverterEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
            String[] morse =
                    {".-", "-...", "-.-.","-..", "."
                     ,"..-.", "--.", "....","..",".---"
                     , "-.-", ".-..", "--", "-.", "---"
                     , ".--.", "--.-",".-.","...","-"
                     , "..-", "...-", ".--", "-..-","-.--"
                     , "--.." };
        do {
            System.out.println("\"Q\" 를 입력하면 종료됩니다.");
            System.out.print("입력: ");
            input = scan.nextLine().toUpperCase();
            String tmp = "";
            for (int i = 0; i < input.length(); i++) {
                tmp += morse[input.charAt(i)-'A']; // 'A'대신 65를 기입해도 됨 A가 65이기도 함
            }
            System.out.println(tmp);
        }while (!input.contentEquals("Q"));
    }
}
