package main.operator;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Op_Hwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        String input = scanner.next();
        if (isNumber(input)) {
            System.out.println("숫자입니다.");
        } else {
            System.out.println("숫자가아닙니다.");
        }
    }
}