package array;

import java.util.Arrays;

public class LottoEx {
    public static void main(String[] args) {
        int[] balls = new int[45];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i+1;
        }
        System.out.println(Arrays.toString(balls));
        for (int i = 0; i < balls.length; i++) {
            int rand = (int)(Math.random()*10);
            int temp = balls[i];
            balls[i] = balls[rand];
            balls[rand] = temp;
        }
        System.out.println(Arrays.toString(balls));
    }
}
