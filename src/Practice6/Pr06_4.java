package Practice6;

public class Pr06_4 {
    public static void main(String[] args) {
        System.out.println(MyPoint.getDistance(1,1,2,2));
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }

//6-4다른 풀이    static double getDistance(int x, int y, int x1, int y1){
//        double a,b;
//        a = Math.pow(x1 - x, 2);
//        b = Math.pow(y1 - y, 2);
//        return Math.sqrt(a + b);
//    }
//    public static void main(String[] args) {
//        System.out.println(getDistance(1,1,2,2));
    }

class MyPoint {
    int x,y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //6-4
    static double getDistance(int x, int y, int x1, int y1){
        double result = 0.0;
        result = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        return result;
    }
    //6-6
    double getDistance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2) + Math.pow((this.y-y),2));

    }
}