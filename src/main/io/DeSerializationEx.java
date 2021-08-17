package io;

import swing.UserInfo;

import java.io.*;
import java.util.ArrayList;

public class DeSerializationEx {
    public static void main(String[] args) {
        String fileName = "UserInfo.ser";
        try {
            FileInputStream fis = new FileInputStream(fileName); //주스트림
            BufferedInputStream bis = new BufferedInputStream(fis); //보조스트림
            ObjectInputStream in = new ObjectInputStream(bis);
            UserInfo u1 = (UserInfo) in.readObject();
            UserInfo u2 = (UserInfo) in.readObject();
            ArrayList list = (ArrayList) in.readObject();
            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            in.close();
        }catch (Exception e) {
            
        }
    }
}
