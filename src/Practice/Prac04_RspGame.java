package Practice;

import java.util.Scanner;

public class Prac04_RspGame {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 3) + 1;
        int input = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("가위(1) 바위(2) 보(3) 중에 골라주세여");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("가위를 골랐습니다");
                if(answer == 1){
                    System.out.println("컴퓨터는 가위를 냈습니다, 비겼습니다.");
                }else if(answer == 2){
                    System.out.println("컴퓨터는 바위를 냈습니다, 컴퓨터가 이겼습니다.");
                }else{
                    System.out.println("컴퓨터는 보를 냈습니다, 사용자가 이겼습니다.");
                }
            }else if(input == 2){
                System.out.println("바위를 골랐습니다");
                if(answer == 1){
                    System.out.println("컴퓨터는 가위를 냈습니다, 사용자가 이겼습니다.");
                }else if(answer == 2){
                    System.out.println("컴퓨터는 바위를 냈습니다, 비겼습니다.");
                }else{
                    System.out.println("컴퓨터는 보를 냈습니다, 컴퓨터가 이겼습니다.");
                }
            }else{
                System.out.println("보를 골랐습니다");
                if(answer == 1){
                    System.out.println("컴퓨터는 가위를 냈습니다, 컴퓨터가 이겼습니다.");
                }else if(answer == 2){
                    System.out.println("컴퓨터는 바위를 냈습니다, 사용자가 이겼습니다.");
                }else{
                    System.out.println("컴퓨터는 보를 냈습니다, 비겼습니다.");
                }
            }
            //혼자 완성시켜보기
        }
    }
}

