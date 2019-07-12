package com.jvm.test.DeepClone;

import java.io.*;
/**
 * @Program: ${NAME}
 * @Description:
 * @Author: liu yuanwen
 * @Date:
 */
public class MyUtil {

    private MyUtil(){
        throw new AssertionError();
    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj) throws Exception{

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);

        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);

        return (T) ois.readObject();
        //这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，
        // 这一点不同于对外部资源（如文件流）的释放
    }


}
