package operator;

public class Op_Elvis {
    public static void main(String[] args) {
        int x = -5;
        int absX = x>=0?x:-x;
        System.out.println(absX);
        char signX = (x > 0) ? '+' : (x == 0) ? ' ' : '-';//x가 0보다 크면? +를 붙이고 아니면 x==0 이면? ' '(공백)이 아니면 -를 붙여라
        System.out.printf("x= %c%d %n", signX, absX); // 아래 코드랑 같은 내용지만 가독성이나 여러면으로 이코드를 더많이 사용하는편임
        System.out.printf("x= " + signX + absX + "%n");
    }
}
