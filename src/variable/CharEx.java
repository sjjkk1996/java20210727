package variable;

public class CharEx {
    public static void main(String[] args) {
        //char의 기본형은 공백임 \n0000 유니코드식 공백
        char c1 = 'A'; //65
        char c2 = '0'; //48
        char c3 = 'a'; //97
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3 + "\n"); //한칸 띄우는 방법
        System.out.println(); //위랑 같은 결과 이렇게 띄우는 방법도 있다
        System.out.println("Take on Me");
        System.out.println(Integer.parseInt("123"));
        System.out.println(c1+1);
        System.out.println(++c1);
    }
}
