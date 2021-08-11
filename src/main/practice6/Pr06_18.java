package main.practice6;

public class Pr06_18 {
    public static boolean isNumber(String str){
        boolean b = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')continue;
            else{
                b = false;
                break;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
