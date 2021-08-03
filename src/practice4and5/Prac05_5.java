package practice4and5;

public class Prac05_5 {
    public static void main(String[] args) {
        int[] ballArr = new int[45];
        for (int i = 0; i < ballArr.length; i++) {
            ballArr[i] = i+1;
        }
        int[] lottoBall = new int[6];
// ballArr . 배열 순서대로 임의의 요소를 골라서 위치를 바꾼다
        for(int i=0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
// lottoBall . 배열 의 앞에서 개의 수를 배열 로 복사한다
        System.arraycopy(ballArr,0, lottoBall,0,lottoBall.length);
        for(int i=0;i<lottoBall.length;i++) {
            if(i!=0) System.out.print(",");
            System.out.print(lottoBall[i]);
        }
        System.out.println();
    } // end of main
} // end of class
