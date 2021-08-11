package main.lang;

public class ObjectHashCodeEx {
    public static void main(String[] args) {
        String str1 = new String("abc"); //new를 통해서 인스턴스의 주소값을 가진다
        String str2 = new String("abc");
        System.out.println(str1 == str2); //instance의 주소값이 다르게 나옴.
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = "abc"; //constant Pool에 등록된 문자열의 주소값을 참조
        String str4 = "bac"; //constant Pool에 등록된 문자열의 주소값을 참조
        System.out.println(str3 == str4); //결과값 true
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println(str1.equals(str4));

        str3 = "abcd";
        System.out.println(str3);
        System.out.println(str3.hashCode());
        System.out.println();
    }
}
