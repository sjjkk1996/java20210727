package operator;

import java.util.Scanner;

public class Op_Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ID 입력:");
        String id = scan.nextLine();
        System.out.print("Pass 입력:");
        String pass = scan.nextLine();
        //id=root, pass=1234 라고 가정
        //id는 위에 변수를 String 으로 선언 했기때문에 String에서 안먹히는 == 연산자 대신
        // String 전용 equals 연산자로 비교한다 IgnoreCase(대소문자 상관안함)도 있다
        if(id.equalsIgnoreCase("root")){
            if (pass.equalsIgnoreCase("1234")) {
                System.out.println("로그인 되었습니다.");
            }else {
                System.out.println("비밀번호가 다릅니다.");
            }
        }else{
            System.out.println("아이디가 다릅니다.");
        }
    }
}
