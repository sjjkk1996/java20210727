package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamOutputStream {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];
        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.out.println("Input Source:" + Arrays.toString(inSrc));
//        1)
//        int data = 0;
//        while ((data = input.read()) != -1){
//            output.write(data);//데이타를 아웃풋에다 씀
//
//        }
//        2)
//        input.read(temp,0,temp.length);
//        output.write(temp, 5, 5);
//        3)
        while (input.available() > 0) {
            try {
                int length = input.read(temp);

                output.write(temp, 0 ,length);
                outSrc = output.toByteArray();
                System.out.println("temp: " + Arrays.toString(temp));
                System.out.println("outSrc: " + Arrays.toString(outSrc));
                temp = new byte[4];
            } catch (IOException e) { }
        }
//        outSrc = output.toByteArray();
//        System.out.println("inSrc: " + Arrays.toString(inSrc));
//        System.out.println("temp: " + Arrays.toString(inSrc));
//        System.out.println("outSrc: " + Arrays.toString(outSrc));
    }
}
