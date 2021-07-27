package variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand = (int)(Math.random()*100)+1;
        System.out.println("숫자를 맞추어 보세요(1~100)");
        while (true) {
            int answer;
            try {
//              int answer = scan.nextInt();
                 answer = Integer.parseInt(scan.nextLine());//Integer.parseInt 문자열을 인트로 바꿈
            } catch (Exception e){
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
            if(answer > rand) {
                System.out.println("더 작은수 입니다.");
            }else if(answer < rand) {
                System.out.println("더 큰수 입니다.");
            }else{
                System.out.println("정답입니다");
                break;
                }
            }
       }
    }


