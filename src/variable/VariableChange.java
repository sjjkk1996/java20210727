package variable;

public class VariableChange {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        print(i1, i2);
        print(i2, i1);

    }
    static void print(int n1, int n2) {
        if (n1 > n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
//static void print(int n1, int n2, int n3) {
//        if (n1 > n2) {
//            int tmp = n1;
//            n1 = n2;
//            n2 = tmp;
//       }
        System.out.println(n1+","+n2);
    }

}
