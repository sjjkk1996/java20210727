package operator;

public class MyMath {
    public static void digitRound(double d, int digit) {
        double tmp = d * Math.pow(10, digit);
        System.out.println(tmp);
        tmp = Math.round(tmp) / Math.pow(10, digit);
        System.out.printf("최종 출력값: %10.5f", tmp);
        System.out.println();
        System.out.println(String.format("%f", tmp));
        System.out.println("결과값 뒤의 0을 제외한 최종 출력값: " + tmp);

    }
}
