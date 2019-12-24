package com.jvm.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: IOTest
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/17
 */
public class IOTest {
    public static void main(String[] args) throws IOException {

        int num = 5;
        System.out.println((int) Math.pow((Math.floor(Math.sqrt(2) * num)), 2));
        FileInputStream fileInputStream = new FileInputStream("file");

        try{
            StringBuffer str = new StringBuffer();
            char[] buffer = new char[1024];
            FileReader fileReader = new FileReader("file");
            while (fileReader.read(buffer) > 0){
                str.append(buffer);
            }
            str.toString();
        }catch (IOException e){
            throw e;
        }
        String str= "fhks";
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            Integer.parseInt(strs[i]);
        }
    }
}
