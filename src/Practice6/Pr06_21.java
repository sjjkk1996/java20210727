package Practice6;

public class Pr06_21 {
    public static int abs(int value){
        value = value >= 0 ? value : -value;
        return value;
    }

    public static void main(String[] args) {

        int value = 5;

        System.out.println(value + "의 절대값 :" + abs(value));

        value = -10;

        System.out.println(value + "의 절대값 :" + abs(value));

    }

}

