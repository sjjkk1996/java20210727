package main.array;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int max = score[0];
        int min = score[0];
        int total = 0;

        for (int i = 0; i < score.length; i++) {
            total+= score[i];
            if (max < score[i]){
                max = score[i];
            }
            if(min>score[i]){
                min = score[i];
            }


        }
        System.out.printf("최대값은: %d" +", "+ "최소값은:%2d", max, min);
        System.out.printf("총합: %3d", total);
        System.out.printf("평균: %5.2f", (float)total/score.length);
    }
}