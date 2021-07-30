package Practice;

import java.util.Scanner;

public class Prac04_10 {
    public static void main(String[] args) {
        int answer = (int) (Math.random()*100+1);
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("1~100 사이의 숫자를 입력해주세요: ");
            input = scanner.nextInt();
            if(input == answer){
                System.out.println("정답입니다!");
                break;
            }else if (input > answer){
                System.out.println("더 작은수를 입력하세요");
            }else{
                System.out.println("더 큰수를 입력하세요");
            }
        }
    }
}
