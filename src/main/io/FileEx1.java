package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\classJava\\workspace\\ojdbc8.jar");
        String fileName = f. getName();
        int pos = fileName.lastIndexOf(".");
        System.out.println("경로를 제외한 파일명: " + fileName);
        System.out.println("오직파일명만: " + fileName.substring(0,pos));
        System.out.println("확장자: " + fileName.substring(pos+1));
        System.out.println("with pathname: " + f.getPath());
        System.out.println("absolutepathname: " + f.getAbsolutePath());
        System.out.println("absolutepathname: " + f.getCanonicalPath());
    }
}
