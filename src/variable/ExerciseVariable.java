package variable;

public class ExerciseVariable {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = x;
        x = y;
        y = z;
        z = tmp;
//        if (y < z) {
//            int tmp = z;
//            z = y;
//            y = tmp;
//        }
//        if (x < z) {
//            int tmp = z;
//            z = x;
//            x = tmp;
//
//        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
