package com.jvm.test;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;


/**
 * @program: SelfDefineClassLoader
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/1
 */
public class SelfDefineClassLoader {


    private static  String FILEPATH = null;
    private static final String DEAFAULTDIR = "G/test/";

    static Class<?> defineClass(String var1, byte[] var2, int var3, int var4) {
        return defineClass(var1, var2, var3, var4);
    }

    public Class<?> findClass(String name) throws ClassNotFoundException{

        byte[] bytes = null;
        try{
            bytes = loadClassData(SelfDefineClassLoader.FormatClassName(name));
        }catch (Exception e){
            e.printStackTrace();
        }
        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(String filepath) throws Exception{
        int n = 0;
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(new File(filepath)));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        while ((n = br.read()) != -1){
            bos.write(n);
        }
        br.close();
        return bos.toByteArray();
    }

    public static String FormatClassName(String name){
        FILEPATH = DEAFAULTDIR + name + ".class";

        return FILEPATH;
    }

    @Test
    public void test() throws Exception{

        SelfDefineClassLoader sld = new SelfDefineClassLoader();
        Class c = sld.findClass("testClass");
        Object object = c.newInstance();
        Method m = c.getMethod("getName", new Class[]{String.class, int.class});
        m.invoke(object, "hello", 123);
        System.out.println(c.getName());
        System.out.println(c.getClassLoader());
        System.out.println(c.getClassLoader().getParent());
    }
}
