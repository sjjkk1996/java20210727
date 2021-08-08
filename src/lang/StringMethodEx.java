package lang;

import java.util.Arrays;

public class StringMethodEx {
    public static void main(String[] args) {
        String str = "abc";
        str = new String("abc");
        str = new String(new char[]{'a', 'b', 'c'});
        str = new String(new StringBuffer("abc"));

        System.out.println(str.charAt(0));
        System.out.println(str.compareTo("0abc"));//같으면 0,크면 음수,작으면 양수
        System.out.println(str.concat("defg"));
        System.out.println(str.contains("a"));
        System.out.println(str.endsWith("c"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.equalsIgnoreCase("AbC"));
        System.out.println(str.indexOf("bc"));
        System.out.println(str.lastIndexOf("c"));
        System.out.println("d:\\classJava\\Hello.java".lastIndexOf('.'));
        str = "d:\\classJava\\Hello.java";
        System.out.println(str.substring(str.lastIndexOf('.')+1));
        System.out.println(str.substring(str.lastIndexOf('.')+1, 20));
        str = "abc";
        String str2 = "abc";
        System.out.println(str.intern());
        System.out.println(str.intern() == str2.intern());
        System.out.println(str.length());
        System.out.println(str.replace("a","b"));
        System.out.println("aabbaacc".replace("aa","ee"));
        System.out.println("aabbaacc".replaceAll("aa","ee"));
        System.out.println("aabbaacc".replaceFirst("aa","ee"));
        System.out.println("thor, iron, hulk".split(",")[2]);


    }
}