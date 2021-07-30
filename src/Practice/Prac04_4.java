package Practice;

public class Prac04_4 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;
        while (true){
            total += (i%2==0?-i:i);
            i++;
            if(total>=100)
                break;
        }
        System.out.println(i);
    }
}
//        int sum = 0, num = 0;
//        while(true){
//            num++;
//            if(num % 2 == 0)
//                sum -= num;
//            else
//                sum += num;
//            if(sum >= 100)
//                break;
//        }
//        System.out.println(num);

