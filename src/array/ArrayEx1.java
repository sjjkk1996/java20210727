package array;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr[0] = 100; arr[1]=88; arr[2] = 100; arr[3]=100;
        arr[4] = 90;
        System.out.println(Arrays.toString(arr));
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        float avg = total/(float)arr.length;
        System.out.printf("총점: %3d",total);
        System.out.printf("평균: %5.2f",avg);
    }
}
