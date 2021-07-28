package loop;

public class Gugu3 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"x"+j+"=" +i*j);
                for (int k = 3; k<9 ; k=k*3) {
                    System.out.print("");
                }
            }
            System.out.println("");
            //구구단 3단씩 출력하는거 알아내기  이거 미완임
        }

    }
}
