package javaJungsuk.UtilClass;

import java.util.Arrays;

/*
이해 안 가는 문제
 */
public class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        String [] str = fullPath.split("\\\\");
        path = str[0] + "\\" + str[1] + "\\" + str[2];
        fileName = str[3];

//        int pos = fullPath.lastIndexOf("\\");   // pos : 14
//
//        if(pos!=-1) {
//            path = fullPath.substring(0, pos);
//            fileName = fullPath.substring(pos+1);
//        }

        System.out.println("fullPath: " + fullPath);
        System.out.println("path: " + path);
        System.out.println("fileName: " + fileName);
    }
}
