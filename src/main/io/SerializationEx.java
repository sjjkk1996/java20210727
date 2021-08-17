package io;

import swing.UserInfo;

import java.io.*;
import java.util.ArrayList;

public class SerializationEx {
    public static void main(String[] args) {
        String fileName = "UserInfo.ser";
        try {
            FileOutputStream fos = new FileOutputStream(fileName); //주스트림
            BufferedOutputStream bos = new BufferedOutputStream(fos); //보조스트림
            ObjectOutputStream out = new ObjectOutputStream(bos);
            UserInfo u1 = new UserInfo("javaMan", "1234", 30);
            UserInfo u2 = new UserInfo("javaWoman", "1234", 26);
            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);list.add(u2);

            out.writeObject(u1);out.writeObject(u2);out.writeObject(list);
            out.close();
            System.out.println("직렬화 끝");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            
        }

    }
}

